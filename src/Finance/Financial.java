package Finance;

import java.util.Scanner;

public class Financial {
	protected FinanceKind kind = FinanceKind.Employee;
	protected int employeeNumber;
	protected String employeeName;
	protected int inputMoney;
	protected String inputDay;
	
	
	public Financial() {

	} //생성자가 없을 경우를 대비해서 만들어 두기

	public Financial(int employeeNumber,String employeeName, int inputMoney, String inputDay)
	{
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.inputMoney = inputMoney;
		this.inputDay = inputDay;
	}
	
	public FinanceKind getKind() {
		return kind;
	}

	public void setKind(FinanceKind kind) {
		this.kind = kind;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getInputMoney() {
		return inputMoney;
	}

	public void setInputMoney(int inputMoney) {
		this.inputMoney = inputMoney;
	}

	public String getInputDay() {
		return inputDay;
	}

	public void setInputDay(String inputDay) {
		this.inputDay = inputDay;
	}

	public void printInfo() {
		System.out.println("Employee Number : " + employeeNumber + " Employee Name : " + employeeName + " Input Money : " + inputMoney + " Input Day :" + inputDay);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print(" Employee Number : "); //사원번호
		int employeeNumber = input.nextInt();
		this.setEmployeeNumber(employeeNumber);
		
		System.out.print(" Employee Name : "); //돈 받는사람
		String employeeName = input.next();
		this.setEmployeeName(employeeName);
		
		System.out.print(" Money Input : "); //받은 금액
		int inputMoney = input.nextInt();
		this.setInputMoney(inputMoney);
		
		System.out.print(" Input Day : "); //돈 들어오는 날
		input.nextLine();
		String inputDay = input.nextLine();
		this.setInputDay(inputDay);
	}


}
