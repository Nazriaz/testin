package com.gridnine.testing;

import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

public class RulesTest {
    private List<Flight> flights = FlightBuilder.createFlights();

    @Test
    public void noDepartureAfterArrival() {
        RuleNoDepartureAfterArrival ruleNoDepartureAfterArrival = new RuleNoDepartureAfterArrival();
        Assert.assertFalse(ruleNoDepartureAfterArrival.apply(flights.get(3)));
    }
    @Test
    public void noDepartureBeforeNow() {
        RuleNoDepartureBeforeNow ruleNoDepartureBeforeNow = new RuleNoDepartureBeforeNow();
        Assert.assertFalse(ruleNoDepartureBeforeNow.apply(flights.get(2)));

    }
    @Test
    public void onTheGround2orMoreHours() {
        RuleOnTheGround2orMoreHours ruleOnTheGround2orMoreHours = new RuleOnTheGround2orMoreHours();
        Assert.assertFalse(ruleOnTheGround2orMoreHours.apply(flights.get(4)));
        Assert.assertFalse(ruleOnTheGround2orMoreHours.apply(flights.get(5)));
    }
}