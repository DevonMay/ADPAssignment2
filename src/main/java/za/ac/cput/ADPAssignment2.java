package za.ac.cput;
import java.util.*;
// Devon Sherwyn May 219168296

public class ADPAssignment2
{
        public static void main (String[] args)
        {
            //List
            List<String> string=new ArrayList<>();
            string.add("Hello");
            string.add("Amazing");
            string.add("World");
            string.remove(0);
            System.out.println("List= "+string);
            boolean ans = string.contains("Amazing");
            if (ans)
                System.out.println("The list contains element Amazing");
            else
                System.out.println("The list does not contain element Amazing");

            //Collection
            Collection<String> stringCollection=new LinkedList<>();
            stringCollection.add("Hello");
            stringCollection.add("Beautiful");
            stringCollection.add("World");
            stringCollection.remove("Hello");
            System.out.println("Collection= "+stringCollection);
            boolean answer= stringCollection.contains("Beautiful");
            if (answer)
                System.out.println("The Collection contains element Beautiful ");
            else
                System.out.println("The Collection does not contain element Beautiful");

            //Set
            Set<Integer> values = new HashSet<>();
            values.add(1);
            values.add(2);
            values.add(3);
            values.remove(1);
            System.out.println("Set= "+values);
            boolean SetAnswer= values.contains(2);
            if (SetAnswer)
                System.out.println("The Set contains element 2 ");
            else
                System.out.println("The Set does not contain element 2");

            //Map
            Map element = new HashMap();
            element.put("MyName","Devon");
            element.put("MySurname","May");
            element.put("MyAge","21");
            element.remove("MyName","Devon");
            System.out.println("Map= "+element);
            boolean MapAnswer= element.containsKey("MySurname");
            if (MapAnswer)
                System.out.println("The Map contains element MySurname ");
            else
                System.out.println("The Map does not contain element MySurname");
        }
}
