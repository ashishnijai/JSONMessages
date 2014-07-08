package com.gslab.starfish.json.messages;

import com.gslab.starfish.json.messages.interfaces.Message;

public class Content_R implements Message
{
    public String getCall_event() {
		return call_event;
	}
	public void setCall_event(String call_event) {
		this.call_event = call_event;
	}
	public String getRequest_id() {
		return request_id;
	}
	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String call_event ;
    public String request_id ;
    public String status ;
    public String reason ;

}