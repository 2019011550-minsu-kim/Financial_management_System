package Finance;

import java.util.Scanner;

public interface FinancialInput {
	public void getUserInput(Scanner input);
	
	public int getEmployeeNumber();
	
	public void setEmployeeNumber(int employeeNumber);
	
	public void setEmployeeName(String employeeName);
	
	public void setInputMoney(int inputMoney);
	
	public void setInputDay(String inputDay);
	
	public void printInfo();
	

}
