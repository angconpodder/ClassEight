package javaCollection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> tf = new HashMap<Integer, String>();
		
		tf.put(0,"ALM");
		tf.put(1,"CNS");
		tf.put(2,"SQL");
		tf.put(3,"JAVA");
		tf.put(4,"SDLC");
		tf.put(5,"ALM");
		tf.put(6,"Selenium");
		tf.put(0,"DevOps");
		tf.put(8,"JavaDev");
		tf.put(9,"GitHub");
		tf.put(10,"Manual");
		tf.put(11,"Jenkins");
		tf.put(12,"ALM");
		
		System.out.println(tf.size());
		tf.remove(5);
		System.out.println(tf.get(0));
		System.out.println(tf.size());
		
		System.out.println("=========================");
		
		for(Integer item : tf.keySet()){
			System.out.println(item);
		}
		
		for(Entry<Integer, String> item : tf.entrySet()){
			System.out.println(item);
		}
	}

}
