package com.gridnine.testing;

import java.time.LocalDateTime;

class RuleNoDepartureBeforeNow implements FilterRule {
    @Override
    public boolean apply(Flight flight) {
        LocalDateTime nowDate = LocalDateTime.now();
        return flight.getSegments().stream()
                .noneMatch(segment -> segment.getDepartureDate().isBefore(nowDate));
    }
}