
import java.util.Scanner;

public class MenuManager {
	//원하는 메뉴를 출력하는 클래스

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

			//각 메뉴에 대한 출력
			if (num == 1)
			{
				System.out.print(" Money Input : ");
				int money = input.nextInt();
				System.out.print(" Input Day : ");
				String day = input.next(); //nextLine 사용시 오류 발생

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
				//5번을 입력 시 메뉴를 다시 출력해줌
			}





		} //while 문 종료 괄호


	}
	
	//각 메뉴에 대한 메소드
	//입력값을 저장하는 메소드
	
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