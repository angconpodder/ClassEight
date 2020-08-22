package javaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> tf = new LinkedList<String>();
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
