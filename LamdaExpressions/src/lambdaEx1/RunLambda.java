package lambdaEx1;

import java.util.stream.Stream;
import java.util.stream.IntStream;

public class RunLambda {

	public static void main(String[] args) {
		FirstFuncLambdaInterface first = () -> {
			return "Hello";
		};
		
		System.out.println(first.sayHello());
		first.sayHello11();
		
//		FirstFuncLambdaInterface first = (h) -> System.out.println(h);
//		
//		first.sayHello("Hello");
		
		ComparatorInterface removeSpaces = (m) -> {
			String converted = "";
			for(int i = 0; i < m.length(); i++) {
				if(m.charAt(i) == ' ') {
					converted += m.charAt(i + 1);
					i++;
				}else {
					converted += m.charAt(i);
				}
			}
			
			return converted;
		};
		
		ComparatorInterface removeSpaces1 = (m) -> {
			String converted = "";
			for(int i = 0; i < m.length(); i++) {
				if(m.charAt(i) != ' ') {
					converted += m.charAt(i);
				}
			}
			
			return converted;
		};
		
		ComparatorInterface reverse = (m) -> {
			String converted = "";
			for(int i = m.length()-1; i >= 0; i--) {
				converted += m.charAt(i);
			}
			
			return converted;
		};
		
		System.out.println(removeSpaces.comparator("Hello world Java is awesome"));
		System.out.println(reverse.comparator("Hello world Java is awesome"));
		
		Stream.of("Luke", "Lance", "Mike", "Bob")
		.map((str) -> {
			//System.out.println(str);
			return str;
		}).filter((str) -> str.startsWith("L"))
		.sorted()
		.forEach((str) -> System.out.println(str));
		
//		IntStream.range(0, /*people.size()*/10).filter((p) -> {
//			return people.get(p).getName().startsWith("L");
//		}).forEach((p) -> {
//			System.out.println(people.get(p).getName());
//		});
	}

}
