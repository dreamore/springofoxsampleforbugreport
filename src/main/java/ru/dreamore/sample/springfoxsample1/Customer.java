package ru.dreamore.sample.springfoxsample1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
    private String bankSystemId;
    private boolean chief;
}
