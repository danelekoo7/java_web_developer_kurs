package servlety_JSP.a_Zadania.a_Dzien_2.a_Maven.main.java.pl.coderslab;

import com.google.common.collect.Lists;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Connection connect = Jsoup.connect("http://www.onet.pl/");
        try {
            Document document = connect.get();
            Elements links = document.select("span.title");
            for (Element elem : links) {
                System.out.println(elem.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> names = Lists.newArrayList("Arek", "Czarek", "Darek");
        List<String> reversed = Lists.reverse(names);
        System.out.println(reversed);

    }


}

