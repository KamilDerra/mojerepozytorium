package packet.message;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Outgoing extends BaseMessage {

    public Outgoing() {
        super.messageType = MessageType.outgoing;
    }

}
