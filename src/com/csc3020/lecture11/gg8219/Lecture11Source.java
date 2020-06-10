package com.csc3020.lecture11.gg8219;

public class Lecture11Source
{

    public static void main(String[] args)
    {
        String name = "Jim";
        System.out.println("Hi " + name );

        String greeting = "Hello";
        greeting += " ";
        greeting += "World";

        System.out.println(greeting);
        greeting.length();

        // Integer count = 1;

/*     String  s1 = "";
       String s2 = "";
       boolean equal = true;
             if (s1.length( )==s2.length())
           {
                  for (int i = 0; i < s1.length() ; i++)
                  {
                     if (s1.charAt(i)!=s2.charAt(i))
                   {
                      equal = false;
                  }
               }
           }
*/
        //String Intern Example
        String s1 = "I Love";
        s1 += " Java";

        String s2 = "I";
        s2 += " Love Java";
        boolean  equal = true;
        if(s1.length() == s2.length()) {
            for (int i = 0; i < s1.length() ; i++)
            {
                if (s1.charAt(i)!=s2.charAt(i))
                {
                    equal =false;
                    System.out.println("They are not equal");
                }
            }

        }
        String s3 = s1.intern();
        String s4 = s2.intern();

        if(s1==s2)
        {
            System.out.println("They Are Equal");
        }else
        {
            System.out.println("They Are Not Equal");
        }

        if(s1.equals(s2))
        {
            System.out.println("They are equal");
        }else
        {
            System.out.println("They are not equal");
        }
        //Convert string
        int iVal = 100;
        String sVal = String.valueOf(iVal);
        System.out.println(sVal);

        int i = 2, j = 3;
        int result = i * j;
        System.out.println(  i + " * " + j+ " = "  + result);

        //using Flight Class
        Flight oFlight = new Flight(175);
        System.out.println(oFlight.toString());

        //string builder
        StringBuilder oStringBuilder = new StringBuilder();
        Flight myFlight = new Flight(175);
        String location = "Florida ";
        oStringBuilder.append("I Flew To ");
        oStringBuilder.append(location);
        oStringBuilder.append("on ");
        oStringBuilder.append(myFlight);
        System.out.println(oStringBuilder.toString());

        int time = 9;
        int pos=oStringBuilder.length() - " on ".length()-myFlight.toString().length();
        oStringBuilder.insert(pos, " at ");
        oStringBuilder.insert(pos+4, time);
        String message = oStringBuilder.toString();
        System.out.println(message);

        //wrapper class
        Integer a = 100;
        int b = a;
        Integer c = b;

        Integer d = Integer.valueOf(100);
        int e = d.intValue();
        Integer f = Integer.valueOf(e);
        Float g = Float.valueOf(18.125f);
        float h= g.floatValue();

        String s = "87.44";
        double dbl1 = Double.valueOf(s);
        Double dbl2= Double.parseDouble(s);

        //Using Wrapper Class
        Object[] stuff= new Object[3];
        stuff[0] = new Flight();
        stuff[1] = new Passenger(0, 2);
        stuff[2] = 100;

        for (Object obj:stuff)
        {
            System.out.println(obj.toString());
            System.out.println(obj.hashCode());
        }
    }
}

