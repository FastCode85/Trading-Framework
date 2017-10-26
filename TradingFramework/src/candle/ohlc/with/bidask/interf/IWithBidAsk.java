package candle.ohlc.with.bidask.interf;

import candle.ohlc.abstr.interf.IOhlcCandle;

public interface IWithBidAsk {

	public double openAsk();
	
	public double highAsk();
	
	public double lowAsk();
	
	public double closeAsk();
	
	public IOhlcCandle candle();
}
