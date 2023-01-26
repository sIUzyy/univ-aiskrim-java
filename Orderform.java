package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Orderform extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textCont;
	private JTextField textAddress;
	private JLabel lblclock;
	private JLabel lblTransaction;
	protected Object frame;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Orderform frame = new Orderform();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void curDateTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		lblclock.setText(dtf.format(now));
	}
	public void ramdomnumbers() {
		Random ran = new Random();
		int n = ran.nextInt(1000000)+1;
		String val = String.valueOf(n);
		lblTransaction.setText(val);
	}

	/**
	 * Create the frame.
	 */
	public Orderform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-ice-cream-sundae-40.png"));
		lblNewLabel_10.setBounds(324, 16, 40, 35);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("ORDER FORM");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_9.setBounds(366, 28, 111, 23);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(28, 32, 222, 219);
		contentPane.add(lblNewLabel);
		lblNewLabel.setBorder(null);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (17).png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		textName = new JTextField();
		textName.setBackground(Color.WHITE);
		textName.setBounds(378, 62, 211, 23);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textCont = new JTextField();
		textCont.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		textCont.setBackground(Color.WHITE);
		textCont.setColumns(10);
		textCont.setBounds(378, 96, 211, 23);
		contentPane.add(textCont);
		
		textAddress = new JTextField();
		textAddress.setBackground(Color.WHITE);
		textAddress.setColumns(10);
		textAddress.setBounds(378, 130, 211, 23);
		contentPane.add(textAddress);
		
		JLabel lblContactNumber = new JLabel("Contact No.:");
		lblContactNumber.setFont(new Font("Arial", Font.BOLD, 12));
		lblContactNumber.setBounds(274, 95, 94, 25);
		contentPane.add(lblContactNumber);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Arial", Font.BOLD, 12));
		lblAddress.setBounds(274, 129, 94, 25);
		contentPane.add(lblAddress);
		
		JLabel lblDate = new JLabel("Date & Time:");
		lblDate.setFont(new Font("Arial", Font.BOLD, 12));
		lblDate.setBounds(274, 165, 94, 25);
		contentPane.add(lblDate);
		
		JLabel lblTran = new JLabel("Transaction No.:");
		lblTran.setFont(new Font("Arial", Font.BOLD, 12));
		lblTran.setBounds(274, 201, 94, 25);
		contentPane.add(lblTran);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setBackground(Color.BLACK);
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel your order?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					Orderform.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCancel.setBackground(Color.DARK_GRAY);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnCancel.setBackground(Color.BLACK);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnCancel.setBackground(Color.BLACK);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnCancel.setBackground(Color.DARK_GRAY);
			}
		});
		btnCancel.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancel.setBounds(378, 239, 94, 23);
		contentPane.add(btnCancel);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnConfirm.setBackground(Color.DARK_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnConfirm.setBackground(Color.BLACK);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnConfirm.setBackground(Color.BLACK);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnConfirm.setBackground(Color.DARK_GRAY);
			}
		});
		btnConfirm.setForeground(Color.WHITE);
		btnConfirm.setBackground(Color.BLACK);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textName.getText().equals("") || textCont.getText().equals("") || textAddress.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please input all the needed requirements");
				}
				else {
					String date = JOptionPane.showInputDialog(null, "Time Ordered: ");
					String ref = JOptionPane.showInputDialog(null, "Transaction Number: ");
					JOptionPane.showMessageDialog(null, "Order Successfully. Thank You For Supporting Ais' Krim!\n\nDate & Time Ordered: "+date +"\n\nReference Number: "+ref);
					Dash dashboard = new Dash();
					dashboard.setVisible(true);
					dispose();
				}
				
			}
		});
		btnConfirm.setFont(new Font("Arial", Font.BOLD, 12));
		btnConfirm.setBounds(500, 239, 89, 23);
		contentPane.add(btnConfirm);
		
		lblclock = new JLabel("");
		lblclock.setFont(new Font("Arial", Font.BOLD, 12));
		lblclock.setBounds(378, 170, 211, 14);
		contentPane.add(lblclock);
		
		lblTransaction = new JLabel("New label");
		lblTransaction.setFont(new Font("Arial", Font.BOLD, 12));
		lblTransaction.setBounds(378, 206, 211, 14);
		contentPane.add(lblTransaction);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(378, 195, 211, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (19).png"));
		lblNewLabel_1.setBounds(220, 0, 280, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (20).png"));
		lblNewLabel_1_1.setBounds(220, 265, 280, 35);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (19).png"));
		lblNewLabel_4.setBounds(500, 0, 111, 40);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (20).png"));
		lblNewLabel_5.setBounds(500, 265, 99, 35);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (20).png"));
		lblNewLabel_3.setBounds(0, 265, 71, 35);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (19).png"));
		lblNewLabel_2.setBounds(0, 0, 71, 40);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (20).png"));
		lblNewLabel_6.setBounds(69, 265, 151, 35);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (19).png"));
		lblNewLabel_7.setBounds(69, 0, 151, 40);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-ice-cream-in-waffle-30.png"));
		lblNewLabel_8.setBounds(442, 209, 30, 30);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("");
		lblNewLabel_8_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-ice-cream-in-waffle-30.png"));
		lblNewLabel_8_1.setBounds(559, 209, 30, 30);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Arial", Font.BOLD, 12));
		lblName.setBounds(274, 61, 94, 25);
		contentPane.add(lblName);
		setUndecorated(true);
		setLocationRelativeTo(null);
		curDateTime();
		ramdomnumbers();
	}
}
