package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public interface RhymersFactory {

	public DefaultCountingOutRhymer GetStandardRhymer();

	public DefaultCountingOutRhymer GetFalseRhymer();

	public FIFORhymer GetFIFORhymer();

	public HanoiRhymer GetHanoiRhymer();

}
