package spring.MVC.src.main.java.pl.coderslab.beans;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultiplyController {

    @RequestMapping("/multiply")
    public String size(@RequestParam(defaultValue = "10") String size, Model model){

        model.addAttribute("size",size);

        return "multiply";

    }

    @RequestMapping("paramMultiply/{rows}/{cols}")
    public String paramMultiply(@PathVariable String rows,
                                @PathVariable String cols,
                                Model model){
        model.addAttribute("rows",rows);
        model.addAttribute("cols",cols);

        return "multiParam";
    }

}
