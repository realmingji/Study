import java.util.*;
// ArrayList
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arraylist = new ArrayList<>();
		
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(null);
		arraylist.add(50);
		arraylist.add(2, 30);
		
		System.out.println(arraylist.size());	// 5 출력
		
		for(int i = 0; i<arraylist.size(); i++) {
			System.out.print(arraylist.get(i) + " ");
		}
		
		arraylist.remove(3);
		arraylist.add(3, 40);
		System.out.println();
		
		for(int i = 0; i < arraylist.size(); i++) {
			System.out.print(arraylist.get(i)+ " ");
		}
		
		arraylist.clear();
		System.out.print(arraylist.size());

	}

}
