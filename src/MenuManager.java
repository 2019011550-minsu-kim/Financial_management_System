
import java.util.Scanner;

public class MenuManager {
	//���ϴ� �޴��� ����ϴ� Ŭ����


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FinancialManager financialManager = new FinancialManager(input);
		//FinancialManager Ŭ������ ����



		int num = -1;

		while(num != 5) {
			System.out.println("1. Add Money"); 
			System.out.println("2. Delete Money");
			System.out.println("3. Edit Money");
			System.out.println("4. View Employees");
			System.out.println("5. Exit");
			System.out.print("Select one number beetween 1~5 : ");
			num = input.nextInt();

			//�� �޴��� ���� ���
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
				//5���� �Է� �� �޴��� �ٽ� �������
			}
		} //while �� ���� ��ȣ
	}//main method ��ȣ


}