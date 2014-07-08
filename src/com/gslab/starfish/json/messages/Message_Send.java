package com.gslab.starfish.json.messages;

import com.gslab.starfish.json.messages.interfaces.Message;

public class Message_Send implements Message
{
    public Header header ;
    public Payload_S payload ;
    public ControlR control ;
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public Payload_S getPayload() {
		return payload;
	}
	public void setPayload(Payload_S payload) {
		this.payload = payload;
	}
	public ControlR getControl() {
		return control;
	}
	public void setControl(ControlR control) {
		this.control = control;
	}
}