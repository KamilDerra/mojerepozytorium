package packet.converter;
import network.UdpPacket;


//import com.fasterxml.jackson.databind.ObjectMapper;
import network.UdpPacket;
import org.codehaus.jackson.map.ObjectMapper;
import packet.message.*;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;


public class MessageConverter {

		  
	  private ObjectMapper objectMapper;

	
	 (Message converter class constructor):

	  public MessageConverter() {
		objectMapper = new ObjectMapper();
	  }




	// SERIALIZACJA:


	public UdpPacket serialize(BaseMessage message)
	{

		UdpPacket result = new UdpPacket();


		try {
			
			(Korzystając z klasy ObjectMapper przekonwertuj wiadomość do postaci tekstowej zapisanej w formacie JSON):
			 

			ObjectMapper objectMapper = null;
			try {
				objectMapper = new ObjectMapper();
				MessageConverter messageConverter = new MessageConverter();
				objectMapper.writeValue(new File("FileExample.json"), message);
			} catch (IOException e) {
				e.printStackTrace();
			}



			(Przekonwertuj wiadomość do String za pomocą ObjectMapper):

			String messageAsString = objectMapper.writeValueAsString(message);



		        (Sprawdź typ wiadomości i ustaw type w UdpPacket):

			MessageType msgType;
			msgType = message.getMessageType();
			result.setType(msgType);



			(Pobierz długość tekstu z pierwszego kroku i ustaw pole length w UdpPacket):

			int messageAsStringLength = messageAsString.length();
			result.setLength(messageAsStringLength);



			(Przekonwertuj tekst do tablicy byte[] i ustaw pole value w UdpPacket):

			byte[] messageAsStringToByte = messageAsString.getBytes();
			result.setValue(messageAsStringToByte);


		return result;
	}






	// DESERIALIZACJA:


	public BaseMessage deserialize(UdpPacket data) {

               BaseMessage result1 = null;

		

		(Przekonwertuj value z klasy UdpPacket do String):
        
                String valueFromByteToString = new String(data.getValue());


		
		(Pobierz typ wiadomości "type" z UdpPacket):
        
                MessageType type = data.getType();



		(Przekonwertuj String z pierwszego kroku do wiadomości korzystając z ObjectMapper.
		   Wykorzystaj pobrany typ z poprzedniego kroku do wyboru odpowiedniej klasy):


                 try {
     
                      ObjectMapper objectMapper = new ObjectMapper();
                      switch (data.getType()) {


                      case ingoing:

                      result1 = objectMapper.readValue(valueFromByteToString, Ingoing.class);

                      break;


                      case outgoing:

                      result1 = objectMapper.readValue(valueFromByteToString, Outgoing.class);

                      break;


                      case message:

                      result1 = objectMapper.readValue(valueFromByteToString, TextMessage.class);

                      break;


                      case confirmation:

                      result1 = objectMapper.readValue(valueFromByteToString, MessageConfirmation.class);

                      break;
                     }


                     } catch (IOException e) {
                     e.printStackTrace();
        }

        return result1;
        }
        }


