package io.github.makbn.serviceregistery.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RestResponse<T> {

    private boolean error;
    private String message;
    private T result;
    private int code;

}
