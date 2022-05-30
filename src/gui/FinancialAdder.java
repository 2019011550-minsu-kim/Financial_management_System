package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class FinancialAdder extends JFrame{
	
	public FinancialAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelNumber = new JLabel("ID", JLabel.TRAILING);
		JTextField fieldNumber = new JTextField(10);
		labelNumber.setLabelFor(fieldNumber);
		panel.add(labelNumber);
		panel.add(fieldNumber);
		
		JLabel labelName = new JLabel("NAME", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelMoney = new JLabel("MONEY", JLabel.TRAILING);
		JTextField fieldMoney = new JTextField(10);
		labelMoney.setLabelFor(fieldMoney);
		panel.add(labelMoney);
		panel.add(fieldMoney);
		
		JLabel labelDay = new JLabel("DAY", JLabel.TRAILING);
		JTextField fieldDay = new JTextField(10);
		labelDay.setLabelFor(fieldDay);
		panel.add(labelDay);
		panel.add(fieldDay);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		
		SpringUtilities.makeCompactGrid(panel,5, 2, 6,6,6,6);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		this.setVisible(true);
		
	}

}
