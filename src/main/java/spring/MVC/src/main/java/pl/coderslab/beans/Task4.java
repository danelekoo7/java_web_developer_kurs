package spring.MVC.src.main.java.pl.coderslab.beans;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("first")
public class Task4 {

    @GetMapping("form")
    public String form() {
        return "form.jsp";
    }

    @PostMapping("form")
    public String form(String paramName, String paramDate, Model model) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateTime = LocalDate.parse(paramDate, formatter);

        model.addAttribute("paramName", paramName);
        model.addAttribute("paramDate", dateTime);
        return "form.jsp";
    }
}
