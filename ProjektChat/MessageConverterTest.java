package packet.converter;

import dto.message.Message;
import network.UdpPacket;
import org.junit.Test;
import packet.message.*;

import java.io.IOException;

import static org.junit.Assert.*;

public class MessageConverterTest {

	@Test
	public void shouldSerializeAndDeserializeForOutgoing() throws IOException {
		MessageConverter messageConverter = new MessageConverter();
//		UdpPacket udpPacket = new UdpPacket();
		Outgoing messageOut = new Outgoing();
		UdpPacket ne1 = messageConverter.serialize(messageOut);
		BaseMessage ne11 = messageConverter.deserialize(ne1);
		assertEquals(messageOut, ne11);
	}

	@Test
	public void shouldSerializeAndDeserializeForIngoing(){
		MessageConverter messageConverter = new MessageConverter();
		Ingoing messageIn = new Ingoing();
		UdpPacket ne2 = messageConverter.serialize(messageIn);
		BaseMessage ne22 = messageConverter.deserialize(ne2);
		assertEquals(messageIn, ne22);
	}

	@Test
	public void shouldSerializeAndDeserializeForTextMessage(){
		MessageConverter messageConverter = new MessageConverter();
		TextMessage textMessage = new TextMessage();
		UdpPacket ne3 = messageConverter.serialize(textMessage);
		BaseMessage ne33 = messageConverter.deserialize(ne3);
		assertEquals(textMessage, ne33);

	}

	@Test
	public void shouldSerializeAndDeserializeForConfirmation(){
		MessageConverter messageConverter = new MessageConverter();
		MessageConfirmation messageConfirmation = new MessageConfirmation();
		UdpPacket ne4 = messageConverter.serialize(messageConfirmation);
		BaseMessage ne44 = messageConverter.deserialize(ne4);
		assertEquals(messageConfirmation, ne44);
	}






}