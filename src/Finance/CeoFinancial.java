package Finance;

import java.util.Scanner;

public class CeoFinancial extends HighLevelEmployee{

	public CeoFinancial(FinanceKind kind) {
		super(kind);

	}

	public void getUserInput(Scanner input) {
		setNumber(input);
		setName(input);
		setFinancialMoneywithYNCeo(input);
		setMoney(input);
		setDay(input);
	}
	
	
	

	

}



