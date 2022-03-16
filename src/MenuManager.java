
import java.util.Scanner;

public class MenuManager {
	//원하는 메뉴를 출력하는 클래스

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
		
		while(num != 6) {
			
			System.out.println("1. Add Money"); 
			//println을 통해 Add Money 출력 후 줄 바꿈.

			System.out.println("2. Delete Money");
			//println을 통해 Delete Money 출력 후 줄 바꿈.

			System.out.println("3. Edit Money");
			//println을 통해 Edit Money 출력 후 줄 바꿈.

			System.out.println("4. View Money");
			//println을 통해 View Money 출력 후 줄 바꿈.
			
			System.out.println("5. Show a Menu");
			//println을 통해 Show a Menu 출력 후 줄 바꿈.

			System.out.println("6. Exit");
			//println을 통해 Exit 출력 후 줄 바꿈.
			
			num = input.nextInt();
			
			if (num == 1)
			{
				System.out.print(" Money input : ");
				int money = input.nextInt();
				System.out.print(" Input day : ");
				String day = input.next(); //nextLine 사용시 오류 발생
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
			
			
			
			
			
			
			
			
		} //while 문 종료 괄호
		

	}

}