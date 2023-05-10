import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI1 extends JFrame implements ActionListener {
    Container c ;
    JLabel admin, userName, password;
    JTextField uName;
    JPasswordField pass;
    JButton refresh, ok;

    UI1() {
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

        admin = new JLabel("Admin");
        admin.setFont(new Font("Calibri(Body)", Font.BOLD, 20));
        admin.setBounds(590, 150, 100, 40);
        add(admin);

        userName = new JLabel("username:");
        userName.setFont(new Font("Calibri(Body)", Font.BOLD, 18));
        userName.setBounds(485, 200, 100, 40);
        add(userName);

        password = new JLabel("password:");
        password.setFont(new Font("Calibri(Body)", Font.BOLD, 18));
        password.setBounds(485, 260, 100, 40);
        add(password);

        uName = new JTextField(200);
        uName.setFont(new Font("Calibri(Body)", Font.PLAIN, 18));
        uName.setBounds(595,200, 200, 40);
        add(uName);

        pass = new JPasswordField();
        pass.setEchoChar('*');
        pass.setFont(new Font("Calibri(Body)", Font.PLAIN, 18));
        pass.setBounds(595,260, 200, 40);
        pass.addActionListener(this);
        add(pass);

        refresh = new JButton("Refresh");
        refresh.setCursor(new Cursor(Cursor.HAND_CURSOR));
        refresh.setFont(new Font("Calibri(Body)",Font.BOLD,18));
        refresh.setForeground(Color.WHITE);
        refresh.setBackground(Color.decode("#ff9966"));
        refresh.setBounds(485,350,150,40);
        refresh.addActionListener(this);
        add(refresh);

        ok = new JButton("OK");
        ok.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ok.setFont(new Font("Calibri(Body)",Font.BOLD,18));
        ok.setForeground(Color.WHITE);
        ok.setBackground(Color.decode("#ff9966"));
        ok.setBounds(665,350,150,40);
        ok.addActionListener(this);
        add(ok);
    }
    public void actionPerformed(ActionEvent ae) {
        String str = uName.getText();
        String pf = pass.getText();
        if(str.equals("Jubsha") && pf.equals("jubsha") & ae.getSource() == ok) {
            UI2 optionForm = new UI2();
            this.setVisible(false);
            optionForm.setVisible(true);
            optionForm.setLocationRelativeTo(null);
        }
        else if(ae.getSource() == refresh) {
            uName.setText("");
            pass.setText("");
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid username or password");
        }
    }
}
