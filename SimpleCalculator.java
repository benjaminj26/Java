package Lab21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator implements ActionListener{
	JLabel label1 = new JLabel("Number 1");
	JTextField text1 = new JTextField();
	JLabel label2 = new JLabel("Number 2");
	JTextField text2 = new JTextField();
	JButton add = new JButton("Add");
	JButton sub = new JButton("Subtract");
	JLabel label3 = new JLabel("Result");
	JTextField text3 = new JTextField();
	
	public SimpleCalculator() {
		JFrame frame = new JFrame("Simple Calculator");
		frame.setSize(500,500);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,2));
		add.addActionListener(this);
		sub.addActionListener(this);
		panel.add(label1);
		panel.add(label2);
		panel.add(text2);
		panel.add(add);
		panel.add(sub);
		panel.add(label3);
		panel.add(text3);
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str1 = text1.getText();
		int num1 = Integer.parseInt(str1);
		String str2 = text2.getText();
		int num2 = Integer.parseInt(str2);
		
		if(e.getSource() == add) {
			int result = num1+num2;
			text3.setText(""+result);
		}
		else {
			int result = num1-num2;
			text3.setText(""+result);
		}
	}
	
	public static void main(String[] args) {
		new SimpleCalculator();
	}
}
