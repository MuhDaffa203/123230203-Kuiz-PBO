package Main;

import Login.loginpackage;
import javax.swing.SwingUtilities;

public class mainpackage{
    public static void main(String[] args){
    SwingUtilities.invokeLater(() -> new loginpackage());
    }

}