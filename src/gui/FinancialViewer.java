package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Finance.FinancialInput;
import Manager.FinancialManager;

public class FinancialViewer extends JPanel{
	
	FinancialManager financialManager;
	WindowFrame frame;


	public FinancialViewer(WindowFrame frame, FinancialManager financialManager) {
		
		this.frame = frame;
		
		this.financialManager = financialManager;
		
		System.out.println("***" + financialManager.size());
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NUMBER");
		model.addColumn("NAME");
		model.addColumn("MONEY");
		model.addColumn("DAY");
		
		for(int i = 0; i< financialManager.size(); i++) {
			Vector row = new Vector();
			FinancialInput fi = financialManager.get(i);
			row.add(fi.getEmployeeNumber());
			row.add(fi.getEmployeeName());
			row.add(fi.getInputMoney());
			row.add(fi.getInputDay());
			model.addRow(row);
			
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);



	}
}
