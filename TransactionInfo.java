import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransactionInfo extends JFrame implements ActionListener {
    Container c;
    JPanel p1;
    JLabel l1, l2, l3, l4;
    JRadioButton r1, r2, r3;
    ButtonGroup grp;
    JTextField t1, t2;
    JButton b1, b2;

    TransactionInfo() {
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

        l1 = new JLabel("TRANSACTION INFO");
        l1.setFont(new Font("Calibri(Body)", Font.BOLD, 18));
        l1.setBounds(10, 200, 200, 40);
        add(l1);

        l2 = new JLabel("Card Type:");
        l2.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l2.setBounds(300, 50, 150, 30);
        add(l2);

        grp = new ButtonGroup();

        r1 = new JRadioButton("Mastard Card / Debit Card / Credit Card");
        r1.setFont(new Font("Calibri(Body)", Font.BOLD, 14));
        r1.setBackground(Color.decode("#99ccff"));
        r1.setBounds(400, 50, 300, 20);
        add(r1);

        r2 = new JRadioButton("Google Pay");
        r2.setFont(new Font("Calibri(Body)", Font.BOLD, 14));
        r2.setBackground(Color.decode("#99ccff"));
        r2.setBounds(400, 100, 150, 20);
        add(r2);

        r3 = new JRadioButton("Apple Pay");
        r3.setFont(new Font("Calibri(Body)", Font.BOLD, 14));
        r3.setBackground(Color.decode("#99ccff"));
        r3.setBounds(400, 150, 150, 20);
        add(r3);

        grp.add(r1);
        grp.add(r2);
        grp.add(r3);

        l3 = new JLabel("Customer ID:");
        l3.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l3.setBounds(300, 250, 150, 30);
        add(l3);

        l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l4.setBounds(300, 300, 150, 30);
        add(l4);

        t1 = new JTextField();
        t1.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        t1.setBounds(450, 250, 500, 30);
        add(t1);

        t2 = new JTextField();
        t2.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        t2.setBounds(450, 300, 500, 30);
        add(t2);

        b1 = new JButton("Back");
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFont(new Font("Calibri(Body)",Font.BOLD,18));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.decode("#ff9966"));
        b1.setBounds(750,600,150,40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("OK");
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFont(new Font("Calibri(Body)",Font.BOLD,18));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.decode("#ff9966"));
        b2.setBounds(950,600,150,40);
        b2.addActionListener(this);
        add(b2);

        add(p1);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1) {
            UI2 ui2 = new UI2();
            this.setVisible(false);
            ui2.setVisible(true);
        }
        else if(ae.getSource() == b2) {
            JOptionPane.showMessageDialog(null, "Payment Successful");
        }
    }
}
