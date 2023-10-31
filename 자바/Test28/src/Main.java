import java.util.*;

public class Main {

	public static void main(String[] args) {
		LinkedList<Character> linkedlist = new LinkedList<>();
		
		linkedlist.add('K');
		linkedlist.add('O');
		linkedlist.add('R');
		linkedlist.add('E');
		linkedlist.add('A');
		
		for(int i = 0; i<linkedlist.size(); i++) {
			System.out.print(linkedlist.get(i) + " ");
		}
		System.out.println();
		
		System.out.println(Collections.max(linkedlist));
		System.out.println(Collections.min(linkedlist));
		
		Collections.sort(linkedlist);
		for(int i = 0; i<linkedlist.size(); i++) {
			System.out.print(linkedlist.get(i) + " ");
		}
		System.out.println();
		
		
		System.out.println(Collections.binarySearch(linkedlist, 'I'));	// 몇 번째 인덱스에 있는지 알려줌(0부터 시작)
		
		Collections.reverse(linkedlist);	// 역순
		for(int i = 0; i<linkedlist.size(); i++) {
			System.out.print(linkedlist.get(i) + " ");
		}
		System.out.println();
	}

}
