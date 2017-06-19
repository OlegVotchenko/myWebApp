package org.itstep.mywebapp.web;

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

    private DrinkService service =new DrinkServiceImpl();

    private static final Logger LOG = LoggerFactory.getLogger(DrinkServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        Integer drinkId = 1;
//        service.get(Logged.id, drinkId);



        String action = req.getParameter("action");

        LOG.debug("Get request wit action = {} and id = {}", action, req.getParameter("id"));


        if (action!=null){
            if ("create".equals(action))
            {

            }

        }else {
            List<Drink> drinkList = service.getAll();
            req.setAttribute("drinkList", drinkList);
            req.getRequestDispatcher("/drinkList.jsp").forward(req,resp);
        }



    }

}
