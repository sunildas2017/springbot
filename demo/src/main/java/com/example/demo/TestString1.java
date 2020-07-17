package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestString1 {

	public static void countFrequencies(ArrayList<String> list) 
    { 
  
        // hash set is created and elements of 
        // arraylist are insertd into it 
        Set<String> st = new HashSet<String>(list); 
        for (String s : st) 
            System.out.println(s + ": " + Collections.frequency(list, s)); 
    } 
  
    public static void main(String[] args) 
    { 
		/*
		 * ArrayList<String> list = new ArrayList<String>(); list.add("Geeks");
		 * list.add("for"); list.add("Geeks"); countFrequencies(list);
		 */
        
        int[] a = new int[]{1,2,3,2,4,1,1};
		/*
		 * Map<Integer , String> m = Arrays.stream(a) .sorted() .collect((Supplier<R>)
		 * Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 */
        
    } 
    public HashMap returnGroup(int[] a){
    	  
        if( a == null)
          return null;
        
        if( a.length == 0 )
          return null;
        
        HashMap m = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
        	if(m.containsKey(a[i])){
            m.put(a[i], m.get(a[i]));
          } else {
            m.put(a[i], 1);
          }
        }
        
        return m;
      }

}
