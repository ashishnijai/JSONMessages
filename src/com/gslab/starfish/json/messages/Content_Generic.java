package com.gslab.starfish.json.messages;

import com.gslab.starfish.json.messages.interfaces.Message;

public class Content_Generic implements Message
{
    public String getSome_other_value() {
		return some_other_value;
	}
	public void setSome_other_value(String some_other_value) {
		this.some_other_value = some_other_value;
	}
	public String getRequest_id() {
		return request_id;
	}
	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}
	public String getEvent_type() {
		return event_type;
	}
	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}
	public String getStatus_code() {
		return status_code;
	}
	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String some_other_value ;
    public String request_id ;
    public String event_type ;
    public String status_code ;
    public String reason ;

}