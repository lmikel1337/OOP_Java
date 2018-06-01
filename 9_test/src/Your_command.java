
import java.util.Scanner;
import java.io.*;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Your_command {
    public static void main(String args[]) throws Exception {
        new Menu().execute();
        Container c = new Container();
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        String l;
        c.serealization();
        c.deserealization();
        while(!("x".equals(line))){
            if("-h".equals(line) || "help".equals(line))
                new Help().execute();

            else if("a".equals(line)){
                System.out.println( c.toString());
            }

            else if("b".equals(line)){
                System.out.println("Your elements:");
                c.read(); }

            else if("c".equals(line))
                c.clear();

            else if("d".equals(line)){
                System.out.println("Your element:");
                l = s.nextLine();
                c.remove(l);}
            else if("e".equals(line))
                c.compare();
            else if("f".equals(line))
                System.out.println(c.size());
            else if("g".equals(line)){
                System.out.println("Your element:");
                l = s.nextLine();
                System.out.println( c.contains(l));}

            else if("h".equals(line))
                c.sort();

            else if("j".equals(line)){
                Helper.PrintSymbols(c.toString());
                Helper.PrintSymbolNumbers(c.toString());
            }
            else
                new Other().execute();
            System.out.print("New command: \n");
            line = s.nextLine();
        }
        new Exit().execute();
    }

}


