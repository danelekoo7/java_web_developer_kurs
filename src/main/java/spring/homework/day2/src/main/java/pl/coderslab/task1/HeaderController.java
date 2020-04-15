package spring.homework.day2.src.main.java.pl.coderslab.task1;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeaderController {

    @RequestMapping("/showUserAgent")
    public String showUserAgent(@RequestHeader("user-agent") String userAgent, Model model) {

        model.addAttribute("userAgent", userAgent);
        return "userAgent";
    }

}
