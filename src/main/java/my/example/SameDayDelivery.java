package my.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SameDayDelivery {

    public SameDayDelivery(){
        JFrame frame = new JFrame("Same Day Delivery");

        //Menus
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);

        JMenu file = new JMenu("File");
        menubar.add(file);
        JMenuItem open = new JMenuItem("Open");
        JMenuItem settings = new JMenuItem("Settings");
        JMenuItem print = new JMenuItem("Print");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(open);
        file.add(settings);
        file.add(print);
        file.add(exit);

        JMenu edit = new JMenu("Edit");
        menubar.add(edit);
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        JMenuItem delete = new JMenuItem("Delete");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(delete);

        JMenu help = new JMenu("Help");
        menubar.add(help);
        JMenuItem about = new JMenuItem("About");
        help.add(about);



        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



        JLabel label1 = new JLabel("Town Area(Local Town/Cross Town): ");
        label1.setBounds(10,230,250,25);
        frame.add(label1);
        JTextField textField1 = new JTextField(20);
        textField1.setBounds(220,230,150,25);
        frame.add(textField1);

        JLabel label2 = new JLabel("Package Weight: ");
        label2.setBounds(10, 280,250,25 );
        frame.add(label2);
        JTextField textField2 = new JTextField(20);
        textField2.setBounds(220,280,150,25);
        frame.add(textField2);

        JButton button = new JButton("Confirm");
        button.setBounds(100,350,80,25);
        frame.add(button);






        JButton button2 = new JButton("Back");
        button2.setBounds(200, 350, 80, 25);//100, 80, 80, 25
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainFrame();
                frame.dispose();
            }
        });

        frame.add(button2);






        String columnA1[]={"","Local Town","Cross Town"};
        String columnA2[]={" ","Domestic Charge","Surcharge","Total","Domestic Charge","Surcharge","Total"};
        String data1[][]={ {"Below 500gm","                  4.90","                  6.00","                  10.90","                  5.40","                  7.50","                  12.90"},
                {"500gm - 750gm","                  5.70","                  6.00","                  11.70","                  6.40","                  7.50","                  13.90"},
                {"750gm - 1kg","                  6.50","                  6.00","                  12.50","                  7.40","                  7.50","                  14.90"},


        };
        String data0[][]={};



        JTable jt2=new JTable(data0,columnA1);
        jt2.getColumnModel().getColumn(0).setPreferredWidth(5);
        jt2.getColumnModel().getColumn(1).setPreferredWidth(295);
        jt2.getColumnModel().getColumn(2).setPreferredWidth(295);
        jt2.setPreferredScrollableViewportSize(jt2.getPreferredSize());

        JTable jt=new JTable(data1,columnA2);


        JScrollPane sp2=new JScrollPane(jt2);
        JScrollPane sp=new JScrollPane(jt);

        frame.add(sp2,BorderLayout.NORTH);
        frame.add(sp, BorderLayout.CENTER);
        frame.setSize(1000,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}

