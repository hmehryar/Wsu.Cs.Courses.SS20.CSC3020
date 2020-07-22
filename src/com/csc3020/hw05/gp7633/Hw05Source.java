package csc3020.hw05.gp7633;

public class Hw05Source {
    public static void main(String[] args) {
        String[] arr = new String[4];
        arr[0] = "divide 100.0 50.0";
        arr[1] = "add 25.0 92.0";
        arr[2] = "subtract 225.0 17.0";
        arr[3] = "multiply 11.0 3.0";

        for (int i = 0; i < arr.length; i++) {
            CalculateHelper oHelper = new CalculateHelper();
            oHelper.process(arr[i]);
            System.out.println(oHelper.toString());
        }
    }
}
