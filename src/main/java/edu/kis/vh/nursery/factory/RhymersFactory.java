package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

    public interface RhymersFactory {
    
        public defaultCountingOutRhymer GetStandardRhymer();
        
        public defaultCountingOutRhymer GetFalseRhymer();
        
        public defaultCountingOutRhymer GetFIFORhymer();
        
        public defaultCountingOutRhymer GetHanoiRhymer();
        
    }
