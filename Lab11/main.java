package ua.lpnuai.oop.peleshchak11;

import java.io.FileWriter;
import java.util.Scanner;

public class main {
    public static void main(String [] args){
        show();

        LinkedList LinkedList = new LinkedList();
        LinkedList LinkedList1 = new LinkedList();
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        while(!("6".equals(line))) {
            //LinkedList LinkedList1 = new LinkedList();
            if ("1".equals(line)) {
                System.out.println("Please fill your personal card co-worker:");
                System.out.println("Your Passport Data: ");
                String data = new String();
                data = scan.nextLine();
                System.out.println("Your Education: ");
                String education = new String();
                education = scan.nextLine();
                System.out.println("Your Salary: ");
                String salary = new String();
                salary = scan.nextLine();
                System.out.println("Career:(write by .) ");
                System.out.println("1.Date of appointment. ");
                System.out.println("2.Position. ");
                System.out.println("3.Department. ");
                String career = new String();
                career = scan.nextLine();
                System.out.println("Your Characteristic - a set of properties and ratings: ");
                String characteristic = new String();
                characteristic = scan.nextLine();
                System.out.println("Your personal card co-worker is successfully created.");

                LinkedList.setT1(data);
                LinkedList.setT2(education);
                LinkedList.setT3(salary);
                LinkedList.setT4(career);
                LinkedList.setT5(characteristic);
                LinkedList1.add(LinkedList);


            }
            else if("2".equals(line)){
                System.out.println("Your index:");
                int b = scan.nextInt();
                System.out.println(LinkedList1.get(b));
            }

            else if("3".equals(line)){
                System.out.println("Your index:");
                int a = scan.nextInt();
                LinkedList1.delete(a);
            }
            else if("4".equals(line)){
                System.out.println(LinkedList1.size());

            }
            else if("5".equals(line)){
                System.out.println(LinkedList1.toString());
            }
            System.out.print("New command: ");
            line = scan.nextLine();
        }
        System.out.println("Goodbye))");



    }
    public static void show(){
        System.out.println("Help instruction:\n" +
                "1: add your card;\n" +
                "2: return card by index;\n" +
                "3: delete element by index;\n" +
                "4: return size;\n" +
                "5: return list with your cards;\n"+
                "6: exit;");
    }
}
