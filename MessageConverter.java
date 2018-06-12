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

	/**
	 * {@link ObjectMapper} allows to convert any object to its String representation as JSON.
	 */
	private ObjectMapper objectMapper;

	/**
	 * Message converter class constructor
	 */

	public MessageConverter() {
		objectMapper = new ObjectMapper();
	}

	/**
	 * Deserialize UdpPacket into specific message.
	 *
	 * @param data
	 * 		UpdPacket to be deserialized int message
	 *
	 * @return Returns converted specific message
	 */



	// DESERIALIZACJA:


	public BaseMessage deserialize(UdpPacket data) {

		BaseMessage result1 = null;

		/*
		1. Przekonwertuj value z klasy UdpPacket do String */

		//ByteBuffer val = ByteBuffer.wrap(data.getValue());
		String valueFromByteToString = new String(data.getValue());

		/*
		2. Pobierz typ wiadomości "type" z UdpPacket
        */

         MessageType type = data.getType();

	/*	3. Przekonwertuj String z pierwszego kroku do wiadomości korzystając z ObjectMapper.
		   Wykorzystaj pobrany typ z poprzedniego kroku do wyboru odpowiedniej klasy */


		try {

			ObjectMapper objectMapper = new ObjectMapper();
			switch(data.getType()){

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


	/**
	 * Serializes (convert from message to {@link UdpPacket)
	 *
	 * @param message
	 * 		Message to be converted to {@link UdpPacket}
	 *
	 * @return Returns {@link UdpPacket}
	 */





	// SERIALIZACJA:


	public UdpPacket serialize(BaseMessage message)
	{

		UdpPacket result = new UdpPacket();


		try {
			/*
             * Korzystając z klasy ObjectMapper przekonwertuj wiadomość do postaci tekstowej zapisanej w formacie JSON
             * Strona http://www.baeldung.com/jackson-object-mapper-tutorial przedstawia przykład jak to wykonać.
             */

			ObjectMapper objectMapper = null;
			try {
                objectMapper = new ObjectMapper();
                MessageConverter messageConverter = new MessageConverter();
                objectMapper.writeValue(new File("aa.json"), message);
            } catch (IOException e) {
                e.printStackTrace();
            }

			// 1. Przekonwertuj wiadomość do String za pomocą ObjectMapper

			String messageAsString = objectMapper.writeValueAsString(message);


		/* 2. Sprawdź typ wiadomości i ustaw type w UdpPacket

               -> linijka

			*/


			// 3. Pobierz długość tekstu z pierwszego kroku i ustaw pole length w UdpPacket.

			int messageAsStringLength = messageAsString.length();
			result.setLength(messageAsStringLength);


			// 4. Przekonwertuj tekst do tablicy byte[] i ustaw pole value w UdpPacket.

			byte[] messageAsStringToByte = messageAsString.getBytes();
			result.setValue(messageAsStringToByte);


			MessageType msgType;
			// Check type and assign to byte

			msgType = message.getMessageType();
			result.setType(msgType);


	/*	if(message instanceof TextMessage)
			 msgType = MessageType.message; */
			// convert dto.message to json


			// convert json to byte array

			// check dto.message byte array length

			// return new UdpPacket(msgType,);
		} catch (IOException e) {
			e.printStackTrace();
		}


		return result;
	}
}
