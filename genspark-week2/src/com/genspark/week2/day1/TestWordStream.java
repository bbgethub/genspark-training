package com.genspark.week2.day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestWordStream {
	
	 

	public static void main(String[] args) {
		Predicate<String> isPallindrome =  inObj -> inObj.equalsIgnoreCase(new StringBuilder(inObj).reverse().toString()) ;
		
		Consumer<Entry<Integer, Long>> printEntry =  (entry) -> System.out.println("There are " + entry.getValue() +" , " + entry.getKey() + " Lettered Words") ;
		
		Function<String, Map<Character, Long>> letters = (inputString) -> inputString.toLowerCase()
				.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c ->c, Collectors.counting())); 
		
		String fileName="C:\\\\genspark\\\\genspark-training\\\\genspark-week2\\\\src\\\\com\\\\genspark\\\\week2\\\\day1\\\\words";
		// TODO Auto-generated method stub
		try {
		  System.out.println("Printing count of words Started ###");

		  System.out.println(readWords("C:\\genspark\\genspark-training\\genspark-week2\\src\\com\\genspark\\week2\\day1\\words"));
		  
		  System.out.println("Printing first 100 words from stream started ### ");
		  printFirst100words("C:\\genspark\\genspark-training\\genspark-week2\\src\\com\\genspark\\week2\\day1\\words");
		  
		  
		  System.out.println("Printing All Words with atleast 22 letters started ### ");
		  printAllWordswithAtleast22Letters("C:\\genspark\\genspark-training\\genspark-week2\\src\\com\\genspark\\week2\\day1\\words");
		  
		  
		  System.out.println("Printing some Words with atleast 22 letters started ### ");
		  printSomeWordswithAtleast22Letters("C:\\genspark\\genspark-training\\genspark-week2\\src\\com\\genspark\\week2\\day1\\words");
		  

		  System.out.println("Printing pallindromes started ### ");
		  long starttime = System.currentTimeMillis();
		  printPallindromes("C:\\genspark\\genspark-training\\genspark-week2\\src\\com\\genspark\\week2\\day1\\words",isPallindrome);
		  System.out.println("Printing pallindromes Time Taken in normal version  ### "+ (System.currentTimeMillis()-starttime));	
		  
		  
		  System.out.println("Printing pallindromes parallel version started ### ");
		  starttime = System.currentTimeMillis();
		  printPallindromesParallelVersion("C:\\genspark\\genspark-training\\genspark-week2\\src\\com\\genspark\\week2\\day1\\words",isPallindrome);
		  System.out.println("Printing pallindromes Time Taken in parallel version  ### "+ (System.currentTimeMillis()-starttime));
		  
		  
		  System.out.println("Printing Word Length Operations Started ### ");
		  System.out.println("Max "+ findMaxLengthWordStream(fileName));
		  System.out.println("Min "+ findMinLengthWordStream(fileName));
		  findAverageWordLengthStream(fileName);
		  
		  
		  System.out.println("Printing word groups by length Started ### ");
		  groupingWordsByLength(fileName,printEntry);
		  
		  System.out.println("Printing Char Count Started ### ");  
		  groupingWordsByChars(fileName,letters);
		  
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static Stream<String> readFile(String s) throws IOException{		
		Stream<String> stream = Files.lines(Paths.get(s));
		return stream;	
	}

	
	public static long readWords(String filePath) throws IOException {

	       long count = readFile(filePath)	    		   
	                .flatMap(line -> Arrays.stream(line.trim().split(" ")))
	               // .peek(System.out::println)
	                .filter(word -> word.length() > 0)	             
	                .collect(Collectors.counting());
	       
		return count;
	}
	
	public static long printFirst100words(String filePath) throws IOException{		
		return readFile(filePath)
				.limit(100)
				.flatMap(line->Arrays.stream(line.trim().split(" ")))
				.filter(word->word.length()>0)
				.peek(System.out::println)
				.collect(Collectors.counting());		
	}
	
	public static long printAllWordswithAtleast22Letters(String filePath) throws IOException{		
		return readFile(filePath)
				.flatMap(line->Arrays.stream(line.trim().split(" ")))
				.filter(word->word.length()>0 && word.length()>=22)
				.peek(System.out::println)
				.collect(Collectors.counting());		
	}

	public static long printSomeWordswithAtleast22Letters(String filePath) throws IOException{		
		return readFile(filePath)
				.limit(10000)
				.flatMap(line->Arrays.stream(line.trim().split(" ")))
				.filter(word->word.length()>0 && word.length()>=22)
				.peek(System.out::println)
				.collect(Collectors.counting());		
	}
	
	public static long printPallindromes(String filePath,Predicate<String> isPallindrome) throws IOException{		
		return readFile(filePath)				
				.flatMap(line->Arrays.stream(line.trim().split(" ")))
				.filter(word->word.length()>1)
				.filter(isPallindrome)
				.peek(System.out::println)
				.collect(Collectors.counting());		
	}
	
	public static long printPallindromesParallelVersion(String filePath,Predicate<String> isPallindrome) throws IOException{		
		return readFile(filePath)
				.parallel()
				.flatMap(line->Arrays.stream(line.trim().split(" ")))
				.filter(word->word.length()>1)
				.filter(isPallindrome)
				.peek(System.out::println)
				.collect(Collectors.counting());		
	}
	
	
	public static Integer findMaxLengthWordStream(String filePath) throws IOException{		
		return readFile(filePath)
				.parallel()
				.flatMap(line->Arrays.stream(line.trim().split(" ")))
				.filter(word->word.length()>0)
				.map(x->x.length())
				//.max(Comparator.comparing(i -> -i));
				.max(Integer::compare).get();
						
	}
	
	public static Integer findMinLengthWordStream(String filePath) throws IOException{		
		return readFile(filePath)
				.parallel()
				.flatMap(line->Arrays.stream(line.trim().split(" ")))
				.filter(word->word.length()>0)
				.map(x->x.length())
				.min(Integer::compare).get();
						
	}
	
	public static void findAverageWordLengthStream(String filePath) throws IOException{		
		IntSummaryStatistics stats = readFile(filePath)
				.parallel()
				.flatMap(line->Arrays.stream(line.trim().split(" ")))
				.filter(word->word.length()>0)
				.map(x->x.length())
				.mapToInt(Integer::intValue)
				//.max(Comparator.comparing(i -> -i));
				.summaryStatistics();
		System.out.println("Printing Average from Stats "+stats.getAverage());
		System.out.println("Printing Max from Stats "+stats.getMax());
		System.out.println("Printing Min from Stats "+stats.getMin());
	}

	
	public static void groupingWordsByLength(String filePath, Consumer<Entry<Integer, Long>> entry) throws IOException{		
		Map<Integer, Long> wordLengthMap = readFile(filePath)
				.collect(Collectors.groupingBy(String::length,Collectors.counting()));		
		wordLengthMap.entrySet().stream().peek(entry).collect(Collectors.counting());
	}
	
	public static void groupingWordsByChars(String filePath,Function<String, Map<Character, Long>> letters) throws IOException{		
		readFile(filePath)
				.limit(100)
				.flatMap(line->Arrays.stream(line.trim().split(" ")))
				.filter(word->word.length()>0)
				.peek(System.out::println)
				.map(letters)
				.peek(System.out::println)
				.collect(Collectors.counting());		
	}
	
//	public static Map<Character, Long> letter(String inputString){		
//		return inputString.toLowerCase()
//		.chars()
//		.mapToObj(c -> (char) c)
//		.collect(Collectors.groupingBy(c ->c, Collectors.counting()));
//	}

	
}
