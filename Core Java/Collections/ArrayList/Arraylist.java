import java.util.*;

public class helloworld {

	public static void main(String[] args) {
		
//		Here the declaration of an arralist can be made without size when the size is unknown
//		like that of vector class in C++ you do, right, and in that case the size will automatically
//		shrink or expand as per requirements by half and twice.
//		Also, you can specify the size as well.
//		Also, collections in java as arraylist and others do not work with primitive data types 
//		instead with objects.
		
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("I");
		arr.add("currently");
		arr.add("work");
		arr.add("at");
		arr.add("Albanero");
		ArrayList<String> arr2=new ArrayList<String>();
		arr2.add("as");
		arr2.add("a");
		arr2.add("SDP");
		arr2.add("fellow");
//		You can have add and addAll method to insert element at the end of arraylist
//		and in case you want to insert at some position you can specify the index first and value 
//		second after add and addAll method
		arr.addAll(arr2);
		System.out.println(arr);
		
		
		arr.remove(1);
		System.out.println(arr);
//		.remove() method is used to remove element from the arraylist 
//		and element to be removed can be passed with value or its index,
//		and after removal all other elements come a step back to occupy the erased position
//		.removeall to remove a part of collection from the merged collection
		arr.remove("a");
		System.out.println(arr);
		arr.removeAll(arr2);
		System.out.println(arr);
		
		arr.addAll(arr2);
		System.out.println(arr);
		
//		iteration can be done with for loop using size value of arraylist or using colon
//		operator
		int len=arr.size();
		for(int i=0;i<len;i++) {
			System.out.println(arr.get(i));
		}
		for(String s:arr) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//set method is used to set value at any index
		//removing previous value
		arr.set(1, "currently");
		System.out.println(arr);
		
		arr.add(2,"work");
		System.out.println(arr);
		
//		If want to convert into array to the collections,
//		.toarray method can be used.
		
//		to check if arraylist is empty
		
		System.out.println(arr.isEmpty());
		
		
		//		contains method is used to check if a value or an element is contained in it or not
		System.out.println("arraylist contains albanero:  "+arr.contains("Albanero"));

		
//		to sort the elements of arraylist like that of in vector 
//		we call collection framework and then provide value of our 
//		arraylist
		Collections.sort(arr);
		System.out.println(arr);
		
//		rotate method is to rotate an entire collection by the number of times you want it to 
//		get rotated.
		Collections.rotate(arr, 1);
		System.out.println(arr);
		
//		.fill() method is used to fill entire collections with some specific values
		Collections.fill(arr,"valueReplaced");
		System.out.println(arr);
		
//		.clear() method is to clear up entire arraylist
		arr.clear();
		System.out.println(arr.isEmpty());
		
		
		
		

	}

}
