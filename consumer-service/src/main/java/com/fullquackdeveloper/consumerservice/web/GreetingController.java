package com.fullquackdeveloper.consumerservice.web;

import com.fullquackdeveloper.consumerservice.client.HelloClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/greeting")
@RequiredArgsConstructor
public class GreetingController {

    private final HelloClient helloClient;
    @GetMapping("/{name}")
    public String greetHello (@PathVariable String name)
    {
        return helloClient.sayHello(name);
    }
}
