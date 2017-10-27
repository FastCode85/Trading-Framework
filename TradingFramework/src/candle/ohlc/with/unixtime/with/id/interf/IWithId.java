package candle.ohlc.with.unixtime.with.id.interf;

import candle.ohlc.with.unixtime.interf.IWithUnixtime;

public interface IWithId<T extends IWithUnixtime> {

	public long id();
	public T element();
}
