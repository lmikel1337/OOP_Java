
import java.util.*;
import java.util.Scanner;
public class Lab14 {

    public static void main(String[] args) {
        Map information = new HashMap();
        Scanner menu = new Scanner(System.in);
        System.out.println("Please select what do you want to do:" +
                "\n1- add information ;\n2-delete information ;\n3- show information ;\n4-finding anket;\n 0 - exit");
        int n = menu.nextInt();
        while(!(n==0)){
            switch(n){
                case 1:
                    Human_Depart allinfo=new Human_Depart();
                    Integer id = allinfo.Depart();
                    String infooo = allinfo.ReadInfo();
                    information.put(id,infooo);
                    break;
                case 2:
                    System.out.println("Choose element which you want to delete");
                    Integer delete = menu.nextInt();
                    information.remove(delete);
                    break;
                case 3:
                    Set set = information.entrySet();
                    for(Object o : set){
                        System.out.println(o);

                    }
                    break;
                case 0:
                    return;
                case 4:
                    System.out.println("Enter an anket youw want to find");
                    Integer find = menu.nextInt();
                    System.out.println(information.get(find));


            }
            System.out.println("Please select what do you want to do:" +
                    "\n1- add information ;\n2-delete information ;\n3- show information ;\n4-finding anket;\n 0 - exit");
            n = menu.nextInt();

        }
    }
}