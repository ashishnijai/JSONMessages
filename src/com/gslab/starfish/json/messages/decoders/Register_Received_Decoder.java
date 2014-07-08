package com.gslab.starfish.json.messages.decoders;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

import com.gslab.starfish.json.messages.ControlR;
import com.gslab.starfish.json.messages.Header;
import com.gslab.starfish.json.messages.Register_Received;
import com.gslab.starfish.json.messages.Register_Send;

public class Register_Received_Decoder implements Decoder.Text<Register_Received>  {

	@Override
	public void init(final EndpointConfig config) {
	}
 
	@Override
	public void destroy() {
	}
 
	@Override
	public Register_Received decode(final String textMessage) throws DecodeException {
		Register_Received sendMessage = new Register_Received();
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
         
         
         sendMessage.setControl(control);
         sendMessage.setHeader(header);
		
		return sendMessage;
	}
 
	@Override
	public boolean willDecode(final String s) {
		return true;
	}
}
