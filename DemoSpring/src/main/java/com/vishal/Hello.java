package com.vishal;


public class Hello {
    private Computer computer;


    public Hello() {
        System.out.println("Hello Constructor");
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void build() {
        System.out.println("You are working on awesome project ");
        computer.compile();
    }
}
