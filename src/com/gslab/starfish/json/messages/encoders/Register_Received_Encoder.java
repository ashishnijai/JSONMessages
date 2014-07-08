package com.gslab.starfish.json.messages.encoders;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.gslab.starfish.json.messages.Register_Received;


public class Register_Received_Encoder implements Encoder.Text<Register_Received> {
	
	@Override
	public void init(final EndpointConfig config) {
	}
 
	@Override
	public void destroy() {
	}
 
	@Override
	public String encode(final Register_Received sendMessage) throws EncodeException {
		
		
		JsonObjectBuilder sendMessageBuilder = Json.createObjectBuilder();
        JsonObjectBuilder controlBuilder = Json.createObjectBuilder();
        JsonObjectBuilder headerBuilder = Json.createObjectBuilder();
        
        controlBuilder.add("type",sendMessage.getControl().getType());
        controlBuilder.add("package_type",sendMessage.getControl().getPackage_type());
        controlBuilder.add("sequence",sendMessage.getControl().getSequence());
        controlBuilder.add("version",sendMessage.getControl().getVersion());
      
       headerBuilder.add("initiator",sendMessage.getHeader().getInitiator());
       headerBuilder.add("target",sendMessage.getHeader().getTarget());
       headerBuilder.add("action",sendMessage.getHeader().getAction());
     
       sendMessageBuilder.add("control", controlBuilder);
       sendMessageBuilder.add("header",headerBuilder);
    
       
       JsonObject jsonMessage = sendMessageBuilder.build();
       
		return jsonMessage.toString();
	}
 
	

}
