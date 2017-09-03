package Java_Classes;

import java.util.HashSet;
import java.util.Iterator;
public class Java_HashSet {

	public Java_HashSet() {
		// Constructor for Java_Hashset calss
		System.out.println("Constructor for Java_HashSet");
	}

	public static void main(String[] args) {
		// main method of Java_HashSet
		HashSet <Object> newHashSet = new HashSet<Object>();
		int iItr = 100;
		
		//adding values into the hash set
		System.out.println("Adding values into the HashSet");
		while(iItr>=0){
			newHashSet.add(Math.random()*(100));
			iItr-=1;
		}
		
		//reading values from the hash set
		System.out.println("Reading values from the hash set");
		
		//create a list iterator to read values form the hash set
		Iterator <Object> newHashsetIterator = newHashSet.iterator();  
		while(newHashsetIterator.hasNext()){
			System.out.println(newHashsetIterator.next());
		}
		
	}

}
