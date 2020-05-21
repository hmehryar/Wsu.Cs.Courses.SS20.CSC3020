package fp6266;

public class homework01ChrinMyroslawa {
    public static void main(String[] args) {
        int n = 4 ;
        double leftVals[] = {100.0, 25.0, 225.0, 11.0};
        double rightVals[] = {50.0, 92.0, 17.0, 3.0} ;
        System.out.print("LeftVals = ");
        for(double val : leftVals)
            System.out.print(val + " ");
        System.out.println("\n");
        System.out.print("RightVals = ");
        for(double val : rightVals)
            System.out.print(val + " ");
        System.out.println("\n");
        System.out.print("Addition Result = ");
        for(int i = 0 ; i < n ; i++)
            System.out.print((leftVals[i] + rightVals[i]) + " ");
        System.out.println("\n");
        System.out.print("Substraction Result = ");
        for(int i = 0 ; i < n ; i++)
            System.out.print((leftVals[i] - rightVals[i]) + " ");
        System.out.println("\n");
        System.out.print("Division Result = ");
        for(int i = 0 ; i < n ; i++)
            System.out.print((leftVals[i] / rightVals[i]) + " ");
        System.out.println("\n");
        System.out.print("Multiplication Result = ");
        for(int i = 0 ; i < n ; i++)
            System.out.print((leftVals[i] * rightVals[i]) + " ");
        System.out.println("");
    }
}
