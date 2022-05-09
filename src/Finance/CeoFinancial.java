package Finance;

import java.util.Scanner;

public class CeoFinancial extends Financial implements FinancialInput{

	public CeoFinancial(FinanceKind kind) {
		super(kind);

	}

	public void getUserInput(Scanner input) {
		System.out.print(" Employee Number : "); //�����ȣ
		int employeeNumber = input.nextInt();
		this.setEmployeeNumber(employeeNumber);

		System.out.print(" Employee Name : "); //�� �޴»��
		String employeeName = input.next();
		this.setEmployeeName(employeeName);

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



		System.out.print(" Money Input : "); //���� �ݾ�
		int inputMoney = input.nextInt();
		this.setInputMoney(inputMoney);

		System.out.print(" Input Day : "); //�� ������ ��
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



