
package com.mycompany.lab10;

import java.util.Stack;


public class Postfix {
    private final String input;

    public Postfix(String input) {
        this.input = input;
    }
    
    public int evalPostfix() 
    { 
        Stack<Integer> stack = new Stack<>(); 
        int count = 0;
        int[] arr = new int[10];
        for(int i=0; i < input.length();i++)
        {
            char ch = input.charAt(i);
            if(Character.isDigit(ch))
            {
               arr[count] = ch - '0';
                count++;
            }
        }
        for(int j = count - 1; j>=0; j--)
        {
             stack.push(arr[j]);
        }
        
        for(int i=0; i < input.length(); i++)
        { 
            char ch0 = input.charAt(i);
            if(Character.isDigit(ch0));
            else
            {
                int b=stack.pop();
                int a=stack.pop();
                switch(ch0) 
                { 
                    case '+': 
                    stack.push(b + a); 
                    break; 
                      
                    case '-': 
                    stack.push(b - a); 
                    break; 
                        
                    case '*': 
                    stack.push(b * a); 
                    break; 
                    
                    case '/': 
                    stack.push(b/a);
                    break; 
                    
                    default:
                    break;
              }
            }
        } 
        return stack.pop(); 
    } 
    
}
