package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
         ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


         for (int i = 0; i < 10; i++){
            String s = reader.readLine();
            strings.add(s); 
            }
            
            int max = strings.get(0).length();
            int min = strings.get(0).length(); 
            int maxstr = 0;
            int minstr = 0;
        
            
            for (int k = 0; k < strings.size();k++ ) {
                if (strings.get(k).length() < min)  {
                min = strings.get(k).length();
                if( strings.get(k + 1).length() >  min)
                
                //System.out.println("Самая коротокая " + strings.get(k) + " " + minstr);
                  minstr = k;  
                    }
            }
            
            
            for (int p = 0; p < strings.size(); p++ ) {
                if (strings.get(p).length() > max) {
                max = strings.get(p).length(); 
                
               // System.out.println("Самая длинная " + strings.get(p) + " " +  maxstr);
                 maxstr = p;
                    }
            }
            if (minstr > maxstr ){
                System.out.println( strings.get(maxstr));
            }
            else{
                System.out.println(strings.get(minstr));
            }
   
    }
    
    
}
