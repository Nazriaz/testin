package com.gridnine.testing;

class RuleDepartureAfterArrival implements FilterRule {
    @Override
    public boolean apply(Flight flight) {
        return flight.getSegments().stream().noneMatch(this::checkSegment);
    }

    private boolean checkSegment(Segment segment) {
        return segment.getDepartureDate().isAfter(segment.getArrivalDate());
    }
}