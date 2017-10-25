package candle.ohlc.temp;

import candle.ohlc.abstr.AbstractOhlcCandle;

public final class TempOhlcCandle extends AbstractOhlcCandle{
	
	public TempOhlcCandle(final double open, final double high, 
			final double low, final double close) throws Exception{
		
		super(open,high,low,close);
	}
}
