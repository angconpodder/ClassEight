package javaCollection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> tf = new TreeSet<String>();
		
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
		tf.add("ALM");
		
		System.out.println(tf.size());
		tf.remove("Jenkins");
		System.out.println(tf.size());
		
		System.out.println("=========================");
		
		for(String item : tf){
			System.out.println(item);
		}
		
		System.out.println("=========================");
		
		Object[] abc = tf.toArray();
		System.out.println(abc[3]);
		
		
	}

}
