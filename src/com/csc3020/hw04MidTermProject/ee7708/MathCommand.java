package csc3020.hw04MidTermProject.ee7708;

//This program demonstrates an example using the toString() method
//to get a meaningful String representation from an Enum instance in Java.

public enum MathCommand {
    Add("+"),
    Subtract("-"),
    Multiply("*"),
    Divide("/");

    private String command;

    private MathCommand(String command){
        this.command = command;
    }

    @Override
    public String toString() {
        return command;
    }
}