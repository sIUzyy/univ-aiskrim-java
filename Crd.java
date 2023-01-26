package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Crd extends JFrame {

	private JPanel contentPane;
	private JTextField txtCardNum;
	private JTextField txtName;
	private JTextField txtCVC;
	private JComboBox comboMonth = new JComboBox();
	private JComboBox comboYear = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Crd frame = new Crd();
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
	public Crd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 469);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 350, 459);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 191, 255));
		panel_1.setBounds(0, 0, 350, 459);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled_design__21_-removebg-preview.png"));
		lblNewLabel.setBounds(10, 11, 331, 150);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CARD NUMBER");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 172, 184, 30);
		panel_1.add(lblNewLabel_1);
		
		txtCardNum = new JTextField();
		txtCardNum.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtCardNum.setForeground(new Color(255, 255, 255));
		txtCardNum.setBackground(new Color(0, 191, 255));
		txtCardNum.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtCardNum.setHorizontalAlignment(SwingConstants.CENTER);
		txtCardNum.setFont(new Font("Arial", Font.PLAIN, 15));
		txtCardNum.setBounds(10, 213, 184, 30);
		panel_1.add(txtCardNum);
		txtCardNum.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 241, 141, 2);
		panel_1.add(separator);
		
		JLabel lblNewLabel_1_1 = new JLabel("CARD HOLDER NAME");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 254, 331, 30);
		panel_1.add(lblNewLabel_1_1);
		
		txtName = new JTextField();
		txtName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();

				if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
				txtName.setEditable(true);
				}
				else{
				txtName.setEditable(false);
				} 
			}
		});
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setForeground(Color.WHITE);
		txtName.setFont(new Font("Arial", Font.PLAIN, 15));
		txtName.setColumns(10);
		txtName.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtName.setBackground(new Color(0, 191, 255));
		txtName.setBounds(10, 295, 340, 30);
		panel_1.add(txtName);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CARD NUMBER");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(10, 336, 331, 30);
		panel_1.add(lblNewLabel_1_1_1);
		comboMonth.setFont(new Font("Arial", Font.PLAIN, 15));
		
		comboMonth.setBounds(10, 368, 160, 22);
		panel_1.add(comboMonth);
		comboMonth.addItem("JAN");
		comboMonth.addItem("FEB");
		comboMonth.addItem("MAR");
		comboMonth.addItem("APR");
		comboMonth.addItem("MAY");
		comboMonth.addItem("JUN");
		comboMonth.addItem("JUL");
		comboMonth.addItem("AUG");
		comboMonth.addItem("SEP");
		comboMonth.addItem("OCT");
		comboMonth.addItem("NOV");
		comboMonth.addItem("DEC");
		comboYear.setFont(new Font("Arial", Font.PLAIN, 15));
		
		comboYear.setBounds(190, 368, 160, 22);
		panel_1.add(comboYear);
		comboYear.addItem("2019");
		comboYear.addItem("2020");
		comboYear.addItem("2021");
		comboYear.addItem("2022");
		comboYear.addItem("2023");
		comboYear.addItem("2024");
		comboYear.addItem("2025");
		
		JLabel lblNewLabel_1_2 = new JLabel("CVC");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(210, 172, 140, 30);
		panel_1.add(lblNewLabel_1_2);
		
		txtCVC = new JTextField();
		txtCVC.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtCVC.setHorizontalAlignment(SwingConstants.CENTER);
		txtCVC.setForeground(Color.WHITE);
		txtCVC.setFont(new Font("Arial", Font.PLAIN, 15));
		txtCVC.setColumns(10);
		txtCVC.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtCVC.setBackground(new Color(0, 191, 255));
		txtCVC.setBounds(210, 213, 140, 30);
		panel_1.add(txtCVC);
		
		JButton btnPay = new JButton("PAY NOW");
		
		btnPay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnPay.setBackground(Color.WHITE);
				btnPay.setForeground(new Color (0, 191, 225));
				btnPay.setBorder(BorderFactory.createMatteBorder(1,1,1,1,new Color (0, 191, 225)));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtCardNum.getText().equals("") || txtCVC.getText().equals("") || txtName.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please input all needed requirements!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Payment sucessfully. We will now direct you to our confirmation form. Thank you!");
					Orderform of = new Orderform();
					of.setVisible(true);
					dispose();
				 {
				 }
				}
			}
		});
		btnPay.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				btnPay.setBackground(new Color (0, 191, 225));
				btnPay.setForeground(Color.WHITE);
				btnPay.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.WHITE));
			}
		});
		btnPay.setFont(new Font("Arial", Font.BOLD, 15));
		btnPay.setBounds(112, 408, 131, 30);
		panel_1.add(btnPay);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (1).png"));
		lblNewLabel_2_1.setBounds(374, 269, 250, 200);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\GIVE US.png"));
		lblNewLabel_3.setBounds(374, 200, 250, 69);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("X");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
						Crd.this.dispose();
					}
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					lblNewLabel_4.setForeground(Color.RED);
				}
				public void mouseExited(MouseEvent e) {
					lblNewLabel_4.setForeground(Color.BLACK);
				}
		});
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_4.setBounds(578, 5, 46, 30);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (4).png"));
		lblNewLabel_2.setBounds(374, 0, 250, 200);
		contentPane.add(lblNewLabel_2);
		setLocationRelativeTo(null);
		setUndecorated(true);
	}
}
