import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		/*
		 * Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9); stream.forEach(p ->
		 * System.out.println(p));
		 */

		 List<Integer> list = new ArrayList<Integer>();
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
         
         Stream<Integer> stream = list.parallelStream();
         System.out.println(stream.filter(i -> i%2 == 0).collect(Collectors.toList()));
         //List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
         //System.out.print(evenNumbersList);
	}

}
