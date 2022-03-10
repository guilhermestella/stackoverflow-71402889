package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping
    public ResponseEntity<List<Request>> test(@RequestBody List<@Valid Request> tests) {
        return ResponseEntity.ok(tests);
    }
}
