package com.gslab.starfish.json.messages;

import com.gslab.starfish.json.messages.interfaces.Message;

public class ControlR 
{
    public String getSession_id() {
		return session_id;
	}
	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}
	public int getAck_sequence() {
		return ack_sequence;
	}
	public void setAck_sequence(int ack_sequence) {
		this.ack_sequence = ack_sequence;
	}
	public String getPackage_type() {
		return package_type;
	}
	public void setPackage_type(String package_type) {
		this.package_type = package_type;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getMessage_state() {
		return message_state;
	}
	public void setMessage_state(String message_state) {
		this.message_state = message_state;
	}
	public String getSubsession_id() {
		return subsession_id;
	}
	public void setSubsession_id(String subsession_id) {
		this.subsession_id = subsession_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCorrelation_id() {
		return correlation_id;
	}
	public void setCorrelation_id(String correlation_id) {
		this.correlation_id = correlation_id;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String session_id ;
    public int ack_sequence ;
    public String package_type ;
    public int sequence ;
    public String message_state ;
    public String subsession_id ;
    public String type ;
    public String correlation_id ;
    public String version ;
}