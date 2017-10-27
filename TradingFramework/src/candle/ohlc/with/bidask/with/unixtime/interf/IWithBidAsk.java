package candle.ohlc.with.bidask.with.unixtime.interf;

import candle.ohlc.abstr.interf.IOhlcCandle;
import candle.ohlc.with.unixtime.interf.IWithUnixtime;

public interface IWithBidAsk extends IWithUnixtime{

	public IOhlcCandle askCandle();
	public long creationTime();
}
