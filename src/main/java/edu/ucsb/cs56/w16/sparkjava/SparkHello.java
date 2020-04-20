package edu.ucsb.cs56.w16.sparkjava;

import static spark.Spark.*;
import java.io.*; 

import java.util.*;
public class SparkHello {
    public static void main(String[] args) {
        
get("/hello", (req, res) -> "Hello World");

    }
}
