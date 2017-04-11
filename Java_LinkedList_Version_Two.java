package Java_Classes;

import java.util.LinkedList;
public class Java_LinkedList_Version_Two {

	public Java_LinkedList_Version_Two() {
		// Constructor of Java_LinkedList_Version_Two
		System.out.println("Constructor is created");
	}
	
	public LinkedList<Object> createNewLinkedList(){
		// creating a new Linked List
		LinkedList <Object> newLinkedList = new LinkedList<Object>();
		return newLinkedList;
	}
	
	public void addValuesString(LinkedList<Object> argLinkedList){
		//adds random values into the linked list
		//in the rage(0,100)
		argLinkedList.add(Integer.toString((int )(Math.random()*100))+"element");
	}
	
	public void addValuesInteger(LinkedList<Object> argLinkedList){
		//adds random values into the linked list
		//in the rage(0,100)
		System.out.println("Adding the values into the Linked List");
		argLinkedList.add((int )(Math.random()*100));
	}

	
	public void displayValues(LinkedList<Object> argLinkedList){
		//displaying the values
		System.out.println("Displaying the values in the LinkedList");
		int iItr;
		for (iItr = 0; iItr<argLinkedList.size(); iItr++){
			System.out.println(argLinkedList.get(iItr));
		}
	}
	
	public void removeValue(LinkedList<Object> argLinkedList,int iIndex){
		//removing a value from the Linked List at index iIndex
		System.out.println("Removing the value at index"+iIndex);
		argLinkedList.remove(iIndex);
	}
	
	public void clearValues(LinkedList<Object> argLinkedList){
		//clear the LinkdeList
		System.out.println("Clearing the LinkedList");
		argLinkedList.clear();
	}
		
	public void addFirstElement(LinkedList<Object> argLinkedList){
		//adding an element at the beginning
		System.out.println("adding the element at the beginning");
		argLinkedList.addFirst((int )(Math.random()*100));;
	}
	
	public void addLastElement(LinkedList<Object> argLinkedList){
		//adding an element at the beginning
		System.out.println("adding the element at the beginning");
		argLinkedList.addLast((int )(Math.random()*100));;
	}
	
	public void setValueIndex(LinkedList<Object> argLinkedList, int iIndex){
		//setting the values at the index iIndex
		argLinkedList.set(iIndex, (int )(Math.random()*(300)));
	}
	
	
	public static void main(String[] args) {
		// main method of the class
		//Create a new LinkedList
		LinkedList <Object> mNewLinkedList = new LinkedList<Object>();
		
		Java_LinkedList_Version_Two newLinkedList = new Java_LinkedList_Version_Two();
		mNewLinkedList = newLinkedList.createNewLinkedList();

		//add values into the LinkedList
		newLinkedList.addValuesString(mNewLinkedList);
		newLinkedList.addValuesString(mNewLinkedList);
		newLinkedList.addValuesString(mNewLinkedList);
		
		//display values from the LinkedList
		newLinkedList.displayValues(mNewLinkedList);
		
		//remove value at a particular index
		newLinkedList.removeValue(mNewLinkedList,2);
		
		//add values into the LinkedList
		newLinkedList.addValuesString(mNewLinkedList);
		
		//clear the values from the LinkedList
		newLinkedList.clearValues(mNewLinkedList);
		
		//add values into the LinkedList
		newLinkedList.addValuesInteger(mNewLinkedList);
		newLinkedList.addValuesInteger(mNewLinkedList);
		newLinkedList.addValuesInteger(mNewLinkedList);
		
		//displaying the values from the LinkedList
		newLinkedList.displayValues(mNewLinkedList);
		
		//add a element at the beginning
		newLinkedList.addFirstElement(mNewLinkedList);
		
		//add a element at the end of the list
		newLinkedList.addLastElement(mNewLinkedList);
		
		//display the LinkedList
		newLinkedList.displayValues(mNewLinkedList);
		
		//set the value at a particular index
		newLinkedList.setValueIndex(mNewLinkedList, 2);
		
		//display the LinkedList
		newLinkedList.displayValues(mNewLinkedList);
	}

}
