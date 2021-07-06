package exam.main.java.pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/smurfs")
public class Smurfs extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Smurf> smurfs = SmurfDao.getList();
        request.setAttribute("smurfs", smurfs);
        getServletContext().getRequestDispatcher("/smurfs.jsp")
                .forward(request, response);
    }
}
