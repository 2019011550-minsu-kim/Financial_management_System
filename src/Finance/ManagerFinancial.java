package Finance;

import java.util.Scanner;

public class ManagerFinancial extends Financial {

	public void getUserInput(Scanner input) {
		System.out.print(" Employee Number : "); //�����ȣ
		int employeeNumber = input.nextInt();
		this.setEmployeeNumber(employeeNumber);

		System.out.print(" Employee Name ee: "); //�� �޴»��
		String employeeName = input.next();
		this.setEmployeeName(employeeName);

		char answer = 'x';
		while (answer != 'y' && answer == 'Y' && answer != 'n' && answer == 'N') {
			System.out.print("If you are manager, You will get more money than employee (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print(" Input more than 10000000$ ");
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				System.out.print(" Under 10000000$ ");
				break;
			}
			else {
			}
		}



		System.out.print(" Money Input : "); //���� �ݾ�
		int inputMoney = input.nextInt();
		this.setInputMoney(inputMoney);

		System.out.print(" Input Day : "); //�� ������ ��
		input.nextLine();
		String inputDay = input.nextLine();
		this.setInputDay(inputDay);
	}

}
