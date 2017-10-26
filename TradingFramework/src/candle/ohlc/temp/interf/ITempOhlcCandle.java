package candle.ohlc.temp.interf;

import candle.ohlc.abstr.interf.IOhlcCandle;

/**
 * Interface of a temporary ( forming ) OhlcCandle
 * @author Mark
 *
 */
public interface ITempOhlcCandle extends IOhlcCandle{

	/**
	 * Updates the TempOhlcCandle, a temporary candle which is still forming,
	 * with the new price.
	 * @param newPrice
	 */
	public void newTick(double newPrice);
}
