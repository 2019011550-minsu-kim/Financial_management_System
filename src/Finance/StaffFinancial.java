package Finance;

import java.util.Scanner;

public class StaffFinancial extends Financial{

	public StaffFinancial(FinanceKind kind) {
		super(kind);

	}


	public void getUserInput(Scanner input) {  //파라미터로 스캐너형이 들어오면 next형태가 있는 경우에 계속 입력이 가능한건가
		setNumber(input);
		setName(input);
		setMoney(input);
		setDay(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : "+ skind + " Employee Number : " + employeeNumber + " Employee Name : " + employeeName + " Input Money : " + inputMoney + " Input Day :" + inputDay);
	}

}
