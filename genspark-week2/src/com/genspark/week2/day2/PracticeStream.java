package com.genspark.week2.day2;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeStream {
	public static void main(String[] args) {
try {
	String fileName="C:\\\\genspark\\\\genspark-training\\\\genspark-week2\\\\src\\\\com\\\\genspark\\\\week2\\\\day2\\\\words2";
	Stream<String> stream= Files.lines(Paths.get(fileName));
	List<String> list=stream.limit(10).flatMap(line->Arrays.stream(line.trim().split(" ")))
			.filter(word->word.length()>0)
			.collect(Collectors.toList());
	System.out.println(list);

	Set<String>uniqueName=new HashSet();
	list.stream().filter(name->uniqueName.add(name))
	.collect(Collectors.toSet());
	Map<String,Long>mapName=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	Set<String>sName=mapName.entrySet().stream().filter(entry->entry.getValue()>1).map(entry->entry.getKey()).collect(Collectors.toSet());
	System.out.println(mapName);
	System.out.println(sName);
	System.out.println("Another Way of Streaming");
	Set<String>set1=list.stream().filter(name->Collections.frequency(list, name)==1).collect((Collectors.toSet()));
	System.out.println(set1);
}catch(Exception e)
{

}

String string1="sammmm";
System.out.println(IntStream.range(0,string1.length()/2).noneMatch(i->string1.charAt(i)!=string1.charAt(string1.length()-i-1)));
	}
}
