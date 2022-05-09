package Finance;

import java.util.Scanner;

public abstract class Financial {  //Financial 객체를 생성하지 않는다
	protected FinanceKind kind = FinanceKind.Staff; //enum에서는 인스턴스를 만들지 않아도 되는건가? 프로그램 구조화, 다른사람이 보기 쉽게
	protected int employeeNumber;
	protected String employeeName;
	protected int inputMoney;
	protected String inputDay;

	public Financial(FinanceKind kind) {
		this.kind = kind;

	}

	public Financial() {

	} //생성자가 없을 경우를 대비해서 만들어 두기

	public Financial(int employeeNumber,String employeeName, int inputMoney, String inputDay)
	{
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.inputMoney = inputMoney;
		this.inputDay = inputDay;
	}

	public Financial(FinanceKind kind, int employeeNumber,String employeeName, int inputMoney, String inputDay)
	{
		this.kind = kind;
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

	
	public abstract void printInfo();

	


}
