import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Window;
import java.awt.Component;
import java.awt.Desktop;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class dashboard extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	protected Window panelinsuranceprop;
	protected Window panelfoodprop;
	protected Object paneltravel;
	private JLayeredPane layeredPane;
	private JPanel homepanel;
	private JPanel transferpanel;
	private JPanel billpanel;
	private JPanel travelpanel;
	private JPanel foodpanel;
	private JPanel toselfaccountpanel;
	private JTextField account;
	private JTextField amount;
	private JLabel lblNewLabel_3;
	private JLabel balance;
    private JLabel lbldatetime_1;
    private JLabel lbldatetime_1_1;
    private JLabel lblgas;
    private JPanel gaspanel;
    private JTextField txtgasprovider;
    private JTextField txtpayfrom;
    private JTextField txtamount;
	private JLabel lblacbalance;
	private JPanel instantpaymentpanel;
	private JTextField bankname;
	private JTextField account1;
	private JTextField amount1;
	private JTextField purpose;
	private JTextField email;
	private JTextField mobile;
	private JTextField note;
    

	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashboard frame = new dashboard();
					
					frame.setVisible(true);
					frame.currentdateTime();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void currentdateTime()
	{
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		lbldatetime_1_1.setText(dtf.format(now));
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
	public dashboard() {
		
	    lbldatetime_1_1= new JLabel();	
	    
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 994, 607);
		contentPane = new JPanel();
		//contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel sidepanel = new JPanel();
		sidepanel.setBackground(new Color(0, 0, 0));
		sidepanel.setBounds(0, 55, 223, 557);
		contentPane.add(sidepanel);
		sidepanel.setLayout(null);
		
		JPanel paneltransfermoney = new JPanel();
		paneltransfermoney.setBorder(null);
		paneltransfermoney.setBackground(new Color(0, 0, 0));
		paneltransfermoney.setBounds(0, 138, 268, 53);
		sidepanel.add(paneltransfermoney);
		paneltransfermoney.setLayout(null);
		
		JLabel lblicontransmoney = new JLabel("");
		lblicontransmoney.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblicontransmoney.setVerticalAlignment(SwingConstants.TOP);
		lblicontransmoney.setBounds(10, 11, 40, 42);
		paneltransfermoney.add(lblicontransmoney);
		lblicontransmoney.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\money-transfer.png"));
		
		JButton btnNewButton_1 = new JButton("Transfer Money");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBackground(new Color(204, 204, 51));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(transferpanel);
			}
		});
		btnNewButton_1.setBounds(70, 11, 140, 31);
		paneltransfermoney.add(btnNewButton_1);
		
		JPanel panelbillpayments = new JPanel();
		panelbillpayments.setBorder(null);
		panelbillpayments.setBackground(new Color(0, 0, 0));
		panelbillpayments.setBounds(0, 190, 268, 53);
		sidepanel.add(panelbillpayments);
		panelbillpayments.setLayout(null);
		
		JLabel lbliconbill = new JLabel("");
		lbliconbill.setVerticalTextPosition(SwingConstants.TOP);
		lbliconbill.setVerticalAlignment(SwingConstants.TOP);
		lbliconbill.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\bill.png"));
		lbliconbill.setBounds(10, 11, 70, 42);
		panelbillpayments.add(lbliconbill);
		
		JButton btnNewButton_2 = new JButton("Bill Payments");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBackground(new Color(204, 204, 51));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(billpanel);
			}
			
		});
		btnNewButton_2.setBounds(65, 11, 141, 31);
		panelbillpayments.add(btnNewButton_2);
		
		JPanel paneltravelbooking = new JPanel();
		paneltravelbooking.setBorder(null);
		paneltravelbooking.setBackground(new Color(0, 0, 0));
		paneltravelbooking.setBounds(0, 243, 268, 53);
		sidepanel.add(paneltravelbooking);
		paneltravelbooking.setLayout(null);
		
		JLabel lblicontravel = new JLabel("");
		lblicontravel.setVerticalTextPosition(SwingConstants.TOP);
		lblicontravel.setVerticalAlignment(SwingConstants.TOP);
		lblicontravel.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\traveler.png"));
		lblicontravel.setBounds(10, 11, 46, 42);
		paneltravelbooking.add(lblicontravel);
		
		JButton btnNewButton_4 = new JButton("Travel Booking");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_4.setBackground(new Color(204, 204, 51));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(travelpanel);
			}
		});
		btnNewButton_4.setBounds(66, 11, 145, 31);
		paneltravelbooking.add(btnNewButton_4);
		
		JPanel panelfoodorder = new JPanel();
		panelfoodorder.setBorder(null);
		panelfoodorder.setBackground(new Color(0, 0, 0));
		panelfoodorder.setBounds(0, 295, 268, 53);
		sidepanel.add(panelfoodorder);
		panelfoodorder.setLayout(null);
		
		JLabel lbliconfood = new JLabel("");
		lbliconfood.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\baby-spoon.png"));
		lbliconfood.setBounds(10, 11, 46, 42);
		panelfoodorder.add(lbliconfood);
		
		JButton btnNewButton_5 = new JButton("Food");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_5.setBackground(new Color(204, 204, 51));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(foodpanel);
			}
		});
		btnNewButton_5.setBounds(66, 11, 149, 31);
		panelfoodorder.add(btnNewButton_5);
		
		JPanel panelhome = new JPanel();
		panelhome.setBackground(new Color(0, 0, 0));
		panelhome.setBounds(0, 88, 223, 47);
		sidepanel.add(panelhome);
		panelhome.setLayout(null);
		
		JLabel lbliconhome = new JLabel("");
		lbliconhome.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\home.png"));
		lbliconhome.setBounds(10, 0, 46, 42);
		panelhome.add(lbliconhome);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBorder(new CompoundBorder());
		btnNewButton.setBackground(new Color(204, 204, 51));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(homepanel);
			}
		});
		btnNewButton.setBounds(66, 11, 144, 31);
		panelhome.add(btnNewButton);
		
		JPanel toolpanel = new JPanel();
		toolpanel.setBackground(new Color(0, 0, 0));
		toolpanel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		toolpanel.setBounds(0, 0, 978, 56);
		contentPane.add(toolpanel);
		toolpanel.setLayout(null);
		
		JLabel lblheading = new JLabel("SIMPLE BANKING APPLICATION");
		lblheading.setForeground(new Color(255, 0, 0));
		lblheading.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblheading.setBounds(77, 11, 417, 45);
		toolpanel.add(lblheading);
		
		JLabel lblicontoolbar = new JLabel("");
		lblicontoolbar.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\bank (1).png"));
		lblicontoolbar.setBounds(33, 11, 34, 45);
		toolpanel.add(lblicontoolbar);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(222, 55, 756, 506);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		homepanel = new JPanel();
		homepanel.setBackground(new Color(211, 211, 211));
		layeredPane.add(homepanel, "name_606273879770500");
		homepanel.setLayout(null);
		
		JLabel lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setIcon(new ImageIcon("D:\\project images\\ba.jpg"));
		lblNewLabel_18.setBounds(0, 0, 756, 518);
		homepanel.add(lblNewLabel_18);
		//homepanel.setLayout(null);
		
		transferpanel = new JPanel();
		transferpanel.setBackground(SystemColor.control);
		layeredPane.add(transferpanel, "name_606281351613700");
		transferpanel.setLayout(null);
		
		JLabel lbltoselfaccount = new JLabel("To Self Account");
		lbltoselfaccount.setForeground(UIManager.getColor("Button.light"));
		lbltoselfaccount.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbltoselfaccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanels(toselfaccountpanel);
			}
		});
		lbltoselfaccount.setBounds(91, 86, 206, 35);
		transferpanel.add(lbltoselfaccount);
		
		JLabel lblinstantpayment = new JLabel("Instant Payment");
		lblinstantpayment.setForeground(UIManager.getColor("Button.light"));
		lblinstantpayment.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblinstantpayment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanels(instantpaymentpanel);
			}
		});
		lblinstantpayment.setBounds(91, 232, 194, 35);
		transferpanel.add(lblinstantpayment);
		
		JLabel lblNewLabel_19 = new JLabel("Check Balance");
		lblNewLabel_19.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_19.addMouseListener(new MouseAdapter() {
			private String accountbalance;

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","root");
					
					 // to get the data from the account table of balance
					  String sql="select accountbalance from account ";
					  PreparedStatement ptst=con.prepareStatement(sql);
					  ResultSet rs=ptst.executeQuery(sql);
					  
					if(rs.next()) {
					//	 balance.setText(rs.getString("accountbalance"));
						JOptionPane.showMessageDialog(null,"Your Account balance is   "+rs.getString("accountbalance"));
						  
					  }
					  else {
						balance.setText(" ");  
					  }
					con.close();
				}
				catch(Exception e1)
				{
				  JOptionPane.showMessageDialog(null, e1);
				}
			
			}
		});
		lblNewLabel_19.setBounds(91, 415, 190, 25);
		transferpanel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("New label");
		lblNewLabel_20.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\to-self.png"));
		lblNewLabel_20.setBounds(0, 75, 67, 64);
		transferpanel.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\payment.png"));
		lblNewLabel_21.setBounds(0, 215, 79, 64);
		transferpanel.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("");
		lblNewLabel_22.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\check-balance.png"));
		lblNewLabel_22.setBounds(0, 379, 67, 64);
		transferpanel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_31 = new JLabel("New label");
		lblNewLabel_31.setIcon(new ImageIcon("D:\\project images\\trans.jpg"));
		lblNewLabel_31.setBounds(0, 0, 746, 506);
		transferpanel.add(lblNewLabel_31);
		
	   	
		billpanel = new JPanel();
		billpanel.setName("");
		billpanel.setToolTipText("");
		billpanel.setBackground(Color.WHITE);
		layeredPane.add(billpanel, "name_606289589993800");
		billpanel.setLayout(null);
		
	    lbldatetime_1_1 = new JLabel("Date");
	    lbldatetime_1_1.setForeground(UIManager.getColor("Button.light"));
	    lbldatetime_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbldatetime_1_1.setBounds(496, 70, 162, 14);
		billpanel.add(lbldatetime_1_1);
		
		lblgas = new JLabel("PAY BILL");
		lblgas.setForeground(UIManager.getColor("Button.light"));
		lblgas.setVerticalAlignment(SwingConstants.BOTTOM);
		lblgas.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblgas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanels(gaspanel);
			}
		});
		lblgas.setBounds(501, 250, 224, 33);
		billpanel.add(lblgas);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\bill (1).png"));
		lblNewLabel_7.setBounds(375, 204, 116, 96);
		billpanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_36 = new JLabel("");
		lblNewLabel_36.setIcon(new ImageIcon("D:\\project images\\paybill.jpg"));
		lblNewLabel_36.setBounds(0, 0, 756, 506);
		billpanel.add(lblNewLabel_36);
		//insurancepanel.setLayout(null);
		
		travelpanel = new JPanel();
		travelpanel.setBackground(SystemColor.controlHighlight);
		layeredPane.add(travelpanel, "name_606319548341700");
		travelpanel.setLayout(null);
		
		JButton btnBus = new JButton("BUS");
		btnBus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser=Desktop.getDesktop();
				try {
				browser.browse(new URI("https://www.redbus.in/"));
			}
				catch(IOException err) {
					
				}
				catch(URISyntaxException err) {
					
				}
			}
		});
		btnBus.setBounds(381, 82, 111, 33);
		travelpanel.add(btnBus);
		
		JButton btnNewButton_15 = new JButton("TRAIN");
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser=Desktop.getDesktop();
				try {
				browser.browse(new URI("https://www.confirmtkt.com/"));
			}
				catch(IOException err) {
					
				}
				catch(URISyntaxException err) {
					
				}
			}
		});
		btnNewButton_15.setBounds(381, 206, 111, 33);
		travelpanel.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("FLIGHT");
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser=Desktop.getDesktop();
				try {
				browser.browse(new URI("https://www.makemytrip.com/flights/"));
			}
				catch(IOException err) {
					
				}
				catch(URISyntaxException err) {
					
				}
			}
		});
		btnNewButton_16.setBounds(381, 335, 111, 33);
		travelpanel.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("HOTEL");
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser=Desktop.getDesktop();
				try {
				browser.browse(new URI("https://www.makemytrip.com/hotels/"));
			}
				catch(IOException err) {
					
				}
				catch(URISyntaxException err) {
					
				}
			}
		});
		btnNewButton_17.setBounds(381, 455, 111, 33);
		travelpanel.add(btnNewButton_17);
		
		JLabel lblNewLabel_27 = new JLabel("");
		lblNewLabel_27.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\bus.png"));
		lblNewLabel_27.setBounds(244, 67, 74, 48);
		travelpanel.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("New label");
		lblNewLabel_28.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\railway.png"));
		lblNewLabel_28.setBounds(248, 194, 57, 48);
		travelpanel.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("");
		lblNewLabel_29.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\flight.png"));
		lblNewLabel_29.setBounds(259, 335, 59, 36);
		travelpanel.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("New label");
		lblNewLabel_30.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\hotel.png"));
		lblNewLabel_30.setBounds(259, 439, 59, 49);
		travelpanel.add(lblNewLabel_30);
		
		JLabel lblNewLabel_37 = new JLabel("");
		lblNewLabel_37.setIcon(new ImageIcon("D:\\project images\\trav.jpg"));
		lblNewLabel_37.setBounds(0, 0, 756, 516);
		travelpanel.add(lblNewLabel_37);
		//travelpanel.setLayout(null);
		
		foodpanel = new JPanel();
		foodpanel.setBackground(Color.WHITE);
		layeredPane.add(foodpanel, "name_606328342383700");
		foodpanel.setLayout(null);
		
		JButton btnNewButton_11 = new JButton("Swiggy");
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser=Desktop.getDesktop();
				try {
				browser.browse(new URI("https://www.swiggy.com/city/tirunelveli"));
			}
				catch(IOException err) {
					
				}
				catch(URISyntaxException err) {
					
				}
			}
		});
		btnNewButton_11.setBounds(48, 166, 116, 38);
		foodpanel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("KFC");
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser=Desktop.getDesktop();
				try {
				browser.browse(new URI("https://online.kfc.co.in/"));
			}
				catch(IOException err) {
					
				}
				catch(URISyntaxException err) {
					
				}
			}
		});
		btnNewButton_12.setBounds(325, 166, 89, 38);
		foodpanel.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Zomato");
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser=Desktop.getDesktop();
				try {
				browser.browse(new URI("https://www.zomato.com/chennai/order-food-online"));
			}
				catch(IOException err) {
					
				}
				catch(URISyntaxException err) {
					
				}
			}
		});
		btnNewButton_13.setBounds(48, 397, 116, 38);
		foodpanel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("Domino's");
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser=Desktop.getDesktop();
				try {
				browser.browse(new URI("https://pizzaonline.dominos.co.in/?src=brand"));
			}
				catch(IOException err) {
					
				}
				catch(URISyntaxException err) {
					
				}
			}
		});
		btnNewButton_14.setBounds(325, 397, 131, 38);
		foodpanel.add(btnNewButton_14);
		
		JLabel lblNewLabel_23 = new JLabel("");
		lblNewLabel_23.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\swiggy.png"));
		lblNewLabel_23.setBounds(71, 102, 46, 68);
		foodpanel.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("");
		lblNewLabel_24.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\kfc.png"));
		lblNewLabel_24.setBounds(342, 102, 58, 58);
		foodpanel.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("");
		lblNewLabel_25.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\zomato.png"));
		lblNewLabel_25.setBounds(71, 334, 72, 52);
		foodpanel.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("");
		lblNewLabel_26.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\dominos.png"));
		lblNewLabel_26.setBounds(342, 323, 57, 52);
		foodpanel.add(lblNewLabel_26);
		
		JLabel lblNewLabel_35 = new JLabel("New label");
		lblNewLabel_35.setIcon(new ImageIcon("D:\\project images\\food.jpg"));
		lblNewLabel_35.setBounds(0, 0, 756, 506);
		foodpanel.add(lblNewLabel_35);
		
		toselfaccountpanel = new JPanel();
		toselfaccountpanel.setBackground(Color.CYAN);
		layeredPane.add(toselfaccountpanel, "name_614339989025700");
		toselfaccountpanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TO SELF ACCOUNT");
		lblNewLabel.setForeground(UIManager.getColor("CheckBox.foreground"));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(306, 22, 247, 44);
		toselfaccountpanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Account Number :");
		lblNewLabel_1.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(178, 123, 164, 14);
		toselfaccountpanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Amount :");
		lblNewLabel_2.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(178, 204, 164, 14);
		toselfaccountpanel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("ShowBalance:");
		lblNewLabel_3.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			
		@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","root");
					
					 // to get the data from the account table of balance
					  String sql="select accountbalance from account ";
					  PreparedStatement ptst=con.prepareStatement(sql);
					  ResultSet rs=ptst.executeQuery(sql);
					  
					if(rs.next()) {
						  balance.setText(rs.getString("accountbalance"));
						  
					  }
					  else {
						balance.setText(" ");  
					  }
					con.close();
				}
				catch(Exception e1)
				{
				  JOptionPane.showMessageDialog(null, e1);
				}
				
			}
		});
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(224, 369, 164, 14);
		toselfaccountpanel.add(lblNewLabel_3);
		
		account = new JTextField();
		account.setBounds(406, 122, 187, 20);
		toselfaccountpanel.add(account);
		account.setColumns(10);
		
		amount = new JTextField();
		amount.setBounds(406, 203, 187, 20);
		toselfaccountpanel.add(amount);
		amount.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("Submit");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Amount=amount.getText();
				int AmountInt=Integer.parseInt(Amount);
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","root");
					
					// to get the data in JTextfield from Mysql
					String sql="select accountnumber from account";
					String sql1="select accountbalance from account";
					
					PreparedStatement ptstmt=con.prepareStatement(sql);
					PreparedStatement ptst=con.prepareStatement(sql1);
					ResultSet rs=ptstmt.executeQuery(sql);
					
					if(rs.next()) {
						account.setText(rs.getString("accountnumber"));
					}
					else {
						account.setText("");
					}
					
					ResultSet rs1=ptst.executeQuery(sql1);
					
					if(rs1.next()) {
					String accountblc=rs1.getString("accountbalance");
					int totalaccountblc=Integer.parseInt(accountblc) + AmountInt;
					String sql2="Update account SET accountbalance ='"+totalaccountblc+"'";
					PreparedStatement ptmt=con.prepareStatement(sql2);
					ptmt.execute();
					}
					
					con.close();
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
					
				}
			}
		});
		btnNewButton_6.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton_6.setBounds(444, 275, 109, 29);
		toselfaccountpanel.add(btnNewButton_6);
		
		JLabel lblNewLabel_4 = new JLabel("PKR/=");
		lblNewLabel_4.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(355, 426, 87, 14);
		toselfaccountpanel.add(lblNewLabel_4);
		
	    balance = new JLabel("00000");
	    balance.setForeground(UIManager.getColor("Button.light"));
	
		balance.setFont(new Font("Tahoma", Font.BOLD, 18));
		balance.setBounds(477, 426, 136, 14);
		toselfaccountpanel.add(balance);
		
		JLabel lblNewLabel_32 = new JLabel("");
		lblNewLabel_32.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\pexels-dana-tentis-370799.jpg"));
		lblNewLabel_32.setBounds(0, 0, 756, 506);
		toselfaccountpanel.add(lblNewLabel_32);
		
		gaspanel = new JPanel();
		gaspanel.setBackground(Color.PINK);
		layeredPane.add(gaspanel, "name_839424309125900");
		gaspanel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("BILLER NAME");
		lblNewLabel_5.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(144, 67, 131, 17);
		gaspanel.add(lblNewLabel_5);
		
		txtgasprovider = new JTextField();
		txtgasprovider.setBounds(352, 67, 208, 20);
		gaspanel.add(txtgasprovider);
		txtgasprovider.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String selectedValue=comboBox.getSelectedItem().toString();
				txtgasprovider.setText(selectedValue);
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mobile Recharge", "DTH", "Gas Cyclinder", "Electricity", "Water"}));
		comboBox.setBounds(352, 118, 208, 22);
		gaspanel.add(comboBox);
		
		JLabel lblNewLabel_10 = new JLabel("PAY FROM");
		lblNewLabel_10.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_10.setBounds(144, 197, 131, 19);
		gaspanel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("AMOUNT");
		lblNewLabel_11.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_11.setBounds(144, 304, 131, 14);
		gaspanel.add(lblNewLabel_11);
		
		txtpayfrom = new JTextField();
		txtpayfrom.setBounds(352, 198, 166, 20);
		gaspanel.add(txtpayfrom);
		txtpayfrom.setColumns(10);
		
		JButton btnNewButton_7 = new JButton("SELECT AMOUNT");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","root");
					
					//to get the data from mysql into the JTextField of account number
					
					String sql="select accountnumber from account";
					PreparedStatement ptst=con.prepareStatement(sql);
					ResultSet rs=ptst.executeQuery(sql);
					if(rs.next()) {
						txtpayfrom.setText(rs.getString("accountnumber"));
						}
					else {
						txtpayfrom.setText("");
					}
					con.close();
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnNewButton_7.setBounds(352, 247, 160, 23);
		gaspanel.add(btnNewButton_7);
		
		txtamount = new JTextField();
		txtamount.setBounds(352, 303, 171, 20);
		gaspanel.add(txtamount);
		txtamount.setColumns(10);
		
		JButton btnNewButton_8 = new JButton("PAY");
		btnNewButton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","root");
					String amnt=txtamount.getText();
					int amntInt=Integer.parseInt(amnt);
					String gasprovider=txtgasprovider.getText();
					
					//To get the data in JTextField from Mysql
					
					String sql="select accountbalance from account where ID =1";
					PreparedStatement ptst=con.prepareStatement(sql);
					ResultSet rs=ptst.executeQuery(sql);
					if(rs.next()) {
						lblacbalance.setText(rs.getString("accountbalance"));
						String accbalance=rs.getString("accountbalance");
						int accbalanceInt=Integer.parseInt(accbalance);
						
						if(accbalanceInt >=amntInt) {
							int leftover=accbalanceInt-amntInt;
							
							String sql1="Update account SET accountbalance='"+leftover+"'";
							PreparedStatement ptmt=con.prepareStatement(sql1);
							ptmt.execute();
							
							String sql2="insert into paybills values(?,?)";
							PreparedStatement pts=con.prepareStatement(sql2);
							pts.setString(1,txtgasprovider.getText());
							pts.setString(2,txtamount.getText());
			                JOptionPane.showMessageDialog(null,"Your"+gasprovider+"bill of amount"+amnt+"has been paid.");				
						}
						
						else {
							JOptionPane.showMessageDialog(null,"Your account balance is low");
						}
					}
						else {
						      lblacbalance.setText("");	
						}
					
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnNewButton_8.setBounds(356, 358, 89, 23);
		gaspanel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("CANCEL");
		btnNewButton_9.setBounds(535, 358, 89, 23);
		gaspanel.add(btnNewButton_9);
		
		JLabel lblNewLabel_12 = new JLabel("VIEW ACCOUNT BALANCE");
		lblNewLabel_12.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_12.addMouseListener(new MouseAdapter() {
		

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","root");
					
					//To get data from Mysql in JTextfield
					String sql="select accountbalance from account where ID =1";
					PreparedStatement ptst=con.prepareStatement(sql);
					ResultSet rs=ptst.executeQuery(sql);
					
					if(rs.next()) {
						lblacbalance.setText(rs.getString("accountbalance"));   
					}
					else
					{
						lblacbalance.setText("");
					}
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,e1);
				}
			}
		});
		lblNewLabel_12.setBounds(77, 427, 198, 20);
		gaspanel.add(lblNewLabel_12);
		
	    lblacbalance = new JLabel("00000");
	    lblacbalance.setForeground(UIManager.getColor("Button.light"));
	    lblacbalance.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblacbalance.setBounds(352, 423, 192, 25);
		gaspanel.add(lblacbalance);
		
		JLabel lblNewLabel_34 = new JLabel("New label");
		lblNewLabel_34.setIcon(new ImageIcon("C:\\Users\\Sumathi Sundar\\Downloads\\pexels-achim-bongard-352096.jpg"));
		lblNewLabel_34.setBounds(0, 0, 756, 506);
		gaspanel.add(lblNewLabel_34);
		
		instantpaymentpanel = new JPanel();
		instantpaymentpanel.setBackground(SystemColor.activeCaption);
		layeredPane.add(instantpaymentpanel, "name_872374136809900");
		instantpaymentpanel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("INSTANT PAYMENT");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(302, 11, 201, 14);
		instantpaymentpanel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("Select Bank");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(41, 66, 103, 14);
		instantpaymentpanel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Account Number");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setBounds(41, 138, 133, 14);
		instantpaymentpanel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_13 = new JLabel("Amount");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_13.setBounds(41, 198, 133, 14);
		instantpaymentpanel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Purpose");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_14.setBounds(41, 256, 133, 14);
		instantpaymentpanel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Payee Email");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_15.setBounds(41, 319, 152, 14);
		instantpaymentpanel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Payee Mobile");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_16.setBounds(41, 382, 196, 14);
		instantpaymentpanel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Note");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_17.setBounds(41, 434, 46, 14);
		instantpaymentpanel.add(lblNewLabel_17);
		
		bankname = new JTextField();
		bankname.setBounds(217, 65, 226, 20);
		instantpaymentpanel.add(bankname);
		bankname.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedValue=comboBox_1.getSelectedItem().toString();
				bankname.setText(selectedValue);
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"ICICI Bank", "Indian Bank", "IOB Bank", "KVB Bank", "State Bank of India", "TMB Bank", ""}));
		comboBox_1.setBounds(217, 96, 226, 22);
		instantpaymentpanel.add(comboBox_1);
		
		account1 = new JTextField();
		account1.setBounds(217, 137, 226, 20);
		instantpaymentpanel.add(account1);
		account1.setColumns(10);
		
		amount1 = new JTextField();
		amount1.setBounds(217, 197, 226, 20);
		instantpaymentpanel.add(amount1);
		amount1.setColumns(10);
		
		purpose = new JTextField();
		purpose.setBounds(217, 255, 226, 20);
		instantpaymentpanel.add(purpose);
		purpose.setColumns(10);
		
		email = new JTextField();
		email.setBounds(217, 318, 226, 20);
		instantpaymentpanel.add(email);
		email.setColumns(10);
		
		mobile = new JTextField();
		mobile.setBounds(217, 381, 226, 20);
		instantpaymentpanel.add(mobile);
		mobile.setColumns(10);
		
		note = new JTextField();
		note.setBounds(217, 433, 218, 20);
		instantpaymentpanel.add(note);
		note.setColumns(10);
		
		JButton btnNewButton_10 = new JButton("PAY");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","root");
				
				String amnt =amount1.getText();
				int amntInt=Integer.parseInt(amnt);
				
				String sql="insert into instantpay values(?,?,?,?,?,?,?)";
				PreparedStatement ptst=con.prepareStatement(sql);
				ptst.setString(1, bankname.getText());
				ptst.setString(2, account1.getText());
				ptst.setString(3, amount1 .getText());
				ptst.setString(4, purpose .getText());
				ptst.setString(5, email   .getText());
				ptst.setString(6, mobile  .getText());
				ptst.setString(7, note    .getText());
				ptst.executeUpdate();
				
				String sql2="select accountbalance from account where ID=1";
				PreparedStatement ptstmt=con.prepareStatement(sql2);
				
				ResultSet rs=ptstmt.executeQuery(sql2);
				
				if(rs.next()) {
					String accbalance=rs.getString("accountbalance");
					int accbalanceInt=Integer.parseInt(accbalance);
					
					int leftover=accbalanceInt- amntInt;
				String sql3="update account SET accountbalance='"+leftover+"'";
				PreparedStatement pt=con.prepareStatement(sql3);
				pt.execute();
				
				JOptionPane.showMessageDialog(null, "Amount has been transferred Successfully...");
				con.close();
				}
				
			}
			catch(Exception e1) {
				JOptionPane.showMessageDialog(null, e1);
			}
			}
			
		});
		btnNewButton_10.setBounds(288, 472, 89, 23);
		instantpaymentpanel.add(btnNewButton_10);
		
		JLabel lblNewLabel_33 = new JLabel("New label");
		lblNewLabel_33.setIcon(new ImageIcon("D:\\project images\\iii.jpg"));
		lblNewLabel_33.setBounds(0, 0, 756, 506);
		instantpaymentpanel.add(lblNewLabel_33);
		
	}
}
