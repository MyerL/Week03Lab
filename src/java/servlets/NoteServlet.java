package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author awarsyle
 */
public class NoteServlet extends HttpServlet {
    String path=null;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       path = getServletContext().getRealPath("/WEB-INF/note.txt"); 
       BufferedReader br = new BufferedReader(new FileReader(new File(path)));
       
          
            Note n = new Note(br.readLine(),br.readLine());
        
            
           

            if(request.getParameter("edit")!=null)
            {
                request.setAttribute("Note",n); 
                br.close();
                getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            }
       
        request.setAttribute("Note",n); 
        br.close();
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
        String title = request.getParameter("title")+"\n";
        String contents = request.getParameter("contents");
            Note n = new Note(title,contents);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path,false)));
        pw.write(title);
        pw.write(contents);
        pw.close();
        
        request.setAttribute("Note",n); 
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);   
    }
}
