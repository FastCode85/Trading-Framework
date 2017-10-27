package candle.ohlc.with.unixtime.interf;

import candle.ohlc.abstr.interf.IOhlcCandle;

public interface IWithUnixtime {

	/**
	 * Returns the creation time, in Unixtime
	 * @return
	 */
	public long creationTime();
	
	/**
	 * Returns the wrapped OHLC Candle
	 * @return
	 */
	public IOhlcCandle bidCandle();
}
