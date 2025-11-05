import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {
	public static void main(String[] args) {
		
		
//		List<Integer> a = Arrays.asList(10,20,30,40,50,60,70);
//		
//		   
//		List<Integer> b =  a.stream().map((ele)->ele*ele).collect(Collectors.toList());
//		System.out.println(b);
		
		
		List<String> subjects = Arrays.asList("Java","Php","Python","Node","android");
		
		List<String> s = subjects.stream().map((ele)->ele.toUpperCase()).collect(Collectors.toList());
		System.out.println(s);
		
		List<Integer> i = subjects.stream().map((ele)->ele.length()).collect(Collectors.toList());
		System.out.println(i);
		
		List<String> k = subjects.stream().filter((ele)->ele.contains("a")).collect(Collectors.toList());
		System.out.println(k);
		
		
		List<Integer> a = Arrays.asList(1,5,6,9,7,4,6,9,8,2,3,5);
		
		List<Integer> c = a.stream().filter((ele)->ele%2!=0).collect(Collectors.toList());
		System.out.println(c);
		
		
	}
}
