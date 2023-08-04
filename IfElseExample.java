package Examples;

public class IfElseExample {

	public void budgetAmount(int budget, int bananaPrice, int apple) {
		if (budget >= bananaPrice) {

			System.out.println("I want to buy banana for Rs: " + bananaPrice);
		} else {
			System.out.println("I want to buy apple for Rs:" + budget);

		}

	}

	public static void main(String[] args) {

		IfElseExample pp = new IfElseExample();
		pp.budgetAmount(100, 40, 100);
		pp.budgetAmount(100, 0, 100);

	}

}
