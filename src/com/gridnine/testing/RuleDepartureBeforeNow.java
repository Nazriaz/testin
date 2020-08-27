package com.gridnine.testing;

import java.time.LocalDateTime;

public class RuleDepartureBeforeNow implements FilterRule {
    @Override
    public boolean rule(Flight flight) {
        return flight.getSegments().stream().noneMatch(segment -> segment.getDepartureDate().isBefore(LocalDateTime.now()));
    }
}
