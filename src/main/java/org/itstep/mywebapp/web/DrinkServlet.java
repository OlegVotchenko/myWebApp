package org.itstep.mywebapp.web;

import com.sun.javafx.util.Logging;
import org.itstep.mywebapp.Logged;
import org.itstep.mywebapp.model.Drink;
import org.itstep.mywebapp.service.DrinkService;
import org.itstep.mywebapp.service.DrinkServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/drinks")
public class DrinkServlet extends HttpServlet {

    private DrinkService service = new DrinkServiceImpl();

    private static final Logger LOG = LoggerFactory.getLogger(DrinkServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        Integer drinkId = 1;
//        service.get(Logged.id, drinkId);


        String action = req.getParameter("action");

        LOG.debug("Get request wit action = {} and id = {}", action, req.getParameter("id"));


        if (action != null) {
            if ("create".equals(action)) {
                Drink drink = service.save(new Drink(Logged.id));
                req.setAttribute("drink", drink);
                req.getRequestDispatcher("/editUser.jsp").forward(req,resp);
                return;
            }

            Integer id = Integer.valueOf(req.getParameter("id"));
            if (action.equals("delete")){
                service.delete(Logged.id,id);
                resp.sendRedirect("drinks");
            }else if (action.equals("update")){
                Drink drink = service.get(Logged.id, id);
                req.setAttribute("drink", drink);
                req.getRequestDispatcher("/editDrink.jsp").forward(req,resp);
            }

        } else {
            List<Drink> drinkList = service.getAll();
            req.setAttribute("drinkList", drinkList);
            req.getRequestDispatcher("/drinkList.jsp").forward(req, resp);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        Drink drink = service.get(Logged.id, id);
        drink.setName(req.getParameter("name"));
        drink.setCapacity(Integer.valueOf(req.getParameter("capacity")));
        service.save(drink);
        resp.sendRedirect("drinks");
    }
}
