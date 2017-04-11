package Java_Classes;

import java.util.ArrayList;

public class Java_ArrayList_VersionTwo {

	public Java_ArrayList_VersionTwo() {
		// creating the constructor
		System.out.println("This is the default constructor");
	}
	
	
	public ArrayList<Object> createArrayList(){
		ArrayList<Object> newArrayList = new ArrayList<Object>();
		return newArrayList;
	}
	
	void addValues(ArrayList<Object>argArrayList){ 
		//adding the values into the ArrayList
		System.out.println("Adding the values in the ArrayList");
		int iMin, iMax;
		iMin = 0;
		iMax = 100;
		for (int iItr = 0; iItr < 10; iItr++){
			argArrayList.add(iItr, (int )(Math.random()*(iMax-iMin)));
		}
	}
	
	void displayValues(ArrayList<Object> argArrayList){
		//displaying the values in the ArrayList
		System.out.println("Displaying the values in the ArrayList");
		for (int iItr = 0;iItr<argArrayList.size(); iItr++){
			System.out.print(argArrayList.get(iItr)+"\t");
		}
		System.out.println();
	}
	
	void clearValues(ArrayList<Object> argArrayList){
		//clearing the values in the ArrayList
		System.out.println("Clearing the values in the ArrayList");
		argArrayList.clear();
	}
	
	void removeValue(ArrayList<Object> argArrayList,int iIndex){
		//clearing the values in the ArrayList
		System.out.println("Removing the value in the ArrayList at index:"+iIndex);
		argArrayList.remove(iIndex);
	}
	
	void setValue(ArrayList<Object> argArrayList,int iIndex,Object oObject){
		//set the value in the ArrayList
		System.out.println("setting the value at the index "+iIndex);
		argArrayList.set(iIndex, oObject);
	}
	

	public static void main(String[] args) {
		// main method of Class
		ArrayList <Object> newList = null;
		//creating the object of the class Java_ArrayList_VersionTwo
		Java_ArrayList_VersionTwo ListOne = new Java_ArrayList_VersionTwo();
		newList = ListOne.createArrayList();
		ListOne.addValues(newList);
		ListOne.displayValues(newList);
		ListOne.removeValue(newList, 5);
		ListOne.displayValues(newList);
		ListOne.clearValues(newList);
		ListOne.displayValues(newList);
		System.out.println(newList.isEmpty());
		ListOne.addValues(newList);
		System.out.println(newList.get(4));
		System.out.println(newList.isEmpty());
		System.out.println(newList.indexOf(newList.get(4)));
		System.out.println(newList.contains(newList.get(4)));
		ListOne.displayValues(newList);
		ListOne.setValue(newList, 5, (int )(Math.random()*100));
		ListOne.displayValues(newList);
	}

}
