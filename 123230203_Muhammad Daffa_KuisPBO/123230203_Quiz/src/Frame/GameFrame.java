package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame implements ActionListener {
    private JTextField player1Field, player2Field;
    private JRadioButton batu1, kertas1, gunting1, batu2, kertas2, gunting2;
    private JButton playButton, resetButton, logoutButton;
    private JLabel resultLabel;
    private ButtonGroup group1, group2;

    public GameFrame() {
        setTitle("Game Batu Kertas Gunting");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        JLabel player1Label = new JLabel("Nama Player 1:");
        player1Field = new JTextField();
        
        JLabel player2Label = new JLabel("Nama Player 2:");
        player2Field = new JTextField();
        
        JLabel pilihLabel = new JLabel("Pilih Batu, Kertas, atau Gunting:");
        
        batu1 = new JRadioButton("🗿 Batu");
        kertas1 = n