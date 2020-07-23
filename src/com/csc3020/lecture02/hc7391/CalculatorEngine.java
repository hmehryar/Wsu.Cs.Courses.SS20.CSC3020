package csc3020.lecture02.hc7391;

public class CalculatorEngine {
    public static void main(String[] args) {

        float val1 =10, val2= 4;
        char opCode = 'd';

        float result = 0;

        System.out.println(val1);
        System.out.println(val2);

        if(opCode == 'a'){
            result = val1+val2;
        }else if (opCode == 's'){
            result = val1-val2;
        }else if (opCode=='m'){
            result = val1*val2;
        }else if(opCode=='d'){
            result = val1/val2;
        }else{
            System.out.println("Error: Invalid Operation");
        }
        System.out.println(result);

        //while loop

        int iVal = 5;
        do{
            iVal=iVal*2;
            System.out.println(iVal);
        }while(iVal<100);
    }//end main
}
