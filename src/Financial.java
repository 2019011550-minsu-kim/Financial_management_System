
public class Financial {
	int payerNumber;
	String payerName;
	int inputMoney;
	String inputDay;



	public Financial() {

	} //생성자가 없을 경우를 대비해서 만들어 두기

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
