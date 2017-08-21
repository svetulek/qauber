package HomeworkLevel2Class3;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList1 {

	public static void main (String arg[]) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Hello");
		obj.add("World");
		obj.add ("Class");
		
		ArrayList<String> obj1 = new ArrayList<String>();
		obj1.add("Hello");
		obj1.add("there");
		obj1.add("World");
				
		for(String i : obj) {
			for(String j : obj1)
				if(i.equals(j))
					System.out.println(i);
		}
		
		ArrayList<String> obj2 = new ArrayList<>();
		obj2.add("Hello");
		obj2.add("Hello");
		obj2.add("test");
		obj2.add("test");
		for(int i = 0; i < obj2.size() - 1; i++) {
			for(int j = i + 1; j < obj2.size(); j++)
				if(obj2.get(i).equals(obj2.get(j)))
					System.out.println(obj2.get(i));
		}
		
		HashSet<String> set = new HashSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("two");
		for(String i : set) {
			System.out.println(i);
		}
		
		
		
		
		
		
	}

}
