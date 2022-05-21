import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Finance.CeoFinancial;
import Finance.FinanceKind;
import Finance.FinancialInput;
import Finance.ManagerFinancial;
import Finance.StaffFinancial;

public class FinancialManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4687128340487126927L;
	
	ArrayList<FinancialInput> finances = new ArrayList <FinancialInput>();
	transient Scanner input;


	FinancialManager(Scanner input){
		this.input = input;
	}

	public void addMoney() {
		int kind = 0;
		FinancialInput financialInput;

		while(kind < 1 || kind > 3) {
			try {
				System.out.println(" 1 for Staff : ");
				System.out.println(" 2 for Manager : ");
				System.out.println(" 3 for Ceo : "); //아직 CeoFinancial 클래스는 제작 x
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
			catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}

	public void deleteMoney() {
		System.out.print(" Employee Number : "); //사원번호
		int employeeNumber = input.nextInt();
		int index = findIndex(employeeNumber);
		removefromEmployees(index, employeeNumber);
	}

	public int findIndex(int employeeNumber) {
		int index = -1;
		for (int i =0; i<finances.size();i++){
			if(finances.get(i).getEmployeeNumber() == employeeNumber) {
				index = i;
				break;
			}
		}
		return index;

	}

	public int removefromEmployees(int index, int employeeNumber) {
		if (index >=0) {
			finances.remove(index);
			System.out.println("the employee " + employeeNumber + " is deleted");
			return 1;
		}
		else {
			System.out.println("the employee has not been registered");
			return -1;
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
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						financialInput.setNumber(input);
						break;
					case 2:
						financialInput.setName(input);
						break;
					case 3:
						financialInput.setMoney(input);
						break;
					case 4:
						financialInput.setDay(input);
						break;
					default:
						continue;
					}

				}//while
				break;
			}//if
		}//for
	}

	public void viewEmployees() {

		System.out.println("# of registered finances : " + finances.size());
		for (int i =0; i<finances.size();i++) {
			finances.get(i).printInfo();
		}

	}



	public void showEditMenu() {
		System.out.println("** Financial Info Edit Menu **");
		System.out.println(" 1. Edit Number");
		System.out.println(" 2. Edit Name");
		System.out.println(" 3. Edit Money Input");
		System.out.println(" 4. Edit Input Day");
		System.out.println(" 5. Exit");
		System.out.print("Select one number between 1 - 5: ");

	}
}
