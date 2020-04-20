package edu.ucsb.cs56.w16.sparkjava;

import static spark.Spark.*;
import java.io.*; 

import java.util.*;
public class SparkHello {
    public static void main(String[] args) {
        
get("/hello", (req, res) -> "Hello World");
get("/hello", (req, res) -> "Hello World");
get("/hello", (req, res) -> "Hello World");
int a=10;
int b=10;
int c=a+b;
int d=a-b;
  //BufferedReader br = new BufferedReader(new FileReader("D:\\test.txt"));
    //    System.out.println(br.readLine());

System.out.println("Addition is "+c);
System.out.println("substraction is "+d);

String ptr = null; 
  
        // Checking if ptr.equals null or works fine. 
        try
        { 
            // This line of code throws NullPointerException 
            // because ptr is null 
            if ("gfg".equals(ptr)) 
                System.out.print("Same"); 
            else 
                System.out.print("Not Same"); 
        } 
        catch(NullPointerException e) 
        { 
            System.out.print("NullPointerException Caught"); 
        }
    }
}
