import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class FinalProject {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			File StockPrice = new File("StockPrice.txt"); 
			Scanner newReader = new Scanner(StockPrice); 
			String stock1[] = newReader.nextLine().split(" ");
			String stock2[] = newReader.nextLine().split(" ");
			String stock3[] = newReader.nextLine().split(" ");
			String stock4[] = newReader.nextLine().split(" ");
			ArrayList<Double>Stock1 = new ArrayList<>();
			ArrayList<Double>Stock2 = new ArrayList<>();
			ArrayList<Double>Stock3 = new ArrayList<>();
			ArrayList<Double>Stock4 = new ArrayList<>();
			for(int i =0;i<stock1.length;i++) {
				double price = Double.parseDouble(stock1[i]);
				Stock1.add(price);	
			}
			for(int i =0;i<stock2.length;i++) {
				double price = Double.parseDouble(stock2[i]);
				Stock2.add(price);	
			}
			for(int i =0;i<stock3.length;i++) {
				double price = Double.parseDouble(stock3[i]);
				Stock3.add(price);	
			}
			for(int i =0;i<stock4.length;i++) {
				double price = Double.parseDouble(stock4[i]);
				Stock3.add(price);	
			}
			Stock FB = new Stock("FB", Stock1);
			Stock Apple = new Stock("Apple", Stock2);
			Stock Google = new Stock("Google", Stock3);
			Stock Tesla = new Stock("Tesla", Stock4);
			
			ETF ETF1 = new ETF(FB,0.3,Apple,0.3,Google,0.4);
			DividendETF DividendETF1 = new DividendETF(Tesla,0.6, Google ,0.3, FB,0.1, 0.03);
			DividendETF DividendETF2 = new DividendETF(FB,0.4,Apple,0.2,Tesla, 0.4,0.04);
			System.out.println(ETF1.ETFReturn(6000, 2, true));
			System.out.println(ETF1.ETFReturn(2500, 6, false));
			System.out.println(DividendETF1.ETFReturn(4000, 8, false));
			System.out.println(DividendETF2.getETFInfo());
			newReader.close();
}

			catch(FileNotFoundException e) {
	e.printStackTrace();
}
}
}

