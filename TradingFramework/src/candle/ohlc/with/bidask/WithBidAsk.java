package candle.ohlc.with.bidask;

import candle.ohlc.OhlcCandle;
import candle.ohlc.abstr.interf.IOhlcCandle;
import candle.ohlc.with.bidask.interf.IWithBidAsk;

public class WithBidAsk implements IWithBidAsk{

	private final IOhlcCandle bidCandle;
	private final OhlcCandle askCandle;
	
	public WithBidAsk(IOhlcCandle bidCandle, final double openAsk,
			final double highAsk, final double lowAsk,final double closeAsk) throws Exception{
		
		this.bidCandle=bidCandle;
		askCandle=new OhlcCandle(openAsk,highAsk,lowAsk,closeAsk,bidCandle.mutable());
	}

	public WithBidAsk(OhlcCandle bidCandle, OhlcCandle askCandle, long unixtime) throws Exception{
		
		this(bidCandle,askCandle.open(),askCandle.high(),askCandle.low(),askCandle.close());
	}

	@Override
	public IOhlcCandle askCandle() {
		
		return askCandle;
	}

	@Override
	public IOhlcCandle bidCandle() {

		return bidCandle;
	}
}
