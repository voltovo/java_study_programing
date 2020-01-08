package MyApp;

class Accounting {
	// 공급가
	public static double valueOfSupply;
	// 부가세 비율
	public static double vatRate;
	// 비용 비율
	public static double expenseRate;
	// 부가세
	double vat = getVAT();
	// 소바자 가격
	double total = getTotal();
	// 비용
	double expense = getExpense();
	// 수익
	double income = getIncome();
	// 배당1
	double dividend1 = getDividend1();
	// 배당2
	double dividend2 = getDividend2();
	// 배당3
	double dividend3 = getDividend3();

	public static void print() {
		System.out.println("Value of Supply : " + valueOfSupply);

		System.out.println("VAT : " + getVAT());

		System.out.println("Totla : " + getTotal());

		System.out.println("Expense : " + getExpense());

		System.out.println("Income : " + getIncome());

		System.out.println("Dividend 1 : " + getDividend1());

		System.out.println("Dividend 2 : " + getDividend2());

		System.out.println("Dividend 3 : " + getDividend3());
	}

	private static double getDividend1() {
		double dividend1 = getIncome() * 0.5;
		return dividend1;
	}

	private static double getDividend2() {
		double dividend1 = getIncome() * 0.3;
		return dividend1;
	}

	private static double getDividend3() {
		double dividend1 = getIncome() * 0.2;
		return dividend1;
	}

	private static double getIncome() {
		double income = valueOfSupply - getExpense();
		return income;
	}

	private static double getExpense() {
		double expense = valueOfSupply * expenseRate;
		return expense;
	}

	private static double getTotal() {
		double total = valueOfSupply + getVAT();
		return total;
	}

	private static double getVAT() {
		return valueOfSupply * vatRate;
	}
}

public class AccountIngClassApp {

	public static void main(String[] args) {

		Accounting.valueOfSupply = 20000.0;
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;

		Accounting.print();
	}

}
