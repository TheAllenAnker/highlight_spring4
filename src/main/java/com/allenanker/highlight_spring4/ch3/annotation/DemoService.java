package com.allenanker.highlight_spring4.ch3.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public void outputResult() {
        System.out.println("Bean acquired from composed annotation");;
    }
}
