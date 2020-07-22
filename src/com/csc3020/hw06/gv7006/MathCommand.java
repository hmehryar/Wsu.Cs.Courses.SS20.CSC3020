package com.csc3020.hw06.gv7006;

enum MathCommand {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private char op;

    private MathCommand(char op) {
        this.op = op;
    }

    public char getOp() {
        return op;
    }
}
