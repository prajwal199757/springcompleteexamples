package com.fidelity;

import org.springframework.stereotype.Component;

@Component("amarilloVis")
public class AmarilloVisitor implements Visitor {
    private String name;
    private String greeting;

    public AmarilloVisitor(){
        System.out.println("created Amarillo visitor");
        this.name = "Joe Bob";
        this.greeting = "Howdy";
    }

    public String getGreeting() {
        return greeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
