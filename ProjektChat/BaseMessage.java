package packet.message;

import lombok.Getter;

public abstract class BaseMessage {

    @Getter
    protected MessageType messageType;
}
