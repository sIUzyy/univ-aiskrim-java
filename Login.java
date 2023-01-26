package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private JLabel lblMessage;
	
	int attempt=1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		panel.setBackground(Color.WHITE);
		panel.setBounds(315, 195, 250, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textUsername = new JTextField();
		textUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textUsername.getText().equals("Username")) {
					textUsername.setText("");
					}
				else {
					textUsername.selectAll();
					
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textUsername.getText().equals(""))
					textUsername.setText("Username");
			}
		});
		textUsername.setBorder(null);
		textUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		textUsername.setText("Username");
		textUsername.setHorizontalAlignment(SwingConstants.CENTER);
		textUsername.setBounds(10, 11, 230, 20);
		panel.add(textUsername);
		textUsername.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(315, 245, 250, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textPassword = new JPasswordField();
		textPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textPassword.getText().equals("Password")) {
					textPassword.setEchoChar('●');
					textPassword.setText("");
				}
				else {
					textPassword.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textPassword.getText().equals("")) {
					textPassword.setText("Password");
					textPassword.setEchoChar((char)0); 
				}
					
			}
		});
		textPassword.setFont(new Font("Arial", Font.PLAIN, 12));
		textPassword.setBorder(null);
		textPassword.setEchoChar((char)0);
		textPassword.setText("Password");
		textPassword.setHorizontalAlignment(SwingConstants.CENTER);
		textPassword.setBounds(10, 11, 230, 20);
		panel_1.add(textPassword);
		
		JButton btnLogin = new JButton("LOG IN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textUsername.getText().equals("justin") && textPassword.getText().equals("icecream")) {
					lblMessage.setText("");
					JOptionPane.showMessageDialog(null, "Login Successful!");
					Dash dashboard = new Dash();
					dashboard.setVisible(true);
					dispose();
				}
				else if(textUsername.getText().equals("") || textUsername.getText().equals("Username") ||
						textPassword.getText().equals("") || textPassword.getText().equals("Password")) {
					lblMessage.setText("Please input all needed requirements!");
					
				}
				else if(attempt!=3) {
						Login login=new Login();
						JOptionPane.showMessageDialog(login, "Login Failed. 3 attempts only.");
				}
				else {
					JOptionPane.showMessageDialog(null, "Your failed attempts exeeded to 3. Wait for 5 minutes and try again.");
					textUsername.setEditable(false);
					textPassword.setEnabled(false);
				} 
				attempt++;
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLogin.setBackground(Color.DARK_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnLogin.setBackground(Color.BLACK);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnLogin.setBackground(Color.BLACK);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnLogin.setBackground(Color.DARK_GRAY);
			}
		});
		btnLogin.setBorder(null);
		btnLogin.setBackground(new Color(0, 0, 0));
		btnLogin.setFont(new Font("Arial", Font.BOLD, 15));
		btnLogin.setBounds(315, 321, 250, 50);
		contentPane.add(btnLogin);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 250, 200);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (4).png"));
		lblNewLabel_2.setBounds(0, 0, 250, 200);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblexit = new JLabel("X");
		lblexit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					Login.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblexit.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				lblexit.setForeground(Color.BLACK);
			}
		});
		lblexit.setForeground(Color.BLACK);
		lblexit.setFont(new Font("Arial", Font.BOLD, 15));
		lblexit.setHorizontalAlignment(SwingConstants.CENTER);
		lblexit.setBounds(564, 0, 36, 31);
		contentPane.add(lblexit);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-username-30.png"));
		lblNewLabel_1.setBounds(279, 195, 36, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-sign-in-form-password-30.png"));
		lblNewLabel_1_1.setBounds(279, 245, 36, 40);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-login-30.png"));
		lblNewLabel_1_1_1.setBounds(279, 321, 36, 50);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (1).png"));
		lblNewLabel_2_1.setBounds(0, 200, 250, 200);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled_design__5_-removebg-preview.png"));
		lblNewLabel_3.setBounds(270, 42, 75, 140);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled_design__6_-removebg-preview.png"));
		lblNewLabel_4.setBounds(355, 62, 100, 100);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("New label");
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled_design__7_-removebg-preview.png"));
		lblNewLabel_4_1.setBounds(465, 62, 100, 100);
		contentPane.add(lblNewLabel_4_1);
		
		lblMessage = new JLabel("");
		lblMessage.setFont(new Font("Arial", Font.BOLD, 12));
		lblMessage.setForeground(Color.RED);
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(315, 296, 250, 14);
		contentPane.add(lblMessage);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled_design__8_-removebg-preview.png"));
		lblNewLabel.setBounds(250, 0, 70, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled_design__9_-removebg-preview.png"));
		lblNewLabel_5.setBounds(315, 0, 70, 40);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("New label");
		lblNewLabel_5_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled_design__8_-removebg-preview.png"));
		lblNewLabel_5_1.setBounds(386, 0, 70, 40);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("New label");
		lblNewLabel_5_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled_design__9_-removebg-preview.png"));
		lblNewLabel_5_1_1.setBounds(455, 0, 70, 40);
		contentPane.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("New label");
		lblNewLabel_5_1_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled_design__8_-removebg-preview.png"));
		lblNewLabel_5_1_1_1.setBounds(520, 0, 70, 40);
		contentPane.add(lblNewLabel_5_1_1_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("New label");
		lblNewLabel_5_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled_design__9_-removebg-preview.png"));
		lblNewLabel_5_2.setBounds(295, 13, 70, 40);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("New label");
		lblNewLabel_5_1_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled_design__8_-removebg-preview.png"));
		lblNewLabel_5_1_2.setBounds(484, 13, 70, 40);
		contentPane.add(lblNewLabel_5_1_2);
		
		JLabel lblNewLabel_5_1_1_2 = new JLabel("New label");
		lblNewLabel_5_1_1_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled_design__9_-removebg-preview.png"));
		lblNewLabel_5_1_1_2.setBounds(535, 0, 70, 40);
		contentPane.add(lblNewLabel_5_1_1_2);
		
		JLabel lblNewLabel_5_1_1_1_1 = new JLabel("New label");
		lblNewLabel_5_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled_design__8_-removebg-preview.png"));
		lblNewLabel_5_1_1_1_1.setBounds(404, 13, 70, 40);
		contentPane.add(lblNewLabel_5_1_1_1_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(246, 59, 25, -6);
		contentPane.add(label);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled_design__10_-removebg-preview.png"));
		lblNewLabel_6.setBounds(244, 33, 25, 356);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled_design__10_-removebg-preview.png"));
		lblNewLabel_6_1.setBounds(565, 33, 25, 356);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled_design__11_-removebg-preview.png"));
		lblNewLabel_7.setBounds(260, 33, 330, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled_design__11_-removebg-preview.png"));
		lblNewLabel_7_1.setBounds(260, 375, 330, 14);
		contentPane.add(lblNewLabel_7_1);
		setUndecorated(true);
		setLocationRelativeTo(null);
	}
}
