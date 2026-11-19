import java.util.*;
public class Calculator_using_Interfaces {
    @FunctionalInterface 
    interface Cal{
        int calculate(int a, int b);
    }
    public static void main(String[] args){
      Cal add=(a,b)->a+b;
      Cal mul=(a,b)->a*b;
    }
}
