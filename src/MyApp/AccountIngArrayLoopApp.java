package MyApp;

public class AccountIngArrayLoopApp {

	public static void main(String[] args) {

		// 공급가
		double valueOfSupply = 50000.0;
		// 부가세 비율
		double vatRate = 0.1;
		// 비용 비율
		double expenseRate = 0.3;
		// 부가세
		double vat = valueOfSupply * vatRate;
		// 소바자 가격
		double total = valueOfSupply + vat;
		// 비용
		double expense = valueOfSupply * expenseRate;
		// 수익
		double income = valueOfSupply - expense;

		System.out.println("Value of Supply : " + valueOfSupply);

		System.out.println("VAT : " + vat);

		System.out.println("Totla : " + total);

		System.out.println("Expense : " + expense);

		System.out.println("Income : " + income);
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;

		// 배당1
		double dividend1 = income * dividendRates[0];
		// 배당2
		double dividend2 = income * dividendRates[0];
		// 배당3
		double dividend3 = income * dividendRates[0];
		
		for(int i = 0; i < dividendRates.length; i++) {
			System.out.println("Dividened "+ i + " : " + income * dividendRates[i]);
		}
		
		int j = 0;
		while(j < dividendRates.length) {
			System.out.println("Dividened "+ j + " : " + income * dividendRates[j]);
			j++;
		}

	}

}
