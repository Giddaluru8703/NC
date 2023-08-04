package Examples;

public class BuyApplesAndBananas {

	public static void main(String[] args) {
		int budget = 100;
		int bananaPrice = 40;
		int applesPrice = budget - bananaPrice;
		int bananasToBuy = 12;

		if (bananasToBuy * bananaPrice <= budget) {
			System.out.println("Kid buys " + bananasToBuy + " bananas for Rs " + bananaPrice);
		} else {
			System.out.println("12 bananas are not available for Rs 40. So, the kid buys apples for Rs " + budget);
		}
	}
}