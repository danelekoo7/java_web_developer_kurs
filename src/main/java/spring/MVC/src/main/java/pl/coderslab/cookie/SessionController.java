package spring.MVC.src.main.java.pl.coderslab.cookie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
public class SessionController {

    @ResponseBody
    @RequestMapping("/check-session")
    public String checkSession(HttpSession session) {
        if (session.getAttribute("loginStart") == null) {
            session.setAttribute("loginStart", LocalDateTime.now());
        }
        return session.getAttribute("loginStart").toString();
    }
}
