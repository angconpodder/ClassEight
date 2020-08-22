package javaCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {

	public static void main(String[] args) {
		
		
		//Array: 1. By knowing the values
		String[] Students = {"Tom", "Tim", "Jane"};
		
		//2. By knowing the number of values
		String[] names = new String[5];
		names[3] = "jsdhfsd";
		
		
		//ArrayList = dynamic in size
		
		//Formula:
		//List<ObjectDataType> identifier = new TypeOfList<ObjectDataType>();
		
		//List<Integer> al = new ArrayList<Integer>();
		
		//ArrayList<Integer> al4 = new ArrayList<Integer>();
		
		//List<Boolean> al3 = new ArrayList<Boolean>();
		
		List<String> tf = new ArrayList<String>();
		tf.add("ALM");
		tf.add("CNS");
		tf.add("SQL");
		tf.add("JAVA");
		tf.add("SDLC");
		tf.add("ALM");
		tf.add("Selenium");
		tf.add("DevOps");
		tf.add("JavaDev");
		tf.add("GitHub");
		tf.add("Manual");
		tf.add("Jenkins");
		
		System.out.println(tf.size());
		tf.remove(2);
		System.out.println(tf.size());
		System.out.println(tf.get(2));
		
		System.out.println("=========================");
		
		for(String item : tf){
			System.out.println(item);
		}

	}

}
