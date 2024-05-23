/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import za.ac.tut.entity.Temp;
import za.ac.tut.entity.TempFacadeLocal;
import za.ac.tut.entity.tamp;


@WebServlet("/create_student")
@MultipartConfig()

public class CreateStudent extends HttpServlet {
@EJB TempFacadeLocal tfl;
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String modules[] = request.getParameterValues("modules[]");
        Part filepart = request.getPart("image");
        InputStream input = filepart.getInputStream();
        byte[] image = createImage(input);
        
        Temp tt = new Temp();
        tt.setName(name);
        tt.setImage(image);
        
        List<tamp> mods = new ArrayList<>();
        if(modules != null)
        {
            for (String module : modules) {
                tamp tet = new tamp();
                tet.setName(module);
                tet.setTemps(tt);
                mods.add(tet);
            }
        }
        
        tt.setTamp(mods);
        tfl.createTemp(tt);
        
        RequestDispatcher disp = request.getRequestDispatcher("create_student.html");
        disp.forward(request, response);
    }

    private byte[] createImage(InputStream input) throws IOException {
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      byte[] buffer = new byte[4096];
      int read;
      
      while((read = input.read(buffer)) != -1)
      {
          output.write(buffer, 0, read);
      }
      return output.toByteArray();
    }

}
