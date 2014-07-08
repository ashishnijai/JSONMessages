package com.gslab.starfish.json.messages;

import com.gslab.starfish.json.messages.interfaces.Message;

public class Send_Received_Message_temp implements Message
{
    public Header header ;
    public Payload payload ;
    public ControlR control ; //M
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public Payload getPayload() {
		return payload;
	}
	public void setPayload(Payload payload) {
		this.payload = payload;
	}
	public ControlR getControl() {
		return control;
	}
	public void setControl(ControlR control) {
		this.control = control;
	}
}
