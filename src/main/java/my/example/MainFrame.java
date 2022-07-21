package my.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JButton b1, b2, b3, b4, b5,b6;
    private JFrame f;

    public MainFrame() {
        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout(8, 6));
        mainContainer.setBackground(Color.WHITE);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.GRAY));

        b1 = new JButton("Next-Day Delivery");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new NextDayDelivery();
                dispose();
            }
        });
        add(b1);

        b2 = new JButton("Same-Day Delivery");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SameDayDelivery();
                dispose();
            }
        });
        add(b2);

        b3 = new JButton("Prepaid Box and Envelope");
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PrepaidBoxEnvelope();
                dispose();
            }
        });
        add(b3);

        b4 = new JButton("Pos Ekspres");
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PosEkspres();
                dispose();
            }
        });
        add(b4);


        b5 = new JButton("Receipt");
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Receipt();
                dispose();
            }
        });
        add(b5);

        b6 = new JButton("Back");
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Choice();
                dispose();
            }
        });
        add(b6);

        //Frame
        setTitle("Pos Laju Malaysia");
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(520, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

