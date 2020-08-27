package com.gridnine.testing;

import java.util.Iterator;
import java.util.List;

public class RuleOnTheGround2orMoreHours implements FilterRule {
    public boolean rule(Flight flight) {
        List<Segment> segments = flight.getSegments();
        Iterator<Segment> iterator = segments.iterator();
        Segment current = iterator.next();
        while (iterator.hasNext()) {
            Segment next = iterator.next();
            if (!current.getArrivalDate().plusHours(2).isAfter(next.getDepartureDate())) return false;
            else current = next;
        }
        return true;
    }
}
