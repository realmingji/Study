// 링크드리스트
// 벡터는 한 쪽, 링크드리스튼 양방향
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedlist = new LinkedList<>();
		
		linkedlist.add(10);
		linkedlist.add(20);
		linkedlist.add(30);
		linkedlist.add(null);
		linkedlist.add(40);
		linkedlist.add(2, 50);
		
		System.out.println(linkedlist.size());
		
		for(int i = 0; i<linkedlist.size(); i++) {
			System.out.println(linkedlist.get(i)+" ");
		}
		
		linkedlist.clear();
		System.out.println(linkedlist.size());
		

	}

}
