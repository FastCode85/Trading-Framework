package candle.ohlc.with.bidask;

import candle.ohlc.OhlcCandle;
import candle.ohlc.abstr.interf.IOhlcCandle;
import candle.ohlc.with.bidask.interf.IWithBidAsk;
import candle.ohlc.with.unixtime.WithUnixtime;


public class WithBidAsk implements IWithBidAsk{

	private final WithUnixtime bidCandleWithUnixtime;
	private final OhlcCandle askCandle;
	
	public WithBidAsk(WithUnixtime bidCandleWithUnixtime, final double openAsk,
			final double highAsk, final double lowAsk,final double closeAsk) throws Exception{
		
		this.bidCandleWithUnixtime=bidCandleWithUnixtime;
		askCandle=new OhlcCandle(openAsk,highAsk,lowAsk,closeAsk,bidCandleWithUnixtime.candle().mutable());
	}
	
	public WithBidAsk(WithUnixtime bidCandleWithUnixtime, OhlcCandle askCandle) throws Exception{
		
		this(bidCandleWithUnixtime,askCandle.open(),askCandle.high(),askCandle.low(),askCandle.close());
	}
	
	public WithBidAsk(OhlcCandle bidCandle, OhlcCandle askCandle, long unixtime) throws Exception{
		
		this(new WithUnixtime(unixtime,bidCandle),askCandle.open(),askCandle.high(),askCandle.low(),askCandle.close());
	}

	@Override
	public IOhlcCandle askCandle() {
		
		return askCandle;
	}

	@Override
	public IOhlcCandle bidCandle() {

		return bidCandleWithUnixtime.candle();
	}

	@Override
	public long creationTime() {
		
		return bidCandleWithUnixtime.creationTime();
	}
	
	
	
}
