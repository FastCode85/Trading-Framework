package candle.ohlc.temp;

import candle.ohlc.temp.interf.ITempOhlcCandle;

public final class TempOhlcCandle implements ITempOhlcCandle{
	
	private double open;
	private double high;
	private double low;
	private double close;
	
	public TempOhlcCandle(final double open, final double high, 
			final double low, final double close) throws Exception{
		
		this.open=open;
		this.high=high;
		this.low=low;
		this.close=close;
		checkValues();
	}
	
	private final void checkValues() throws Exception{
		
		if(open<=0 || high<=0 || low<=0 || close<=0)
			throw new Exception("Cannot handle negative values");
		if(low>=high)
			throw new Exception("Invalid values, low>=high. Low: "+low+" High: "+high);
		if(!(open<=high && open>=low))
			throw new Exception("Invalid values, !(open<=high && open>=low). Open: "+open+" High: "+high+" Low: "+low);
		if(!(close<=high && close>=low))
			throw new Exception("Invalid values, !(close<=high && close>=low). Close: "+close+" High: "+high+" Low: "+low);
	}

	public final double open(){
		
		return open;
	}
	
	public final double high(){
		
		return high;
	}
	
	public final double low(){
		
		return low;
	}
	
	public final double close(){
		
		return close;
	}
	
	
}
