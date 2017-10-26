package candle.ohlc.with.unixtime;

import candle.ohlc.abstr.interf.IOhlcCandle;

/**
 * A OHLC Candle with creation time, which is Unixtime in Millis.
 * @author Mark
 *
 * @param <T>
 */

/*
 * TODO: T has to be restricted, but need to avoid duplication over the Temp candle class.
 */
public class WithUnixtime{

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
	
	/**
	 * 
	 * @return creationTime
	 */
	public long creationTime(){
		
		return creationTime;
	}
	
	/**
	 * Returns the OHLC Candle.
	 * @return
	 */
	public IOhlcCandle candle(){
		
		return ohlcCandle;
	}
}
