
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.Collections;


public class Interface1 extends JPanel
{
    private Font f = new Font("SanSerif",Font.PLAIN,20);
    private ArrayList<Character> arr=new ArrayList<>();

    private JTextField T = new JTextField("",10);
    public void output() throws PrinterException {
        String str="";
        for(int i=0;i < arr.size();i++){
            str +=(arr.get(i)).toString();
            str += " ";
        }
        T.setText(str);
    }
    public Interface1(){
        setLayout(null);
        JButton j = new JButton("Add");
        JButton j1 = new JButton("Delete");
        JButton j2 = new JButton("Find");
        JButton j3 = new JButton("Sort ");
        JButton j4 = new JButton("Show");
        JLabel l = new JLabel("Input:");
        JLabel L= new JLabel("Result:");
        JTextField t = new JTextField("",10);




        L.setBounds(50,350,80,60);
        L.setFont(f);


        T.setBounds(150,350,395,50);
        T.setFont(f);

        t.setBounds(150,10,395,50);
        t.setFont(f);


        l.setBounds(50,10,80,60);
        l.setFont(f);

        j.setBounds(45,85,250,50);
        j.setFont(f);


        j1.setBounds(395,85,250,50);
        j.setFont(f);


        j2.setBounds(45,175,250,50);
        j.setFont(f);


        j3.setBounds(395,175,250,50);
        j.setFont(f);


        j4.setBounds(220,265,250,50);
        j.setFont(f);



        j.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                T.setText("Add your elments by one!");
                String text1 = t.getText();
                t.setText("");
                for(int i = 0; i < text1.length();i++){
                    arr.add(text1.charAt(i));
                }
                T.setText("Element has added successfully!");

            }
        });
        j1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text2 = t.getText();
                t.setText("");
                if(arr.size()>= Integer.parseInt(text2)) {
                    arr.remove(Integer.parseInt(text2));
                    T.setText("Element " + text2 + " is deleted");
                }else{
                    T.setText("Container doesn't contain " + text2);
                }  }

        });
        j2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text3 = t.getText();
                t.setText("");
                if(arr.contains(text3.charAt(0))){
                    T.setText("Container contains element : " + text3);

                }else{
                    T.setText("Container doesn't contain element : " + text3);
                }
            }

        });
        j3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Collections.sort(arr);

                T.setText("Elements are sorted");

            }
        });
        j4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("");
                try {
                    output();
                } catch (PrinterException e1) {
                    e1.printStackTrace();
                }
            }
        });



        add(j);
        add(j1);
        add(j2);
        add(j3);
        add(j4);
        add(l);
        add(t);
        add(T);
        add(L);
    }
}
