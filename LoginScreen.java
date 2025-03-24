import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Нэвтрэх");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblUser = new JLabel("Хэрэглэгчийн нэр:");
        lblUser.setBounds(20, 20, 120, 25);
        frame.add(lblUser);

        JTextField txtUser = new JTextField();
        txtUser.setBounds(150, 20, 120, 25);
        frame.add(txtUser);

        JLabel lblPass = new JLabel("Нууц үг:");
        lblPass.setBounds(20, 60, 120, 25);
        frame.add(lblPass);

        JPasswordField txtPass = new JPasswordField();
        txtPass.setBounds(150, 60, 120, 25);
        frame.add(txtPass);

        JButton btnLogin = new JButton("Нэвтрэх");
        btnLogin.setBounds(100, 110, 100, 30);
        frame.add(btnLogin);

        btnLogin.addActionListener(e -> {
            System.out.println("Нэвтрэх товч дарагдлаа. Хэрэглэгч: " + txtUser.getText());
            frame.dispose(); // Одоогийн цонх хаах
            ProductScreen.showProductScreen(); // Барааны жагсаалтын цонх нээх
        });

        frame.setVisible(true);
    }
}
