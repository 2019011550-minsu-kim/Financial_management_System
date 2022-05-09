package Finance;

import java.util.Scanner;

public class StaffFinancial extends Financial implements FinancialInput{

	public StaffFinancial(FinanceKind kind) {
		super(kind);

	}


	public void getUserInput(Scanner input) {  //파라미터로 스캐너형이 들어오면 next형태가 있는 경우에 계속 입력이 가능한건가
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
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Staff:
			skind = "Staff.";
			break;
		case Manager:
			skind = "Manager.";
			break;
		case Ceo:
			skind = "Ceo.";
			break;
		default:
		}
		System.out.println("kind : "+ skind + "Employee Number : " + employeeNumber + " Employee Name : " + employeeName + " Input Money : " + inputMoney + " Input Day :" + inputDay);
	}

}
