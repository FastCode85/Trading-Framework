package candle.ohlc;

import candle.ohlc.abstr.AbstractOhlcCandle;

/**
 * A OHLC Candle with open, high, low, close values.
 * double primitive is used to store data.
 * @author Mark
 *
 */
public final class OhlcCandle extends AbstractOhlcCandle{

	
	public OhlcCandle(final double open, final double high, 
			final double low, final double close) throws Exception{
		
		super(open,high,low,close);
	}
	
	public OhlcCandle(final String open, final String high, 
			final String low, final String close) throws Exception{
	
		this(Double.parseDouble(open),Double.parseDouble(high),Double.parseDouble(high),Double.parseDouble(close));
	}
}
