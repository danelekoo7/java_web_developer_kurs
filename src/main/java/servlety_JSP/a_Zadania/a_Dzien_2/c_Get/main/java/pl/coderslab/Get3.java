package servlety_JSP.a_Zadania.a_Dzien_2.c_Get.main.java.pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "Get3", urlPatterns = "/get3")
public class Get3 extends HttpServlet {
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        final Integer width = parseToInt(request.getParameter("width"), 5);
        final Integer height = parseToInt(request.getParameter("height"), 10);
        final int[][] table = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int[] row : table) {
            response.getWriter().println(Arrays.toString(row));
        }
    }

    private static Integer parseToInt(final String string, final int defaultValue) {
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException exception) {
            return defaultValue;
        }
    }
}
