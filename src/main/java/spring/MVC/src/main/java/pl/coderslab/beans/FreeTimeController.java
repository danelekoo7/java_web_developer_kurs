package spring.MVC.src.main.java.pl.coderslab.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

@Controller
public class FreeTimeController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);


    @RequestMapping("/freeTimeController")
    @ResponseBody
    public String time() {

        logger.info("time method");

        LocalDateTime dateTime = LocalDateTime.now();

        if (dateTime.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
            return "Wolne";
        } else if (dateTime.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            return "Wolne";
        } else {
            if (dateTime.getHour() > 9 && dateTime.getHour() < 17) {
                return "Pracuję, nie dzwoń";
            } else {
                return "Po pracy";
            }
        }


//        if (dateTime.getDayOfWeek().toString().equals("SUNDAY")) {
//            return "Wolne";
//        } else if (dateTime.getDayOfWeek().toString().equals("SATURDAY")) {
//            return "Wolne";
//        } else {
//            if (dateTime.getHour() > 9 && dateTime.getHour() < 17) {
//                return "Pracuję, nie dzwoń";
//            } else {
//                return "Po pracy";
//            }
//        }

    }

    public static void main(String[] args) {
//        LocalDateTime dateTime = LocalDateTime.now();

        LocalDateTime dateTime = LocalDateTime.of(2020, 2, 4, 16, 3);

        if (dateTime.getDayOfWeek().toString().equals("SUNDAY")) {
            System.out.println("Wolne");
        } else if (dateTime.getDayOfWeek().toString().equals("SATURDAY")) {
            System.out.println("Wolne");
        } else {
            if (dateTime.getHour() > 9 && dateTime.getHour() < 17) {
                System.out.println("Pracuję, nie dzwoń");
            } else {
                System.out.println("Po pracy");
            }
        }

        System.out.println(dateTime.getDayOfWeek().toString());
    }
}
