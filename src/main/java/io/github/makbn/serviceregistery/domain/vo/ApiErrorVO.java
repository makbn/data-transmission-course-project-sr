package io.github.makbn.serviceregistery.domain.vo;

import java.util.List;

public class ApiErrorVO {
    private List<String> errors;

    public ApiErrorVO(List<String> errors) {
        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
