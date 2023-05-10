import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Record extends JFrame implements ActionListener {
    Container c;
    JPanel p1, p2;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8,t9, t10, t11, t12, t13;
    JRadioButton male, female;
    ButtonGroup grp;
    JButton b1, b2;

    Record() {
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

        l1 = new JLabel("Record");
        l1.setFont(new Font("Calibri(Body)", Font.BOLD, 18));
        l1.setBounds(25, 200, 150, 40);
        add(l1);

        p2 = new JPanel();
        p2.setSize(1920, 50);
        p2.setBackground(Color.decode("#3333cc"));

        l2 = new JLabel("Customer Information Desk");
        l2.setFont(new Font("Calibri(Body)", Font.BOLD, 18));
        l2.setBounds(600, 5, 250, 40);
        add(l2);

        add(p1);
        add(p2);

        l3 = new JLabel("Name:");
        l3.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l3.setBounds(250, 70, 150, 20);
        add(l3);

        l4 = new JLabel("Age:");
        l4.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l4.setBounds(250, 105, 150, 20);
        add(l4);

        l5 = new JLabel("Gender:");
        l5.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l5.setBounds(250, 140, 150, 20);
        add(l5);

        l6 = new JLabel("Address:");
        l6.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l6.setBounds(250, 175, 150, 20);
        add(l6);

        l7 = new JLabel("Mobile:");
        l7.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l7.setBounds(250, 210, 150, 20);
        add(l7);

        l8 = new JLabel("Email:");
        l8.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l8.setBounds(250, 245, 150, 20);
        add(l8);

        l9 = new JLabel("Nationality:");
        l9.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l9.setBounds(250, 280, 150, 20);
        add(l9);

        l10 = new JLabel("Destination:");
        l10.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l10.setBounds(250, 315, 150, 20);
        add(l10);

        l11 = new JLabel("Seat Count:");
        l11.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l11.setBounds(250, 350, 150, 20);
        add(l11);

        l12 = new JLabel("Departure Time: ");
        l12.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l12.setBounds(250, 385, 150, 20);
        add(l12);

        l13 = new JLabel("Passport No:");
        l13.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l13.setBounds(250, 420, 150, 20);
        add(l13);

        l14 = new JLabel("Flight ID:");
        l14.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l14.setBounds(250, 455, 150, 20);
        add(l14);

        l15 = new JLabel("Customer ID:");
        l15.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l15.setBounds(250, 490, 150, 20);
        add(l15);

        l16 = new JLabel("Bill:");
        l16.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l16.setBounds(250, 525, 150, 20);
        add(l16);

        t1 = new JTextField();
        t1.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        t1.setBounds(450, 70, 500, 25);
        add(t1);

        t2 = new JTextField();
        t2.setFont(new Font("Calibri(Body)", Font.PLAIN, 14));
        t2.setBounds(450, 105, 500, 25);
        add(t2);

        t3 = new JTextField();
        t3.setFont(new Font("Calibri(Body)", Font.PLAIN, 14));
        t3.setBounds(450, 175, 500, 25);
        add(t3);

        t4 = new JTextField();
        t4.setFont(new Font("Calibri(Body)", Font.PLAIN, 14));
        t4.setBounds(450, 210, 500, 25);
        add(t4);

        t5 = new JTextField();
        t5.setFont(new Font("Calibri(Body)", Font.PLAIN, 14));
        t5.setBounds(450, 245, 500, 25);
        add(t5);

        t6 = new JTextField();
        t6.setFont(new Font("Calibri(Body)", Font.PLAIN, 14));
        t6.setBounds(450, 280, 500, 25);
        add(t6);

        t7 = new JTextField();
        t7.setFont(new Font("Calibri(Body)", Font.PLAIN, 14));
        t7.setBounds(450, 315, 500, 25);
        add(t7);

        t8 = new JTextField();
        t8.setFont(new Font("Calibri(Body)", Font.PLAIN, 14));
        t8.setBounds(450, 350, 500, 25);
        add(t8);

        t9 = new JTextField();
        t9.setFont(new Font("Calibri(Body)", Font.PLAIN, 14));
        t9.setBounds(450, 385, 500, 25);
        add(t9);

        t10 = new JTextField();
        t10.setFont(new Font("Calibri(Body)", Font.PLAIN, 14));
        t10.setBounds(450, 420, 500, 25);
        add(t10);

        t11 = new JTextField();
        t11.setFont(new Font("Calibri(Body)", Font.PLAIN, 14));
        t11.setBounds(450, 455, 500, 25);
        add(t11);

        t12 = new JTextField();
        t12.setFont(new Font("Calibri(Body)", Font.PLAIN, 14));
        t12.setBounds(450, 490, 500, 25);
        add(t12);

        t13 = new JTextField();
        t13.setFont(new Font("Calibri(Body)", Font.PLAIN, 14));
        t13.setBounds(450, 525, 500, 25);
        add(t13);

        grp = new ButtonGroup();

        male = new JRadioButton("Male");
        male.setFont(new Font("Calibri(Body)", Font.BOLD, 14));
        male.setBackground(Color.decode("#99ccff"));
        male.setBounds(450, 140, 150, 20);
        add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Calibri(Body)", Font.BOLD, 14));
        female.setBackground(Color.decode("#99ccff"));
        female.setBounds(620, 140, 150, 20);
        add(female);

        grp.add(male);
        grp.add(female);

        b1 = new JButton("Back");
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFont(new Font("Calibri(Body)",Font.BOLD,18));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.decode("#ff9966"));
        b1.setBounds(750,600,150,40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Update");
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFont(new Font("Calibri(Body)",Font.BOLD,18));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.decode("#ff9966"));
        b2.setBounds(950,600,150,40);
        b2.addActionListener(this);
        add(b2);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1) {
            UI2 ui2 = new UI2();
            this.setVisible(false);
            ui2.setVisible(true);
        }
        else if(ae.getSource() == b2) {
            JOptionPane.showMessageDialog(null, "Information Updated");
        }
    }
}
