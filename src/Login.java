import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

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
		setBounds(100, 100, 1109, 615);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Wide Latin", Font.BOLD, 70));
		lblNewLabel.setBounds(208, 22, 723, 137);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName :");
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		lblNewLabel_1.setBounds(168, 217, 129, 44);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setOpaque(false);
		textField.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		textField.setForeground(new Color(255, 0, 0));
		textField.setBounds(341, 214, 424, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setOpaque(false);
		passwordField.setForeground(new Color(255, 0, 0));
		passwordField.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		passwordField.setBounds(341, 321, 424, 44);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("PassWord :");
		lblNewLabel_2.setForeground(Color.YELLOW);
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		lblNewLabel_2.setBounds(168, 321, 129, 44);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("X");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		lblNewLabel_3.setBounds(1050, 0, 59, 35);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Login");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try
				{
					int a=0,b=0;
					String u1,pass;
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
					u1="select Username from user";
					pass="select Password from user";
					PreparedStatement pst1=con.prepareStatement(u1);
					PreparedStatement pst2=con.prepareStatement(pass);
					ResultSet rs=pst1.executeQuery(u1);
					while(rs.next())
					{
						String u2=rs.getString("Username");
						String u3=textField.getText();
						if(u2.equals(u3))
						{
							a=1;
						}
					}
					ResultSet rs1=pst2.executeQuery(pass);
					while(rs1.next())
					{
						String u4=rs1.getString("Password");
						String u5=String.valueOf(passwordField.getPassword());
						if(u4.equals(u5))
						{
							b=1;
						}
					}
					if(a==1 && b==1)
					{
						JOptionPane.showMessageDialog(null,"Login SuccessFully...");
						textField.setText("");
						passwordField.setText("");
						Shop shop=new Shop();
						shop.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Invalid UserName Or PassWord...");
						textField.setText("");
						passwordField.setText("");
					}
					con.close();
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		lblNewLabel_4.setForeground(Color.YELLOW);
		lblNewLabel_4.setBounds(341, 404, 134, 33);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Reset");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
				passwordField.setText("");
			}
		});
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		lblNewLabel_5.setForeground(Color.YELLOW);
		lblNewLabel_5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_5.setBounds(625, 404, 140, 33);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Sign Up For New User ?");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_6.setForeground(Color.red);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_6.setForeground(new Color(0, 0, 255));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Form form=new Form();
				form.setVisible(true);
			}
		});
		lblNewLabel_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_6.setForeground(Color.YELLOW);
		lblNewLabel_6.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		lblNewLabel_6.setBounds(418, 476, 294, 44);
		contentPane.add(lblNewLabel_6);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show PassWord");
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setForeground(Color.CYAN);
		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxNewCheckBox.isSelected())
				{
					passwordField.setEchoChar((char)0);
				}
				else
				{
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxNewCheckBox.setBounds(784, 322, 155, 44);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Asus\\Downloads\\jack-millard-sa4TE0-MrOw-unsplash.jpg"));
		lblNewLabel_7.setBounds(0, 0, 1109, 615);
		contentPane.add(lblNewLabel_7);
		setUndecorated(true);
	}
}
