
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
			
			num = input.nextInt();
			
			if (num == 1)
			{
				System.out.print(" Money input : ");
				int money = input.nextInt();
				System.out.print(" Input day : ");
				String day = input.next(); //nextLine ���� ���� �߻�
				System.out.println(" Money input");
				System.out.println(" Money input");
				System.out.println(" Money input");
			}
			else if (num == 2)
			{
				System.out.print(" Money input : ");
				int money = input.nextInt();
				System.out.print(" Input day : ");
				String day = input.next();
			}
			else if (num == 3)
			{
				System.out.print(" Money input : ");
				int money = input.nextInt();
				System.out.print(" Input day : ");
				String day = input.next();
			}
			else if (num == 4)
			{
				System.out.print(" Money input : ");
				int money = input.nextInt();
				System.out.print(" Input day : ");
				String day = input.next();
			}
			else {
				continue;
			}
			
			
			
			
			
			
			
			
		} //while �� ���� ��ȣ
		

	}

}