package com.gridnine.testing;

import java.util.List;
import java.util.stream.Collectors;

class FiltrationMechanism {
    List<Flight> doFiltration(List<Flight> flights, FilterRule... rules) {
        List<Flight> result = flights;
        for (FilterRule filterRule : rules) {
            result = result.stream().filter(filterRule::apply).collect(Collectors.toList());
        }
        return result;
    }
}