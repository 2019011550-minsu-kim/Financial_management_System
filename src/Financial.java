
public class Financial {
	int payerNumber;
	String payerName;
	int inputMoney;
	String inputDay;



	public Financial() {

	} //�����ڰ� ���� ��츦 ����ؼ� ����� �α�

	public Financial(int payerNumber,String Payer, int inputMoney, String inputDay, int currentMoney)
	{
		this.payerNumber = payerNumber;
		this.payerName = Payer;
		this.inputMoney = inputMoney;
		this.inputDay = inputDay;
	}

	public void printInfo() {
		System.out.println("Payer Number" + payerNumber + " Payer Name: " + payerName + " Input Money : " + inputMoney + " Input Day :" + inputDay);
	}


}
