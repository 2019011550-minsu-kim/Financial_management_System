import java.util.Scanner;

public class FinancialManager {
	Financial financial;
	Scanner input;
	
	FinancialManager(Scanner input){
		this.input = input;
	}

	public void addMoney() {
		financial = new Financial();
		System.out.print(" Payer Number : "); //�� �޴»��
		financial.payerNumber = input.nextInt();
		System.out.print(" Payer Name : "); //�� �޴»��
		financial.payerName = input.next();
		System.out.print(" Money Input : "); //���� �ݾ�
		financial.inputMoney = input.nextInt();
		System.out.print(" Input Day : "); //�� ������ ��
		financial.inputDay = input.nextLine();
		input.nextLine();
		
	}

	public void deleteMoney() {
		System.out.print(" Payer Number : "); //�� �޴»��
		int payerNumber = input.nextInt();
		if(financial == null) {
			System.out.println("the payer has not been registered");
			return;
		}
		if(financial.payerNumber == payerNumber) {
			financial = null;
			System.out.println("the payer is deleted");
		}
		
	}

	public void editMoney() {
		System.out.print(" Payer Number : "); //��� ��ȣ
		int payerNumber = input.nextInt();
		if(financial.payerNumber == payerNumber) {
			System.out.println("the payer to be edited is " + payerNumber);
		}
	}

	public void viewMoney() {
		System.out.print(" Payer Number : "); //�� �޴»��
		int payerNumber = input.nextInt();
		if(financial.payerNumber == payerNumber) {
			financial.printInfo();
		}
	}
}
