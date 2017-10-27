package candle.ohlc.with.unixtime.with.id;

import candle.ohlc.with.unixtime.interf.IWithUnixtime;
import candle.ohlc.with.unixtime.with.id.interf.IWithId;

public class WithId<T extends IWithUnixtime> implements IWithId<T>{

	private final long id;
	private final T withUnixtime;
	
	public WithId(long id, T withUnixtime){
		
		this.id=id;
		this.withUnixtime=withUnixtime;
	}

	@Override
	public long id() {

		return id;
	}

	@Override
	public T element() {
		
		return withUnixtime;
	}
}
