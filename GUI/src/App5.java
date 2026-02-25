import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App5 extends JFrame{
    public App5(){
        setTitle("Ejemplo de paneles con Layout");
        setLocation(200,300);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1,panel2,panel3,panel4,panel5;
        panel1=new JPanel(); panel1.add(new JLabel("PANEL 1"),FlowLayout.LEFT);
        panel2=new JPanel(); panel2.add(new JLabel("PANEL 2",FlowLayout.RIGHT));
        panel3=new JPanel(); panel3.add(new JLabel("PANEL 3"));
        panel4=new JPanel(); panel4.add(new JLabel("PANEL 4"));
        panel5=new JPanel(); panel5.add(new JLabel("PANEL 5"));

        add(panel1,BorderLayout.NORTH);
        add(panel2,BorderLayout.SOUTH);
        add(panel3,BorderLayout.WEST);
        add(panel4,BorderLayout.EAST);
        add(panel5,BorderLayout.CENTER);
        
        setVisible(true);
    }
    public static void main(String[] args) {
        App5 ejemplo= new App5();
    }
}