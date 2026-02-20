import java.io.IOException;
import  javax.swing.*;
import java.awt.event.*;
import javax.swing.JButton;

public class tocahuevos {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Apagar el pc");
        JButton boton = new JButton("Apagar");

        boton.addActionListener(new ActionListener(){
            @Override
            public void  actionPerformed(ActionEvent e) {
                try {
                    Runtime.getRuntime().exec("shutdaown /s /t 0");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        ventana.add(boton);
        ventana.setSize(200, 100);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }
}
