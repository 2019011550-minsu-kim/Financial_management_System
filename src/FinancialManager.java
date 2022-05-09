import java.util.ArrayList;
import java.util.Scanner;

import Finance.CeoFinancial;
import Finance.FinanceKind;
import Finance.Financial;
import Finance.FinancialInput;
import Finance.ManagerFinancial;
import Finance.StaffFinancial;

public class FinancialManager {
	ArrayList<FinancialInput> finances = new ArrayList <FinancialInput>();
	Scanner input;


	FinancialManager(Scanner input){
		this.input = input;
	}

	public void addMoney() {
		int kind = 0;
		FinancialInput financialInput;
		while(kind != 1 && kind != 2) {

			System.out.print(" 1 for Staff : ");
			System.out.print(" 2 for Manager : ");
			System.out.print(" 3 for Ceo : "); //아직 CeoFinancial 클래스는 제작 x
			System.out.print(" Select num for Finance Kind betewwn 1 and 3: ");
			kind = input.nextInt();
			if (kind == 1) {
				financialInput = new StaffFinancial(FinanceKind.Staff);
				financialInput.getUserInput(input);
				finances.add(financialInput);
				break;

			}
			else if (kind == 2) { 
				financialInput = new ManagerFinancial(FinanceKind.Manager);
				financialInput.getUserInput(input);
				finances.add(financialInput);
				break;
			}
			else if (kind == 3) { 
				financialInput = new CeoFinancial(FinanceKind.Ceo);
				financialInput.getUserInput(input);
				finances.add(financialInput);
				break;
			}
			else {
				System.out.print(" Select num for Finance Kind betewwn 1 and 3: ");
			}
		}

		

		
		
	}

	public void deleteMoney() {
		System.out.print(" Employee Number : "); //사원번호
		int employeeNumber = input.nextInt();
		int index = -1;
		for (int i =0; i<finances.size();i++){
			if(finances.get(i).getEmployeeNumber() == employeeNumber) {
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
			FinancialInput financialInput = finances.get(i); //변수명 변경을 막기 위해 선언(원래 financial 로 되어 있었기에.)
			if(financialInput.getEmployeeNumber() == employeeNumber) {
				int num = -1;
				while(num!=5) {
					System.out.println("** Financial Info Edit Menu **");
					System.out.println(" 1. Edit Number");
					System.out.println(" 2. Edit Name");
					System.out.println(" 3. Edit Money Input");
					System.out.println(" 4. Edit Input Day");
					System.out.println(" 5. Exit");
					System.out.print("Select one number between 1 - 5: ");
					num = input.nextInt();
					if(num == 1) {
						System.out.print(" Employee Number : ");
						int number = input.nextInt();
						financialInput.setEmployeeNumber(number);

					}
					else if (num == 2) {
						System.out.print(" Employee Name : ");
						String name = input.next();
						financialInput.setEmployeeName(name);
					}
					else if (num == 3) {
						System.out.print(" Money Input : ");
						int money = input.nextInt();
						financialInput.setInputMoney(money);
					}
					else if (num == 4) {
						System.out.print(" Input Day : ");
						input.nextLine();
						String day = input.nextLine();
						financialInput.setInputDay(day);
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
		System.out.println("# of registered finances : " + finances.size());
		for (int i =0; i<finances.size();i++) {
			finances.get(i).printInfo();
		}

	}
}
