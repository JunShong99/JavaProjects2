package my.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Receipt extends JFrame{
    public Receipt() {

        //Menus
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);

        JMenu file = new JMenu("File");
        menubar.add(file);
        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);

        JMenu help = new JMenu("Help");
        menubar.add(help);
        JMenuItem contact = new JMenuItem("Contact");
        help.add(contact);

        setTitle("Receipt");
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainFrame().setVisible(true);
                setVisible(false);
            }
        });

        contact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Contact().setVisible(true);
                setVisible(false);
            }

        });
    }
}

class Contact extends JFrame{
    private JButton b1;
    public Contact(){

        //Buttons
        b1 = new JButton("OK");


        JPanel pBottom = new JPanel();
        add(pBottom, BorderLayout.SOUTH);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Receipt().setVisible(true);
                setVisible(false);
            }
        });

        pBottom.add(b1);
        setTitle("Contact");
        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

}
