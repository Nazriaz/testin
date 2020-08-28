package com.gridnine.testing;

import java.util.List;

class RuleOnTheGround2orMoreHours implements FilterRule {
    public boolean apply(Flight flight) {
        List<Segment> segments = flight.getSegments();
        for (int i = 0; i < segments.size() - 1; i++) {
            boolean isCorrect =
                    segments.get(i).getArrivalDate().plusHours(2)
                            .isAfter(segments.get(i + 1).getDepartureDate());
            if (!isCorrect) {
                return false;
            }
        }
        return true;
    }
}