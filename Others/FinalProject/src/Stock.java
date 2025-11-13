import java.util.ArrayList;

public class Stock {
	private ArrayList<Double>Stock  = new ArrayList<>();
	private String Symbol;
	
	
	public Stock(String Symbol, ArrayList<Double> Stock) {
		this.Symbol=Symbol;
		this.Stock=Stock;
		
	}

	public double percentChange(int quarter,boolean Long) {
		if(Long==true) {
			return Stock.get(Stock.size()-1)/Stock.get(quarter-1);
		}else{
			int i=0;
			double percentChange = 1;
			
			while(i<Stock.size()-quarter) {
	
			percentChange=percentChange*(Stock.get(quarter+i-1)-(Stock.get(quarter+i)-Stock.get(quarter+i-1)))/Stock.get(quarter+i-1);
			i+=1;
			
			}
			return percentChange;

		}

	}
	public String getSymbol(){
		return Symbol;
	}
	
}
