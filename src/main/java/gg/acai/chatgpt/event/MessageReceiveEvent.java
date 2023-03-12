package gg.acai.chatgpt.event;

import gg.acai.acava.event.Event;
import gg.acai.chatgpt.Response;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * 
 *
 * @author Clouke
 * @since 09.12.2022 22:13
 */
@Deprecated
@AllArgsConstructor
@Getter
@ToString
public class MessageReceiveEvent implements Event{
    private final Response response;
}
