package candle.ohlc.with.unixtime.with.id.interf;

import java.util.Comparator;

import candle.ohlc.with.unixtime.interf.IWithUnixtime;

public interface IWithId {

	public long id();
	public IWithUnixtime withUnixtime();
}
