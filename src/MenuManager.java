
import java.util.Scanner;

public class MenuManager {
	//원하는 메뉴를 출력하는 클래스


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FinancialManager financialManager = new FinancialManager(input);
		//FinancialManager 클래스를 선언



		int num = -1;

		while(num != 5) {
			System.out.println("1. Add Money"); 
			System.out.println("2. Delete Money");
			System.out.println("3. Edit Money");
			System.out.println("4. View Employees");
			System.out.println("5. Exit");
			System.out.print("Select one number beetween 1~5 : ");
			num = input.nextInt();

			//각 메뉴에 대한 출력
			if (num == 1)
			{
				financialManager.addMoney();
			}
			else if (num == 2)
			{
				financialManager.deleteMoney();
			}
			else if (num == 3)
			{
				financialManager.editMoney();
			}
			else if (num == 4)
			{
				financialManager.viewEmployees();
			}
			else {
				continue;
				//5번을 입력 시 메뉴를 다시 출력해줌
			}
		} //while 문 종료 괄호
	}//main method 괄호


}