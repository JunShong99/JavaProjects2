package my.example;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrepaidBoxEnvelope extends JFrame implements ActionListener{
    private JButton button,button2;
    private JLabel label;
    private JRadioButton envelope, prepaid;

    public PrepaidBoxEnvelope() {
        label = new JLabel("Please select your type of package");
        label.setBounds(50, 50, 300, 20);
        add(label);

        //Radio Buttons
        envelope = new JRadioButton("Envelope");
        envelope.setBounds(100, 100, 150, 20);
        envelope.addActionListener(this);
        prepaid = new JRadioButton("Prepaid Box");
        prepaid.setBounds(100, 150, 150, 20);
        prepaid.addActionListener(this);
        add(envelope);
        add(prepaid);

        button = new JButton("Confirm");
        button.setBounds(100, 200, 80, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(envelope.isSelected()){
                    new Envelope();
                    dispose();
                }
                else if(prepaid.isSelected()){
                    new PrepaidBox();
                    dispose();
                }

            }
        });


        button2 = new JButton("Back");
        button2.setBounds(200, 200, 80, 30);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainFrame();
                dispose();
            }
        });

        add(button);
        add(button2);

        //Frame
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Prepaid Box and Envelope");
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(envelope.isSelected()){
            prepaid.setEnabled(false);
        }
        else{
            prepaid.setEnabled(true);
        }

        if(prepaid.isSelected()){
            envelope.setEnabled(false);
        }
        else{
            envelope.setEnabled(true);
        }

    }

}

class PrepaidBox {
    public PrepaidBox(){
        JFrame frame = new JFrame("Prepaid Box");

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




        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        JLabel label1 = new JLabel("Choose your type of package: ");
        label1.setBounds(10,230,250,25);//10,20,250,25
        frame.add(label1);
        JCheckBox s = new JCheckBox("S");
        s.setBounds(200,230,50,25);//200,20,50,25
        frame.add(s);
        JCheckBox m = new JCheckBox("M");
        m.setBounds(250,230,50,25);//250,20,50,25);
        frame.add(m);
        JCheckBox l = new JCheckBox("L");
        l.setBounds(300,230,50,25);//300,20,50,25
        frame.add(l);

        JLabel label2 = new JLabel("Package Quantity: ");
        label2.setBounds(10,280,250,25);//10,50,250,25)
        frame.add(label2);
        JTextField textField1 = new JTextField(20);
        textField1.setBounds(200,280,200,25);//200,50,200,25
        frame.add(textField1);

        JLabel label3 = new JLabel("Package Weight: ");
        label3.setBounds(10,330,250,25);//10,80,250,25)
        frame.add(label3);
        JTextField textField2 = new JTextField(20);
        textField2.setBounds(200,330,200,25);//200,80,200,25
        frame.add(textField2);

        JButton button = new JButton("Confirm");
        button.setBounds(100,390,80,25);//100,130,80,25
        frame.add(button);

        JButton button2 = new JButton("Back");
        button2.setBounds(200,390,80,25);//200,130,80,25)


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PrepaidBoxEnvelope();
                frame.dispose();
            }
        });
        frame.add(button2);



        String data[][]={ {"Saiz","         280mm x 200mm","         380mm x 320mm","   340mm x 250mm x 80mm","   340mm x 250mm x 150mm","   380mm x 320mm x 200mm"},
                {"Berat Max ","                    500g","                    1kg","                    2kg","                    5kg","                    10kg"},
                {"Harga ","                 RM7.31","                 RM10.49","                 RM13.78","                 RM21.20","                 RM31.80"}
        };
        String column[]={"Jenis","Envelope S","Envelope L","Prepaid Box S","Prepaid Box M","Prepaid Box L"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);

        frame.add(sp);
        frame.setVisible(true);

    }
}

class Envelope {
    public Envelope(){
        JFrame frame = new JFrame("Envelope");

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

        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        frame.add(panel);


        JLabel label1 = new JLabel("Choose your type of package: ");
        label1.setBounds(10,230,250,25);
        frame.add(label1);
        JCheckBox s = new JCheckBox("S");
        s.setBounds(200,230,50,25);
        frame.add(s);
        JCheckBox l = new JCheckBox("L");
        l.setBounds(250,230,50,25);
        frame.add(l);

        JLabel label2 = new JLabel("Package quantity: ");
        label2.setBounds(10,280,250,25);
        frame.add(label2);
        JTextField textField1 = new JTextField(20);
        textField1.setBounds(200,280,200,25);
        frame.add(textField1);

        JLabel label3 = new JLabel("Package Weight: ");
        label3.setBounds(10,330,250,25);
        frame.add(label3);
        JTextField textField2 = new JTextField(20);
        textField2.setBounds(200,330,200,25);
        frame.add(textField2);

        JButton button = new JButton("Confirm");
        button.setBounds(100,390,80,25);
        frame.add(button);


        JButton button2 = new JButton("Back");
        button2.setBounds(200,390,80,25);


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PrepaidBoxEnvelope();
                frame.dispose();
            }
        });
        frame.add(button2);


        String data[][]={ {"Saiz","         280mm x 200mm","         380mm x 320mm","   340mm x 250mm x 80mm","   340mm x 250mm x 150mm","   380mm x 320mm x 200mm"},
                {"Berat Max ","                    500g","                    1kg","                    2kg","                    5kg","                    10kg"},
                {"Harga ","                 RM7.31","                 RM10.49","                 RM13.78","                 RM21.20","                 RM31.80"}
        };
        String column[]={"Jenis","Envelope S","Envelope L","Prepaid Box S","Prepaid Box M","Prepaid Box L"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);

        frame.add(sp);
        frame.setVisible(true);
    }
}
