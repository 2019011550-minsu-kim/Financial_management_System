
import java.util.Scanner;

public class MenuManager {
	//���ϴ� �޴��� ����ϴ� Ŭ����

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;

		while(num != 6) {
			System.out.println("1. Add Money"); 
			System.out.println("2. Delete Money");
			System.out.println("3. Edit Money");
			System.out.println("4. View Money");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number beetween 1~6 : ");
			num = input.nextInt();

			//�� �޴��� ���� ���
			if (num == 1)
			{
				System.out.print(" Money Input : ");
				int money = input.nextInt();
				System.out.print(" Input Day : ");
				String day = input.next(); //nextLine ���� ���� �߻�

			}
			else if (num == 2)
			{
				deleteMoney();
			}
			else if (num == 3)
			{
				editMoney();
			}
			else if (num == 4)
			{
				viewMoney();
			}
			else {
				continue;
				//5���� �Է� �� �޴��� �ٽ� �������
			}





		} //while �� ���� ��ȣ


	}
	
	//�� �޴��� ���� �޼ҵ�
	//�Է°��� �����ϴ� �޼ҵ�
	
	public static void addMoney() {
		Scanner input = new Scanner(System.in);
		System.out.print(" Money Input : ");
		int inputMoney = input.nextInt();
		System.out.print(" Input Day : ");
		String day = input.next();
	}
	
	public static void deleteMoney() {
		Scanner input = new Scanner(System.in);
		System.out.print(" Money Input : ");
		int inputMoney = input.nextInt();
		System.out.print(" Using Money : ");
		int usedMoney = input.nextInt();
		System.out.print(" Left Money : ");
		String day = input.next();
	}
	
	public static void editMoney() {
		Scanner input = new Scanner(System.in);
		System.out.print(" Money Input : ");
		int inputMoney = input.nextInt();
	}
	
	public static void viewMoney() {
		Scanner input = new Scanner(System.in);
		System.out.print(" Money Input : ");
		int inputMoney = input.nextInt();
	}

}