




import java.awt.*;
import javax.swing.*;





public class Main extends JFrame {

    JLabel myLlable =new JLabel ("hello bro");


    public Main() {
        super("welocome gui");
        setSize(200, 200);
        getContentPane().add(myLlable);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }



    public static void main(String[] args) {

        Main ab=new Main();
                System.out.println("Hello world!");
    }
}