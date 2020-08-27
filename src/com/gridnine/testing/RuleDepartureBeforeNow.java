package com.gridnine.testing;

import java.time.LocalDateTime;

class RuleDepartureBeforeNow implements FilterRule {
    private LocalDateTime nowDate = LocalDateTime.now();

    @Override
    public boolean apply(Flight flight) {
        return flight.getSegments().stream().noneMatch(this::checkSegment);
    }

    private boolean checkSegment(Segment segment) {
        return segment.getDepartureDate().isBefore(nowDate);
    }
}