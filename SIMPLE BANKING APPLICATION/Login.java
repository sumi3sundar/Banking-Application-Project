import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SpringLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {
    private Image img_login= new ImageIcon(Login.class.getResource("res/key3.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_password= new ImageIcon(Login.class.getResource("res/lock.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_username= new ImageIcon(Login.class.getResource("res/woman.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel lblLoginMessage = new JLabel("");

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
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblbankimage = new JLabel("New label");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblLoginMessage, 156, SpringLayout.NORTH, lblbankimage);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblbankimage, 96, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblbankimage, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblbankimage, 443, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblbankimage, 370, SpringLayout.WEST, contentPane);
		lblbankimage.setIcon(new ImageIcon("D:\\project images\\istockphoto-1191152066-612x612.jpg"));
		contentPane.add(lblbankimage);
		
		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.WEST, lblLoginMessage, 0, SpringLayout.WEST, panel);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblLoginMessage, 0, SpringLayout.EAST, panel);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 109, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 488, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, -400, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, -35, SpringLayout.EAST, contentPane);
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtUsername.getText().equals("Username")) {
					txtUsername.setText("");
				}
				else {
					txtUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals(""))
				{
					txtUsername.setText("Username");
				}
			}
		});
		txtUsername.setBorder(null);
		txtUsername.setBounds(10, 11, 194, 20);
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 13));
		txtUsername.setText("Username");
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblIconUsername = new JLabel("");
		panel.add(lblIconUsername);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblIconUsername, -735, SpringLayout.EAST, contentPane);
		lblIconUsername.setBounds(212, 6, 39,30);
		lblIconUsername.setIcon(new ImageIcon(img_username));
		
		JPanel panel_1 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_1, 39, SpringLayout.SOUTH, panel);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_1, 488, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_1, 232, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_1, 0, SpringLayout.EAST, panel);
		panel_1.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Password")) {
				txtPassword.setEchoChar('*');
				txtPassword.setText("");
				}
				else {
					txtPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
			if(txtPassword.getText().equals("")) {
				txtPassword.setText("Password");
				txtPassword.setEchoChar((char)0);

				
			}
			}
			
		});
		txtPassword.setBorder(null);
		txtPassword.setBounds(10, 11, 189, 20);
		txtPassword.setText("PassWord");
		panel_1.add(txtPassword);
		
		JLabel lblIconPassword = new JLabel("");
		lblIconPassword.setBounds(209, 1, 40, 40);
		panel_1.add(lblIconPassword);
		lblIconPassword.setIcon(new ImageIcon(img_password));
		
		JPanel panLogin = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblLoginMessage, -16, SpringLayout.NORTH, panLogin);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panLogin, 302, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panLogin, 123, SpringLayout.EAST, lblbankimage);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panLogin, -207, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panLogin, -30, SpringLayout.EAST, contentPane);
		panLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtUsername.getText().equals("Sumathi")&& txtPassword.getText().equals("Thivesh")) {
					
					new dashboard().setVisible(true);
					dispose();
				}
				else if(txtUsername.getText().equals("")|| txtUsername.getText().equals("Username") ||
						txtPassword.getText().equals("")|| txtPassword.getText().equals("Password")) {
					lblLoginMessage.setText("Please input all requriments!");
				}
				else {
					lblLoginMessage.setText("Username and Password didn't Match!");
				}
			}
			
		});
		panLogin.setBackground(new Color(51, 204, 153));
		contentPane.add(panLogin);
		panLogin.setLayout(null);
		
		JLabel lblLogin = new JLabel("LogIn");
		lblLogin.setForeground(new Color(255, 204, 0));
		lblLogin.setFont(new Font("Arial", Font.BOLD, 18));
		lblLogin.setBounds(109, 11, 105, 26);
		panLogin.add(lblLogin);
		
		lblLoginMessage.setForeground(new Color(0, 255, 0));
		lblLoginMessage.setFont(new Font("Arial",Font.PLAIN,12));
		lblLoginMessage.setBounds(175,269,250,18);
		contentPane.add(lblLoginMessage);
		setLocationRelativeTo(null);
	}
}
