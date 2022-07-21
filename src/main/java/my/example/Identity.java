package my.example;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Identity extends  JFrame {
    public Identity() {
        //Frame
        super("Details");
        setSize(400, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        JPanel panelTop = new JPanel();
        cp.add(panelTop, BorderLayout.NORTH);

        //Labels
        JLabel image = new JLabel(new ImageIcon("write.png"));
        JLabel label = new JLabel("Name");
        JTextField tf = new JTextField(20);
        panelTop.add(image);
        panelTop.add(label);
        panelTop.add(tf);

        JPanel panelCentre = new JPanel();
        cp.add(panelCentre, BorderLayout.CENTER);
        JTextArea ta = new JTextArea();
        panelCentre.setLayout(new GridLayout());
        ta.append("Welcome to Pos Laju Malaysia. Please enter your detail here");
        panelCentre.add(ta);

        JPanel panelBottom = new JPanel();
        cp.add(panelBottom, BorderLayout.SOUTH);
        panelBottom.setLayout(new GridLayout(2, 2));
        JButton button1 = new JButton("Send");
        JButton button2 = new JButton("Clear");
        JButton button3 = new JButton("Reset");
        JButton button4 = new JButton("Back");
        panelBottom.add(button1);
        panelBottom.add(button2);
        panelBottom.add(button3);
        panelBottom.add(button4);

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Choice();
                dispose();
            }
        });

        cp.revalidate();
        cp.repaint();
    }

}

