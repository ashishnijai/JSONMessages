package com.gslab.starfish.json.messages.encoders;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.gslab.starfish.json.messages.Content_R;

public class Content_R_Encoder implements Encoder.Text<Content_R>{

	@Override
	public void init(final EndpointConfig config) {
	}
 
	@Override
	public void destroy() {
	}
 
	@Override
	public String encode(final Content_R contentR) throws EncodeException {
		
		
		JsonObjectBuilder contentRBuilder = Json.createObjectBuilder();
        
		
       
		contentRBuilder.add("event",contentR.getCall_event());
		contentRBuilder.add("request_id",contentR.getRequest_id());
		contentRBuilder.add("status",contentR.getStatus());
		contentRBuilder.add("reason",contentR.getReason());
		
	    
       JsonObject jsonMessage = contentRBuilder.build();
       
		return jsonMessage.toString();
	}
 
	

}

	
