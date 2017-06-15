package org.itstep.mywebapp.web;

import org.itstep.mywebapp.model.Pet;
import org.itstep.mywebapp.service.PetService;
import org.itstep.mywebapp.service.PetServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Votchenko on 15.06.2017.
 */
@WebServlet("/pets")
public class PetServlet extends HttpServlet {

    private PetService service = new PetServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");
        if (action != null) {
            Integer id = Integer.valueOf(req.getParameter("id"));
            service.delete(id);
            resp.sendRedirect("pets");
        }
        else {
            List<Pet> petList = service.getAll();
            req.setAttribute("petList", petList);
            req.getRequestDispatcher("/pets.jsp").forward(req,resp);
        }

    }
}
