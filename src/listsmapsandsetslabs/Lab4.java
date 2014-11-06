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
public class Lab4 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        
        Employee emp1 = new Employee("Smith", "Mark", "111-11-1111");
        Employee emp2 = new Employee("Jones", "Steve", "222-11-1111");
        Employee emp3 = new Employee("Adams", "Bob", "333-11-1111");
        Employee emp4 = new Employee("White", "Sue", "111-11-1111");
        
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        
        System.out.println("The size of the List is " + list.size());
        
        //No castin is needed here since we used generics with the List above
        Employee emp5 = list.get(1);
        
        System.out.println("The Employee at index 1 is " + emp5.toString());
        
        System.out.println("This shows the duplicates still exist:");
        for (Employee e : list){
            System.out.println(e.toString());
        }
        
        System.out.println("This shows the duplicates have been removed based"
                + "upon SSN duplication.");
        
        Set<Employee> set = new HashSet<>(list);
        list = new ArrayList<>(set);
        
        for (Employee e : list){
            System.out.println(e.toString());
        }
        
        System.out.println("The size of the list is now " + list.size());
    }
}
