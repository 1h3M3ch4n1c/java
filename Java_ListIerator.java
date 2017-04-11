package Java_Classes;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class Java_ListIerator {

	public Java_ListIerator() {
		//constructor for Java_ListIterator
		System.out.println("Constructor for Java_ListIterator");
	}

	public static void main(String[] args) {
		//main method of class
		Java_LinkedList_Version_Two LinkedListOne = new Java_LinkedList_Version_Two();
		
		//create a LinkedList
		LinkedList <Object> NewLinkedList = new LinkedList<Object>();  
		
		//create a new linked list
		NewLinkedList = LinkedListOne.createNewLinkedList();
		
		//add values into the linked list
		LinkedListOne.addValuesInteger(NewLinkedList);
		LinkedListOne.addValuesInteger(NewLinkedList);
		LinkedListOne.addValuesInteger(NewLinkedList);
		
		//display values from the linked list
		LinkedListOne.displayValues(NewLinkedList);
		
		//making the LinkedList as Iterator
		ListIterator <Object> listLinkedListOne = NewLinkedList.listIterator(); 
		
		//looping through the elements
		System.out.println("Looping through the list");
		while (listLinkedListOne.hasNext()){
			System.out.println(listLinkedListOne.next());
		}
		
		//looping through the elements
		System.out.println("Looping through the list");
		while (listLinkedListOne.hasPrevious()){
			System.out.println(listLinkedListOne.previous());
		}
		
		
		//List Iterator for ArrayList
		Java_ArrayList_VersionTwo ArrayListOne = new Java_ArrayList_VersionTwo();
		
		//Create a ArrayList
		ArrayList <Object> NewArrayList = new ArrayList <Object>();
		
		//Create a new ArrayList using the methods
		NewArrayList = ArrayListOne.createArrayList();
		
		//add elements into the array list
		ArrayListOne.addValues(NewArrayList);
		
		//display elements from the array list
		ArrayListOne.displayValues(NewArrayList);
		
		//remove values from the array list
		ArrayListOne.removeValue(NewArrayList, 4);
		
		//display values from the array list
		ArrayListOne.displayValues(NewArrayList);
		
		//Clear the array list
		ArrayListOne.clearValues(NewArrayList);
		
		//display values from the array list
		ArrayListOne.displayValues(NewArrayList);
		
		//add values into the array list
		ArrayListOne.addValues(NewArrayList);
		
		//display values from the array list
		ArrayListOne.displayValues(NewArrayList);
		
		//set a new value at index 6
		ArrayListOne.setValue(NewArrayList, 6, (int )(Math.random()*100));
		
		//display values from the array list
		ArrayListOne.displayValues(NewArrayList);
	}

}
