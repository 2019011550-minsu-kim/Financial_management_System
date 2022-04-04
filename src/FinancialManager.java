import java.util.ArrayList;
import java.util.Scanner;

public class FinancialManager {
	ArrayList<Financial> finances = new ArrayList <Financial>();
	Scanner input;


	FinancialManager(Scanner input){
		this.input = input;
	}

	public void addMoney() {
		Financial financial = new Financial();
		System.out.print(" Employee Number : "); //사원번호
		financial.employeeNumber = input.nextInt();
		System.out.print(" Employee Name : "); //돈 받는사람
		financial.employeeName = input.next();
		System.out.print(" Money Input : "); //받은 금액
		financial.inputMoney = input.nextInt();
		System.out.print(" Input Day : "); //돈 들어오는 날
		input.nextLine();
		financial.inputDay = input.nextLine();

		finances.add(financial);
	}

	public void deleteMoney() {
		System.out.print(" Employee Number : "); //사원번호
		int employeeNumber = input.nextInt();
		int index = -1;
		for (int i =0; i<finances.size();i++){
			if(finances.get(i).employeeNumber == employeeNumber) {
				index = i;
				break;
			}

		}
		if (index >=0) {
			finances.remove(index);
			System.out.println("the employee " + employeeNumber + " is deleted");
		}
		else {
			System.out.println("the employee has not been registered");
			return;
		}

	}

	public void editMoney() {
		System.out.print(" Employee Number : "); //사원 번호
		int employeeNumber = input.nextInt();
		for (int i =0; i<finances.size();i++) {
			Financial financial = finances.get(i);
			if(financial.employeeNumber == employeeNumber) {
				int num = -1;
				while(num!=5) {
					System.out.println("** Financial Info Edit Menu **");
					System.out.println(" 1. Edit Number");
					System.out.println(" 2. Edit Name");
					System.out.println(" 2. Edit Money Input");
					System.out.println(" 2. Edit Input Day");
					System.out.println(" 5. Exit");
					System.out.println("Select one number between 1 - 6: ");
					num = input.nextInt();
					if(num == 1) {
						System.out.print(" Employee Number : ");
						financial.employeeNumber = input.nextInt();
					}
					else if (num == 2) {
						System.out.print(" Employee Name : ");
						financial.employeeName = input.next();
					}
					else if (num == 3) {
						System.out.print(" Money Input : ");
						financial.inputMoney = input.nextInt();
					}
					else if (num == 4) {
						System.out.print(" Input Day : ");
						input.nextLine();
						financial.inputDay = input.nextLine();
					}
					else {
						continue;
					}//if
				}//while
				break;
			}//if
		}//for
	}

	public void viewEmployees() {
		//System.out.print(" Employee Number : "); //돈 받는사람
		//int employeeNumber = input.nextInt();
		for (int i =0; i<finances.size();i++) {
			finances.get(i).printInfo();
		}

	}
}
