package ru.dreamore.sample.springfoxsample1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthenticationDetails {


    @ApiModelProperty(hidden = true)
    private User user;

    @ApiModelProperty(hidden = true)
    private Customer customer;

}
