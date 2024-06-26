package de.ait.spring_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
public class Client {
    private Long id;
    private String name;
    private String email;
}
