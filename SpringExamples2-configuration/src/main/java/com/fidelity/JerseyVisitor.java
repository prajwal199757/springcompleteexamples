package com.fidelity;

public class JerseyVisitor implements Visitor{
    private String name;
    private String greeting;

    public JerseyVisitor() {
        System.out.println("created Jersey visitor");
        this.name = "Bruce Springsteen";
        this.greeting = "Glory Days";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGreeting() {
        return greeting;
    }
}
