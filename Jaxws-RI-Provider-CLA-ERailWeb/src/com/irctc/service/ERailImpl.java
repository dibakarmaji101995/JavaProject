package com.irctc.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.irctc.req.bindings.JourneyInfoType;
import com.irctc.req.bindings.PassengerInfoType;
import com.irctc.res.bindings.TicketType;

@WebService(endpointInterface="com.irctc.service.ERail")
public class ERailImpl implements ERail {
    @WebMethod
	@Override
	public @WebResult TicketType bookTicket(@WebParam PassengerInfoType passInfo,@WebParam JourneyInfoType journeyInfo) {
    	TicketType ticket=null;
		// create TicketType object
    	ticket=new TicketType();
    	//set value to TicketType object fields
    	ticket.setPassengerName(passInfo.getName());
    	ticket.setEmail(passInfo.getEmail());
    	ticket.setPhoneNumber(passInfo.getPhNumber());
    	ticket.setFrom(journeyInfo.getFrom());
    	ticket.setTo(journeyInfo.getTo());
    	ticket.setTrainName(journeyInfo.getTrainName());
    	ticket.setJourneyDate(journeyInfo.getJourneyDate());
    	ticket.setTrainNumber(1245675);
    	ticket.setPNRNo(456898);
    	ticket.setStatus("CNF");
    	ticket.setTicketNumber(5478565);
		return ticket;
	}//method
}//class
