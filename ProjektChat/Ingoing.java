package packet.message;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Ingoing extends BaseMessage{
	private String nick;

	public Ingoing(){
		super.messageType = MessageType.ingoing;
	}


}
