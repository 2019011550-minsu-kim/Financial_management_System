package Finance;

import java.util.Scanner;

public abstract class Financial {  //Financial ��ü�� �������� �ʴ´�
	protected FinanceKind kind = FinanceKind.Staff; //enum������ �ν��Ͻ��� ������ �ʾƵ� �Ǵ°ǰ�? ���α׷� ����ȭ, �ٸ������ ���� ����
	protected int employeeNumber;
	protected String employeeName;
	protected int inputMoney;
	protected String inputDay;

	public Financial(FinanceKind kind) {
		this.kind = kind;

	}

	public Financial() {

	} //�����ڰ� ���� ��츦 ����ؼ� ����� �α�

	public Financial(int employeeNumber,String employeeName, int inputMoney, String inputDay)
	{
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.inputMoney = inputMoney;
		this.inputDay = inputDay;
	}

	public Financial(FinanceKind kind, int employeeNumber,String employeeName, int inputMoney, String inputDay)
	{
		this.kind = kind;
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.inputMoney = inputMoney;
		this.inputDay = inputDay;
	}

	public FinanceKind getKind() {
		return kind;
	}

	public void setKind(FinanceKind kind) {
		this.kind = kind;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getInputMoney() {
		return inputMoney;
	}

	public void setInputMoney(int inputMoney) {
		this.inputMoney = inputMoney;
	}

	public String getInputDay() {
		return inputDay;
	}

	public void setInputDay(String inputDay) {
		this.inputDay = inputDay;
	}

	
	public abstract void printInfo();

	


}
