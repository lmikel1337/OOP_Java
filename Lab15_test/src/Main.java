import com.sun.javaws.util.JfxHelper;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Main
{
    private JFrame window;
    public Main()
    {
        window = new JFrame("Lab №15");
        window.setSize(750,500);
        window.add(new Interface1());
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }

}
