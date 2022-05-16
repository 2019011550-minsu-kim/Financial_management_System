package Finance;

import java.util.Scanner;

public class ManagerFinancial extends HighLevelEmployee{

	public ManagerFinancial(FinanceKind kind) {
		super(kind);

	}

	public void getUserInput(Scanner input) {  //오버라이딩인가
		setNumber(input);
		setName(input);
		setFinancialMoneywithYNManager(input);
		setMoney(input);
		setDay(input);
	}
}
