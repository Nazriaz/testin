package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();
        FilterRule ruleDepartureAfterArrival = new RuleNoDepartureAfterArrival();
        FilterRule ruleDepartureBeforeNow = new RuleNoDepartureBeforeNow();
        FilterRule ruleOnTheGround2orMoreHours = new RuleOnTheGround2orMoreHours();
        FiltrationMechanism filtrationMechanism = new FiltrationMechanism();

        filtrationMechanism.doFiltration(flights, ruleDepartureBeforeNow).forEach(System.out::println);
        System.out.println();
        filtrationMechanism.doFiltration(flights, ruleDepartureAfterArrival).forEach(System.out::println);
        System.out.println();
        filtrationMechanism.doFiltration(flights, ruleOnTheGround2orMoreHours).forEach(System.out::println);
    }
}
