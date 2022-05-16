package Finance;

import java.util.Scanner;

import exception.DayFormatException;

public abstract class Financial  implements FinancialInput{  //Financial 객체를 생성하지 않는다
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

	public void setInputDay(String inputDay) throws DayFormatException {
		if (!(inputDay.contains("월") && inputDay.contains("일"))) {
			throw new DayFormatException();
		}
		this.inputDay = inputDay;
	}


	public abstract void printInfo();

	public void setNumber(Scanner input) {
		System.out.print(" Employee Number : ");
		int number = input.nextInt();
		this.setEmployeeNumber(number);
	}

	public void setName(Scanner input) {
		System.out.print(" Employee Name : ");
		String name = input.next();
		this.setEmployeeName(name);
	}

	public void setMoney(Scanner input) {
		System.out.print(" Money Input : ");
		int money = input.nextInt();
		this.setInputMoney(money);
	}

	public void setDay(Scanner input) {
		String day = "";
		while(!(day.contains("월")&& day.contains("일"))) {
			System.out.print(" Input Day(a월b일 형태로 입력) : ");
			day = input.next();
			try {
				this.setInputDay(day);
			} catch (DayFormatException e) {
				System.out.println("Incorrect Day Format, put the Day that contains a월b일"); //왜 출력이 안되지...
			}
		}
	}

	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Staff:
			skind = "Staff";
			break;
		case Manager:
			skind = "Manager";
			break;
		case Ceo:
			skind = "Ceo";
			break;
		default:
		}
		return skind;
	}



}
