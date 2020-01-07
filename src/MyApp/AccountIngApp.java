package MyApp;

public class AccountIngApp {

	public static void main(String[] args) {
		
		//공급가
		double valueOfSupply = 10000.0;
		//부가세 비율
		double vatRate = 0.1;
		//비용 비율
		double expenseRate = 0.3;	
		//부가세
		double vat = valueOfSupply * vatRate;
		//소바자 가격
		double total = valueOfSupply + vat;
		//비용
		double expense = valueOfSupply * expenseRate;
		//수익
		double income = valueOfSupply - expense;
		//배당1
		double dividend1 = income * 0.5;
		//배당2
		double dividend2 = income * 0.3;
		//배당3
		double dividend3 = income * 0.2;
		
		
		System.out.println("Value of Supply : " + valueOfSupply);
		
		System.out.println("VAT : " + vat);
		
		System.out.println("Totla : " + total);
		
		System.out.println("Expense : " + expense);
		
		System.out.println("Income : " + income);
		
		System.out.println("Dividend 1 : " + dividend1);
		
		System.out.println("Dividend 2 : " + dividend2);
		
		System.out.println("Dividend 3 : " + dividend3);

	}

}
