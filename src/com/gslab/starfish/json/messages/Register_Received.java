package com.gslab.starfish.json.messages;

import com.gslab.starfish.json.messages.interfaces.Message;

public class Register_Received implements Message
{
    public Header header ;
    public ControlR control ;
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
}
