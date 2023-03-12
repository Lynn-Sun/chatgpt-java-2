package gg.acai.chatgpt.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Represents an entry in the parsed exception.
 *
 * @author Clouke
 * @since 10.12.2022 20:33
 */
@Getter
@ToString
@AllArgsConstructor
public class ParsedExceptionEntry {
    private final String exceptionKeywords;
    private final Class<? extends Exception> exceptionClass;
}
