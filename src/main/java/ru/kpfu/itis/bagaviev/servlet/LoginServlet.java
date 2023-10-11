package ru.kpfu.itis.bagaviev.servlet;

import ru.kpfu.itis.bagaviev.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "loginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    private static final String PARAM_NAME_EMAIL = "email";
    private static final String PARAM_NAME_PASSWORD = "password";
    private static final int MAX_INACTIVE_INTERVAL = 60 * 60;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("html/login.html").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter(PARAM_NAME_EMAIL);
        String password = req.getParameter(PARAM_NAME_PASSWORD);

        UserService service = new UserService();
        if (service.isExist(email, password)) {
            HttpSession session = req.getSession();
            session.setMaxInactiveInterval(MAX_INACTIVE_INTERVAL);
            session.setAttribute(PARAM_NAME_EMAIL, email);
            resp.sendRedirect("/profile");
        } else {
            doGet(req, resp);
        }
    }

}