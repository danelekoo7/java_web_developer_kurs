package spring.MVC.src.main.java.pl.coderslab.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;


@Controller
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String helloWorld() {
        logger.info("hello method");
        return "home";
    }

    @ResponseBody
    @RequestMapping("/hi")
    public String hi() {
        logger.info("hi method");
        return "hi";
    }

    @RequestMapping("/home")
    public String home2(@RequestParam String backgroundColor, @RequestParam String color, Model model) {
        LocalDateTime now = LocalDateTime.now();
//        now = LocalDateTime.of(2020, 10, 10, 1, 0);
        if (now.getHour() >= 8 && now.getHour() < 20) {
            color = "black";
            backgroundColor = "white";
        } else {
            color = "white";
            backgroundColor = "black";
        }
        model.addAttribute("backgroundColor", backgroundColor);
        model.addAttribute("color", color);
        return "home";
    }


}