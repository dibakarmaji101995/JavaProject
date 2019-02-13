package com.irctc.service;

import javax.jws.WebService;

import com.irctc.req.bindings.JourneyInfoType;
import com.irctc.req.bindings.PassengerInfoType;
import com.irctc.res.bindings.TicketType;

@WebService
public interface ERail {
     public TicketType bookTicket(PassengerInfoType passInfo,JourneyInfoType journeyInfo);
}
