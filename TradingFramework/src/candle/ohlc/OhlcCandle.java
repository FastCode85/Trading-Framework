package candle.ohlc;

import candle.ohlc.abstr.AbstractOhlcCandle;

public class OhlcCandle extends AbstractOhlcCandle{


	
	public OhlcCandle(final double open, final double high, 
			final double low, final double close) throws Exception{
		
		super(open,high,low,close);/*
		this.open=open;
		this.high=high;
		this.low=low;
		this.close=close;
		checkValues();*/
	}
	
	public OhlcCandle(final String open, final String high, 
			final String low, final String close) throws Exception{
	
		this(Double.parseDouble(open),Double.parseDouble(high),Double.parseDouble(high),Double.parseDouble(close));
	}
}
