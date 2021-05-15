package za.ac.cput;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ADPAssignment2Test
{
    @Test
    public void ListAddTest()
    {
        List<String> string=new ArrayList<>();                        //Creates  List
        Assertions.assertEquals(0,string.size());        // Tests that list is empty
        string.add("Hello");                                        // Adds the Element "Hello" into list
        Assertions.assertEquals(1,string.size());      // Tests that the element is Added to list
    }

    @Test
    public void ListRemoveTest()
    {
        List<String> string=new ArrayList<>();                      //Creates  List
        string.add("Hello");                                       // Adds the element "Hello" into list
        string.add("World");                                      // Adds the element "World" into list
        string.remove(0);                                     // Removes first Element in List
        Assertions.assertEquals(1,string.size());      // Tests that the first element is removed
    }

    @Test
    public void ListFindTest()
    {
        List<String> string=new ArrayList<>();                                    //Creates  List
        string.add("Hello");                                                     // Adds the Element "Hello" into list
        string.add("Amazing");                                                  // Adds the Element "Amazing" into list
        Assertions.assertTrue(string.contains("Amazing"));      // Tests that the List contains element Amazing
    }

    @Test
    public void CollectionAddTest()
    {
        Collection<String> string=new LinkedList<>();             // Creates Collection
        Assertions.assertEquals(0,string.size());        // Tests that Collection is empty
        string.add("Hello");                                    // Adds 1 element to Collection
        Assertions.assertEquals(1,string.size());      // Tests that 1 element is added
    }
    @Test
    public void CollectionRemoveTest()
    {
        Collection<String> stringCollection=new LinkedList<>();               //Creates Collection
        stringCollection.add("Hello");                                       // Adds the 1st element into collection
        stringCollection.add("World");                                      // Adds 2nd Element into Collection
        Assertions.assertEquals(2,stringCollection.size());        // Tests that 2 elements is added
        stringCollection.remove("Hello");                              // Removes element "Hello" from Collection
        Assertions.assertEquals(1,stringCollection.size());      // Tests if all elements is removed from Collection
    }

    @Test
    public void CollectionFindTest()
    {
        Collection<String> stringCollection=new LinkedList<>();                           //Creates Collection
        stringCollection.add("Hello");                                                   // Adds the 1st element into collection
        stringCollection.add("World");                                                  // Adds 2nd Element into Collection
        Assertions.assertTrue(stringCollection.contains("Hello"));                     // Tests that the Collection contains element Amazing
    }

    @Test
    public void SetAddTest()
    {
        Set<Integer> values = new HashSet<>();                    //Creates Set
        Assertions.assertEquals(0,values.size());        // Tests that Set is empty
        values.add(1);                                          // Adds 1 element to Set
        Assertions.assertEquals(1,values.size());      // Tests that 1 element is added
    }

    @Test
    public void SetRemoveTest()
    {
        Set<Integer> values = new HashSet<>();                      //Creates Set
        values.add(1);                                             // Adds 1 element to Set
        values.add(2);                                            // Adds 2nd element to Set
        Assertions.assertEquals(2,values.size());        // Tests that 2 elements is in Set
        values.remove(1);                                    // Removes 1 element from set
        Assertions.assertEquals(1,values.size());      // Tests that 1 element is in Set
    }

    @Test
    public void SetFindTest()
    {
        Set<Integer> values = new HashSet<>();                            //Creates Set
        values.add(1);                                                   // Adds 1st element to Set
        values.add(2);                                                  // Adds 2nd element to Set
        Assertions.assertTrue(values.contains(1));                     // Tests that the Set contains element 1
    }

    @Test
    public void MapAddTest()
    {
        Map element = new HashMap();                                 //Creates Map
        Assertions.assertEquals(0,element.size());          // Tests that Map is empty
        element.put("MyName","Devon");                        // Adds 1st element to Map
        element.put("MySurname","May");                      // Adds 2nd element to Map
        Assertions.assertEquals(2,element.size());        // Tests that 2 elements is added
    }
    @Test
    public void MapRemoveTest()
    {
        Map element = new HashMap();                                //Creates Map
        element.put("MyName","Devon");                       // Adds 1st element to Map
        element.put("MySurname","May");                     // Adds 2nd element element to Map
        Assertions.assertEquals(2,element.size());       // tests that 2 elements is added
        element.remove("MyName","Devon");                 // Removes  2nd element from Map
        Assertions.assertEquals(1,element.size());      // Tests that 1 element is in Map
    }

    @Test
    public void MapFindTest()
    {
        Map element = new HashMap();                                                     //Creates Map
        element.put("MyName","Devon");                                             // Adds 1st element to Map
        element.put("MySurname","May");                                           // Adds 2nd element element to Map
        Assertions.assertTrue(element.containsKey("MySurname"));                    // Tests that the Map contains element MySurname
    }

}