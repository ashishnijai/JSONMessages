package com.gslab.starfish.json.messages.decoders;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

import com.gslab.starfish.json.messages.Content_S;

public class Content_S_Decoder implements Decoder.Text<Content_S> {

	@Override
	public void init(final EndpointConfig config) {
	}
 
	@Override
	public void destroy() {
	}
 
	@Override
	public Content_S decode(final String textMessage) throws DecodeException {
		Content_S contentS = new Content_S();
		JsonObject jsonObject = Json.createReader(new StringReader(textMessage))
				.readObject();
		
		contentS.setCall_control(jsonObject.getString("call_control"));
		contentS.setOrigin(jsonObject.getString("origin"));
		contentS.setRequest_id(jsonObject.getString("request_id"));
		contentS.setDestination(jsonObject.getString("destination"));
		contentS.setEndpoint(jsonObject.getString("endpoint"));
		contentS.setDestination(jsonObject.getString("digits"));
		
		
		
		return contentS;
	}
 
	@Override
	public boolean willDecode(final String s) {
		return true;
	}
}
