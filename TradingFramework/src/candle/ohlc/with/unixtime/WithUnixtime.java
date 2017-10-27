package candle.ohlc.with.unixtime;

import candle.ohlc.abstr.interf.IOhlcCandle;
import candle.ohlc.with.unixtime.interf.IWithUnixtime;

/**
 * A OHLC Candle with creation time, which is Unixtime in Millis.
 * @author Mark
 *
 * @param <T>
 */

/*
 * TODO: T has to be restricted, but need to avoid duplication over the Temp candle class.
 */
public class WithUnixtime implements IWithUnixtime{

	/**
	 * Creation Time, in Unixtime Millis.
	 */
	private final long creationTime;
	private final IOhlcCandle ohlcCandle;
	
	/**
	 * Should be used passing a OhlcCandle as last parameter.
	 * @param creationTime
	 * @param ohlcCandle
	 */
	public WithUnixtime(final long creationTime, IOhlcCandle ohlcCandle){
		
		this.creationTime=creationTime;
		this.ohlcCandle=ohlcCandle;
	}
	
	public long creationTime(){
		
		return creationTime;
	}
	
	/**
	 * Returns the OHLC Candle.
	 * @return
	 */
	@Override
	public IOhlcCandle candle(){
		
		return ohlcCandle;
	}

}
