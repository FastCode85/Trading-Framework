package candle.ohlc;

import candle.ohlc.abstr.AbstractOhlcCandle;
import candle.ohlc.temp.interf.ITempOhlcCandle;
import candle.ohlc.with.unixtime.WithUnixtime;

//TODO: MAKE TEST FOR public OhlcCandle(final ITempOhlcCandle tempCandle)
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
	
	public OhlcCandle(final ITempOhlcCandle tempCandle) throws Exception{
	
		this(tempCandle.open(),tempCandle.high(),tempCandle.low(),tempCandle.close());
	}
	
	public WithUnixtime withUnixtime(long creationTime){
		
		return new WithUnixtime(creationTime, this);
	}
}
