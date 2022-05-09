package Finance;

import java.util.Scanner;

public class StaffFinancial extends Financial implements FinancialInput{

	public StaffFinancial(FinanceKind kind) {
		super(kind);

	}


	public void getUserInput(Scanner input) {  //�Ķ���ͷ� ��ĳ������ ������ next���°� �ִ� ��쿡 ��� �Է��� �����Ѱǰ�
		System.out.print(" Employee Number : "); //�����ȣ
		int employeeNumber = input.nextInt();
		this.setEmployeeNumber(employeeNumber);

		System.out.print(" Employee Name : "); //�� �޴»��
		String employeeName = input.next();
		this.setEmployeeName(employeeName);

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
