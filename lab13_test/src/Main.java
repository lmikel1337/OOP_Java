import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<String>();
        ls.push("1");
        ls.push("5");
        ls.push("3");
        ls.push("1");
        ls.push("45");
        ls.push("12");
        ls.push("123");
        ls.push("2");

        First d = new First("First");
        d.start();
        System.out.println("Main Thread:  " + System.currentTimeMillis()*100);

        Add add = new Add(ls,"Second");
        add.start();

        Min min = new Min(ls,"Third");
        min.start();

    }
}


