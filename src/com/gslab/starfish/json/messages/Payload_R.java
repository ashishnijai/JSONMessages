package com.gslab.starfish.json.messages;

import com.gslab.starfish.json.messages.interfaces.Message;

public class Payload_R implements Message
{
    public Content_R content ;

	public Content_R getContent() {
		return content;
	}

	public void setContent(Content_R content) {
		this.content = content;
	}
}
