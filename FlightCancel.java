import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlightCancel extends JFrame implements ActionListener {
    Container c;
    JPanel p1, p2;
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField t1, t2, t3, t4, t5;
    JButton b1, b2;
    FlightCancel() {
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

        l1 = new JLabel("FLIGHT CANCEL");
        l1.setFont(new Font("Calibri(Body)", Font.BOLD, 18));
        l1.setBounds(25, 200, 150, 40);
        add(l1);

        p2 = new JPanel();
        p2.setSize(1920, 50);
        p2.setBackground(Color.decode("#3333cc"));

        l2 = new JLabel("Customer & Flight Details");
        l2.setFont(new Font("Calibri(Body)", Font.BOLD, 18));
        l2.setBounds(640, 5, 250, 40);
        add(l2);

        l3 = new JLabel("Name:");
        l3.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l3.setBounds(250, 70, 150, 30);
        add(l3);

        l4 = new JLabel("Flight ID:");
        l4.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l4.setBounds(250, 110, 150, 30);
        add(l4);

        l5 = new JLabel("Seat Count:");
        l5.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l5.setBounds(250, 150, 150, 30);
        add(l5);

        l6 = new JLabel("Destination:");
        l6.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l6.setBounds(250, 190, 150, 30);
        add(l6);

        l7 = new JLabel("Departure:");
        l7.setFont(new Font("Calibri(Body)", Font.BOLD, 15));
        l7.setBounds(250, 230, 150, 30);
        add(l7);

        t1 = new JTextField();
        t1.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        t1.setBounds(450, 70, 500, 30);
        add(t1);

        t2 = new JTextField();
        t2.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        t2.setBounds(450, 110, 500, 30);
        add(t2);

        t3 = new JTextField();
        t3.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        t3.setBounds(450, 150, 500, 30);
        add(t3);

        t4 = new JTextField();
        t4.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        t4.setBounds(450, 190, 500, 30);
        add(t4);

        t5 = new JTextField();
        t5.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        t5.setBounds(450, 190, 500, 30);
        add(t5);

        t5 = new JTextField();
        t5.setFont(new Font("Calibri(Body)", Font.PLAIN, 15));
        t5.setBounds(450, 230, 500, 30);
        add(t5);

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
        add(p2);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1) {
            FlightCancel1 flightCancel1 = new FlightCancel1();
            this.setVisible(false);
            flightCancel1.setVisible(true);
        }
        else if(ae.getSource() == b2) {
            JOptionPane.showMessageDialog(null, "Flight Cancellation Successful");
        }
    }
}
