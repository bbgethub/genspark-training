package practiceFunctionalProgram;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTester {

	public static void main(String[] args) {
		Predicate<String> hasName = text -> text.contains("name");
	      Predicate<String> hasPassword = text -> text.contains("password");
	      Predicate<String> hasBothNameAndPassword = hasName.and(hasPassword);
	      String queryString = "name=test;password=test";
	      System.out.println(hasBothNameAndPassword.test(queryString));
	      
	      Function<Integer, Integer> multiply = t -> t *3;
	      Function<Integer, Integer> add = t -> t  + 3;
	      Function<Integer, Integer> FirstMultiplyThenAdd = multiply.compose(add);
	      Function<Integer, Integer> FirstAddThenMultiply = multiply.andThen(add);
	      System.out.println(FirstMultiplyThenAdd.apply(3));
	      System.out.println(FirstAddThenMultiply.apply(3));
	}

}
