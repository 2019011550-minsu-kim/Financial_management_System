package Finance;

import java.util.Scanner;

public class ManagerFinancial extends Financial {
	
	public ManagerFinancial(FinanceKind kind) {
		super(kind);

	}

	public void getUserInput(Scanner input) {  //오버라이딩인가
		System.out.print(" Employee Number : "); //사원번호
		int employeeNumber = input.nextInt();
		this.setEmployeeNumber(employeeNumber);

		System.out.print(" Employee Name  : "); //돈 받는사람
		String employeeName = input.next();
		this.setEmployeeName(employeeName);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("If you are manager, You will get more money than staff (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print(" Input more than 10,000,000$ ");
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				System.out.print(" Under 10,000,000$ ");
				break;
			}
			else {
			}
		} //출력 원인 찾기



		System.out.print(" Money Input : "); //받은 금액
		int inputMoney = input.nextInt();
		this.setInputMoney(inputMoney);

		System.out.print(" Input Day : "); //돈 들어오는 날
		input.nextLine();
		String inputDay = input.nextLine();
		this.setInputDay(inputDay);
	}

}
