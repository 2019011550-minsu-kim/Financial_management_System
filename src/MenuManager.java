
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	//원하는 메뉴를 FinancialManager의 메소드를 통해 출력하는 클래스


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		FinancialManager financialManager = getObject("financialManager.ser");
		if (financialManager == null) {
			financialManager = new FinancialManager(input);
		}
		
		
		selectMenu(input, financialManager);
		putObject(financialManager, "financialManager.ser");


	}//main method 괄호

	public static void selectMenu(Scanner input, FinancialManager financialManager) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					financialManager.addMoney();
					logger.log("add Money");
					break;
				case 2:
					financialManager.deleteMoney();
					logger.log("delete Money");
					break;
				case 3:
					financialManager.editMoney();
					logger.log("edit Money");
					break;
				case 4:
					financialManager.viewEmployees();
					logger.log("view Money list");
					break;
				default :
					continue;
				}
			}
			catch(InputMismatchException e){
				System.out.println("please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("1. Add Money"); 
		System.out.println("2. Delete Money");
		System.out.println("3. Edit Money");
		System.out.println("4. View Employees");
		System.out.println("5. Exit");
		System.out.print("Select one number beetween 1~5 : ");

	}
	
	public static FinancialManager getObject(String filename) {
		FinancialManager financialManager = null;
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			financialManager = (FinancialManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return financialManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return financialManager;
		
	
	}
	public static void putObject(FinancialManager financialManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(financialManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	
	}
}

