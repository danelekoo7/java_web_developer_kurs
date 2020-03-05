package servlety_JSP.a_Zadania.a_Dzien_4.main.java.pl.coderslab.filtry;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = { "/admin/*", "/admin.jsp" })
public class AuthFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        final Object username = ((HttpServletRequest) request).getSession().getAttribute("username");
        if (username == null) {
            ((HttpServletResponse) response).sendRedirect("/d4/login");
        } else {
            chain.doFilter(request, response);
        }
    }

    public void init(FilterConfig config) throws ServletException {


    }

}
