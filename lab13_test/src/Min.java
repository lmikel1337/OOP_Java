
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

class Min extends Thread{
    Thread three;
    String name;
    LinkedList<String> list;

    Min(LinkedList<String> ls, String name){
        this.name = name;
        list = ls;
    }

    public void run() {
        list.push("Q");
        list.push("W");
        list.push("E");
        list.push("R");
        list.push("T");


        LinkedList<Integer> arr = new LinkedList<>();
        Random rand = new Random();
        for(int i = 0; i < list.size(); i++) {

            Integer	k = rand.nextInt(1000);
            arr.add(k);

        }
        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");


        Integer max = Collections.max(arr);
        Integer min = Collections.min(arr);
        System.out.println("THIRD THRED :  "+arr);

        System.out.println("THIRD THREAD - max element:  "+max);
        System.out.println("THIRD THREAD -  min element:  "+min);
    }
    public void start() {
        if(three == null) {
            three = new Thread(this, name);
            three.start();
        }
    }
}
