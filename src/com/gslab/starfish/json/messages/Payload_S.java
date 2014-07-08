package com.gslab.starfish.json.messages;

import com.gslab.starfish.json.messages.interfaces.Message;

public class Payload_S implements Message
{
    public Content_S content ;

	public Content_S getContent() {
		return content;
	}

	public void setContent(Content_S content) {
		this.content = content;
	}
}
