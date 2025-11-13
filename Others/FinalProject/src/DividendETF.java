
public class DividendETF extends ETF{
	
	private double interestRate;
	
	
	public DividendETF(Stock Stock1,Double Weight1,Stock Stock2,Double Weight2,Stock Stock3,Double Weight3,double interestRate) {
		super(Stock1, Weight1, Stock2, Weight2, Stock3, Weight3);
		this.interestRate=interestRate;
	}

	
	public String ETFReturn(double money, int quarter,boolean Long) {
		
		return  getETFInfo()+String.format("\nInvested funds: %.1f\nReturn: %.1f\nDividend: %.1f\nFinal fund: %.1f\n",
				money,money*formETF(quarter,Long)*(1+interestRate)-money,money*formETF(quarter,Long)*interestRate,
				money*formETF(quarter,Long)*(1+interestRate));
	}
	
}
