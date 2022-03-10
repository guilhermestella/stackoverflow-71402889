package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class Request {

    @NotEmpty(message = "name cannot be empty")
    private String name;
}
