package my.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PosEkspres extends JFrame implements ActionListener {
    private JButton button,button2;
    private JLabel label;
    private JRadioButton[]type = new JRadioButton[4];

    public PosEkspres(){
        //Labels
        label = new JLabel("Please choose type of package");
        label.setBounds(50,0,300,20);
        add(label);

        //Radio Buttons
        type[0] = new JRadioButton("LG");
        type[0].setBounds(100,50,150,20);
        type[1] = new JRadioButton("LE(C5)");
        type[1].setBounds(100,100,150,20);
        type[2] = new JRadioButton("LD(B4)");
        type[2].setBounds(100,150,150,20);
        type[3] = new JRadioButton("LK");
        type[3].setBounds(100,200,150,20);

        for(int i=0; i<4; i++){
            add(type[i]);
            type[i].addActionListener(this);
        }

        button = new JButton("Confirm");
        button.setBounds(100,250,80,30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(JRadioButton button: type){
                    if(button.isSelected()){
                        new PosEkspres2();
                        dispose();
                    }
                }
            }
        });

        add(button);

        button2 = new JButton("Back");
        button2.setBounds(200,250,80,30);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainFrame();
                dispose();
            }
        });

        add(button2);


        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pos Ekspres");
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e){
        int max = 0;

        for(int i=0; i<4; i++){
            if(type[i].isSelected()){
                max++;
            }
        }

        for(JRadioButton button: type){
            if (max == 1){
                if(!button.isSelected()){
                    button.setEnabled(false);
                }
            }
            else{
                if(max < 1){
                    button.setEnabled(true);
                }
            }
        }
    }

}

class PosEkspres2 {
    public PosEkspres2(){

        JFrame frame = new JFrame("Pos Ekspres");

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





        String data[][]={ {"Saiz","                  220mm x 110mm","                  229mm x 162mm","                  353mm x 250mm","                  340mm x 250mm"},
                {"Berat Max (gm)","                             100","                             250","                             500","                             1000"},
                {"Ketebalan Max","                            3mm","                            5mm","                           10mm","                            25mm"},
                {"Harga (RM)","                             3.18","                             3.71","                             4.77","                             7.42"}
        };
        String column[]={"Jenis","LG","LE(C5)","LD(B4)","LK"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);


        //Labels
        JLabel label1 = new JLabel("Package Quantity: ");
        label1.setBounds(10,230,150,25);
        frame.add(label1);
        JTextField textField1 = new JTextField(20);
        textField1.setBounds(120,230,250,25);
        frame.add(textField1);

        JLabel label2 = new JLabel("Package Weight: ");
        label2.setBounds(10,280,150,25);
        frame.add(label2);
        JTextField textField2 = new JTextField(20);
        textField2.setBounds(120,280,250,25);
        frame.add(textField2);

        JButton button = new JButton("Confirm");
        button.setBounds(100,350,80,25);
        frame.add(button);


        JButton button2 = new JButton("Back");
        button2.setBounds(200,350,80,25);


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PosEkspres();
                frame.dispose();
            }
        });
        frame.add(button2);



        frame.add(sp);
        frame.setSize(1000,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
