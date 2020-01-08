package MyApp;

class Accounting {
	// 공급가
	public double valueOfSupply;
	// 부가세 비율
	public  double vatRate;
	// 비용 비율
	public  double expenseRate;
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

	public  void print() {
		System.out.println("Value of Supply : " + valueOfSupply);

		System.out.println("VAT : " + getVAT());

		System.out.println("Totla : " + getTotal());

		System.out.println("Expense : " + getExpense());

		System.out.println("Income : " + getIncome());

		System.out.println("Dividend 1 : " + getDividend1());

		System.out.println("Dividend 2 : " + getDividend2());

		System.out.println("Dividend 3 : " + getDividend3());
	}

	public  double getDividend1() {
		double dividend1 = getIncome() * 0.5;
		return dividend1;
	}

	public  double getDividend2() {
		double dividend1 = getIncome() * 0.3;
		return dividend1;
	}

	public  double getDividend3() {
		double dividend1 = getIncome() * 0.2;
		return dividend1;
	}

	public  double getIncome() {
		double income = valueOfSupply - getExpense();
		return income;
	}

	public  double getExpense() {
		double expense = valueOfSupply * expenseRate;
		return expense;
	}

	public  double getTotal() {
		double total = valueOfSupply + getVAT();
		return total;
	}

	public  double getVAT() {
		return valueOfSupply * vatRate;
	}
}

public class AccountIngClassApp {

	public static void main(String[] args) {

//		Accounting.valueOfSupply = 20000.0;
//		Accounting.vatRate = 0.1;
//		Accounting.expenseRate = 0.3;
//
//		Accounting.print();

		Accounting a1 = new Accounting();

		a1.valueOfSupply = 20000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();

		Accounting a2 = new Accounting();

		a2.valueOfSupply = 40000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();

	}

}
