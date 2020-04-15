package spring.MVC.src.main.java.pl.coderslab.beans;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping("/showRandom")
    public String showRandom() {

        logger.info("showRandom method");
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        return "Wylosowano liczbę: " + number;
    }

    @ResponseBody
    @GetMapping("/random/{max}")
    public String maxRandom(@PathVariable int max) {
        int wylosowana = new Random().nextInt(max) + 1;
        logger.info("Użytkownik podał wartość {} . Wylosowano liczbę: {} .", max, wylosowana);
        String pierwszaCzesc = "Użytkownik podał wartość %s. Wylosowano liczbę: %s .";
        String formated = String.format(pierwszaCzesc, max, wylosowana);
        return formated;
    }

    @ResponseBody
    @GetMapping(value = "/random/{min}/{max}", produces = "text/plain;charset=UTF-8")
    public String maxRandom(@PathVariable int min, @PathVariable int max) {
        int wylosowana = new Random().nextInt(max - min + 1) + min;
        logger.info("Użytkownik podał wartość {} i {} . Wylosowano liczbę: {} .", min, max, wylosowana);
        String pierwszaCzesc = "Użytkownik podał wartość %s i %s. Wylosowano liczbę: %s .";
        String formated = String.format(pierwszaCzesc, min, max, wylosowana);
        return formated;
    }

    @ResponseBody
    @RequestMapping("/hello/{firstName}/{lastName}")
    public String name(@PathVariable String firstName,
                       @PathVariable String lastName) {
        return "Witaj " + firstName + " " + lastName;

    }


}
