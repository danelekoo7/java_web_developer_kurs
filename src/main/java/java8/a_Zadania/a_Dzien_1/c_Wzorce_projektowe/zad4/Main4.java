package java8.a_Zadania.a_Dzien_1.c_Wzorce_projektowe.zad4;

public class Main4 {
    public static void main(String[] args) {
        Post post = new Post();
        post.setTitle("Some title");
        post.setContent("Some content");

        FacebookObserver facebookObserver = new FacebookObserver();
        TwitterObserver twitterObserver = new TwitterObserver();

        post.attach(facebookObserver);
        post.attach(twitterObserver);
        post.share();
        post.detach(facebookObserver);
        post.detach(twitterObserver);
        post.share();

    }
}
