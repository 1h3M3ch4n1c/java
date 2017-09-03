package Java_Classes;

import java.util.LinkedList;
public class Java_LinkedList {

	public Java_LinkedList() {
		//Default constructor of Java_LinkedList
		
	}

	public static void main(String[] args) {
		//main method of Java_LinkedList class
	
		//creating a LinkedList
		LinkedList<Integer> newLinkedList = new LinkedList<Integer>();
		
		//adding random values into Linked List
		int iMin = 0, iMax = 100;
		int iItr = 100;
		System.out.println("Adding the values in the LinkedList");
		while (iItr > 0){
			newLinkedList.add((int )(Math.random()*(iMax-iMin)));
			iItr -= 1;
		}
		
		//displaying the values from the LinkedList
		System.out.println("Displaying the values from the LinkedList");
		iItr = 0;
		while(iItr < newLinkedList.size()){
			System.out.print(newLinkedList.get(iItr)+"\t");
			iItr += 1;
		}
	}

}
