package collections;

import java.util.List;
import java.util.ArrayList;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> myFriends = new ArrayList<>();
		
		System.out.println("size"+myFriends.size());
		System.out.println(myFriends);
		
		myFriends.add("sonu");
		myFriends.add("monu");
		
		System.out.println("size "+ myFriends.size());
		System.out.println(myFriends);
		
		myFriends.remove(0);
		
		System.out.println("size "+ myFriends.size());
		System.out.println(myFriends);

		myFriends.add("tonu");
		System.out.println("size "+ myFriends.size());
		System.out.println(myFriends);	
	}

}