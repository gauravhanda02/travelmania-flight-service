package com.mnfalcons.travelmania.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/*******************************************************************************
 * ${FILE_NAME}
 * <p/>
 * Copyright 2015 Ameriprise Financial, Inc. All rights reserved.
 * Proprietary and Confidential. Use is subject to license terms.
 * <p/>
 * Created on : 9/19/2016
 * Author(s)  : ghanda1
 ******************************************************************************/
@RestController
public class FlightService {
    public FlightService() {
        System.out.println("Inside FlightService");
    }

    @RequestMapping(value = "/flights", method = RequestMethod.GET)
    public String getFlights() {
        return "Response from flights";
    }

    @RequestMapping(value = "/flights/{id}", method = RequestMethod.GET)
    public String getFlights(@PathVariable("id") String flightId) {
        return "Response from Flight " + flightId;
    }


}
