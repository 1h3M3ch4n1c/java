package Java_Classes;

//importing the necessary classes
import java.util.ArrayList;

public class Java_ArrayList {

	public Java_ArrayList() {
		//Constructor of the Jav_ArrayList class
		System.out.println("Constructor is created");
	}
	//Creating the ArrayList
	ArrayList <Integer> newArrayList = new ArrayList<Integer>();
	void addValues(){
		//inserting the numbers into the arraylist
		System.out.println("Setting values into the ArrayList");
		for (int k = 0; k<10; k++){
			newArrayList.add(k);
		}
	}
	
	void dislayValues(){
		//reading the values from the arraylist
		System.out.println("Reading values from the ArrayList");
		for (int k = 0; k<newArrayList.size(); k++){
			System.out.print(newArrayList.get(k)+"\t");
		}
		System.out.println();
	}

	void removeValue(int iIndex){
		//removing the value from the arralist
		System.out.println("Removing value from the ArrayList");
		newArrayList.remove(iIndex);
	}
	
	void clearValues(){
		//clears the ArrayList
		newArrayList.clear();
	}

	public static void main(String[] args) {
		//main method of Java_ArrayList
		
		Java_ArrayList listArray = new Java_ArrayList();
		listArray.addValues();
		listArray.dislayValues();
		listArray.removeValue(2);
		listArray.dislayValues();
		listArray.clearValues();
		listArray.dislayValues();
		listArray.addValues();
		listArray.dislayValues();
	}

}
