import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlightInfo extends JFrame implements ActionListener {
    Container c;
    JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    JButton b1;

    FlightInfo(){
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

        l1 = new JLabel("FLIGHT INFO");
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
        p3.setBackground(Color.decode("#bdc9c1"));

        p4 = new JPanel();
        p4.setBounds(350, 120,750, 30);
        p4.setBackground(Color.decode("#bdc9c1"));

        p5 = new JPanel();
        p5.setBounds(350, 160,750, 30);
        p5.setBackground(Color.decode("#bdc9c1"));

        p6 = new JPanel();
        p6.setBounds(350, 200,750, 30);
        p6.setBackground(Color.decode("#bdc9c1"));

        p7 = new JPanel();
        p7.setBounds(300, 280,850, 40);
        p7.setBackground(Color.decode("#3333cc"));

        p8 = new JPanel();
        p8.setBounds(350, 330,750, 30);
        p8.setBackground(Color.decode("#bdc9c1"));

        p9 = new JPanel();
        p9.setBounds(350, 370,750, 30);
        p9.setBackground(Color.decode("#bdc9c1"));

        p10 = new JPanel();
        p10.setBounds(350, 410,750, 30);
        p10.setBackground(Color.decode("#bdc9c1"));

        l3 = new JLabel("1. Bangladesh To United States - Time: 9 PM");
        l3.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        l3.setBounds(550, 80,750, 30);
        add(l3);

        l4 = new JLabel("2. Bangladesh To Canada - Time: 10 PM");
        l4.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        l4.setBounds(550, 120,750, 30);
        add(l4);

        l5 = new JLabel("3. Bangladesh To Germany - Time: 8 PM");
        l5.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        l5.setBounds(550, 160,750, 30);
        add(l5);

        l6 = new JLabel("4. Bangladesh To Australia - Time: 11PM");
        l6.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        l6.setBounds(550, 200,750, 30);
        add(l6);

        l7 = new JLabel(" Domestic Flight");
        l7.setFont(new Font("Calibri(Body)", Font.BOLD, 18));
        l7.setBounds(300, 0,850, 50);
        p7.add(l7);

        l8 = new JLabel("1. Dhaka To Cox's Bazar - US Bangla Airlines -Time: 8 AM");
        l8.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        l8.setBounds(550, 330,750, 30);
        add(l8);

        l9 = new JLabel("2. Dhaka To Barisal - Novo Airlines - Time: 10 AM");
        l9.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        l9.setBounds(550, 370,750, 30);
        add(l9);

        l10 = new JLabel("3. Dhaka To Jessore - Biman Bangladesh Airlines - Time: 9 AM");
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
