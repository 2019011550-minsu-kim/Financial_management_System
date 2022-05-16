
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	//���ϴ� �޴��� FinancialManager�� �޼ҵ带 ���� ����ϴ� Ŭ����


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FinancialManager financialManager = new FinancialManager(input);
		//FinancialManager Ŭ������ ����
		selectMenu(input, financialManager);


	}//main method ��ȣ

	public static void selectMenu(Scanner input, FinancialManager financialManager) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					financialManager.addMoney();
					break;
				case 2:
					financialManager.deleteMoney();
					break;
				case 3:
					financialManager.editMoney();
					break;
				case 4:
					financialManager.viewEmployees();
					break;
				default :
					continue;
				}
			}
			catch(InputMismatchException e){
				System.out.println("please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("1. Add Money"); 
		System.out.println("2. Delete Money");
		System.out.println("3. Edit Money");
		System.out.println("4. View Employees");
		System.out.println("5. Exit");
		System.out.print("Select one number beetween 1~5 : ");

	}


}

