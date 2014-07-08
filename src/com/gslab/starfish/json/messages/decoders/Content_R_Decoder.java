package com.gslab.starfish.json.messages.decoders;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

import com.gslab.starfish.json.messages.Content_R;


public class Content_R_Decoder implements Decoder.Text<Content_R> {

	@Override
	public void init(final EndpointConfig config) {
	}
 
	@Override
	public void destroy() {
	}
 
	@Override
	public Content_R decode(final String textMessage) throws DecodeException {
		Content_R contentR = new Content_R();
		JsonObject jsonObject = Json.createReader(new StringReader(textMessage))
				.readObject();
		
		contentR.setCall_event(jsonObject.getString("event"));
		contentR.setStatus(jsonObject.getString("status"));
		contentR.setRequest_id(jsonObject.getString("request_id"));
		contentR.setReason(jsonObject.getString("reason"));
		
		return contentR;
	}
 
	@Override
	public boolean willDecode(final String s) {
		return true;
	}
}
