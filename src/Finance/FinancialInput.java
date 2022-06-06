package Finance;

import java.util.Scanner;

import exception.DayFormatException;

public interface FinancialInput {
	public void getUserInput(Scanner input);
	
	public int getEmployeeNumber();
	
	public void setEmployeeNumber(int employeeNumber);
	
	public void setEmployeeName(String employeeName);
	
	public void setInputMoney(int inputMoney);
	
	public void setInputDay(String inputDay) throws DayFormatException;
	
	public void printInfo();
	
	public void setNumber( Scanner input);
	
	public void setName(Scanner input);
	
	public void setMoney(Scanner input);
	
	public void setDay(Scanner input);
	
	public String getEmployeeName();
	
	public int getInputMoney();
	
	public String getInputDay();
	
	
	

}
