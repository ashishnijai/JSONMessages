package com.gslab.starfish.json.messages;

import com.gslab.starfish.json.messages.interfaces.Message;

public class Payload implements Message
{
    public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String content ;
}
