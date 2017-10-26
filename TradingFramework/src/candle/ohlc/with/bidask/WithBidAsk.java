package candle.ohlc.with.bidask;

import candle.ohlc.OhlcCandle;
import candle.ohlc.with.unixtime.WithUnixtime;

public class WithBidAsk {

	private final WithUnixtime bidCandleWithUnixtime;
	private final OhlcCandle askCandle;
	
	public WithBidAsk(WithUnixtime bidCandleWithUnixtime, final double openAsk,
			final double highAsk, final double lowAsk,final double closeAsk) throws Exception{
		
		this.bidCandleWithUnixtime=bidCandleWithUnixtime;
		askCandle=new OhlcCandle(openAsk,highAsk,lowAsk,closeAsk);
	}
	
}
