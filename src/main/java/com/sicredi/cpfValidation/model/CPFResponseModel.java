package com.sicredi.cpfValidation.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CPFResponseModel {
    private String status;

    public CPFResponseModel(String status) {
        this.status = status;
    }

    // getters e setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
