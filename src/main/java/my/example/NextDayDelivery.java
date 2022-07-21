package my.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NextDayDelivery extends JFrame implements ActionListener {
    private JButton button,button2;
    private JLabel label;
    private JCheckBox[] zone = new JCheckBox[5];

    public NextDayDelivery() {
        //Labels
        label = new JLabel("Please select your zone");
        label.setBounds(50, 0, 300, 20);
        add(label);

        //Check Boxes
        zone[0] = new JCheckBox("Zone 1");
        zone[0].setBounds(100, 50, 150, 20);
        zone[1] = new JCheckBox("Zone 2");
        zone[1].setBounds(100, 100, 150, 20);
        zone[2] = new JCheckBox("Zone 3");
        zone[2].setBounds(100, 150, 150, 20);
        zone[3] = new JCheckBox("Zone 4");
        zone[3].setBounds(100, 200, 150, 20);
        zone[4] = new JCheckBox("Zone 5");
        zone[4].setBounds(100, 250, 150, 20);

        for (int i = 0; i < 5; i++) {
            add(zone[i]);
            zone[i].addActionListener(this);
        }

        //Buttons
        button = new JButton("Confirm");
        button.setBounds(100, 300, 80, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(JCheckBox box: zone){
                    if(box.isSelected()){
                        new NextDayDeliveryType();
                        dispose();
                    }
                }
            }
        });

        button2 = new JButton("Back");
        button2.setBounds(200, 300, 80, 30);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainFrame().setVisible(true);
                setVisible(false);
            }
        });

        add(button);
        add(button2);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Next-Day Delivery");
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        int max = 0;

        for (int i = 0; i < 5; i++) {
            if (zone[i].isSelected()) {
                max++;
            }
        }

        for (JCheckBox box : zone) {
            if (max == 1) {
                if (!box.isSelected()) {
                    box.setEnabled(false);
                }
            } else {
                if (max < 1) {
                    box.setEnabled(true);
                }
            }
        }
    }

}


class NextDayDeliveryType  {
    public NextDayDeliveryType() {
        JFrame frame = new JFrame("Next-Day Delivery");

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


        String columnA1[]={"","Document (below 2kg)","Parcel (above 2kg)"};
        String columnA2[]={" ","First 500gm","Subsequent 250gm","2.001-2.5kg","Subsequent 500gm"};
        String data1[][]={ {"Zone 1","                        4.90","                        0.80","                        10.50","                        0.50"},
                {"Zone 2","                        5.40","                        1.00","                        16.00","                        2.00"},
                {"Zone 3","                        6.90","                        1.50","                        21.00","                        3.00"},
                {"Zone 4","                        7.40","                        1.50","                        26.00","                        3.50"},
                {"Zone 5","                        7.90","                        2.00","                        31.00","                        4.00"},
        };
        String data0[][]={};



        JTable jt2=new JTable(data0,columnA1);
        jt2.getColumnModel().getColumn(0).setPreferredWidth(5);
        jt2.getColumnModel().getColumn(1).setPreferredWidth(210);
        jt2.getColumnModel().getColumn(2).setPreferredWidth(210);
        jt2.setPreferredScrollableViewportSize(jt2.getPreferredSize());

        JTable jt=new JTable(data1,columnA2);


        JScrollPane sp2=new JScrollPane(jt2);
        JScrollPane sp=new JScrollPane(jt);


        JLabel label1 = new JLabel("Type of package(Document/Parcel): ");
        label1.setBounds(10, 230, 250, 25);
        frame.add(label1);
        JTextField textField1 = new JTextField(20);
        textField1.setBounds(220, 230, 150, 25);
        frame.add(textField1);

        JLabel label2 = new JLabel("Package Weight: ");
        label2.setBounds(10, 280, 250, 25);
        frame.add(label2);
        JTextField textField2 = new JTextField(20);
        textField2.setBounds(220, 280, 150, 25);
        frame.add(textField2);

        JButton button = new JButton("Confirm");
        button.setBounds(100, 350, 80, 25);
        frame.add(button);

        JButton button2 = new JButton("Back");
        button2.setBounds(200, 350, 80, 25);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new NextDayDelivery();
                frame.dispose();
            }
        });

        frame.add(button2);


        frame.add(sp2, BorderLayout.NORTH);
        frame.add(sp, BorderLayout.CENTER);
        frame.setSize(1000,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}