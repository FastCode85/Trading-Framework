package candle.ohlc.temp.interf;

import candle.ohlc.abstr.interf.IOhlcCandle;

public interface ITempOhlcCandle extends IOhlcCandle{

	
	public void newTick(double newPrice);
}
