package spring.homework.day2.src.main.java.pl.coderslab.task4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
public class HelloController {

    @RequestMapping("/workers")
    public String workersAction(Model model) {
        Random random = new Random();
        String line;
        Map<Integer, String> workerMap = new HashMap<>();

        try {
            File file = ResourceUtils.getFile("classpath:Workers.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((line = bufferedReader.readLine()) != null) {
                int id = 0;
                int name = 1;
                String[] array = line.split(",");
                workerMap.put(Integer.parseInt(array[id]), array[name]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int randomNumber = random.nextInt(30)+1;
        String name = workerMap.get(randomNumber);

        System.out.println(randomNumber);
        System.out.println(name);

        model.addAttribute("name",name);

        return "workers";
    }
}
