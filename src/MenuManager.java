
import java.util.Scanner;

public class MenuManager {
	//���ϴ� �޴��� ����ϴ� Ŭ����

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
		
		while(num != 6) {
			
			System.out.println("1. Add Money"); 
			//println�� ���� Add Money ��� �� �� �ٲ�.

			System.out.println("2. Delete Money");
			//println�� ���� Delete Money ��� �� �� �ٲ�.

			System.out.println("3. Edit Money");
			//println�� ���� Edit Money ��� �� �� �ٲ�.

			System.out.println("4. View Money");
			//println�� ���� View Money ��� �� �� �ٲ�.
			
			System.out.println("5. Show a Menu");
			//println�� ���� Show a Menu ��� �� �� �ٲ�.

			System.out.println("6. Exit");
			//println�� ���� Exit ��� �� �� �ٲ�.
			
			System.out.println("Select one number beetween 1~6 : ");
			
			num = input.nextInt();
			
			if (num == 1)
			{
				System.out.print(" Money Input : ");
				int money = input.nextInt();
				System.out.print(" Input Day : ");
				String day = input.next(); //nextLine ���� ���� �߻�
				
			}
			else if (num == 2)
			{
				System.out.print(" Using Money : ");
				int money = input.nextInt();
				System.out.print(" Left Money : ");
				String day = input.next();
			}
			else if (num == 3)
			{
				System.out.print(" Money Input : ");
				int money = input.nextInt();
			}
			else if (num == 4)
			{
				System.out.print(" Money Input : ");
				int money = input.nextInt();
			}
			else {
				continue;
				//5���� �Է� �� �޴��� �ٽ� �������
			}
			
			
			
			
			
		} //while �� ���� ��ȣ
		

	}

}