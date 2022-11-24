package com.fidelity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

;

@Component("greeter")
public class PopupGreeter implements Greeter {
    private Visitor visitor;

    public Visitor getVisitor() {
        return visitor;
    }

    @Autowired
    public void setVisitor(Visitor visitor) {
        System.out.println("visitor set to " + visitor);
        this.visitor = visitor;
    }

    public void greet() {
        JOptionPane.showMessageDialog(null, visitor.getGreeting() + "," + visitor.getName());
    }

}
