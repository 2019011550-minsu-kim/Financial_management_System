package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Finance.FinanceKind;
import Finance.FinancialInput;
import Finance.StaffFinancial;
import Manager.FinancialManager;
import exception.DayFormatException;

public class FinancialAdderListener implements ActionListener {

	JTextField fieldNumber;
	JTextField fieldName;
	JTextField fieldMoney;
	JTextField fieldDay;

	FinancialManager financialManager;

	public FinancialAdderListener(JTextField fieldNumber, 
			JTextField fieldName, 
			JTextField fieldMoney, 
			JTextField fieldDay, 
			FinancialManager financialManager) {

		this.fieldNumber = fieldNumber;
		this.fieldName = fieldName;
		this.fieldMoney = fieldMoney;
		this.fieldDay = fieldDay;
		this.financialManager = financialManager;
	}



	@Override
	public void actionPerformed(ActionEvent e) {

		FinancialInput financial = new StaffFinancial(FinanceKind.Staff);

		try {
			financial.setEmployeeNumber(Integer.parseInt(fieldNumber.getText()));  //셋넘버나 셋임플로이 넘버인데 쉣...
			financial.setEmployeeName(fieldName.getText());  //gettext 아닌가
			financial.setInputMoney(Integer.parseInt(fieldMoney.getText()));
			financial.setInputDay(fieldDay.getText());
			financialManager.addMoney(financial);
			putObject(financialManager, "financialManager.ser");
			financial.printInfo();
		} catch (DayFormatException e1) {
			e1.printStackTrace();
		}



	}

	public static void putObject(FinancialManager financialManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(financialManager);

			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
