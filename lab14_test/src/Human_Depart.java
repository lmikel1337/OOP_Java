import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Human_Depart {
    public String ReadInfo() {
        Scanner infowriter = new Scanner(System.in);
        System.out.println("Passport data: ");
        String passport= infowriter.nextLine();
        System.out.println("Education: ");
        String education = infowriter.nextLine();
        System.out.println("Salary: ");
        String salary = infowriter.nextLine();
        System.out.println("Career");
        String carrer = infowriter.nextLine();
        System.out.println("Characteristic");
        String characteristic = infowriter.nextLine();

        return "passport data:   " + passport+"\n"+
                "education:      " + education+"\n"+
                "salary:         " + salary+"\n"+
                "career:         " + carrer+"\n"+
                "characteristic: " + characteristic;
    }

    public Integer Depart() {
        Scanner infowriter = new Scanner(System.in);
        System.out.println("Please fill up this form \n Id of your anket:");
        Integer id = infowriter.nextInt();
        return id;


    }}


