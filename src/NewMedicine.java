import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;

public class NewMedicine extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewMedicine frame = new NewMedicine();
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
	public NewMedicine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1243, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel lblNewLabel_7 = new JLabel("X");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(1198, 0, 45, 33);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_1 = new JLabel("UJALA MEDICAL & GENERAL STORE\r\n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Unispace", Font.BOLD, 65));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(0, 0, 1243, 131);
		contentPane.add(lblNewLabel_1);
		

		JLabel lblNewLabel_2 = new JLabel("Enter Your Personal Details :\r\n");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2.setBounds(0, 157, 460, 60);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Your Medicine Details :");
		lblNewLabel_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_3.setBounds(0, 350, 460, 60);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Your Name :");
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_4.setBounds(0, 237, 158, 33);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Mobile No :");
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_5.setBounds(377, 237, 158, 33);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Email ID :");
		lblNewLabel_6.setForeground(Color.BLUE);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_6.setBounds(788, 237, 171, 40);
		contentPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Dialog", Font.BOLD, 18));
		textField.setBounds(168, 234, 197, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Dialog", Font.BOLD, 18));
		textField_1.setBounds(534, 234, 230, 43);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.BOLD, 18));
		textField_2.setBounds(934, 237, 299, 40);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		

		

		JLabel lblNewLabel_8 = new JLabel("Medicine Name :");
		lblNewLabel_8.setForeground(Color.BLUE);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_8.setBounds(0, 420, 177, 32);
		contentPane.add(lblNewLabel_8);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Dialog", Font.BOLD, 18));
		textField_3.setBounds(203, 420, 177, 35);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Brand :");
		lblNewLabel_9.setForeground(Color.BLUE);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_9.setBounds(416, 420, 129, 35);
		contentPane.add(lblNewLabel_9);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Dialog", Font.BOLD, 18));
		textField_4.setBounds(528, 421, 184, 32);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Packaging :\r\n");
		lblNewLabel_10.setForeground(Color.BLUE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_10.setBounds(758, 420, 140, 32);
		contentPane.add(lblNewLabel_10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Dialog", Font.BOLD, 18));
		textField_5.setBounds(908, 420, 197, 35);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Quantity :");
		lblNewLabel_11.setForeground(Color.BLUE);
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_11.setBounds(0, 524, 115, 35);
		contentPane.add(lblNewLabel_11);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Dialog", Font.BOLD, 18));
		textField_6.setBounds(149, 524, 216, 35);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		

		JLabel lblNewLabel_12 = new JLabel("Register");
		lblNewLabel_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try
				{
					String first;
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
					first="INSERT INTO medicine(name,mobile,email,dawai,brand,pack,quant) VALUES (?,?,?,?,?,?,?);";
					PreparedStatement pst=con.prepareStatement(first);
					pst.setString(1, textField.getText());
					pst.setString(2,textField_1.getText());
					pst.setString(3, textField_2.getText());
					pst.setString(4, textField_3.getText());
					pst.setString(5, textField_4.getText());
					pst.setString(6, textField_5.getText());
					pst.setString(7, textField_6.getText());
					int rs1=pst.executeUpdate();
					if(rs1 > 0)
					{
						JOptionPane.showMessageDialog(null, "Thanks For Using.We Will Contact You Shortly When Medicine Will Come!!!");
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
						dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Not Added SuccessFully!!!");
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
					}
				}
				catch(Exception e2)
				{
					e2.printStackTrace();
				}
			}
		});
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setForeground(Color.YELLOW);
		lblNewLabel_12.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_12.setBounds(442, 524, 103, 43);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Reset");
		lblNewLabel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
			}
		});
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setForeground(Color.YELLOW);
		lblNewLabel_13.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_13.setBounds(612, 520, 100, 40);
		contentPane.add(lblNewLabel_13);
		
		
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Asus\\Downloads\\Medical\\istockphoto-943974286-1024x1024.jpg"));
		lblNewLabel.setBounds(0, 0, 1243, 650);
		contentPane.add(lblNewLabel);
		
		
		setUndecorated(true);
	}
}
