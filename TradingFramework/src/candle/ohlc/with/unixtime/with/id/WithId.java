package candle.ohlc.with.unixtime.with.id;

import candle.ohlc.with.unixtime.interf.IWithUnixtime;
import candle.ohlc.with.unixtime.with.id.interf.IWithId;

public class WithId implements IWithId{

	private final long id;
	private final IWithUnixtime withUnixtime;
	
	public WithId(long id, IWithUnixtime withUnixtime){
		
		this.id=id;
		this.withUnixtime=withUnixtime;
	}

	@Override
	public long id() {

		return id;
	}

	@Override
	public IWithUnixtime withUnixtime() {
		
		return withUnixtime;
	}

}
