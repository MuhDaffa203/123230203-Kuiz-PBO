package Login;

import Frame.GameFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginpackage extends JFrame{
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton logiButton;
    private final String USERNAME = "Daffa";
    private final String PASSWORD = "203";
    
    public loginpackage(){
    
        setTitle("Login");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,2));
        
        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);
        
        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        
        JButton loginButton = new JButton("Login");
        add(logiButton);
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText().trim();
                String password = new String(passwordField.getPassword()).trim();
            
                if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                    dispose();
                    new GameFrame();
                            } else {
                    JOptionPane.showMessageDialog(null, "Login Gagal! Username dan password salah.", "Error",JOptionPane.ERROR_MESSAGE);
                }
            }   
        });
            setVisible(true);
        }
    
    }
  
        
            
    
