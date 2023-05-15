package com.example.gemfiredemo;
import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

@Region("People")
public class Person {

    @Id
    private Long id;
    private String name;
}
