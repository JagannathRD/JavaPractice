import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//Write Program in Java to achieve following objective

//Sample Input Data:
//
//0,1,2,3,4,5,11,12,13,14,21,22,23,24,33,31,32,41,43,45,46,55,56,54,65,64,63,76,78,87,89,90,91,100
//
//Performfollowing Operations:
//
//1. Store the data inside LinkedList of Java Collection 
//
//2 .Implement the logic in Java8 to sort the data in descending order
//
//3. Traverse in forward and reverse direction
//
//4. Implement the logic in Java to filter out the data between 12 to 64 use Stream API
public class TechM {
	public static void main(String[] args) {
		List<Integer> list= new LinkedList<>(Arrays.asList(0,1,2,3,4,5,11,12,13,14,21,22,23,24,33,31,32,41,43,45,46,55,56,54,65,64,63,76,78,87,89,90,91,100));
		list.sort((i,j)->j.compareTo(i));
		list.forEach(System.out::println);
		System.out.println("");
		
//		Iterator<Integer> iterator=list.iterator();
//		while(iterator.hasNext()) {
//			System.out.print(iterator.next()+" ");
//			
//		}
//		System.out.println("");
		ListIterator<Integer> iterator2= list.listIterator();
		while(iterator2.hasPrevious()) {
			System.out.print(iterator2.previous()+" ");
		}
		System.out.println("");
		
		list.stream().filter(i->i>12).filter(i->i<64).forEach(System.out::println);
	}

}
