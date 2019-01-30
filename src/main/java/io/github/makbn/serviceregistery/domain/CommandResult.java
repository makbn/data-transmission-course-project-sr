package io.github.makbn.serviceregistery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CommandResult {
    private String input;
    private String output;
    private String err;
}
