package com.gridnine.testing;

class RuleNoDepartureAfterArrival implements FilterRule {
    @Override
    public boolean apply(Flight flight) {
        return flight.getSegments().stream()
                .noneMatch(segment -> segment.getDepartureDate().isAfter(segment.getArrivalDate()));
    }
}