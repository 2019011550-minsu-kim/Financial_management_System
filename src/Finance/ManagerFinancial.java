package Finance;

import java.util.Scanner;

public class ManagerFinancial extends HighLevelEmployee{

	public ManagerFinancial(FinanceKind kind) {
		super(kind);

	}

	public void getUserInput(Scanner input) {  //�������̵��ΰ�
		setNumber(input);
		setName(input);
		setFinancialMoneywithYNManager(input);
		setMoney(input);
		setDay(input);
	}
}
