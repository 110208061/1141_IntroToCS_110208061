
public class ETF {
private Stock stock1,stock2,stock3;
private double weight1,weight2,weight3;
	public ETF(Stock stock1,double weight1,Stock stock2,double weight2,Stock stock3,double weight3) {
		this.stock1=stock1;
		this.stock2=stock2;
		this.stock3=stock3;
		this.weight1=weight1;
		this.weight2=weight2;
		this.weight3=weight3;
}
	public double formETF(int quarter, boolean Long) {
		return stock1.percentChange(quarter, Long)*weight1+stock2.percentChange(quarter, Long)*weight2+stock3.percentChange(quarter, Long)*weight3;
	}
	public String ETFReturn(double money, int quarter,boolean Long) {
		return getETFInfo()+String.format("\nInvested funds: %.1f\nReturn: %.1f\nFinal fund: %.1f\n",money, (money*formETF(quarter,Long)-money),money*formETF(quarter,Long));
	}
	public String getETFInfo(){
		return "ETF component: \n"+stock1.getSymbol()+": "+weight1+"\n"+stock2.getSymbol()+": "+weight2+"\n"+stock3.getSymbol()+": "+weight3;
	}

}
	