package my.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PosLajuMalaysia {
    public static void main(String[] args) {
        Choice choice = new Choice();
    }
}

class Choice extends MenuItem{
    JButton b1, b2;
    public Choice(){

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        JPanel pTop = new JPanel();
        cp.add(pTop, BorderLayout.NORTH);

        JPanel pCenter = new JPanel();
        cp.add(pCenter, BorderLayout.CENTER);
        pCenter.setBackground(Color.WHITE);

        JLabel jl2 = new JLabel();
        jl2.setText("Welcome To Pos Laju Malaysia");
        pCenter.add(jl2);

        JPanel pBottom = new JPanel();
        cp.add(pBottom, BorderLayout.SOUTH);
        b1 = new JButton("Next");
        b2 = new JButton("Exit");
        pBottom.add(b1);
        pBottom.add(b2);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainFrame().setVisible(true);
                setVisible(false);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setTitle("Pos Laju Malaysia");
        setVisible(true);
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setJMenuBar();
    }

    private void setJMenuBar() {

    }
}


class MenuItem extends JFrame{

    private JButton button1;
    public MenuItem() {

        //Menus
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);

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

        setTitle("Menu");
        setVisible(true);
        setSize(400, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Identity().setVisible(true);
                setVisible(false);
            }
        });
    }

}
