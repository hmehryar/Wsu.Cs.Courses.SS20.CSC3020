package csc3020.hw02.hm;

public class MathEquation {
    double leftValue;
    double rightValue;
    double result;
    char opCode;
    void Execute(){
        switch (opCode){
            case 'a':
                result=leftValue+rightValue;
                break;
            case 's':
                result=leftValue-rightValue;
                break;
            case 'm':
                result=leftValue*rightValue;
                break;
            case 'd':
                if(rightValue==0){
                    System.out.println("Error: right Value for division can be not zero!!!");
                    result = 0.0d;
                    break;
                }
                result=leftValue/rightValue;
                break;
            default:
                System.out.println("Error: Invalid Operation Code");
                result = 0.0d;
                break;
        }
    }
}
