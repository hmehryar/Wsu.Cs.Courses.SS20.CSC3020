package lecture11.gn2289;

public class Lecture11Source {
    public static void main(String[] args) {
        //String
        String name = "Ryan";
        System.out.println("hi "+ name);

        String greeting = "Hello";
        greeting+= " ";
        greeting+= "world!";
        System.out.println(greeting);
        System.out.println(greeting.length());

        String s1 = "I love";
        s1 += " java";
        String s2 = "I";
        s2 += "love java.";
        if(s1 == s2) {
            System.out.println("They're equal");
        }else{
            System.out.println("They're not equal");
        }

        if(s1.equals(s2)) {
            System.out.println("equal");
        }

        String s3 = s1.intern();
        String s4 = s2.intern();

        if(s3 == s4) {
            System.out.println("Equal.");
        }

        int val = 100;
        String sval = String.valueOf(val);
        System.out.println(sval);

        Flight oFlight = new Flight(175);
        System.out.println(oFlight.toString());

        //string builder
        StringBuilder oStringBuilder = new StringBuilder();
        Flight myFlight = new Flight(175);
        String location = "Florida";
        oStringBuilder.append("I flew to ");
        oStringBuilder.append(location);
        oStringBuilder.append(" on ");
        oStringBuilder.append(myFlight);
        System.out.println(oStringBuilder.toString());

        int time = 9;
        int pos = oStringBuilder.length()-"on".length()-myFlight.toString().length();
        oStringBuilder.insert(pos," at ");
        oStringBuilder.insert(pos+4, time);
        String message = oStringBuilder.toString();
        System.out.println(message);

        //wrapper classes
        Integer a = 100;
        int b = a;
        Integer c = b;

        //1nd conversion
        Integer d = Integer.valueOf(100);
        Integer f = Integer.valueOf(d);
        int e = d.intValue();
        Float g = Float.valueOf(18.125f);
        float h = g.floatValue();

        String s = "87.44";
        double dbl1 = Double.valueOf(s);
        Double dbl2 = Double.parseDouble(s);

        Object[] stuff = new Object[3];
        stuff[0] = new Flight();
        stuff[1] = new Passenger(0, 2);
        stuff[2] = 100;
        for(Object obj:stuff) {
            System.out.println(obj.toString());
            System.out.println(obj.hashCode());
        }









    }
}
