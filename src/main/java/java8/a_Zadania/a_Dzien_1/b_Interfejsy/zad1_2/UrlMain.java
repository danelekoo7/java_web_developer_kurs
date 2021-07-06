package java8.a_Zadania.a_Dzien_1.b_Interfejsy.zad1_2;

public class UrlMain {

    public static void main(String[] args) {
        Url standardUrl = new StandardUrl();
        printParam(standardUrl,"param1", "url_example?param1=99&param2=string");

        Url extended = new ExtendedUrl();
        printParam(extended,"param1", "url_example/param1.55/param2.byte");
        printParam(extended,"param2", "url_example/param1.55/param2.byte");
    }

    public static void printParam(Url urlParser, String paramName, String url) {
        System.out.println(urlParser.getParam(paramName, url));
    }
}