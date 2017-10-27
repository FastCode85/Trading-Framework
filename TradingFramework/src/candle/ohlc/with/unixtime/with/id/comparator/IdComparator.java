package candle.ohlc.with.unixtime.with.id.comparator;

import java.util.Comparator;
import candle.ohlc.with.unixtime.with.id.interf.IWithId;

public class IdComparator implements Comparator<IWithId>{

	@Override
	public int compare(IWithId one, IWithId other) {
		
		if(one.id()<other.id())
			return (int)(one.id()-other.id());
		else if(one.id()>other.id())
			return (int)(other.id()-one.id());
		else
			return 0;
	}
}
