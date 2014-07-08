package com.gslab.starfish.json.messages;

import java.util.ArrayList;
import java.util.List;

import com.gslab.starfish.json.messages.interfaces.Message;

public class Register_Send implements Message
{
    public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public ControlR getControl() {
		return control;
	}
	public void setControl(ControlR control) {
		this.control = control;
	}
	private Header header ;
    private ControlR control ; // control
    private List<String> payload;
	public List<String> getPayload() {
		return payload;
	}
	public void setPayload(List<String> payload) {
		this.payload = payload;
	}
}