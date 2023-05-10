import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI2 extends JFrame implements ActionListener {
    Container c;
    JButton b1, b2, b3, b4, b5, b6, b7;

    UI2() {
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

        b1 = new JButton("Reservation");
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFont(new Font("Calibri(Body)",Font.BOLD,18));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.decode("#3399ff"));
        b1.setBounds(265,200,200,50);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Flight Info");
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFont(new Font("Calibri(Body)",Font.BOLD,18));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.decode("#3399ff"));
        b2.setBounds(515,200,200,50);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Price Info");
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFont(new Font("Calibri(Body)",Font.BOLD,18));
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.decode("#3399ff"));
        b3.setBounds(765,200,200,50);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("Transaction Info");
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setFont(new Font("Calibri(Body)",Font.BOLD,18));
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.decode("#3399ff"));
        b4.setBounds(265,300,200,50);
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton("Record");
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setFont(new Font("Calibri(Body)",Font.BOLD,18));
        b5.setForeground(Color.WHITE);
        b5.setBackground(Color.decode("#3399ff"));
        b5.setBounds(515,300,200,50);
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("Flight Cancel");
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setFont(new Font("Calibri(Body)",Font.BOLD,18));
        b6.setForeground(Color.WHITE);
        b6.setBackground(Color.decode("#3399ff"));
        b6.setBounds(765,300,200,50);
        b6.addActionListener(this);
        add(b6);

        b7 = new JButton("Back");
        b7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b7.setFont(new Font("Calibri(Body)",Font.BOLD,18));
        b7.setForeground(Color.WHITE);
        b7.setBackground(Color.decode("#ff9966"));
        b7.setBounds(515,450,200,50);
        b7.addActionListener(this);
        add(b7);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            Reservation reservation = new Reservation();
            this.setVisible(false);
            reservation.setVisible(true);
        }
        else if(ae.getSource() == b2) {
            FlightInfo flightInfo = new FlightInfo();
            this.setVisible(false);
            flightInfo.setVisible(true);
        }
        else if(ae.getSource() == b3) {
            PriceInfo priceInfo = new PriceInfo();
            this.setVisible(false);
            priceInfo.setVisible(true);
        }
        else if(ae.getSource() == b4) {
            TransactionInfo transactionInfo = new TransactionInfo();
            this.setVisible(false);
            transactionInfo.setVisible(true);
        }
        else if(ae.getSource() == b5) {
            Record record = new Record();
            this.setVisible(false);
            record.setVisible(true);
        }
        else if(ae.getSource() == b6) {
            FlightCancel1 flightCancel1 = new FlightCancel1();
            this.setVisible(false);
            flightCancel1.setVisible(true);
        } else if (ae.getSource() == b7) {
            UI1 loginForm = new UI1();
            this.setVisible(false);
            loginForm.setVisible(true);
        }
    }
}
