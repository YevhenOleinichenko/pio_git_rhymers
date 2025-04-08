package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements RhymersFactory {

	public DefaultCountingOutRhymer GetStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}

	public DefaultCountingOutRhymer GetFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}

	public FIFORhymer GetFIFORhymer() {
		return new FIFORhymer();
	}

	public HanoiRhymer GetHanoiRhymer() {
		return new HanoiRhymer();
	}

}
