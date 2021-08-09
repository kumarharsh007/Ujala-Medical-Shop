import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
public class Form extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
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
	public Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 722, 801);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("SIGN UP");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 70));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(91, 10, 521, 132);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(677, 0, 45, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("First Name :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2.setBounds(71, 152, 128, 25);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setOpaque(false);
		textField.setForeground(new Color(255, 0, 0));
		textField.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		textField.setBounds(242, 149, 279, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Last Name :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_3.setBounds(71, 214, 138, 25);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setOpaque(false);
		textField_1.setForeground(new Color(255, 0, 0));
		textField_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		textField_1.setBounds(242, 202, 278, 40);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("UserName :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_4.setBounds(71, 277, 128, 25);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setOpaque(false);
		textField_2.setForeground(new Color(255, 0, 0));
		textField_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		textField_2.setBounds(242, 274, 279, 40);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setOpaque(false);
		passwordField.setForeground(new Color(255, 0, 0));
		passwordField.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		passwordField.setBounds(242, 335, 279, 45);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setOpaque(false);
		passwordField_1.setForeground(new Color(255, 0, 0));
		passwordField_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		passwordField_1.setBounds(242, 407, 279, 45);
		contentPane.add(passwordField_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textArea.setOpaque(false);
		textArea.setForeground(new Color(255, 0, 0));
		textArea.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		textArea.setBounds(242, 548, 279, 95);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_5 = new JLabel("Password:");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_5.setBounds(71, 341, 125, 25);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Retype PassWord :");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_6.setBounds(71, 407, 161, 45);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Mobile  :");
		lblNewLabel_7.setForeground(Color.YELLOW);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_7.setBounds(71, 486, 161, 35);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Address :");
		lblNewLabel_8.setForeground(Color.YELLOW);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_8.setBounds(74, 554, 128, 25);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Register");
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try
				{
					String first;
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
					first="INSERT INTO user(Username, Password, fname, lname, Retype, Address,Mobile) VALUES (?,?,?,?,?,?,?);";
					PreparedStatement pst=con.prepareStatement(first);
					pst.setString(1, textField_2.getText());
					pst.setString(2,String.valueOf(passwordField.getPassword()));
					pst.setString(3, textField.getText());
					pst.setString(4, textField_1.getText());
					pst.setString(5, String.valueOf(passwordField_1.getPassword()));
					pst.setString(6, textArea.getText());
					pst.setString(7, textField_3.getText());
					int rs1=pst.executeUpdate();
					if(rs1 > 0)
					{
						JOptionPane.showMessageDialog(null, "Registered SuccessFully!!!");
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						passwordField.setText("");
						passwordField_1.setText("");
						textArea.setText("");
						dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Not Registered SuccessFully!!!");
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						passwordField.setText("");
						passwordField_1.setText("");
						textArea.setText("");
					}
				}
				catch(Exception e2)
				{
					e2.printStackTrace();
				}
			}
		});
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setForeground(Color.YELLOW);
		lblNewLabel_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_9.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_9.setBounds(242, 669, 107, 35);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Reset");
		lblNewLabel_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				passwordField.setText("");
				passwordField_1.setText("");
				textArea.setText("");
			}
		});
		lblNewLabel_10.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setForeground(Color.YELLOW);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_10.setBounds(426, 669, 95, 35);
		contentPane.add(lblNewLabel_10);
		
		textField_3 = new JTextField();
		textField_3.setOpaque(false);
		textField_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				String l,l1;
				l=String.valueOf(passwordField.getPassword());
				l1=String.valueOf(passwordField_1.getPassword());
				if(l.equals(l1))
				{
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "PassWord MisMatch!!!");
				}
			}
		});
		textField_3.setForeground(new Color(255, 0, 0));
		textField_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		textField_3.setBounds(242, 474, 279, 52);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\Asus\\Downloads\\hello-i-m-nik-sJ3yXvHTOj8-unsplash.jpg"));
		lblNewLabel_11.setBounds(0, 0, 722, 801);
		contentPane.add(lblNewLabel_11);
		setUndecorated(true);
	}
}
