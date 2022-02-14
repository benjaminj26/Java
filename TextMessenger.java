package Lab21;

import javax.swing.*;
import java.awt.event.*;

public class TextMessenger implements ActionListener {
	
	JTextArea textarea = new JTextArea();
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JButton button1 = new JButton("Send");
	JButton button2 = new JButton("Send");
	
	public TextMessenger() {
		JFrame frame = new JFrame("Athul Soman");
		frame.setSize(640,480);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		textarea.setBounds(10,10,600,350);
		text1.setBounds(10,400,150,30);
		text2.setBounds(350,400,150,30);
		button1.setBounds(200,400,90,30);
		button1.addActionListener(this);
		button2.setBounds(520,400,90,30);
		button2.addActionListener(this);
		panel.add(textarea);
		panel.add(text1);
		panel.add(text2);
		panel.add(button1);
		panel.add(button2);
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TextMessenger();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {	
			String str = text1.getText();
			textarea.append("\nUser1: "+str);
		}
		else {
			String str = text2.getText();
			textarea.append("\nUser2: "+str);
		}
	}

}
