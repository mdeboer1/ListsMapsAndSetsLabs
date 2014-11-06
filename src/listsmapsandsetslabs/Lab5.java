/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listsmapsandsetslabs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author mdeboer1
 */
public class Lab5 {
    public static void main(String[] args) {
       
        Employee emp1 = new Employee("Smith", "Mark", "111-11-1111");
        Employee emp2 = new Employee("Jones", "Steve", "222-11-1111");
        Employee emp3 = new Employee("Adams", "Bob", "333-11-1111");
        Employee emp4 = new Employee("White", "Sue", "111-11-1111");
        Employee emp5 = new Employee("Anderson", "Neo", "333-33-3333");
        
        Map map = new HashMap();
        
        // I used SSN as the key as it is the unique identifier that we used in 
        // the overridden .equals method in the Employee class.  It Employee class
        // had an employee ID property, I would have selected that as it is not
        // as sensitive information as SSN is
        map.put(emp1.getSsn(), emp1);
        map.put(emp2.getSsn(), emp2);
        map.put(emp3.getSsn(), emp3);
        map.put(emp4.getSsn(), emp4);
        
        // Sort through map to see what was accepted, since emp1 and emp4 have
        // a matching SSN, it eliminates emp1 from the Map.
        System.out.println("Print out contents of map via the key.");
        Set keys = map.keySet();
        for (Object key : keys){
            System.out.println(map.get(key));
        }
        //Print out the values
        System.out.println("\nPrint out contents of map via the value");
        Collection values = map.values();
        for (Object employee : values){
            System.out.println(employee.toString());
        }
        
        System.out.println("\nPrint out contents of map via key after emp5 added.");
        // Add a new employee at the second spot in the Map
        // The next line of code replaces the key and value at when emp2 ssn
        // matches a key in the map.
        // Put method returns the key and value, but I am not storing the returned
        // info so it is discarded.
        map.put(emp2.getSsn(), emp5);

        // Print out the keys in the Map
        for (Object key : keys){
            System.out.println(map.get(key));
        }
        //Print out the values
        System.out.println("\nPrint out contents of map via value after emp5 added.");
        for (Object employee : values){
            System.out.println(employee.toString());
        }
    }
}
