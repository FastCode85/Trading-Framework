package candle.ohlc;

import candle.ohlc.abstr.AbstractOhlcCandle;
import candle.ohlc.abstr.interf.IOhlcCandle;
import candle.ohlc.with.unixtime.WithUnixtime;

//TODO: MAKE TEST FOR public OhlcCandle(final ITempOhlcCandle tempCandle)
/**
 * A OHLC Candle with open, high, low, close values.
 * double primitive is used to store data.
 * @author Mark
 *
 */
public final class OhlcCandle extends AbstractOhlcCandle{

	private final boolean mutable;
	
	public OhlcCandle(final double open, final double high, 
			final double low, final double close, boolean mutable) throws Exception{
		
		super(open,high,low,close);
		this.mutable=mutable;
	}
	
	public OhlcCandle(final String open, final String high, 
			final String low, final String close, boolean mutable) throws Exception{
	
		this(Double.parseDouble(open),Double.parseDouble(high),
				Double.parseDouble(high),Double.parseDouble(close),mutable);
	}
	
	public OhlcCandle(final IOhlcCandle tempCandle) throws Exception{
	
		this(tempCandle.open(),tempCandle.high(),tempCandle.low(),tempCandle.close(),
				tempCandle.mutable());
	}
	
	public WithUnixtime withUnixtime(long creationTime){
		
		return new WithUnixtime(creationTime, this);
	}
	
	@Override
	public void newTick(double newPrice) throws Exception {
		
		if(!mutable)
			throw new Exception("Not mutable Candle.");
		if(newPrice>high)
			high=newPrice;
		else if(newPrice<low)
			low=newPrice;
		close=newPrice;
		
	}

	@Override
	public boolean mutable() {
		
		return mutable;
	}
	
	@Override
	public String toString(){
		
		StringBuffer sb=new StringBuffer().append("Open: ").append(open).append(" High: ").append(high).append(" Low: ").append(low).append(" Close: "+close);
				return sb.toString();
	}
}
