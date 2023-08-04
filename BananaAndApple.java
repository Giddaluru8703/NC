package Examples;

public class BananaAndApple {

	public static void main(String[] args) {

		int priceOfDBananas = 45;
		int priceOfApple = 20;

		if (priceOfDBananas <= 40) {
			// Kid can buy 1 dozen bananas and then purchase apples with the remaining money
			int numBananas = 12;
			int numApples = (100 - priceOfDBananas) / priceOfApple;
			int remainingMoney = 100 - (priceOfDBananas + (numApples * priceOfApple));

			System.out.println("price of 1 dozen bananas: " + priceOfDBananas + "  and the price of each apple: "
					+ priceOfApple + ".");
			System.out.println("You bought " + numBananas + " bananas and " + numApples + " apples.");
			System.out.println("You have " + remainingMoney + " Rs left.");
		} else {
			// Kid can only buy apples with the entire amount
			int numApples = 100 / priceOfApple;
			int remainingMoney = 100 - (numApples * priceOfApple);

			System.out.println("You can only buy " + numApples + " apples.");
			System.out.println("You have " + remainingMoney + " Rs left.");
		}

	}
}
