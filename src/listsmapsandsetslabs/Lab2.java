/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listsmapsandsetslabs;

import java.util.*;

/**
 *
 * @author mdeboer1
 */
public class Lab2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Employee emp1 = new Employee("Smith", "Mark", "111-11-1111");
        Employee emp2 = new Employee("Jones", "Steve", "222-11-1111");
        Employee emp3 = new Employee("Adams", "Bob", "333-11-1111");
        Employee emp4 = new Employee("White", "Sue", "111-11-1111");
        
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        
        System.out.println("The list size is " + list.size());
        
        // The line below, when uncommented, creates a checked error due to the
        // need to cast the object in the list to type Employee, see next line
//        Employee emp5 = list.get(1);
        // Proper, and needed casting due to non-generics used with List
        Employee emp5 = (Employee)list.get(1);
        
        System.out.println("Employee at index 1 is " + emp5.toString());
        
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
