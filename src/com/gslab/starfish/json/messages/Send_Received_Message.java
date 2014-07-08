package com.gslab.starfish.json.messages;

import java.util.List;
import java.util.ArrayList;

import com.gslab.starfish.json.messages.interfaces.Message;

public class Send_Received_Message implements Message
{
    public Header header ;
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
	public List<String> payload = new ArrayList<String>();
    public ControlR control ; // M
}
