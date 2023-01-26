package Main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dash extends JFrame {

	private JPanel contentPane;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JButton btnMenu;
	private JButton btnOrderNow;
	private JButton btnLogout;
	private JButton btnHome;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLayeredPane layeredPane;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton;
	private JButton btnIceCream;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JPanel panel5;
	private JPanel panel6;
	private JPanel panel7;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_20;
	private JButton btnNewButton_1;
	private JButton btnIceCream_1;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JLabel lblNewLabel_21;
	private JButton btnNewButton_8;
	private JButton btnIceCream_2;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JLabel lblNewLabel_22;
	private JButton btnNewButton_12;
	private JButton btnIceCream_3;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JLabel lblNewLabel_23;
	private JButton btnNewButton_16;
	private JButton btnIceCream_4;
	private JButton btnNewButton_17;
	private JButton btnNewButton_18;
	private JButton btnNewButton_19;
	private JPanel panel_7;
	private JPanel panel_8;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JLabel lblNewLabel_26;
	private JLabel lblNewLabel_27;
	private JLabel lblNewLabel_28;
	private JLabel lblNewLabel_29;
	private JLabel lblNewLabel_30;
	private JLabel lblNewLabel_31;
	private JLabel lblNewLabel_32;
	private JLabel lblNewLabel_33;
	private JTextField txtQty1;
	private JTextField txtQty2;
	private JTextField txtQty3;
	private JTextField txtQty4;
	private JTextField txtCost1;
	private JTextField txtCost2;
	private JTextField txtCost3;
	private JTextField txtCost4;
	private JTextField txtSub1;
	private JTextField txtSub2;
	private JTextField txtSub3;
	private JTextField txtSub4;
	private JLabel lblNewLabel_34;
	private JLabel lblNewLabel_35;
	private JLabel lblNewLabel_36;
	private JLabel lblNewLabel_37;
	private JLabel lblNewLabel_38;
	private JLabel lblNewLabel_39;
	private JTextField txtQty9;
	private JTextField txtQty10;
	private JTextField txtQty11;
	private JTextField txtQty12;
	private JTextField txtCost12;
	private JTextField txtCost11;
	private JTextField txtCost10;
	private JTextField txtCost9;
	private JLabel lblNewLabel_40;
	private JLabel lblNewLabel_41;
	private JTextField txtSub9;
	private JTextField txtSub10;
	private JTextField txtSub11;
	private JTextField txtSub12;
	private JLabel lblNewLabel_42;
	private JLabel lblNewLabel_43;
	private JPanel panel_9;
	private JLabel lblNewLabel_44;
	private JLabel lblNewLabel_45;
	private JLabel lblNewLabel_46;
	private JLabel lblNewLabel_47;
	private JLabel lblNewLabel_48;
	private JLabel lblNewLabel_49;
	private JLabel lblNewLabel_50;
	private JLabel lblNewLabel_51;
	private JTextField txtQty5;
	private JTextField txtQty6;
	private JTextField txtQty7;
	private JTextField txtQty8;
	private JTextField txtCost5;
	private JTextField txtCost6;
	private JTextField txtCost7;
	private JTextField txtCost8;
	private JTextField txtSub5;
	private JTextField txtSub6;
	private JTextField txtSub7;
	private JTextField txtSub8;
	private JPanel panel_10;
	private JLabel lblNewLabel_52;
	private JLabel lblNewLabel_53;
	private JLabel lblNewLabel_54;
	private JLabel lblNewLabel_55;
	private JLabel lblNewLabel_56;
	private JLabel lblNewLabel_57;
	private JTextField txtQty13;
	private JTextField txtQty14;
	private JTextField txtQty15;
	private JTextField txtQty16;
	private JTextField txtCost16;
	private JTextField txtCost15;
	private JTextField txtCost14;
	private JTextField txtCost13;
	private JLabel lblNewLabel_58;
	private JLabel lblNewLabel_59;
	private JTextField txtSub13;
	private JTextField txtSub14;
	private JTextField txtSub15;
	private JTextField txtSub16;
	private JTextField txtAmount;
	private JTextField txtVat;
	private JTextField txtDiscount;
	private JTextField txtTAmount;
	private JTextField txtAmountT;
	private JLabel lblNewLabel_60;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JSeparator separator_6;
	private JSeparator separator_7;
	private JSeparator separator_5;
	private JSeparator separator_8;
	private JLabel lblNewLabel_61;
	private JLabel lblNewLabel_62;
	private JLabel lblNewLabel_63;
	private JLabel lblNewLabel_64;
	private JPanel panel_2;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JPanel panel_3;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JPanel panel_4;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JPanel panel_5;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JPanel panel_6;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JPanel panel_11;
	private JLabel label_25;
	private JLabel label_26;
	private JLabel label_27;
	private JLabel label_28;
	private JLabel label_29;
	private JLabel lblNewLabel_42_1_1_1_2_1_2;
	private JTextField txtChange;
	private JButton btnNewButton_21;
	private JButton btnNewButton_22;
	private JButton btnNewButton_23;
	
	//GLOBAL VARIABLE FOR ICE CREAM
    double IceCreamP_Strawberry = 40;
    double IceCreamP_Vanilla = 30;
    double IceCreamP_Cookies = 50;
    double IceCreamP_Mango = 50;

    //GLOBAL VARIABLE FOR ICE CREAM ROLLS
    double IceR_Vanilla = 330;
    double IceR_Chocolate = 330;
    double IceR_Strawberry = 340;
    double IceR_Cookies = 350;

    //GLOBAL VARIABLE FOR ICE CREAM CAKE
    double IceC_oreo = 1199;
    double IceC_Cheesecake = 1399;
    double IceC_RedV = 1399;
    double IceC_MangoG = 1199;

    //GLOBAL VARIABLE FOR ICE CREAM WAFFLE
    double IceW_MangoP = 440;
    double IceW_Strawberry = 440;
    double IceW_Vanilla  = 430;
    double IceW_Cookies = 450;

    // CHECKOUT DATA

    double Vat = 12;
    double vat,Change;
    double discount;
    private JLabel lblNewLabel_65_1_2;
    private JLabel lblNewLabel_66;
    private JLabel lblNewLabel_17;
    private JLabel lblNewLabel_18;
    private JSeparator separator_11;
    private JSeparator separator_13;
    private JSeparator separator_14;
    private JSeparator separator_15;
    private JSeparator separator_16;
    private JSeparator separator_17;
    private JSeparator separator_18;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dash frame = new Dash();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void switchPanels(JPanel panel)
	{
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	/**
	 * Create the frame.
	 */
	public Dash() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Downloads\\Untitled design (1).png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 830);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 103, 664, 646);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		layeredPane.add(panel1, "name_172077341319500");
		panel1.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (22).png"));
		lblNewLabel.setBounds(10, 11, 644, 214);
		panel1.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\311223944_1533609417060715_3706212188223131616_n.png"));
		lblNewLabel_2.setBounds(10, 311, 644, 200);
		panel1.add(lblNewLabel_2);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 544, 664, 102);
		panel1.add(panel_2);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-facebook-23.png"));
		label.setBounds(228, 11, 23, 23);
		panel_2.add(label);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-twitter-23.png"));
		label_1.setBounds(308, 11, 23, 23);
		panel_2.add(label_1);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-instagram-23.png"));
		label_2.setBounds(386, 11, 23, 23);
		panel_2.add(label_2);
		
		label_3 = new JLabel("Boni Ave, Mandaluyong, 1550 Metro Manila");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_3.setBounds(202, 38, 245, 39);
		panel_2.add(label_3);
		
		label_4 = new JLabel("Copyright @ 2022 All Rights Reserved");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_4.setBounds(202, 63, 245, 39);
		panel_2.add(label_4);
		
		lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (9).gif"));
		lblNewLabel_17.setBounds(10, 236, 140, 100);
		panel1.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (9).gif"));
		lblNewLabel_18.setBounds(514, 236, 140, 100);
		panel1.add(lblNewLabel_18);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		layeredPane.add(panel2, "name_172083752980800");
		panel2.setLayout(null);
		
		lblNewLabel_3 = new JLabel("Filter By");
		lblNewLabel_3.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblNewLabel_3.setBounds(37, 99, 117, 23);
		panel2.add(lblNewLabel_3);
		
		btnNewButton = new JButton("All");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(new Color(153,180,290));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(Color.WHITE);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton.setBackground(Color.WHITE);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnNewButton.setBackground(new Color(153,180,290));
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel2);
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(37, 159, 117, 23);
		panel2.add(btnNewButton);
		
		btnIceCream = new JButton("Ice Cream");
		btnIceCream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel4);
			}
		});
		btnIceCream.setHorizontalAlignment(SwingConstants.LEFT);
		btnIceCream.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnIceCream.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnIceCream.setBackground(Color.WHITE);
		btnIceCream.setBounds(37, 193, 117, 23);
		panel2.add(btnIceCream);
		
		btnNewButton_2 = new JButton("Ice Cream Roll");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel5);
			}
		});
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(37, 227, 117, 23);
		panel2.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Ice Cream Cake");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel6);
			}
		});
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(37, 261, 117, 23);
		panel2.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Ice Cream Waffle");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel7);
			}
		});
		btnNewButton_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_4.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setBounds(37, 295, 117, 23);
		panel2.add(btnNewButton_4);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\309700844_638411144601777_1379330082550608517_n.png"));
		lblNewLabel_4.setBounds(37, 11, 55, 49);
		panel2.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\301562963_1241595879957625_3824780351369949722_n.png"));
		lblNewLabel_5.setBounds(496, 11, 55, 49);
		panel2.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\266386641_2891096441193437_5830540323230669555_n.png"));
		lblNewLabel_6.setBounds(324, 11, 55, 49);
		panel2.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\310922969_1260284798089737_5033886732396454397_n.png"));
		lblNewLabel_7.setBounds(183, 11, 55, 49);
		panel2.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Free Delivery");
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_8.setBounds(94, 21, 79, 14);
		panel2.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("To Your Door");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(94, 36, 79, 14);
		panel2.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Local Pickup");
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_10.setBounds(235, 21, 79, 14);
		panel2.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Check Out");
		lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(235, 36, 79, 14);
		panel2.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("Available For You");
		lblNewLabel_12.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_12.setBounds(377, 21, 96, 14);
		panel2.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("Online Support 24/7");
		lblNewLabel_13.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_13.setBounds(377, 36, 109, 14);
		panel2.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("Order On The Go");
		lblNewLabel_14.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_14.setBounds(545, 21, 96, 14);
		panel2.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("Download Our App");
		lblNewLabel_15.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_15.setBounds(545, 36, 109, 14);
		panel2.add(lblNewLabel_15);
		
		lblNewLabel_60 = new JLabel("");
		lblNewLabel_60.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\311176966_1270452603779338_386509514165930175_n.png"));
		lblNewLabel_60.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_60.setBounds(220, 99, 488, 435);
		panel2.add(lblNewLabel_60);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(37, 124, 117, 8);
		panel2.add(separator);
		
		separator_6 = new JSeparator();
		separator_6.setForeground(Color.BLACK);
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(172, 11, 1, 49);
		panel2.add(separator_6);
		
		separator_7 = new JSeparator();
		separator_7.setForeground(Color.BLACK);
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(313, 11, 1, 2);
		panel2.add(separator_7);
		
		separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setForeground(Color.BLACK);
		separator_5.setBounds(313, 11, 1, 49);
		panel2.add(separator_5);
		
		separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setForeground(Color.BLACK);
		separator_8.setBounds(496, 11, 1, 49);
		panel2.add(separator_8);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 545, 664, 102);
		panel2.add(panel_3);
		
		label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-facebook-23.png"));
		label_5.setBounds(228, 11, 23, 23);
		panel_3.add(label_5);
		
		label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-twitter-23.png"));
		label_6.setBounds(308, 11, 23, 23);
		panel_3.add(label_6);
		
		label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-instagram-23.png"));
		label_7.setBounds(386, 11, 23, 23);
		panel_3.add(label_7);
		
		label_8 = new JLabel("Boni Ave, Mandaluyong, 1550 Metro Manila");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_8.setBounds(202, 38, 245, 39);
		panel_3.add(label_8);
		
		label_9 = new JLabel("Copyright @ 2022 All Rights Reserved");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_9.setBounds(202, 63, 245, 39);
		panel_3.add(label_9);
		
		JLabel lblNewLabel_65 = new JLabel("");
		lblNewLabel_65.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design.gif"));
		lblNewLabel_65.setBounds(10, 329, 193, 205);
		panel2.add(lblNewLabel_65);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setForeground(Color.BLACK);
		separator_9.setBounds(0, 543, 664, 2);
		panel2.add(separator_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setForeground(Color.BLACK);
		separator_10.setBounds(0, 0, 664, 2);
		panel2.add(separator_10);
		
		panel3 = new JPanel();
		panel3.setBackground(Color.WHITE);
		layeredPane.add(panel3, "name_172086149750400");
		panel3.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.control);
		textArea.setBounds(300, 363, 354, 272);
		panel3.add(textArea);
		
		panel_7 = new JPanel();
		panel_7.setBounds(10, 39, 315, 137);
		panel3.add(panel_7);
		panel_7.setLayout(null);
		
		lblNewLabel_26 = new JLabel("ITEM");
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_26.setBounds(29, 11, 46, 14);
		panel_7.add(lblNewLabel_26);
		
		lblNewLabel_27 = new JLabel("STRAWBERRY");
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_27.setBounds(10, 36, 107, 14);
		panel_7.add(lblNewLabel_27);
		
		lblNewLabel_28 = new JLabel("VANILLA");
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_28.setBounds(10, 61, 80, 14);
		panel_7.add(lblNewLabel_28);
		
		lblNewLabel_29 = new JLabel("COOKIES & CREAM");
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_29.setBounds(10, 86, 93, 14);
		panel_7.add(lblNewLabel_29);
		
		lblNewLabel_30 = new JLabel("MANGO");
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_30.setBounds(10, 111, 93, 14);
		panel_7.add(lblNewLabel_30);
		
		lblNewLabel_31 = new JLabel("QTY");
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_31.setBounds(116, 11, 46, 14);
		panel_7.add(lblNewLabel_31);
		
		lblNewLabel_32 = new JLabel("ITEM COST");
		lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32.setBounds(172, 11, 62, 14);
		panel_7.add(lblNewLabel_32);
		
		lblNewLabel_33 = new JLabel("SUB TOTAL");
		lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_33.setBounds(243, 11, 62, 14);
		panel_7.add(lblNewLabel_33);
		
		txtQty1 = new JTextField();
		txtQty1.setHorizontalAlignment(SwingConstants.CENTER);
		txtQty1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtQty1.setBounds(116, 33, 46, 20);
		panel_7.add(txtQty1);
		txtQty1.setColumns(10);
		
		txtQty2 = new JTextField();
		txtQty2.setHorizontalAlignment(SwingConstants.CENTER);
		txtQty2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtQty2.setColumns(10);
		txtQty2.setBounds(116, 58, 46, 20);
		panel_7.add(txtQty2);
		
		txtQty3 = new JTextField();
		txtQty3.setHorizontalAlignment(SwingConstants.CENTER);
		txtQty3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtQty3.setColumns(10);
		txtQty3.setBounds(116, 83, 46, 20);
		panel_7.add(txtQty3);
		
		txtQty4 = new JTextField();
		txtQty4.setHorizontalAlignment(SwingConstants.CENTER);
		txtQty4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtQty4.setColumns(10);
		txtQty4.setBounds(116, 108, 46, 20);
		panel_7.add(txtQty4);
		
		txtCost1 = new JTextField();
		txtCost1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtCost1.setHorizontalAlignment(SwingConstants.CENTER);
		txtCost1.setEditable(false);
		txtCost1.setColumns(10);
		txtCost1.setBounds(170, 33, 64, 20);
		panel_7.add(txtCost1);
		
		txtCost2 = new JTextField();
		txtCost2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtCost2.setHorizontalAlignment(SwingConstants.CENTER);
		txtCost2.setEditable(false);
		txtCost2.setColumns(10);
		txtCost2.setBounds(170, 58, 64, 20);
		panel_7.add(txtCost2);
		
		txtCost3 = new JTextField();
		txtCost3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtCost3.setHorizontalAlignment(SwingConstants.CENTER);
		txtCost3.setEditable(false);
		txtCost3.setColumns(10);
		txtCost3.setBounds(170, 83, 64, 20);
		panel_7.add(txtCost3);
		
		txtCost4 = new JTextField();
		txtCost4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtCost4.setHorizontalAlignment(SwingConstants.CENTER);
		txtCost4.setEditable(false);
		txtCost4.setColumns(10);
		txtCost4.setBounds(170, 108, 64, 20);
		panel_7.add(txtCost4);
		
		txtSub1 = new JTextField();
		txtSub1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtSub1.setHorizontalAlignment(SwingConstants.CENTER);
		txtSub1.setEditable(false);
		txtSub1.setColumns(10);
		txtSub1.setBounds(241, 33, 64, 20);
		panel_7.add(txtSub1);
		
		txtSub2 = new JTextField();
		txtSub2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtSub2.setHorizontalAlignment(SwingConstants.CENTER);
		txtSub2.setEditable(false);
		txtSub2.setColumns(10);
		txtSub2.setBounds(241, 58, 64, 20);
		panel_7.add(txtSub2);
		
		txtSub3 = new JTextField();
		txtSub3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtSub3.setHorizontalAlignment(SwingConstants.CENTER);
		txtSub3.setEditable(false);
		txtSub3.setColumns(10);
		txtSub3.setBounds(241, 83, 64, 20);
		panel_7.add(txtSub3);
		
		txtSub4 = new JTextField();
		txtSub4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtSub4.setHorizontalAlignment(SwingConstants.CENTER);
		txtSub4.setEditable(false);
		txtSub4.setColumns(10);
		txtSub4.setBounds(241, 108, 64, 20);
		panel_7.add(txtSub4);
		
		panel_8 = new JPanel();
		panel_8.setBounds(339, 39, 315, 137);
		panel3.add(panel_8);
		panel_8.setLayout(null);
		
		lblNewLabel_34 = new JLabel("ITEM");
		lblNewLabel_34.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_34.setBounds(29, 11, 46, 14);
		panel_8.add(lblNewLabel_34);
		
		lblNewLabel_35 = new JLabel("STRAWBERRY");
		lblNewLabel_35.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_35.setBounds(10, 36, 107, 14);
		panel_8.add(lblNewLabel_35);
		
		lblNewLabel_36 = new JLabel("VANILLA");
		lblNewLabel_36.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_36.setBounds(10, 61, 80, 14);
		panel_8.add(lblNewLabel_36);
		
		lblNewLabel_37 = new JLabel("COOKIES & CREAM");
		lblNewLabel_37.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_37.setBounds(10, 86, 93, 14);
		panel_8.add(lblNewLabel_37);
		
		lblNewLabel_38 = new JLabel("MANGO");
		lblNewLabel_38.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_38.setBounds(10, 111, 93, 14);
		panel_8.add(lblNewLabel_38);
		
		lblNewLabel_39 = new JLabel("QTY");
		lblNewLabel_39.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_39.setBounds(116, 11, 46, 14);
		panel_8.add(lblNewLabel_39);
		
		txtQty9 = new JTextField();
		txtQty9.setHorizontalAlignment(SwingConstants.CENTER);
		txtQty9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtQty9.setColumns(10);
		txtQty9.setBounds(116, 33, 46, 20);
		panel_8.add(txtQty9);
		
		txtQty10 = new JTextField();
		txtQty10.setHorizontalAlignment(SwingConstants.CENTER);
		txtQty10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtQty10.setColumns(10);
		txtQty10.setBounds(116, 58, 46, 20);
		panel_8.add(txtQty10);
		
		txtQty11 = new JTextField();
		txtQty11.setHorizontalAlignment(SwingConstants.CENTER);
		txtQty11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtQty11.setColumns(10);
		txtQty11.setBounds(116, 83, 46, 20);
		panel_8.add(txtQty11);
		
		txtQty12 = new JTextField();
		txtQty12.setHorizontalAlignment(SwingConstants.CENTER);
		txtQty12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtQty12.setColumns(10);
		txtQty12.setBounds(116, 108, 46, 20);
		panel_8.add(txtQty12);
		
		txtCost12 = new JTextField();
		txtCost12.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtCost12.setHorizontalAlignment(SwingConstants.CENTER);
		txtCost12.setEditable(false);
		txtCost12.setColumns(10);
		txtCost12.setBounds(170, 108, 64, 20);
		panel_8.add(txtCost12);
		
		txtCost11 = new JTextField();
		txtCost11.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtCost11.setHorizontalAlignment(SwingConstants.CENTER);
		txtCost11.setEditable(false);
		txtCost11.setColumns(10);
		txtCost11.setBounds(170, 83, 64, 20);
		panel_8.add(txtCost11);
		
		txtCost10 = new JTextField();
		txtCost10.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtCost10.setHorizontalAlignment(SwingConstants.CENTER);
		txtCost10.setEditable(false);
		txtCost10.setColumns(10);
		txtCost10.setBounds(170, 58, 64, 20);
		panel_8.add(txtCost10);
		
		txtCost9 = new JTextField();
		txtCost9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtCost9.setHorizontalAlignment(SwingConstants.CENTER);
		txtCost9.setEditable(false);
		txtCost9.setColumns(10);
		txtCost9.setBounds(170, 33, 64, 20);
		panel_8.add(txtCost9);
		
		lblNewLabel_40 = new JLabel("ITEM COST");
		lblNewLabel_40.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_40.setBounds(172, 11, 62, 14);
		panel_8.add(lblNewLabel_40);
		
		lblNewLabel_41 = new JLabel("SUB TOTAL");
		lblNewLabel_41.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_41.setBounds(243, 11, 62, 14);
		panel_8.add(lblNewLabel_41);
		
		txtSub9 = new JTextField();
		txtSub9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtSub9.setHorizontalAlignment(SwingConstants.CENTER);
		txtSub9.setEditable(false);
		txtSub9.setColumns(10);
		txtSub9.setBounds(241, 33, 64, 20);
		panel_8.add(txtSub9);
		
		txtSub10 = new JTextField();
		txtSub10.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtSub10.setHorizontalAlignment(SwingConstants.CENTER);
		txtSub10.setEditable(false);
		txtSub10.setColumns(10);
		txtSub10.setBounds(241, 58, 64, 20);
		panel_8.add(txtSub10);
		
		txtSub11 = new JTextField();
		txtSub11.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtSub11.setHorizontalAlignment(SwingConstants.CENTER);
		txtSub11.setEditable(false);
		txtSub11.setColumns(10);
		txtSub11.setBounds(241, 83, 64, 20);
		panel_8.add(txtSub11);
		
		txtSub12 = new JTextField();
		txtSub12.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtSub12.setHorizontalAlignment(SwingConstants.CENTER);
		txtSub12.setEditable(false);
		txtSub12.setColumns(10);
		txtSub12.setBounds(241, 108, 64, 20);
		panel_8.add(txtSub12);
		
		lblNewLabel_24 = new JLabel("ICE CREAM");
		lblNewLabel_24.setForeground(Color.RED);
		lblNewLabel_24.setFont(new Font("ISOCPEUR", Font.BOLD, 16));
		lblNewLabel_24.setBounds(10, 11, 138, 17);
		panel3.add(lblNewLabel_24);
		
		lblNewLabel_25 = new JLabel("ICE CREAM CAKE");
		lblNewLabel_25.setForeground(Color.RED);
		lblNewLabel_25.setFont(new Font("ISOCPEUR", Font.BOLD, 16));
		lblNewLabel_25.setBounds(339, 11, 138, 17);
		panel3.add(lblNewLabel_25);
		
		lblNewLabel_42 = new JLabel("ICE CREAM ROLL");
		lblNewLabel_42.setForeground(Color.RED);
		lblNewLabel_42.setFont(new Font("ISOCPEUR", Font.BOLD, 16));
		lblNewLabel_42.setBounds(10, 187, 138, 17);
		panel3.add(lblNewLabel_42);
		
		lblNewLabel_43 = new JLabel("ICE CREAM WAFFLE");
		lblNewLabel_43.setForeground(Color.RED);
		lblNewLabel_43.setFont(new Font("ISOCPEUR", Font.BOLD, 16));
		lblNewLabel_43.setBounds(339, 187, 138, 17);
		panel3.add(lblNewLabel_43);
		
		panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(10, 215, 315, 137);
		panel3.add(panel_9);
		
		lblNewLabel_44 = new JLabel("ITEM");
		lblNewLabel_44.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_44.setBounds(29, 11, 46, 14);
		panel_9.add(lblNewLabel_44);
		
		lblNewLabel_45 = new JLabel("STRAWBERRY");
		lblNewLabel_45.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_45.setBounds(10, 36, 106, 14);
		panel_9.add(lblNewLabel_45);
		
		lblNewLabel_46 = new JLabel("VANILLA");
		lblNewLabel_46.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_46.setBounds(10, 61, 80, 14);
		panel_9.add(lblNewLabel_46);
		
		lblNewLabel_47 = new JLabel("COOKIES & CREAM");
		lblNewLabel_47.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_47.setBounds(10, 86, 93, 14);
		panel_9.add(lblNewLabel_47);
		
		lblNewLabel_48 = new JLabel("MANGO");
		lblNewLabel_48.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_48.setBounds(10, 111, 93, 14);
		panel_9.add(lblNewLabel_48);
		
		lblNewLabel_49 = new JLabel("QTY");
		lblNewLabel_49.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_49.setBounds(116, 11, 46, 14);
		panel_9.add(lblNewLabel_49);
		
		lblNewLabel_50 = new JLabel("ITEM COST");
		lblNewLabel_50.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_50.setBounds(172, 11, 62, 14);
		panel_9.add(lblNewLabel_50);
		
		lblNewLabel_51 = new JLabel("SUB TOTAL");
		lblNewLabel_51.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_51.setBounds(243, 11, 62, 14);
		panel_9.add(lblNewLabel_51);
		
		txtQty5 = new JTextField();
		txtQty5.setHorizontalAlignment(SwingConstants.CENTER);
		txtQty5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtQty5.setColumns(10);
		txtQty5.setBounds(116, 33, 46, 20);
		panel_9.add(txtQty5);
		
		txtQty6 = new JTextField();
		txtQty6.setHorizontalAlignment(SwingConstants.CENTER);
		txtQty6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtQty6.setColumns(10);
		txtQty6.setBounds(116, 58, 46, 20);
		panel_9.add(txtQty6);
		
		txtQty7 = new JTextField();
		txtQty7.setHorizontalAlignment(SwingConstants.CENTER);
		txtQty7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtQty7.setColumns(10);
		txtQty7.setBounds(116, 83, 46, 20);
		panel_9.add(txtQty7);
		
		txtQty8 = new JTextField();
		txtQty8.setHorizontalAlignment(SwingConstants.CENTER);
		txtQty8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtQty8.setColumns(10);
		txtQty8.setBounds(116, 108, 46, 20);
		panel_9.add(txtQty8);
		
		txtCost5 = new JTextField();
		txtCost5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtCost5.setHorizontalAlignment(SwingConstants.CENTER);
		txtCost5.setEditable(false);
		txtCost5.setColumns(10);
		txtCost5.setBounds(170, 33, 64, 20);
		panel_9.add(txtCost5);
		
		txtCost6 = new JTextField();
		txtCost6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtCost6.setHorizontalAlignment(SwingConstants.CENTER);
		txtCost6.setEditable(false);
		txtCost6.setColumns(10);
		txtCost6.setBounds(170, 58, 64, 20);
		panel_9.add(txtCost6);
		
		txtCost7 = new JTextField();
		txtCost7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtCost7.setHorizontalAlignment(SwingConstants.CENTER);
		txtCost7.setEditable(false);
		txtCost7.setColumns(10);
		txtCost7.setBounds(170, 83, 64, 20);
		panel_9.add(txtCost7);
		
		txtCost8 = new JTextField();
		txtCost8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtCost8.setHorizontalAlignment(SwingConstants.CENTER);
		txtCost8.setEditable(false);
		txtCost8.setColumns(10);
		txtCost8.setBounds(170, 108, 64, 20);
		panel_9.add(txtCost8);
		
		txtSub5 = new JTextField();
		txtSub5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtSub5.setHorizontalAlignment(SwingConstants.CENTER);
		txtSub5.setEditable(false);
		txtSub5.setColumns(10);
		txtSub5.setBounds(241, 33, 64, 20);
		panel_9.add(txtSub5);
		
		txtSub6 = new JTextField();
		txtSub6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtSub6.setHorizontalAlignment(SwingConstants.CENTER);
		txtSub6.setEditable(false);
		txtSub6.setColumns(10);
		txtSub6.setBounds(241, 58, 64, 20);
		panel_9.add(txtSub6);
		
		txtSub7 = new JTextField();
		txtSub7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtSub7.setHorizontalAlignment(SwingConstants.CENTER);
		txtSub7.setEditable(false);
		txtSub7.setColumns(10);
		txtSub7.setBounds(241, 83, 64, 20);
		panel_9.add(txtSub7);
		
		txtSub8 = new JTextField();
		txtSub8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtSub8.setHorizontalAlignment(SwingConstants.CENTER);
		txtSub8.setEditable(false);
		txtSub8.setColumns(10);
		txtSub8.setBounds(241, 108, 64, 20);
		panel_9.add(txtSub8);
		
		panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBounds(339, 215, 315, 137);
		panel3.add(panel_10);
		
		lblNewLabel_52 = new JLabel("ITEM");
		lblNewLabel_52.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_52.setBounds(29, 11, 46, 14);
		panel_10.add(lblNewLabel_52);
		
		lblNewLabel_53 = new JLabel("STRAWBERRY");
		lblNewLabel_53.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_53.setBounds(10, 36, 107, 14);
		panel_10.add(lblNewLabel_53);
		
		lblNewLabel_54 = new JLabel("VANILLA");
		lblNewLabel_54.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_54.setBounds(10, 61, 80, 14);
		panel_10.add(lblNewLabel_54);
		
		lblNewLabel_55 = new JLabel("COOKIES & CREAM");
		lblNewLabel_55.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_55.setBounds(10, 86, 93, 14);
		panel_10.add(lblNewLabel_55);
		
		lblNewLabel_56 = new JLabel("MANGO");
		lblNewLabel_56.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_56.setBounds(10, 111, 93, 14);
		panel_10.add(lblNewLabel_56);
		
		lblNewLabel_57 = new JLabel("QTY");
		lblNewLabel_57.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_57.setBounds(116, 11, 46, 14);
		panel_10.add(lblNewLabel_57);
		
		txtQty13 = new JTextField();
		txtQty13.setHorizontalAlignment(SwingConstants.CENTER);
		txtQty13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtQty13.setColumns(10);
		txtQty13.setBounds(116, 33, 46, 20);
		panel_10.add(txtQty13);
		
		txtQty14 = new JTextField();
		txtQty14.setHorizontalAlignment(SwingConstants.CENTER);
		txtQty14.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtQty14.setColumns(10);
		txtQty14.setBounds(116, 58, 46, 20);
		panel_10.add(txtQty14);
		
		txtQty15 = new JTextField();
		txtQty15.setHorizontalAlignment(SwingConstants.CENTER);
		txtQty15.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtQty15.setColumns(10);
		txtQty15.setBounds(116, 83, 46, 20);
		panel_10.add(txtQty15);
		
		txtQty16 = new JTextField();
		txtQty16.setHorizontalAlignment(SwingConstants.CENTER);
		txtQty16.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtQty16.setColumns(10);
		txtQty16.setBounds(116, 108, 46, 20);
		panel_10.add(txtQty16);
		
		txtCost16 = new JTextField();
		txtCost16.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtCost16.setHorizontalAlignment(SwingConstants.CENTER);
		txtCost16.setEditable(false);
		txtCost16.setColumns(10);
		txtCost16.setBounds(170, 108, 64, 20);
		panel_10.add(txtCost16);
		
		txtCost15 = new JTextField();
		txtCost15.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtCost15.setHorizontalAlignment(SwingConstants.CENTER);
		txtCost15.setEditable(false);
		txtCost15.setColumns(10);
		txtCost15.setBounds(170, 83, 64, 20);
		panel_10.add(txtCost15);
		
		txtCost14 = new JTextField();
		txtCost14.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtCost14.setHorizontalAlignment(SwingConstants.CENTER);
		txtCost14.setEditable(false);
		txtCost14.setColumns(10);
		txtCost14.setBounds(170, 58, 64, 20);
		panel_10.add(txtCost14);
		
		txtCost13 = new JTextField();
		txtCost13.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtCost13.setHorizontalAlignment(SwingConstants.CENTER);
		txtCost13.setEditable(false);
		txtCost13.setColumns(10);
		txtCost13.setBounds(170, 33, 64, 20);
		panel_10.add(txtCost13);
		
		lblNewLabel_58 = new JLabel("ITEM COST");
		lblNewLabel_58.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_58.setBounds(172, 11, 62, 14);
		panel_10.add(lblNewLabel_58);
		
		lblNewLabel_59 = new JLabel("SUB TOTAL");
		lblNewLabel_59.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_59.setBounds(243, 11, 62, 14);
		panel_10.add(lblNewLabel_59);
		
		txtSub13 = new JTextField();
		txtSub13.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtSub13.setHorizontalAlignment(SwingConstants.CENTER);
		txtSub13.setEditable(false);
		txtSub13.setColumns(10);
		txtSub13.setBounds(241, 33, 64, 20);
		panel_10.add(txtSub13);
		
		txtSub14 = new JTextField();
		txtSub14.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtSub14.setHorizontalAlignment(SwingConstants.CENTER);
		txtSub14.setEditable(false);
		txtSub14.setColumns(10);
		txtSub14.setBounds(241, 58, 64, 20);
		panel_10.add(txtSub14);
		
		txtSub15 = new JTextField();
		txtSub15.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtSub15.setHorizontalAlignment(SwingConstants.CENTER);
		txtSub15.setEditable(false);
		txtSub15.setColumns(10);
		txtSub15.setBounds(241, 83, 64, 20);
		panel_10.add(txtSub15);
		
		txtSub16 = new JTextField();
		txtSub16.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtSub16.setHorizontalAlignment(SwingConstants.CENTER);
		txtSub16.setEditable(false);
		txtSub16.setColumns(10);
		txtSub16.setBounds(241, 108, 64, 20);
		panel_10.add(txtSub16);
		
		JLabel lblNewLabel_42_1 = new JLabel("PAYMENT METHOD:");
		lblNewLabel_42_1.setForeground(Color.RED);
		lblNewLabel_42_1.setFont(new Font("ISOCPEUR", Font.BOLD, 12));
		lblNewLabel_42_1.setBounds(10, 363, 138, 17);
		panel3.add(lblNewLabel_42_1);
		
		JLabel lblNewLabel_42_1_1 = new JLabel("TOTAL AMOUNT:");
		lblNewLabel_42_1_1.setForeground(Color.RED);
		lblNewLabel_42_1_1.setFont(new Font("ISOCPEUR", Font.BOLD, 12));
		lblNewLabel_42_1_1.setBounds(10, 391, 138, 17);
		panel3.add(lblNewLabel_42_1_1);
		
		JLabel lblNewLabel_42_1_1_1 = new JLabel("VAT:");
		lblNewLabel_42_1_1_1.setForeground(Color.RED);
		lblNewLabel_42_1_1_1.setFont(new Font("ISOCPEUR", Font.BOLD, 12));
		lblNewLabel_42_1_1_1.setBounds(10, 419, 138, 17);
		panel3.add(lblNewLabel_42_1_1_1);
		
		JLabel lblNewLabel_42_1_1_1_1 = new JLabel("DISCOUNT:");
		lblNewLabel_42_1_1_1_1.setForeground(Color.RED);
		lblNewLabel_42_1_1_1_1.setFont(new Font("ISOCPEUR", Font.BOLD, 12));
		lblNewLabel_42_1_1_1_1.setBounds(10, 447, 138, 17);
		panel3.add(lblNewLabel_42_1_1_1_1);
		
		JLabel lblNewLabel_42_1_1_1_2 = new JLabel("GRAND TOTAL AMOUNT:");
		lblNewLabel_42_1_1_1_2.setForeground(Color.RED);
		lblNewLabel_42_1_1_1_2.setFont(new Font("ISOCPEUR", Font.BOLD, 12));
		lblNewLabel_42_1_1_1_2.setBounds(10, 475, 161, 17);
		panel3.add(lblNewLabel_42_1_1_1_2);
		
		JLabel lblNewLabel_42_1_1_1_2_1 = new JLabel("AMOUNT TENDERED");
		lblNewLabel_42_1_1_1_2_1.setForeground(Color.RED);
		lblNewLabel_42_1_1_1_2_1.setFont(new Font("ISOCPEUR", Font.BOLD, 12));
		lblNewLabel_42_1_1_1_2_1.setBounds(10, 503, 138, 17);
		panel3.add(lblNewLabel_42_1_1_1_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(null);
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"--------------", "Cash", "Card", "Senior Citizen/PWD Card"}));
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox.getSelectedIndex() == 0) {
                    txtDiscount.setText("0");
                }

                else if(comboBox.getSelectedIndex() == 1 ) {
                    txtDiscount.setText("0%");
                }
                else if(comboBox.getSelectedIndex() == 2) {
                    txtDiscount.setText("0%");

                }

                else {
                    txtDiscount.setText("20%");
                }
			}
		});
		comboBox.setBounds(142, 360, 148, 22);
		panel3.add(comboBox);
		
		txtAmount = new JTextField();
		txtAmount.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtAmount.setHorizontalAlignment(SwingConstants.CENTER);
		txtAmount.setEditable(false);
		txtAmount.setBounds(142, 388, 148, 20);
		panel3.add(txtAmount);
		txtAmount.setColumns(10);
		
		txtVat = new JTextField();
		txtVat.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtVat.setHorizontalAlignment(SwingConstants.CENTER);
		txtVat.setEditable(false);
		txtVat.setColumns(10);
		txtVat.setBounds(142, 416, 148, 20);
		panel3.add(txtVat);
		
		txtDiscount = new JTextField();
		txtDiscount.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtDiscount.setHorizontalAlignment(SwingConstants.CENTER);
		txtDiscount.setEditable(false);
		txtDiscount.setColumns(10);
		txtDiscount.setBounds(142, 444, 148, 20);
		panel3.add(txtDiscount);
		
		txtTAmount = new JTextField();
		txtTAmount.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtTAmount.setHorizontalAlignment(SwingConstants.CENTER);
		txtTAmount.setEditable(false);
		txtTAmount.setColumns(10);
		txtTAmount.setBounds(142, 472, 148, 20);
		panel3.add(txtTAmount);
		
		txtAmountT = new JTextField();
		txtAmountT.setBackground(Color.WHITE);
		txtAmountT.setHorizontalAlignment(SwingConstants.CENTER);
		txtAmountT.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char number = e.getKeyChar();
                if( ((number < '0') || (number > '9')) && (number != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
			}
		});
		txtAmountT.setColumns(10);
		txtAmountT.setBounds(142, 500, 148, 20);
		panel3.add(txtAmountT);
		
		JButton btnNewButton_20 = new JButton("EXIT");
		btnNewButton_20.setBackground(Color.WHITE);
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Do you want to exit?", "AIS 'KRIM", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
				  
			}
		});
		btnNewButton_20.setBounds(50, 578, 112, 23);
		panel3.add(btnNewButton_20);
		
		lblNewLabel_42_1_1_1_2_1_2 = new JLabel("CHANGE:");
		lblNewLabel_42_1_1_1_2_1_2.setForeground(Color.RED);
		lblNewLabel_42_1_1_1_2_1_2.setFont(new Font("ISOCPEUR", Font.BOLD, 12));
		lblNewLabel_42_1_1_1_2_1_2.setBounds(10, 534, 66, 17);
		panel3.add(lblNewLabel_42_1_1_1_2_1_2);
		
		txtChange = new JTextField();
		txtChange.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		txtChange.setHorizontalAlignment(SwingConstants.CENTER);
		txtChange.setEditable(false);
		txtChange.setColumns(10);
		txtChange.setBounds(142, 531, 148, 20);
		panel3.add(txtChange);
		
		btnNewButton_21 = new JButton("RESET");
		btnNewButton_21.setBackground(Color.WHITE);
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TEXTAREA RESET
				textArea.setText(null);
				
				// QUANTITY RESET
				txtQty1.setText(null);
				txtQty2.setText(null);
				txtQty3.setText(null);
				txtQty4.setText(null);
				txtQty5.setText(null);
				txtQty6.setText(null);
				txtQty7.setText(null);
				txtQty8.setText(null);
				txtQty9.setText(null);
				txtQty10.setText(null);
				txtQty11.setText(null);
				txtQty12.setText(null);
				txtQty13.setText(null);
				txtQty14.setText(null);
				txtQty15.setText(null);
				txtQty16.setText(null);
		
				
				// ITEM COST RESET
				txtCost1.setText(null);
				txtCost2.setText(null);
				txtCost3.setText(null);
				txtCost4.setText(null);
				txtCost5.setText(null);
				txtCost6.setText(null);
				txtCost7.setText(null);
				txtCost8.setText(null);
				txtCost9.setText(null);
				txtCost10.setText(null);
				txtCost11.setText(null);
				txtCost12.setText(null);
				txtCost13.setText(null);
				txtCost14.setText(null);
				txtCost15.setText(null);
				txtCost16.setText(null);
				
				
				// SUB TOTAL RESET
				txtSub1.setText(null);
				txtSub2.setText(null);
				txtSub3.setText(null);
				txtSub4.setText(null);
				txtSub5.setText(null);
				txtSub6.setText(null);
				txtSub7.setText(null);
				txtSub8.setText(null);
				txtSub9.setText(null);
				txtSub10.setText(null);
				txtSub11.setText(null);
				txtSub12.setText(null);
				txtSub13.setText(null);
				txtSub14.setText(null);
				txtSub15.setText(null);
				txtSub16.setText(null);
		
				
				// COMBO BOX RESET
				comboBox.setSelectedIndex(0);
				
				// CHECKOUT RESET
				txtAmount.setText(null);
				txtVat.setText(null);
				txtDiscount.setText(null);
				txtTAmount.setText(null);
				txtAmountT.setText(null);
				txtChange.setText(null);
				
			}
			
		});
		btnNewButton_21.setBounds(50, 612, 112, 23);
		panel3.add(btnNewButton_21);
		
		btnNewButton_22 = new JButton("CHECK OUT");
		btnNewButton_22.setBackground(Color.WHITE);
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//QUANTITY FOR ICE CREAM
				double Qty1 = Double.parseDouble(txtQty1.getText());
				double Qty2 = Double.parseDouble(txtQty2.getText());
				double Qty3 = Double.parseDouble(txtQty3.getText());
				double Qty4 = Double.parseDouble(txtQty4.getText());
				
				// QUANTITY FOR ICE CREAM ROLLS
				double Qty5 = Double.parseDouble(txtQty5.getText());
				double Qty6 = Double.parseDouble(txtQty6.getText());
				double Qty7 = Double.parseDouble(txtQty7.getText());
				double Qty8 = Double.parseDouble(txtQty8.getText());
				
				// QUANTITY FOR ICE CREAM CAKES
				double Qty9 = Double.parseDouble(txtQty9.getText());
				double Qty10 = Double.parseDouble(txtQty10.getText());
				double Qty11 = Double.parseDouble(txtQty11.getText());
				double Qty12 = Double.parseDouble(txtQty12.getText());
				
				// QUANTITY FOR ICE CREAM CAKES
				double Qty13 = Double.parseDouble(txtQty13.getText());
				double Qty14 = Double.parseDouble(txtQty14.getText());
				double Qty15 = Double.parseDouble(txtQty15.getText());
				double Qty16 = Double.parseDouble(txtQty16.getText());
				Change = Double.parseDouble(txtAmountT.getText());
				String Payment = (String)comboBox.getSelectedItem();
	
				double total1,total2,total3,total4,total5,total6,total7,total8,total9,total10,total11,total12,total13,total14,total15,total16,TotalAmount;
				
				if(Payment == "Cash") {
				TotalAmount = Qty1 + Qty2 + Qty3 + Qty4 + Qty5 + Qty6 + Qty7 + Qty8 + Qty9 + Qty10 + Qty11 + Qty12 + Qty13 + Qty14 + Qty15 + Qty16;	
				
				// display the price in item cost
				String IceCream_Strawberry = String.format("₱%.2f", IceCreamP_Strawberry);
				txtCost1.setText(IceCream_Strawberry);
				
				String IceCream_Vanilla = String.format("₱%.2f", IceCreamP_Vanilla );
				txtCost2.setText(IceCream_Vanilla);
				
				String IceCream_Cookies = String.format("₱%.2f", IceCreamP_Cookies );
				txtCost3.setText(IceCream_Cookies);
				
				String IceCream_Mango = String.format("₱%.2f", IceCreamP_Mango );
				txtCost4.setText(IceCream_Mango);
				
				//
				String IceR_Val = String.format("₱%.2f", IceR_Vanilla );
				txtCost5.setText(IceR_Val);
				
				String IceR_Choc = String.format("₱%.2f", IceR_Chocolate  );
				txtCost6.setText(IceR_Choc);
				
				String IceR_Berry = String.format("₱%.2f", IceR_Strawberry  );
				txtCost7.setText(IceR_Berry);
				
				String IceR_Cookie = String.format("₱%.2f", IceR_Cookies  );
				txtCost8.setText(IceR_Cookie);
				
				//
				String IceR_Oreo = String.format("₱%.2f", IceC_oreo  );
				txtCost9.setText(IceR_Oreo);
				
				String IceR_Cheese = String.format("₱%.2f", IceC_Cheesecake   );
				txtCost10.setText(IceR_Cheese);
				
				String IceR_Red = String.format("₱%.2f", IceC_RedV   );
				txtCost11.setText(IceR_Red);
				
				String IceR_Mango = String.format("₱%.2f", IceC_MangoG   );
				txtCost12.setText(IceR_Mango);
				
				//
				String IceW_Mango = String.format("₱%.2f", IceW_MangoP);
				txtCost13.setText(IceW_Mango);
				
				String IceW_Berry = String.format("₱%.2f", IceW_Strawberry);
				txtCost14.setText(IceW_Berry);
				
				String IceW_Van = String.format("₱%.2f", IceW_Vanilla);
				txtCost15.setText(IceW_Van);
				
				String IceW_Cookie = String.format("₱%.2f", IceW_Cookies);
				txtCost16.setText(IceW_Cookie);
				
				
				// quantity & itemCost formula
				
				total1 = Qty1 *IceCreamP_Strawberry;
				total2 = Qty2 *IceCreamP_Vanilla;
				total3 = Qty3 *IceCreamP_Cookies;
				total4 = Qty4 *IceCreamP_Mango;
				
				//
				total5 = Qty5 *IceR_Vanilla;
				total6 = Qty6 *IceR_Chocolate;
				total7 = Qty7 *IceR_Strawberry;
				total8 = Qty8 *IceR_Cookies;
				
				//
				total9 = Qty9 *IceC_oreo;
				total10 = Qty10 *IceC_Cheesecake;
				total11 = Qty11 *IceC_RedV;
				total12 = Qty12 *IceC_MangoG;
				
				//
				total13 = Qty13 *IceW_MangoP;
				total14 = Qty14 *IceW_Strawberry;
				total15 = Qty15 *IceW_Vanilla;
				total16 = Qty16 *IceW_Cookies;
				
				// display the answer in SUB TOTAL
				String TotalSub1 = String.format("₱%.2f", total1);
				txtSub1.setText(TotalSub1);
				
				String TotalSub2 = String.format("₱%.2f", total2 );
				txtSub2.setText(TotalSub2);
				
				String TotalSub3 = String.format("₱%.2f", total3 );
				txtSub3.setText(TotalSub3);
				
				String TotalSub4 = String.format("₱%.2f", total4 );
				txtSub4.setText(TotalSub4);
				
				//
				String TotalSub5 = String.format("₱%.2f", total5);
				txtSub5.setText(TotalSub5);
				
				String TotalSub6 = String.format("₱%.2f", total6 );
				txtSub6.setText(TotalSub6);
				
				String TotalSub7 = String.format("₱%.2f", total7 );
				txtSub7.setText(TotalSub7);
				
				String TotalSub8 = String.format("₱%.2f", total8 );
				txtSub8.setText(TotalSub8);
				
				//
				String TotalSub9 = String.format("₱%.2f", total9);
				txtSub9.setText(TotalSub9);
				
				String TotalSub10 = String.format("₱%.2f", total10);
				txtSub10.setText(TotalSub10);
				
				String TotalSub11 = String.format("₱%.2f", total11);
				txtSub11.setText(TotalSub11);
				
				String TotalSub12 = String.format("₱%.2f", total12);
				txtSub12.setText(TotalSub12);
				
				//
				String TotalSub13 = String.format("₱%.2f", total13);
				txtSub13.setText(TotalSub13);
				
				String TotalSub14 = String.format("₱%.2f", total14);
				txtSub14.setText(TotalSub14);
				
				String TotalSub15 = String.format("₱%.2f", total15);
				txtSub15.setText(TotalSub15);
				
				String TotalSub16 = String.format("₱%.2f", total16);
				txtSub16.setText(TotalSub16);
				
				
			
				// calculate the SUB TOTAL and display to TOTAL AMOUNT
				
				TotalAmount = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9 + total10 + total11 + total12 + total13 + total14 + total15 + total16;
				String totalAmount = String.format("₱%.2f", TotalAmount);
				txtAmount.setText(totalAmount);
				
				if (Change >= TotalAmount) {
					
				// calculating the VAT
				vat = (TotalAmount * Vat)/100;
				String tax = String.valueOf(vat);
				txtVat.setText(tax);
				
				// calculating the GRAND TOTAL AMOUNT
				String GrandTotalAmount = String.valueOf(TotalAmount + vat);
				txtTAmount.setText(GrandTotalAmount);
				
				//CALCULATING THE CHANGE
				String cChange = String.format("₱ %.2f", Change - ( TotalAmount + vat));
				txtChange.setText(cChange);
				}
				else {
					JOptionPane.showMessageDialog(null, "ENTER ENOUGH CASH", "AIS 'KRIM", JOptionPane.OK_OPTION);

				}
				}
				
				else if(Payment == "Card") {
					
					//CARD FRAME
					Crd Card = new Crd();
					Card.setVisible(true);
					TotalAmount = Qty1 + Qty2 + Qty3 + Qty4 + Qty5 + Qty6 + Qty7 + Qty8 + Qty9 + Qty10 + Qty11 + Qty12 + Qty13 + Qty14 + Qty15 + Qty16;
					
					// display the price in item cost
					String IceCream_Strawberry = String.format("₱%.2f", IceCreamP_Strawberry);
					txtCost1.setText(IceCream_Strawberry);
					
					String IceCream_Vanilla = String.format("₱%.2f", IceCreamP_Vanilla );
					txtCost2.setText(IceCream_Vanilla);
					
					String IceCream_Cookies = String.format("₱%.2f", IceCreamP_Cookies );
					txtCost3.setText(IceCream_Cookies);
					
					String IceCream_Mango = String.format("₱%.2f", IceCreamP_Mango );
					txtCost4.setText(IceCream_Mango);
					
					//
					String IceR_Val = String.format("₱%.2f", IceR_Vanilla );
					txtCost5.setText(IceR_Val);
					
					String IceR_Choc = String.format("₱%.2f", IceR_Chocolate  );
					txtCost6.setText(IceR_Choc);
					
					String IceR_Berry = String.format("₱%.2f", IceR_Strawberry  );
					txtCost7.setText(IceR_Berry);
					
					String IceR_Cookie = String.format("₱%.2f", IceR_Cookies  );
					txtCost8.setText(IceR_Cookie);
					
					//
					String IceR_Oreo = String.format("₱%.2f", IceC_oreo  );
					txtCost9.setText(IceR_Oreo);
					
					String IceR_Cheese = String.format("₱%.2f", IceC_Cheesecake   );
					txtCost10.setText(IceR_Cheese);
					
					String IceR_Red = String.format("₱%.2f", IceC_RedV   );
					txtCost11.setText(IceR_Red);
					
					String IceR_Mango = String.format("₱%.2f", IceC_MangoG   );
					txtCost12.setText(IceR_Mango);
					
					//
					String IceW_Mango = String.format("₱%.2f", IceW_MangoP);
					txtCost13.setText(IceW_Mango);
					
					String IceW_Berry = String.format("₱%.2f", IceW_Strawberry);
					txtCost14.setText(IceW_Berry);
					
					String IceW_Van = String.format("₱%.2f", IceW_Vanilla);
					txtCost15.setText(IceW_Van);
					
					String IceW_Cookie = String.format("₱%.2f", IceW_Cookies);
					txtCost16.setText(IceW_Cookie);
					
					
					// quantity & itemCost formula
					
					total1 = Qty1 *IceCreamP_Strawberry;
					total2 = Qty2 *IceCreamP_Vanilla;
					total3 = Qty3 *IceCreamP_Cookies;
					total4 = Qty4 *IceCreamP_Mango;
					
					//
					total5 = Qty5 *IceR_Vanilla;
					total6 = Qty6 *IceR_Chocolate;
					total7 = Qty7 *IceR_Strawberry;
					total8 = Qty8 *IceR_Cookies;
					
					//
					total9 = Qty9 *IceC_oreo;
					total10 = Qty10 *IceC_Cheesecake;
					total11 = Qty11 *IceC_RedV;
					total12 = Qty12 *IceC_MangoG;
					
					//
					total13 = Qty13 *IceW_MangoP;
					total14 = Qty14 *IceW_Strawberry;
					total15 = Qty15 *IceW_Vanilla;
					total16 = Qty16 *IceW_Cookies;
					
					// display the answer in SUB TOTAL
					String TotalSub1 = String.format("₱%.2f", total1);
					txtSub1.setText(TotalSub1);
					
					String TotalSub2 = String.format("₱%.2f", total2 );
					txtSub2.setText(TotalSub2);
					
					String TotalSub3 = String.format("₱%.2f", total3 );
					txtSub3.setText(TotalSub3);
					
					String TotalSub4 = String.format("₱%.2f", total4 );
					txtSub4.setText(TotalSub4);
					
					//
					String TotalSub5 = String.format("₱%.2f", total5);
					txtSub5.setText(TotalSub5);
					
					String TotalSub6 = String.format("₱%.2f", total6 );
					txtSub6.setText(TotalSub6);
					
					String TotalSub7 = String.format("₱%.2f", total7 );
					txtSub7.setText(TotalSub7);
					
					String TotalSub8 = String.format("₱%.2f", total8 );
					txtSub8.setText(TotalSub8);
					
					//
					String TotalSub9 = String.format("₱%.2f", total9);
					txtSub9.setText(TotalSub9);
					
					String TotalSub10 = String.format("₱%.2f", total10);
					txtSub10.setText(TotalSub10);
					
					String TotalSub11 = String.format("₱%.2f", total11);
					txtSub11.setText(TotalSub11);
					
					String TotalSub12 = String.format("₱%.2f", total12);
					txtSub12.setText(TotalSub12);
					
					//
					String TotalSub13 = String.format("₱%.2f", total13);
					txtSub13.setText(TotalSub13);
					
					String TotalSub14 = String.format("₱%.2f", total14);
					txtSub14.setText(TotalSub14);
					
					String TotalSub15 = String.format("₱%.2f", total15);
					txtSub15.setText(TotalSub15);
					
					String TotalSub16 = String.format("₱%.2f", total16);
					txtSub16.setText(TotalSub16);
					
					
					
					// calculate the SUB TOTAL and display to TOTAL AMOUNT
					TotalAmount = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9 + total10 + total11 + total12 + total13 + total14 + total15 + total16;
					String totalAmount = String.format("₱%.2f", TotalAmount);
					txtAmount.setText(totalAmount);
					
					// calculating the VAT
					vat = (TotalAmount * Vat)/100;
					String tax = String.valueOf(vat);
					txtVat.setText(tax);
					
					// calculating the GRAND TOTAL AMOUNT
					String GrandTotalAmount = String.valueOf(TotalAmount + vat);
					txtTAmount.setText(GrandTotalAmount);
					

				}
				
				else if(Payment == "Senior Citizen/PWD Card") {
					TotalAmount = Qty1 + Qty2 + Qty3 + Qty4 + Qty5 + Qty6 + Qty7 + Qty8 + Qty9 + Qty10 + Qty11 + Qty12 + Qty13 + Qty14 + Qty15 + Qty16;
					
		
						// display the price in item cost
						String IceCream_Strawberry = String.format("₱%.2f", IceCreamP_Strawberry);
						txtCost1.setText(IceCream_Strawberry);
						
						String IceCream_Vanilla = String.format("₱%.2f", IceCreamP_Vanilla );
						txtCost2.setText(IceCream_Vanilla);
						
						String IceCream_Cookies = String.format("₱%.2f", IceCreamP_Cookies );
						txtCost3.setText(IceCream_Cookies);
						
						String IceCream_Mango = String.format("₱%.2f", IceCreamP_Mango );
						txtCost4.setText(IceCream_Mango);
						
						//
						String IceR_Val = String.format("₱%.2f", IceR_Vanilla );
						txtCost5.setText(IceR_Val);
						
						String IceR_Choc = String.format("₱%.2f", IceR_Chocolate  );
						txtCost6.setText(IceR_Choc);
						
						String IceR_Berry = String.format("₱%.2f", IceR_Strawberry  );
						txtCost7.setText(IceR_Berry);
						
						String IceR_Cookie = String.format("₱%.2f", IceR_Cookies  );
						txtCost8.setText(IceR_Cookie);
						
						//
						String IceR_Oreo = String.format("₱%.2f", IceC_oreo  );
						txtCost9.setText(IceR_Oreo);
						
						String IceR_Cheese = String.format("₱%.2f", IceC_Cheesecake   );
						txtCost10.setText(IceR_Cheese);
						
						String IceR_Red = String.format("₱%.2f", IceC_RedV   );
						txtCost11.setText(IceR_Red);
						
						String IceR_Mango = String.format("₱%.2f", IceC_MangoG   );
						txtCost12.setText(IceR_Mango);
						
						//
						String IceW_Mango = String.format("₱%.2f", IceW_MangoP);
						txtCost13.setText(IceW_Mango);
						
						String IceW_Berry = String.format("₱%.2f", IceW_Strawberry);
						txtCost14.setText(IceW_Berry);
						
						String IceW_Van = String.format("₱%.2f", IceW_Vanilla);
						txtCost15.setText(IceW_Van);
						
						String IceW_Cookie = String.format("₱%.2f", IceW_Cookies);
						txtCost16.setText(IceW_Cookie);
						
						
						// quantity & itemCost formula
						
						total1 = Qty1 *IceCreamP_Strawberry;
						total2 = Qty2 *IceCreamP_Vanilla;
						total3 = Qty3 *IceCreamP_Cookies;
						total4 = Qty4 *IceCreamP_Mango;
						
						//
						total5 = Qty5 *IceR_Vanilla;
						total6 = Qty6 *IceR_Chocolate;
						total7 = Qty7 *IceR_Strawberry;
						total8 = Qty8 *IceR_Cookies;
						
						//
						total9 = Qty9 *IceC_oreo;
						total10 = Qty10 *IceC_Cheesecake;
						total11 = Qty11 *IceC_RedV;
						total12 = Qty12 *IceC_MangoG;
						
						//
						total13 = Qty13 *IceW_MangoP;
						total14 = Qty14 *IceW_Strawberry;
						total15 = Qty15 *IceW_Vanilla;
						total16 = Qty16 *IceW_Cookies;
						
						// display the answer in SUB TOTAL
						String TotalSub1 = String.format("₱%.2f", total1);
						txtSub1.setText(TotalSub1);
						
						String TotalSub2 = String.format("₱%.2f", total2 );
						txtSub2.setText(TotalSub2);
						
						String TotalSub3 = String.format("₱%.2f", total3 );
						txtSub3.setText(TotalSub3);
						
						String TotalSub4 = String.format("₱%.2f", total4 );
						txtSub4.setText(TotalSub4);
						
						//
						String TotalSub5 = String.format("₱%.2f", total5);
						txtSub5.setText(TotalSub5);
						
						String TotalSub6 = String.format("₱%.2f", total6 );
						txtSub6.setText(TotalSub6);
						
						String TotalSub7 = String.format("₱%.2f", total7 );
						txtSub7.setText(TotalSub7);
						
						String TotalSub8 = String.format("₱%.2f", total8 );
						txtSub8.setText(TotalSub8);
						
						//
						String TotalSub9 = String.format("₱%.2f", total9);
						txtSub9.setText(TotalSub9);
						
						String TotalSub10 = String.format("₱%.2f", total10);
						txtSub10.setText(TotalSub10);
						
						String TotalSub11 = String.format("₱%.2f", total11);
						txtSub11.setText(TotalSub11);
						
						String TotalSub12 = String.format("₱%.2f", total12);
						txtSub12.setText(TotalSub12);
						
						//
						String TotalSub13 = String.format("₱%.2f", total13);
						txtSub13.setText(TotalSub13);
						
						String TotalSub14 = String.format("₱%.2f", total14);
						txtSub14.setText(TotalSub14);
						
						String TotalSub15 = String.format("₱%.2f", total15);
						txtSub15.setText(TotalSub15);
						
						String TotalSub16 = String.format("₱%.2f", total16);
						txtSub16.setText(TotalSub16);
						
						
					
					// calculate the SUB TOTAL and display to TOTAL AMOUNT
						TotalAmount = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9 + total10 + total11 + total12 + total13 + total14 + total15 + total16;
					String totalAmount = String.format("₱%.2f", TotalAmount);
					txtAmount.setText(totalAmount);
				
					// calculate the discount
					discount = TotalAmount * 0.2;
					

					// calculating the VAT
					vat = (TotalAmount * Vat)/100;
					String tax = String.valueOf(vat);
					txtVat.setText(tax);
					
					// calculating the GRAND TOTAL AMOUNT
					String GrandTotalAmount = String.valueOf(TotalAmount + vat - discount);
					txtTAmount.setText(GrandTotalAmount);
				}
			}
		});
		btnNewButton_22.setBounds(178, 578, 112, 23);
		panel3.add(btnNewButton_22);
		
		btnNewButton_23 = new JButton("RECEIPT");
		btnNewButton_23.setBackground(Color.WHITE);
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("******************************************************************************\n");
                textArea.setText(textArea.getText() + "*                                 FOOD ORDERED RECEIPT                               *\n");
                textArea.setText(textArea.getText() +"************************************************************************\n");

                Dash receipt = new Dash();
                String Dash = receipt.toString();


                textArea.setText(textArea.getText()+ "Payment Method : " +comboBox.getSelectedItem() + "\n\n");
                textArea.setText(textArea.getText()+ "Total Amount : " +txtAmount.getText() + "\n\n");
                textArea.setText(textArea.getText()+ "Vat : " +txtVat.getText() + "\n\n");
                textArea.setText(textArea.getText()+ "Discount: " +txtDiscount.getText() + "\n\n");
                textArea.setText(textArea.getText()+ "Grand Total Amount : ₱ " +txtTAmount.getText() + "\n\n");
                textArea.setText(textArea.getText()+ "Amount Tendered : ₱ " +txtAmountT.getText() + "\n\n");
                textArea.setText(textArea.getText()+ "Change : " +txtChange.getText() + "\n\n");
			}
		});
		btnNewButton_23.setBounds(178, 612, 112, 23);
		panel3.add(btnNewButton_23);
		
		panel4 = new JPanel();
		panel4.setBackground(Color.WHITE);
		layeredPane.add(panel4, "name_172087665413500");
		panel4.setLayout(null);
		
		lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\306662471_662810621848982_8225734010126902469_n.png"));
		lblNewLabel_16.setBounds(35, 11, 629, 49);
		panel4.add(lblNewLabel_16);
		
		lblNewLabel_20 = new JLabel("Filter By");
		lblNewLabel_20.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblNewLabel_20.setBounds(37, 99, 117, 23);
		panel4.add(lblNewLabel_20);
		
		btnNewButton_1 = new JButton("All");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel2);
			}
		});
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(37, 159, 117, 23);
		panel4.add(btnNewButton_1);
		
		btnIceCream_1 = new JButton("Ice Cream");
		btnIceCream_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel4);
			}
		});
		btnIceCream_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnIceCream_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnIceCream_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnIceCream_1.setBackground(Color.WHITE);
		btnIceCream_1.setBounds(37, 193, 117, 23);
		panel4.add(btnIceCream_1);
		
		btnNewButton_5 = new JButton("Ice Cream Roll");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel5);
			}
		});
		btnNewButton_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_5.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_5.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.setBounds(37, 227, 117, 23);
		panel4.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("Ice Cream Cake");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel6);
			}
		});
		btnNewButton_6.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_6.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_6.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton_6.setBackground(Color.WHITE);
		btnNewButton_6.setBounds(37, 261, 117, 23);
		panel4.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("Ice Cream Waffle");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel7);
			}
		});
		btnNewButton_7.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_7.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_7.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton_7.setBackground(Color.WHITE);
		btnNewButton_7.setBounds(37, 295, 117, 23);
		panel4.add(btnNewButton_7);
		
		separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(37, 124, 117, 8);
		panel4.add(separator_1);
		
		lblNewLabel_61 = new JLabel("");
		lblNewLabel_61.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\309815568_519120073369641_2688595702454567062_n.png"));
		lblNewLabel_61.setBounds(221, 110, 496, 435);
		panel4.add(lblNewLabel_61);
		
		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 544, 664, 102);
		panel4.add(panel_4);
		
		label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-facebook-23.png"));
		label_10.setBounds(228, 11, 23, 23);
		panel_4.add(label_10);
		
		label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-twitter-23.png"));
		label_11.setBounds(308, 11, 23, 23);
		panel_4.add(label_11);
		
		label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-instagram-23.png"));
		label_12.setBounds(386, 11, 23, 23);
		panel_4.add(label_12);
		
		label_13 = new JLabel("Boni Ave, Mandaluyong, 1550 Metro Manila");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_13.setBounds(202, 38, 245, 39);
		panel_4.add(label_13);
		
		label_14 = new JLabel("Copyright @ 2022 All Rights Reserved");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_14.setBounds(202, 63, 245, 39);
		panel_4.add(label_14);
		
		JLabel lblNewLabel_65_1 = new JLabel("");
		lblNewLabel_65_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (2).gif"));
		lblNewLabel_65_1.setBounds(10, 329, 193, 205);
		panel4.add(lblNewLabel_65_1);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setForeground(Color.BLACK);
		separator_12.setBounds(0, 0, 664, 2);
		panel4.add(separator_12);
		
		separator_11 = new JSeparator();
		separator_11.setForeground(Color.BLACK);
		separator_11.setBounds(0, 543, 664, 2);
		panel4.add(separator_11);
		
		panel5 = new JPanel();
		panel5.setBackground(Color.WHITE);
		layeredPane.add(panel5, "name_172089592771200");
		panel5.setLayout(null);
		
		lblNewLabel_21 = new JLabel("Filter By");
		lblNewLabel_21.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblNewLabel_21.setBounds(37, 99, 117, 23);
		panel5.add(lblNewLabel_21);
		
		btnNewButton_8 = new JButton("All");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel2);
			}
		});
		btnNewButton_8.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_8.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_8.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton_8.setBackground(Color.WHITE);
		btnNewButton_8.setBounds(37, 159, 117, 23);
		panel5.add(btnNewButton_8);
		
		btnIceCream_2 = new JButton("Ice Cream");
		btnIceCream_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel4);
			}
		});
		btnIceCream_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnIceCream_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnIceCream_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnIceCream_2.setBackground(Color.WHITE);
		btnIceCream_2.setBounds(37, 193, 117, 23);
		panel5.add(btnIceCream_2);
		
		btnNewButton_9 = new JButton("Ice Cream Roll");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel5);
			}
		});
		btnNewButton_9.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_9.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_9.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton_9.setBackground(Color.WHITE);
		btnNewButton_9.setBounds(37, 227, 117, 23);
		panel5.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("Ice Cream Cake");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel6);
			}
		});
		btnNewButton_10.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_10.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_10.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton_10.setBackground(Color.WHITE);
		btnNewButton_10.setBounds(37, 261, 117, 23);
		panel5.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("Ice Cream Waffle");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel7);
			}
		});
		btnNewButton_11.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_11.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_11.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton_11.setBackground(Color.WHITE);
		btnNewButton_11.setBounds(37, 295, 117, 23);
		panel5.add(btnNewButton_11);
		
		separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(37, 124, 117, 8);
		panel5.add(separator_2);
		
		lblNewLabel_64 = new JLabel("");
		lblNewLabel_64.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\309628316_1153555145243721_8257689355372322654_n.png"));
		lblNewLabel_64.setBounds(222, 110, 496, 435);
		panel5.add(lblNewLabel_64);
		
		panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(0, 544, 664, 102);
		panel5.add(panel_5);
		
		label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-facebook-23.png"));
		label_15.setBounds(228, 11, 23, 23);
		panel_5.add(label_15);
		
		label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-twitter-23.png"));
		label_16.setBounds(308, 11, 23, 23);
		panel_5.add(label_16);
		
		label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-instagram-23.png"));
		label_17.setBounds(386, 11, 23, 23);
		panel_5.add(label_17);
		
		label_18 = new JLabel("Boni Ave, Mandaluyong, 1550 Metro Manila");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_18.setBounds(202, 38, 245, 39);
		panel_5.add(label_18);
		
		label_19 = new JLabel("Copyright @ 2022 All Rights Reserved");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_19.setBounds(202, 63, 245, 39);
		panel_5.add(label_19);
		
		JLabel lblNewLabel_65_1_1 = new JLabel("");
		lblNewLabel_65_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (3).gif"));
		lblNewLabel_65_1_1.setBounds(10, 329, 193, 205);
		panel5.add(lblNewLabel_65_1_1);
		
		JLabel lblNewLabel_16_1 = new JLabel("");
		lblNewLabel_16_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\306662471_662810621848982_8225734010126902469_n.png"));
		lblNewLabel_16_1.setBounds(35, 11, 629, 49);
		panel5.add(lblNewLabel_16_1);
		
		separator_13 = new JSeparator();
		separator_13.setForeground(Color.BLACK);
		separator_13.setBounds(0, 543, 664, 2);
		panel5.add(separator_13);
		
		separator_14 = new JSeparator();
		separator_14.setForeground(Color.BLACK);
		separator_14.setBounds(0, 0, 664, 2);
		panel5.add(separator_14);
		
		panel6 = new JPanel();
		panel6.setBackground(Color.WHITE);
		layeredPane.add(panel6, "name_175676048050600");
		panel6.setLayout(null);
		
		lblNewLabel_22 = new JLabel("Filter By");
		lblNewLabel_22.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblNewLabel_22.setBounds(37, 99, 117, 23);
		panel6.add(lblNewLabel_22);
		
		btnNewButton_12 = new JButton("All");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel2);
			}
		});
		btnNewButton_12.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_12.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_12.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton_12.setBackground(Color.WHITE);
		btnNewButton_12.setBounds(37, 159, 117, 23);
		panel6.add(btnNewButton_12);
		
		btnIceCream_3 = new JButton("Ice Cream");
		btnIceCream_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel4);
			}
		});
		btnIceCream_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnIceCream_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnIceCream_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnIceCream_3.setBackground(Color.WHITE);
		btnIceCream_3.setBounds(37, 193, 117, 23);
		panel6.add(btnIceCream_3);
		
		btnNewButton_13 = new JButton("Ice Cream Roll");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel5);
			}
		});
		btnNewButton_13.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_13.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_13.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton_13.setBackground(Color.WHITE);
		btnNewButton_13.setBounds(37, 227, 117, 23);
		panel6.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("Ice Cream Cake");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel6);
			}
		});
		btnNewButton_14.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_14.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_14.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton_14.setBackground(Color.WHITE);
		btnNewButton_14.setBounds(37, 261, 117, 23);
		panel6.add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("Ice Cream Waffle");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel7);
			}
		});
		btnNewButton_15.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_15.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_15.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton_15.setBackground(Color.WHITE);
		btnNewButton_15.setBounds(37, 295, 117, 23);
		panel6.add(btnNewButton_15);
		
		separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(37, 124, 117, 8);
		panel6.add(separator_3);
		
		lblNewLabel_62 = new JLabel("");
		lblNewLabel_62.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\311124979_1171839500356721_8524885836796778347_n.png"));
		lblNewLabel_62.setBounds(219, 110, 496, 435);
		panel6.add(lblNewLabel_62);
		
		panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(0, 544, 664, 102);
		panel6.add(panel_6);
		
		label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-facebook-23.png"));
		label_20.setBounds(228, 11, 23, 23);
		panel_6.add(label_20);
		
		label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-twitter-23.png"));
		label_21.setBounds(308, 11, 23, 23);
		panel_6.add(label_21);
		
		label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-instagram-23.png"));
		label_22.setBounds(386, 11, 23, 23);
		panel_6.add(label_22);
		
		label_23 = new JLabel("Boni Ave, Mandaluyong, 1550 Metro Manila");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_23.setBounds(202, 38, 245, 39);
		panel_6.add(label_23);
		
		label_24 = new JLabel("Copyright @ 2022 All Rights Reserved");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_24.setBounds(202, 63, 245, 39);
		panel_6.add(label_24);
		
		lblNewLabel_65_1_2 = new JLabel("");
		lblNewLabel_65_1_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (4).gif"));
		lblNewLabel_65_1_2.setBounds(10, 328, 193, 205);
		panel6.add(lblNewLabel_65_1_2);
		
		JLabel lblNewLabel_16_2 = new JLabel("");
		lblNewLabel_16_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\306662471_662810621848982_8225734010126902469_n.png"));
		lblNewLabel_16_2.setBounds(35, 11, 629, 49);
		panel6.add(lblNewLabel_16_2);
		
		separator_15 = new JSeparator();
		separator_15.setForeground(Color.BLACK);
		separator_15.setBounds(0, 543, 664, 2);
		panel6.add(separator_15);
		
		separator_16 = new JSeparator();
		separator_16.setForeground(Color.BLACK);
		separator_16.setBounds(0, 0, 664, 2);
		panel6.add(separator_16);
		
		panel7 = new JPanel();
		panel7.setBackground(Color.WHITE);
		layeredPane.add(panel7, "name_175679941498800");
		panel7.setLayout(null);
		
		lblNewLabel_23 = new JLabel("Filter By");
		lblNewLabel_23.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblNewLabel_23.setBounds(37, 99, 117, 23);
		panel7.add(lblNewLabel_23);
		
		btnNewButton_16 = new JButton("All");
		btnNewButton_16.addMouseListener(new MouseAdapter() {
		});
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel2);
			}
		});
		btnNewButton_16.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_16.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_16.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton_16.setBackground(Color.WHITE);
		btnNewButton_16.setBounds(37, 159, 117, 23);
		panel7.add(btnNewButton_16);
		
		btnIceCream_4 = new JButton("Ice Cream");
		btnIceCream_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel4);
			}
		});
		btnIceCream_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnIceCream_4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnIceCream_4.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnIceCream_4.setBackground(Color.WHITE);
		btnIceCream_4.setBounds(37, 193, 117, 23);
		panel7.add(btnIceCream_4);
		
		btnNewButton_17 = new JButton("Ice Cream Roll");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel5);
			}
		});
		btnNewButton_17.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_17.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_17.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton_17.setBackground(Color.WHITE);
		btnNewButton_17.setBounds(37, 227, 117, 23);
		panel7.add(btnNewButton_17);
		
		btnNewButton_18 = new JButton("Ice Cream Cake");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel6);
			}
		});
		btnNewButton_18.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_18.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_18.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton_18.setBackground(Color.WHITE);
		btnNewButton_18.setBounds(37, 261, 117, 23);
		panel7.add(btnNewButton_18);
		
		btnNewButton_19 = new JButton("Ice Cream Waffle");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel7);
			}
		});
		btnNewButton_19.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_19.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_19.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.BLACK));
		btnNewButton_19.setBackground(Color.WHITE);
		btnNewButton_19.setBounds(37, 295, 117, 23);
		panel7.add(btnNewButton_19);
		
		separator_4 = new JSeparator();
		separator_4.setForeground(Color.BLACK);
		separator_4.setBounds(37, 124, 117, 8);
		panel7.add(separator_4);
		
		lblNewLabel_63 = new JLabel("");
		lblNewLabel_63.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\310999898_811685536645646_4555402886250362975_n.png"));
		lblNewLabel_63.setBounds(218, 110, 496, 435);
		panel7.add(lblNewLabel_63);
		
		panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(0, 544, 664, 102);
		panel7.add(panel_11);
		
		label_25 = new JLabel("");
		label_25.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-facebook-23.png"));
		label_25.setBounds(228, 11, 23, 23);
		panel_11.add(label_25);
		
		label_26 = new JLabel("");
		label_26.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-twitter-23.png"));
		label_26.setBounds(308, 11, 23, 23);
		panel_11.add(label_26);
		
		label_27 = new JLabel("");
		label_27.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-instagram-23.png"));
		label_27.setBounds(386, 11, 23, 23);
		panel_11.add(label_27);
		
		label_28 = new JLabel("Boni Ave, Mandaluyong, 1550 Metro Manila");
		label_28.setHorizontalAlignment(SwingConstants.CENTER);
		label_28.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_28.setBounds(202, 38, 245, 39);
		panel_11.add(label_28);
		
		label_29 = new JLabel("Copyright @ 2022 All Rights Reserved");
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		label_29.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_29.setBounds(202, 63, 245, 39);
		panel_11.add(label_29);
		
		lblNewLabel_66 = new JLabel("");
		lblNewLabel_66.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (5).gif"));
		lblNewLabel_66.setBounds(10, 329, 193, 195);
		panel7.add(lblNewLabel_66);
		
		JLabel lblNewLabel_16_3 = new JLabel("");
		lblNewLabel_16_3.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\306662471_662810621848982_8225734010126902469_n.png"));
		lblNewLabel_16_3.setBounds(35, 11, 629, 49);
		panel7.add(lblNewLabel_16_3);
		
		separator_17 = new JSeparator();
		separator_17.setForeground(Color.BLACK);
		separator_17.setBounds(0, 543, 664, 2);
		panel7.add(separator_17);
		
		separator_18 = new JSeparator();
		separator_18.setForeground(Color.BLACK);
		separator_18.setBounds(0, 0, 664, 2);
		panel7.add(separator_18);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 0, 664, 105);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\ais 'krim.gif"));
		lblNewLabel_1.setBounds(0, 13, 235, 83);
		panel_1.add(lblNewLabel_1);
		
		btnHome = new JButton("HOME");
		btnHome.setBounds(257, 45, 89, 33);
		panel_1.add(btnHome);
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHome.setBackground(Color.PINK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnHome.setBackground(Color.WHITE);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnHome.setBackground(Color.WHITE);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnHome.setBackground(Color.PINK);
			}
		});
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel1);
			}
		});
		btnHome.setBackground(Color.WHITE);
		btnHome.setFont(new Font("Palatino Linotype", Font.BOLD, 13));
		btnHome.setBorder(null);
		
		btnMenu = new JButton("MENU");
		btnMenu.setBounds(356, 45, 89, 33);
		panel_1.add(btnMenu);
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMenu.setBackground(Color.PINK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnMenu.setBackground(Color.WHITE);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnMenu.setBackground(Color.WHITE);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnMenu.setBackground(Color.PINK);
			}
		});
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel2);
			}
		});
		btnMenu.setBackground(Color.WHITE);
		btnMenu.setFont(new Font("Palatino Linotype", Font.BOLD, 13));
		btnMenu.setBorder(null);
		
		btnOrderNow = new JButton("ORDER NOW");
		btnOrderNow.setBounds(455, 45, 101, 33);
		panel_1.add(btnOrderNow);
		btnOrderNow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnOrderNow.setBackground(Color.PINK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnOrderNow.setBackground(Color.WHITE);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnOrderNow.setBackground(Color.WHITE);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnOrderNow.setBackground(Color.PINK);
			}
		});
		btnOrderNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel3);
			}
		});
		btnOrderNow.setBackground(Color.WHITE);
		btnOrderNow.setFont(new Font("Palatino Linotype", Font.BOLD, 13));
		btnOrderNow.setBorder(null);
		
		btnLogout = new JButton("LOG OUT");
		btnLogout.setBounds(565, 45, 89, 33);
		panel_1.add(btnLogout);
		btnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLogout.setBackground(Color.PINK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnLogout.setBackground(Color.WHITE);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnLogout.setBackground(Color.WHITE);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnLogout.setBackground(Color.PINK);
			}
		});
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Do you want to log-out your account?", "AIS 'KRIM", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Login account = new Login();
					account.setVisible(true);
					dispose();
				}
			}
		});
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setFont(new Font("Palatino Linotype", Font.BOLD, 13));
		btnLogout.setBorder(null);
	}
}
