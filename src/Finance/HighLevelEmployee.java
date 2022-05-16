package Finance;

import java.util.Scanner;

public abstract class HighLevelEmployee extends Financial {
	
	public HighLevelEmployee(FinanceKind kind) {
		super(kind);

	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : "+ skind + " Employee Number : " + employeeNumber + " Employee Name : " + employeeName + " Input Money : " + inputMoney + " Input Day :" + inputDay);
	}
	
	public void setFinancialMoneywithYNCeo(Scanner input) { //�޴����� �ٸ� �޼ҵ� �����̶� ���� ���� ����������.
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("If you are ceo, You will get more money than manager (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print(" Input more than 100,000,000$ ");
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				System.out.print(" Under 100,000,000$ ");
				break;
			}
			else {
			}
		} //��� ���� ã��
	}
	
	public void setFinancialMoneywithYNManager(Scanner input) {
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
		} //��� ���� ã��
	}
	
	


}
