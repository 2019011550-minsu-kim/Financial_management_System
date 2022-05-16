package Finance;

import java.util.Scanner;

public class StaffFinancial extends Financial{

	public StaffFinancial(FinanceKind kind) {
		super(kind);

	}


	public void getUserInput(Scanner input) {  //�Ķ���ͷ� ��ĳ������ ������ next���°� �ִ� ��쿡 ��� �Է��� �����Ѱǰ�
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
