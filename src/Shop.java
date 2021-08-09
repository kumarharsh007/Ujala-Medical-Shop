import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Shop extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JComboBox<String> comboBox,comboBox_1,comboBox_2,comboBox_3;
	public JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5;
	public String name502,brand1,expiry,packaging,name505,brand2,expiry1,packaging1;
	public double price,price1;
	public int qunt,qunt1;
	/**
	 * Launch the application.
	 */
	public void getcals()
	{
		String sql1="select types from types";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
			PreparedStatement pst=con.prepareStatement(sql1);
			ResultSet rs=pst.executeQuery(sql1);
			comboBox_1.addItem("--Select Type Of Medicine--");
			while(rs.next())
			{
				String name1=rs.getString("types");
				comboBox_1.addItem(name1);
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void getcals1()
	{
		String sql1="select name from newdata";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
			PreparedStatement pst=con.prepareStatement(sql1);
			ResultSet rs=pst.executeQuery(sql1);
			comboBox_3.addItem("--Type Your Medicine Name--");
			while(rs.next())
			{
				String name1=rs.getString("name");
				comboBox_3.addItem(name1);
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shop frame = new Shop();
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
	public Shop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1370, 737);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		JLabel lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setBounds(1315, 0, 55, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("  UJALA MEDICAL & GENERAL STORE");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblNewLabel.setFont(new Font("STXinwei", Font.BOLD, 73));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(0, 0, 1370, 183);
		contentPane.add(lblNewLabel);
		
		comboBox_1 = new JComboBox<String>();
		getcals();
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
					String sql2="select data from data where types='"+comboBox_1.getSelectedItem()+"'";
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
						PreparedStatement pst=con.prepareStatement(sql2);
						ResultSet rs=pst.executeQuery(sql2);
						comboBox.removeAllItems();
						comboBox.addItem("--Select Manufacturer Name Of Medicine--");
						while(rs.next())
						{
							String name2=rs.getString("data");
							comboBox.addItem(name2);
						}
						con.close();
					}
					catch(Exception e1)
					{
						e1.printStackTrace();
					}
			}
		});
		comboBox_1.setFont(new Font("Dialog", Font.BOLD, 14));
		comboBox_1.setBounds(20, 328, 216, 34);
		contentPane.add(comboBox_1);
		
		comboBox = new JComboBox<String>();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
					if(comboBox.getItemCount()!=0)
					{
						String sql3="select name from newdata where types='"+comboBox_1.getSelectedItem()+"' and brand='"+comboBox.getSelectedItem()+"'";
						try
						{
							Class.forName("com.mysql.jdbc.Driver");
							Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
							PreparedStatement pst=con.prepareStatement(sql3);
							ResultSet rs=pst.executeQuery(sql3);
							comboBox_2.removeAllItems();
							comboBox_2.addItem("--Select Name Of Medicine--");
							while(rs.next())
							{
								String name3=rs.getString("name");
								comboBox_2.addItem(name3);
							}
							con.close();
						}
						catch(Exception e2)
						{
							e2.printStackTrace();
						}
					}
					else
					{
						
					}
			}
		});
		comboBox.setFont(new Font("Dialog", Font.BOLD, 14));
		comboBox.setBounds(281, 328, 291, 34);
		contentPane.add(comboBox);
		
    	comboBox_2 = new JComboBox<String>();
    	comboBox_2.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			String sql3="select * from newdata where types='"+comboBox_1.getSelectedItem()+"' and brand='"+comboBox.getSelectedItem()+"' and name='"+comboBox_2.getSelectedItem()+"'";
				try
				{
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
					PreparedStatement pst=con.prepareStatement(sql3);
					ResultSet rs=pst.executeQuery(sql3);
					while(rs.next())
					{
						name502=rs.getString("name");
						brand1=rs.getString("brand");
						packaging=rs.getString("packaging");
						expiry=rs.getString("expiry");
						price=rs.getDouble("price");
						qunt=rs.getInt("available");
					}
				}
				catch(Exception e2)
				{
					JOptionPane.showMessageDialog(null, e2);
				}
    		}
    	});
		comboBox_2.setFont(new Font("Dialog", Font.BOLD, 14));
		comboBox_2.setBounds(606, 328, 243, 34);
		contentPane.add(comboBox_2);

		JTextField textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.BOLD, 14));
		textField.setBounds(87, 477, 216, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextField textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.BOLD, 14));
		textField_1.setBounds(399, 477, 291, 41);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JTextField textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.BOLD, 14));
		textField_2.setBounds(778, 477, 96, 41);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JTextField textField_3 = new JTextField();
		textField_3.setFont(new Font("Dialog", Font.BOLD, 14));
		textField_3.setBounds(979, 477, 96, 41);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JTextField textField_4 = new JTextField();
		textField_4.setFont(new Font("Dialog", Font.BOLD, 14));
		textField_4.setBounds(1214, 477, 96, 41);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JTextField textField_5 = new JTextField();
		textField_5.setFont(new Font("Dialog", Font.BOLD, 14));
		textField_5.setBounds(226, 587, 101, 41);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Selected/Searched \r\nItem Details :");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_3.setBounds(20, 427, 470, 40);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Select Your Item :\r\n");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setBounds(24, 278, 212, 40);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("Click Me\r\n");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(name502);
				textField_1.setText(brand1);
				textField_2.setText(Double.toString(price));
				textField_3.setText(expiry);
				textField_4.setText(packaging);
				textField_5.setText(Integer.toString(qunt));
			}
		});
		lblNewLabel_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_4.setBounds(922, 326, 106, 34);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Name :");
		lblNewLabel_6.setForeground(Color.BLUE);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_6.setBounds(10, 477, 87, 41);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Brand :");
		lblNewLabel_7.setForeground(Color.BLUE);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_7.setBounds(313, 481, 87, 37);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("MRP :");
		lblNewLabel_8.setForeground(Color.BLUE);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_8.setBounds(700, 477, 84, 41);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Expiry :");
		lblNewLabel_9.setForeground(Color.BLUE);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_9.setBounds(884, 477, 85, 41);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Packaging :");
		lblNewLabel_10.setForeground(Color.BLUE);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_10.setBounds(1085, 477, 133, 41);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Available Quantity :");
		lblNewLabel_11.setForeground(Color.BLUE);
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_11.setBounds(10, 580, 226, 51);
		contentPane.add(lblNewLabel_11);
		
		comboBox_3 = new JComboBox<String>();
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql3="select * from newdata where name='"+comboBox_3.getSelectedItem()+"'";
				try
				{
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
					PreparedStatement pst=con.prepareStatement(sql3);
					ResultSet rs=pst.executeQuery(sql3);
					while(rs.next())
					{
						name505=rs.getString("name");
						brand2=rs.getString("brand");
						packaging1=rs.getString("packaging");
						expiry1=rs.getString("expiry");
						price1=rs.getDouble("price");
						qunt1=rs.getInt("available");
					}
				}
				catch(Exception e2)
				{
					JOptionPane.showMessageDialog(null, e2);
				}
			}
		});
		getcals1();
		comboBox_3.setFont(new Font("Dialog", Font.BOLD, 14));
		AutoCompleteDecorator.decorate(comboBox_3);
		
		comboBox_3.setBounds(24, 216, 260, 41);
		contentPane.add(comboBox_3);
		JLabel lblNewLabel_12 = new JLabel("Search Your  Item :");
		lblNewLabel_12.setForeground(Color.BLUE);
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_12.setBounds(25, 172, 259, 34);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Select Item");
		lblNewLabel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(name505);
				textField_1.setText(brand2);
				textField_2.setText(Double.toString(price1));
				textField_3.setText(expiry1);
				textField_4.setText(packaging1);
				textField_5.setText(Integer.toString(qunt1));
			}
		});
		lblNewLabel_13.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_13.setForeground(Color.RED);
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_13.setBounds(357, 216, 133, 41);
		contentPane.add(lblNewLabel_13);
		
		

		JLabel lblNewLabel_14 = new JLabel("If Your Medicine Is Not In The List....\r\n");
		lblNewLabel_14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_14.setForeground(Color.red);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_14.setForeground(Color.black);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				NewMedicine obj=new NewMedicine();
				obj.setVisible(true);
			}
		});
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_14.setBounds(357, 675, 492, 34);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Asus\\Downloads\\Medical\\istockphoto-1130982608-1024x1024.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1370, 737);
		contentPane.add(lblNewLabel_2);
		
		setUndecorated(true);
	}
}
