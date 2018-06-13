package packet.message;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class MessageConfirmation  extends BaseMessage{

    public MessageConfirmation(){
        super.messageType = MessageType.confirmation;
    }

}
