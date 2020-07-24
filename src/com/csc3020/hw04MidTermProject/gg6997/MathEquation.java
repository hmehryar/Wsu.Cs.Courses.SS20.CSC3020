package csc3020.hw04MidTermProject.gg6997;

public class MathEquation {
    //declare variable
    char opCode;

    //constructor utilizes this keyword to differentiate instance from local variable
    MathEquation(char opCode)
    {
        this.opCode = opCode;
    }

    //overloaded execute methods
    //one for double and one for int variables
    //outputs result of overrode methods
    void execute(double leftVal, double rightVal){
        double result = 0.0;
        if (this.opCode == 'd'){
            result = (double)leftVal / rightVal;
        }
        else if(this.opCode == 'm'){
            result = (double)leftVal * rightVal;
        }
        else if(this.opCode == 'a'){
            result = (double)leftVal + rightVal;
        }
        else if(this.opCode == 's'){
            result = (double)leftVal - rightVal;
        }
        else{
            System.out.println("Error! Invalid operation inputted!");
        }
        System.out.println("Result: " + result);
    }

    void execute(int leftVal, int rightVal){
        int result = 0;
        if (this.opCode == 'd'){
            result = leftVal / rightVal;
        }
        else if(this.opCode == 'm'){
            result = leftVal * rightVal;
        }
        else if(this.opCode == 'a'){
            result = leftVal + rightVal;
        }
        else if(this.opCode == 's'){
            result = leftVal - rightVal;
        }
        else {
            System.out.println("Error! Invalid operation inputted!");
        }
        System.out.println("Result: " + result);

    }
}

