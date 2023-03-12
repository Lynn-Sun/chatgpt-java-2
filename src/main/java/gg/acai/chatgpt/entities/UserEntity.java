package gg.acai.chatgpt.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * Entity for the user object.
 *
 * @author Clouke
 * @since 09.12.2022 19:33
 */
@Getter
@AllArgsConstructor
@ToString
public class UserEntity {
    private final String id;
    private final String name;
    private final String email;
    private final String image;
    private final String picture;
    private final List<String> groups;
    private final List<String> features;
}
