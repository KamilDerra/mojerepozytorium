package packet.message;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class TextMessage extends BaseMessage {

    public TextMessage(){
        super.messageType = MessageType.message;
    }
}
