package com.gslab.starfish.json.messages;

import com.gslab.starfish.json.messages.interfaces.Message;

public class Content_S implements Message
{
    public String call_control ;
    public String request_id ;
    public String origin ;
    public String destination ;
    public String endpoint ;
    public String digits ;
	public String getCall_control() {
		return call_control;
	}
	public void setCall_control(String call_control) {
		this.call_control = call_control;
	}
	public String getRequest_id() {
		return request_id;
	}
	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	public String getDigits() {
		return digits;
	}
	public void setDigits(String digits) {
		this.digits = digits;
	}
}
