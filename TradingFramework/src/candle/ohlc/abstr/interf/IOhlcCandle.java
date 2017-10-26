package candle.ohlc.abstr.interf;

public interface IOhlcCandle {

	public double open();
	
	public double high();
	
	public double low();
	
	public double close();
	
	/**
	 * Updates the TempOhlcCandle, a temporary candle which is still forming,
	 * with the new price.
	 * @param newPrice
	 * @throws Exception 
	 */
	public void newTick(double newPrice) throws Exception;

	public boolean mutable();
}
