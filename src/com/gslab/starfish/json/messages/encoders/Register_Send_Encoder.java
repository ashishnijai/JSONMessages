package com.gslab.starfish.json.messages.encoders;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;
import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.gslab.starfish.json.messages.ControlR;
import com.gslab.starfish.json.messages.Header;
import com.gslab.starfish.json.messages.Register_Send;
public class Register_Send_Encoder implements Encoder.Text<Register_Send> {
	
	@Override
	public void init(final EndpointConfig config) {
	}
 
	@Override
	public void destroy() {
	}
 
	@Override
	public String encode(final Register_Send sendMessage) throws EncodeException {
		
		
		JsonObjectBuilder sendMessageBuilder = Json.createObjectBuilder();
        JsonObjectBuilder controlBuilder = Json.createObjectBuilder();
        JsonObjectBuilder headerBuilder = Json.createObjectBuilder();
        JsonArrayBuilder payloadArrayBuilder =  Json.createArrayBuilder();
        
        controlBuilder.add("type",sendMessage.getControl().getType());
        controlBuilder.add("package_type",sendMessage.getControl().getPackage_type());
        controlBuilder.add("sequence",sendMessage.getControl().getSequence());
        controlBuilder.add("version",sendMessage.getControl().getVersion());
      
       headerBuilder.add("initiator",sendMessage.getHeader().getInitiator());
       headerBuilder.add("target",sendMessage.getHeader().getTarget());
       headerBuilder.add("action",sendMessage.getHeader().getAction());
     
       
    
      for (String value : sendMessage.getPayload()){
    	  payloadArrayBuilder.add(value);
      }
      sendMessageBuilder.add("payload",payloadArrayBuilder);
      sendMessageBuilder.add("header",headerBuilder);
      sendMessageBuilder.add("control", controlBuilder);
   
     
       JsonObject jsonMessage = sendMessageBuilder.build();
       System.out.println("JSON Message from Register_Send_Encoder:"+jsonMessage.toString());
		return jsonMessage.toString();
	}
 
	

}
