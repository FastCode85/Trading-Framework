package candle.ohlc.with.unixtime.comparator;



import java.util.Comparator;

import candle.ohlc.with.unixtime.interf.IWithUnixtime;

public class UnixtimeComparator implements Comparator<IWithUnixtime>{


	@Override
	public int compare(IWithUnixtime one, IWithUnixtime other) {
		
		if(one.creationTime()<other.creationTime())
			return (int)(one.creationTime()-other.creationTime());
		else if(one.creationTime()>other.creationTime())
			return (int)(other.creationTime()-one.creationTime());
		else
			return 0;
	}
}
