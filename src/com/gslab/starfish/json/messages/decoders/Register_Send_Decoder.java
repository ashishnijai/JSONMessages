package com.gslab.starfish.json.messages.decoders;

import java.io.StringReader;
import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonValue;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;

import com.gslab.starfish.json.messages.ControlR;
import com.gslab.starfish.json.messages.Header;

import javax.websocket.EndpointConfig;

import com.gslab.starfish.json.messages.Register_Send;

public class Register_Send_Decoder implements Decoder.Text<Register_Send>  {

	@Override
	public void init(final EndpointConfig config) {
	}
 
	@Override
	public void destroy() {
	}
 
	@Override
	public Register_Send decode(final String textMessage) throws DecodeException {
		Register_Send sendMessage = new Register_Send();
		JsonObject jsonObject = Json.createReader(new StringReader(textMessage))
				.readObject();
		
		JsonObject controlObject = jsonObject.getJsonObject("control");
		ControlR control = new ControlR();
		control.setType( controlObject.getString("type"));
        control.setPackage_type(controlObject.getString("package_type"));
        control.setSequence (controlObject.getInt("sequence"));
        control.setVersion ( controlObject.getString("version"));         
         
    
        JsonObject headerObject = jsonObject.getJsonObject("header");
         Header header = new Header();    
         header.setInitiator(headerObject.getString("initiator"));
         header.setTarget (headerObject.getString("target"));
         header.setAction( headerObject.getString("action"));
         
       
         JsonArray payloadArray = jsonObject.getJsonArray("payload");
         
         ArrayList<String> payloadList = new ArrayList<String>();
         for (JsonValue value: payloadArray){
        	 payloadList.add(value.toString());
         }
         
         sendMessage.setPayload(payloadList);
        
         sendMessage.setHeader(header);
         sendMessage.setControl(control);
        
		
		return sendMessage;
	}
 
	@Override
	public boolean willDecode(final String s) {
		return true;
	}
}
