package candle.ohlc.with.unixtime.test;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import candle.ohlc.OhlcCandle;
import candle.ohlc.with.unixtime.WithUnixtime;

//TODO ( check with bad values - Exceptions )
public class WithUnixtimeTest {

	@Test
	public void test() {
		
		try {
			if(new OhlcCandle(1,3,1,2,false).withUnixtime(
					Calendar.getInstance().getTimeInMillis()).candle().open()
					!=1)
			fail("Bad open, stored open is: "+new OhlcCandle(1,3,1,2,false).withUnixtime(
					Calendar.getInstance().getTimeInMillis()).candle().open());
			if(new OhlcCandle(1,3,1,2,false).withUnixtime(
					Calendar.getInstance().getTimeInMillis()).candle().close()
					!=2)
			fail("Bad open");
			long creationTime=Calendar.getInstance().getTimeInMillis();
			if((new OhlcCandle(1,3,1,2,false).withUnixtime(
					creationTime).creationTime()!=creationTime))
			fail("Bad creationTime");

			WithUnixtime tempOhlcCandle=new OhlcCandle(1,3,1,2,true).withUnixtime(
					Calendar.getInstance().getTimeInMillis());
			tempOhlcCandle.candle().newTick(5);
			if(tempOhlcCandle.candle().close()!=5 || tempOhlcCandle.candle().high()!=5)
				fail("newTick() gone bad");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			fail("Exception");
		}
	}

}
