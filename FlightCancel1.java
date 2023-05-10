import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlightCancel1 extends JFrame implements ActionListener {
    Container c;
    JPanel p1;
    JLabel l1, l2;
    JTextField t1;
    JButton b1, b2;

    FlightCancel1() {
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

        l2 = new JLabel("Customer ID:");
        l2.setFont(new Font("Calibri(Body)", Font.BOLD, 18));
        l2.setBounds(250, 70, 150, 40);
        add(l2);

        t1 = new JTextField();
        t1.setFont(new Font("Calibri(Body)", Font.PLAIN, 18));
        t1.setBounds(450, 70, 500, 40);
        add(t1);

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
            FlightCancel flightCancel = new FlightCancel();
            this.setVisible(false);
            flightCancel.setVisible(true);
        }
    }
}
