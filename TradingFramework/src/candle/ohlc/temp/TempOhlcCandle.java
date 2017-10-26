package candle.ohlc.temp;

import candle.ohlc.abstr.interf.IOhlcCandle;
import candle.ohlc.temp.interf.ITempOhlcCandle;
import candle.ohlc.with.unixtime.WithUnixtime;

/**
 * A Temporary OHLC Candle, which is still forming.
 * @author Mark
 *
 */
public final class TempOhlcCandle implements ITempOhlcCandle{
	
	private double open;
	private double high;
	private double low;
	private double close;
	
	/**
	 * Secondary constructor. Should be used only if the current candle's values
	 * are known.
	 * @param open
	 * @param high
	 * @param low
	 * @param close
	 * @throws Exception if params are not valid prices for a OHLC Candle.
	 */
	public TempOhlcCandle(final double open, final double high, 
			final double low, final double close) throws Exception{
		
		this.open=open;
		this.high=high;
		this.low=low;
		this.close=close;
		checkValues();
	}
	
	/**
	 * Preferred constructor. Should always be used to create a updatable
	 * Temporary OHLC Candle.
	 * @param open
	 * @throws Exception
	 */
	public TempOhlcCandle(final double open) throws Exception{
		
		this(open,open,open,open);
	}
	
	/**
	 * Checks the correctness of the values of this candle.
	 * @throws Exception
	 */
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
	
	public WithUnixtime withUnixtime(long creationTime){
		
		return new WithUnixtime(creationTime, this);
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

	@Override
	public void newTick(double newPrice) {
		
		if(newPrice>high)
			high=newPrice;
		else if(newPrice<low)
			low=newPrice;
		close=newPrice;
		
	}
	
	
}
