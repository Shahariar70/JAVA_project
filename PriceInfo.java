import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PriceInfo extends JFrame implements ActionListener {
    Container c;
    JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    JButton b1;

    PriceInfo(){
        setTitle("Airlines Management System");
        setSize(1280,720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#99ccff"));

        ImageIcon img = new ImageIcon("logo.png");
        this.setIconImage(img.getImage());

        p1 = new JPanel();
        p1.setSize(200, 1080);
        p1.setBackground(Color.decode("#3333cc"));

        l1 = new JLabel("PRICE INFO");
        l1.setFont(new Font("Calibri(Body)", Font.BOLD, 18));
        l1.setBounds(25, 200, 150, 40);
        add(l1);

        p2 = new JPanel();
        p2.setBounds(300, 30,850, 40);
        p2.setBackground(Color.decode("#3333cc"));

        l2 = new JLabel(" Abroad Flight");
        l2.setFont(new Font("Calibri(Body)", Font.BOLD, 18));
        l2.setBounds(300, 0,850, 50);
        p2.add(l2);

        p3 = new JPanel();
        p3.setBounds(350, 80,750, 30);
        p3.setBackground(Color.gray);

        p4 = new JPanel();
        p4.setBounds(350, 120,750, 30);
        p4.setBackground(Color.gray);

        p5 = new JPanel();
        p5.setBounds(350, 160,750, 30);
        p5.setBackground(Color.gray);

        p6 = new JPanel();
        p6.setBounds(350, 200,750, 30);
        p6.setBackground(Color.gray);

        p7 = new JPanel();
        p7.setBounds(300, 280,850, 40);
        p7.setBackground(Color.decode("#3333cc"));

        p8 = new JPanel();
        p8.setBounds(350, 330,750, 30);
        p8.setBackground(Color.gray);

        p9 = new JPanel();
        p9.setBounds(350, 370,750, 30);
        p9.setBackground(Color.gray);

        p10 = new JPanel();
        p10.setBounds(350, 410,750, 30);
        p10.setBackground(Color.gray);

        l3 = new JLabel("1. Bangladesh - United States: 60,000 BDT");
        l3.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        l3.setBounds(550, 80,750, 30);
        add(l3);

        l4 = new JLabel("2. Bangladesh - Canada: 50,000 BDT");
        l4.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        l4.setBounds(550, 120,750, 30);
        add(l4);

        l5 = new JLabel("3. Bangladesh - Germany: 40,000 BDT");
        l5.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        l5.setBounds(550, 160,750, 30);
        add(l5);

        l6 = new JLabel("4. Bangladesh - Australia: 55,000 BDT");
        l6.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        l6.setBounds(550, 200,750, 30);
        add(l6);

        l7 = new JLabel(" Domestic Flight");
        l7.setFont(new Font("Calibri(Body)", Font.BOLD, 18));
        l7.setBounds(300, 0,850, 50);
        p7.add(l7);

        l8 = new JLabel("1. Dhaka - Cox's Bazar: 5,000 BDT");
        l8.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        l8.setBounds(550, 330,750, 30);
        add(l8);

        l9 = new JLabel("2. Dhaka - Barisal: 3,000 BDT");
        l9.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        l9.setBounds(550, 370,750, 30);
        add(l9);

        l10 = new JLabel("3. Dhaka - Jessore: 2,500 BDT");
        l10.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        l10.setBounds(550, 410,750, 30);
        add(l10);

        b1 = new JButton("Back");
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFont(new Font("Calibri(Body)",Font.BOLD,18));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.decode("#ff9966"));
        b1.setBounds(950,600,150,40);
        b1.addActionListener(this);
        add(b1);

        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        add(p6);
        add(p7);
        add(p8);
        add(p9);
        add(p10);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            UI2 ui2 = new UI2();
            this.setVisible(false);
            ui2.setVisible(true);
        }
    }
}
