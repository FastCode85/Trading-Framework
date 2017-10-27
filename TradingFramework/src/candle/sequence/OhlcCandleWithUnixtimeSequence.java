package candle.sequence;

import java.util.Collections;
import java.util.List;

import candle.ohlc.abstr.interf.IOhlcCandle;
import candle.ohlc.with.unixtime.comparator.UnixtimeComparator;
import candle.ohlc.with.unixtime.interf.IWithUnixtime;

public class OhlcCandleWithUnixtimeSequence {

	List<IWithUnixtime> ohlcCandleSequence;
	
	public OhlcCandleWithUnixtimeSequence(List<IWithUnixtime> externOhlcCandleSequence){
		
		Collections.copy(ohlcCandleSequence, externOhlcCandleSequence);
		
	}
	
	public List<IWithUnixtime> ascOrderedOhlcCandle(){
		
		Collections.sort(ohlcCandleSequence, new UnixtimeComparator());
		return ohlcCandleSequence;
	}
	
	@Override
	public String toString(){
		
		return ohlcCandleSequence.toString();
	}
}
