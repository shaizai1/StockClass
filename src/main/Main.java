package Stock.src.main;

public class Main {
    
    public static void main(String[] args) {

		Stock stock1 = new Stock("AAPL", "Apple", 200, 198);

		
		System.out.println("\n stock1");
		System.out.println("-------------");
		System.out.println("Symbol:     " + stock1.symbol);
		System.out.println("Name:    " + stock1.name);
		System.out.println("Current price:      " + stock1.currentPrice);
		System.out.println("Previous closing price: " + stock1.previousClosingPrice);
		System.out.println("Percent change in price: " + stock1.getChangePercent());

    }
}

class Stock {
	String symbol;
	String name;

	double previousClosingPrice;
	double currentPrice;

	Stock(String newSymbol, String newName, double newPreviousClosingPrice, double newCurrentPrice) {
		symbol = newSymbol;
		name = newName;
		previousClosingPrice = newPreviousClosingPrice;
		currentPrice = newCurrentPrice;

	}

	double getChangePercent() {
		return ((currentPrice - previousClosingPrice)/previousClosingPrice * 100);
	}

}