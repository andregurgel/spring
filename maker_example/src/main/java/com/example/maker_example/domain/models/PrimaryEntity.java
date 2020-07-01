package com.example.maker_example.domain.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class PrimaryEntity {

    @JsonIgnore
    private String userAudit;
}
