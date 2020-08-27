package com.gridnine.testing;

public class RuleDepartureAfterArrival implements FilterRule {
    @Override
    public boolean rule(Flight flight) {
        return flight.getSegments().stream().noneMatch(segment -> segment.getDepartureDate().isAfter(segment.getArrivalDate()));
    }
}
