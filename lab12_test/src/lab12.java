import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class lab12{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("How many ankets  would you like to add ? - ");
        byte anket = (byte) in.nextInt();

        for (int a = 0; a < anket;a++) {

            System.out.println("Enter your  id");

            String id = in.next();
            Human_Res_Dep reg = new Human_Res_Dep();
            while (!reg.id(id)){
                System.out.println("Incorrect input.Enter your  id correctly");
                id = in.next();
            }
            System.out.println("Enter your passport date");
            String data = in.next();
            while(!reg.passport(data)){
                System.out.println("Incorrect input. Enter your passport date correctly(8 symbols: big letters and numbers)");
                data = in.next();
            }
            System.out.println("Enter your education");
            String educat = in.next();
            while(!reg.education(educat)){
                System.out.println("Incorrect input.Enter your education correctly");
                educat = in.next();
            }
            System.out.println("Enter your salary");
            String salary = in.next();
            while(!reg.salary(salary)){
                System.out.println("Incorrect input. Enter your salary correctly");
                salary = in.next();
            }

            System.out.println("Enter your career(dd.mm.yyyy position department)");
            String[] career = new String[3];
            for (int i = 0; i < 3; i++) {
                career[i] = in.next();
            }
            while (!reg.career(career)){
                System.out.println("Incorrect input.Enter your career correctly(dd.mm.yyyy position department)");
                for (int i = 0;i < 3; i++) {
                    career[i] = in.next();
                }
            }

            System.out.println("Enter your characteristic - a set of properties and ratings");
            String charact = in.next();
            while(!reg.character(charact)){
                System.out.println("Incorrect input.Enter your characteristic - a set of properties and ratings correctly");
                charact = in.next();
            }

        }
    }
}
