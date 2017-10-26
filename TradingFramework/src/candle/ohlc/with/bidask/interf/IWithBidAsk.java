package candle.ohlc.with.bidask.interf;

import candle.ohlc.abstr.interf.IOhlcCandle;

public interface IWithBidAsk {

	public IOhlcCandle askCandle();
	public IOhlcCandle bidCandle();
	public long creationTime();
}
