package com.gridnine.testing;

import java.time.LocalDateTime;

public class RuleDepartureBeforeNow implements FilterRule {
    @Override
    public boolean apply(Flight flight) {
        LocalDateTime now = LocalDateTime.now();
        return flight.getSegments().stream().noneMatch(segment -> segment.getDepartureDate().isBefore(now));
    }
}