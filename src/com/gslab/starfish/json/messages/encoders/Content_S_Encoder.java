package com.gslab.starfish.json.messages.encoders;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.gslab.starfish.json.messages.Content_S;


public class Content_S_Encoder implements Encoder.Text<Content_S>{

	@Override
	public void init(final EndpointConfig config) {
	}
 
	@Override
	public void destroy() {
	}
 
	@Override
	public String encode(final Content_S contentS) throws EncodeException {
		
		
		JsonObjectBuilder contentSBuilder = Json.createObjectBuilder();
        
		
		
       
	    contentSBuilder.add("call_control",contentS.getCall_control());
	    contentSBuilder.add("request_id",contentS.getRequest_id());
	    contentSBuilder.add("origin",contentS.getOrigin());
	    contentSBuilder.add("destination",contentS.getDestination());
	    contentSBuilder.add("endpoint",contentS.getEndpoint());
	    contentSBuilder.add("digits",contentS.getDigits());
	    
       JsonObject jsonMessage = contentSBuilder.build();
       
		return jsonMessage.toString();
	}
 
	

}
