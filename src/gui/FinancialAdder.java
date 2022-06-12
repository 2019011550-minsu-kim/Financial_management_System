package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Manager.FinancialManager;
import listeners.FinancialAdderCancelListener;
import listeners.FinancialAdderListener;

public class FinancialAdder extends JPanel{
	
	WindowFrame frame;
	FinancialManager financialManager;
	
	public FinancialAdder(WindowFrame frame, FinancialManager financialManager) {
		this.frame = frame;
		this.financialManager = financialManager;
		
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
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new FinancialAdderListener(fieldNumber, fieldName, fieldMoney, fieldDay, financialManager));
		
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new FinancialAdderCancelListener(frame));
		
		panel.add(labelDay);
		panel.add(fieldDay);
		
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		
		SpringUtilities.makeCompactGrid(panel,5, 2, 6,6,6,6);
		
		this.add(panel);
		this.setVisible(true);
		
	}

}
