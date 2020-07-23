package homework6.em0608;

public class HW06Source {
    public static void main(String[] args)  {

        String[] mathArray = {"2.0 1.0", "add xx 25.0", "addX 0.0 0.0",
                               "divide 100.0 50.0", "add 25.0 92.0",
                               "subtract 225.0 17.0", "multiply 11.0 3.0"};

        CalculateHelper mathLoop = new CalculateHelper();


        for (int i = 0; i < mathArray.length; i++) {
            try {
                mathLoop.process(mathArray[i]);
                System.out.println(mathLoop);
            } catch (InvalidStatementException exception){
                System.out.println(exception.getMessage());
                if(exception.getCause() != null) {
                    System.out.println("Original exception:" + exception.getCause().getMessage());
                }
                }
            }

        }

    }

