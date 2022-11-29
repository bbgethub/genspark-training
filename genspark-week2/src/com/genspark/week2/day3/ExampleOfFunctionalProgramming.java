package com.genspark.week2.day3;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExampleOfFunctionalProgramming {

	public static void main(String[] args) {
		// Example for Predicate 		
		Predicate<String> start = text -> text.startsWith("Hi");
	    Predicate<String> end = text -> text.endsWith("Bye");
	    Predicate<String> checkboth= start.and(end);
	    Predicate<String> checkone= start.or(end);
	    //Test with positive result
	    String testString = "Hi Welcome All.Have a wonderful Day! Bye";
	    System.out.println(testString+"\n"+"Check and :"+checkboth.test(testString));
	    System.out.println("Check or :"+checkone.test(testString));
	  //Test with negative result
	    testString = "Welcome All.Have a wonderful Day! Bye";
	    System.out.println(testString+"\n"+"Check and :"+checkboth.test(testString));
	    System.out.println("Check or :"+checkone.test(testString));
	    
	    //Currying
	    Function<String, Function<String, String>> concatCurried= a -> b -> a + b;      																		
        System.out.println("concatTraditional: "+ concatTraditional("A", "B"));                  
        System.out.println("concatCurried: " + concatCurried.apply("A").apply("B"));
                   
	    //Function Composition
	    Function<Integer, Integer> multiply = x -> x*2;
	    Function<Integer, Integer> sub = x -> x  - 2;
	    Function<Integer, Integer> MultiplyThenSubstract = multiply.compose(sub);
	    Function<Integer, Integer> FirstSubstractThenMultiply = multiply.andThen(sub);
	    System.out.println("Example for compose:Multiply Then Substract");
	    System.out.println(MultiplyThenSubstract.apply(10));
	    System.out.println("Example for andThen: First Substract Then Multiply");
	    System.out.println(FirstSubstractThenMultiply.apply(10));
	    
	    //Monads
	    Optional<String> concat = Optional.of("A")
	                                      .flatMap(a -> Optional.of("B")
	                                      .flatMap(b -> Optional.of(a + b)));
	        
	        System.out.println("Example for Monads: "+concat.get());
	        System.out.println("Factorial using recursion :"+ factorialRec(5));
	  
	}
	 public static String concatTraditional(String a, String b) {
	        return a + b;
	    }
	 //Recursion
     static long factorialRec(long num){
           return num == 1 ? 1 : num * factorialRec(num - 1);
     }

}
