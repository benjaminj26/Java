package New1;

import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.*;

public class StudentRecord implements ActionListener {
	
	static int stdin, age;
	static String stdname, branch;
	static char batch;
	JTextField text1, text2, text3, text4, text5;
	JLabel label1, label2, label3, label4, label5;
	JButton button1, button2;
	
	public StudentRecord() {
		JFrame frame = new JFrame("Student Record");
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6,2));
		text1 = new JTextField();
		text2 = new JTextField();
		text3 = new JTextField();
		text4 = new JTextField();
		text5 = new JTextField();
		
		label1 = new JLabel("stdin");
		label2 = new JLabel("StdName");
		label3 = new JLabel("StdAge");
		label4 = new JLabel("Branch");
		label5 = new JLabel("Batch");
	
		button1 = new JButton("Add");
		button2 = new JButton("Clear");
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		panel.add(label1);
		panel.add(text1);
		panel.add(label2);
		panel.add(text2);
		panel.add(label3);
		panel.add(text3);
		panel.add(label4);
		panel.add(text4);
		panel.add(label5);
		panel.add(text5);
		panel.add(button1);
		panel.add(button2);
		
		frame.setSize(640,480);
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new StudentRecord();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button1) {
			stdin = Integer.parseInt(text1.getText());
			stdname = text2.getText();
			age = Integer.parseInt(text3.getText());
			branch = text4.getText();
			batch = text5.getText().charAt(0);
			try {
				Connection conn;
				String userName = "bin";
				String password = "paayal";
				String url = "jdbc:mysql://localhost/bin";
				conn = DriverManager.getConnection(url, userName, password);
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Connection Established");
				Statement stmt= conn.createStatement();
				String sql="insert into "+
							"student" + " values"+
						"("+stdin+","+"\""+stdname+"\","+age+",\""+branch+"\""+",\""+batch+"\""+")";
				stmt.executeUpdate(sql);
			}
			catch(SQLException | ClassNotFoundException e1) {
				System.out.println(e1.getMessage());
			}	
		}else if(e.getSource() == button2) {
			text1.setText(null);
			text2.setText(null);
			text3.setText(null);
			text4.setText(null);
			text5.setText(null);
		}
	}
}
