
public class Financial {
	int employeeNumber;
	String employeeName;
	int inputMoney;
	String inputDay;



	public Financial() {

	} //�����ڰ� ���� ��츦 ����ؼ� ����� �α�

	public Financial(int employeeNumber,String employee, int inputMoney, String inputDay)
	{
		this.employeeNumber = employeeNumber;
		this.employeeName = employee;
		this.inputMoney = inputMoney;
		this.inputDay = inputDay;
	}

	public void printInfo() {
		System.out.println("Employee Number : " + employeeNumber + " Employee Name : " + employeeName + " Input Money : " + inputMoney + " Input Day :" + inputDay);
	}


}
