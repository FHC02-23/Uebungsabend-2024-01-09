package org.campus02.social;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SocialNetwork {
	
	private ArrayList<User> users = new ArrayList<>();
	
	public void addUser(User user) {
		this.users.add(user);
	}
	
	public void addUsers(List<User> users) {
		this.users.addAll(users);
	}
	
	public ArrayList<User> getUsers() {
		return users;
	}
	
	
	
	
	//TODO 1: implementieren Sie hier die rekursive Methode lt. Angabe
	
	
	
	
	public static SocialNetwork generateDemoNetwork() {
		
		//initialize 10 users
		User u1 = new User(1, "Franz", 31);
		User u2 = new User(2, "Fritz", 23);
		User u3 = new User(3, "Susi", 25);
		User u4 = new User(4, "Mona", 18);
		User u5 = new User(5, "Petra", 41);
		User u6 = new User(6, "Peter", 42);
		User u7 = new User(7, "Paul", 19);
		User u8 = new User(8, "Sofia", 20);
		User u9 = new User(9, "Max", 27);
		User u10 = new User(10, "Doris", 26);
		
		//setup friend relations
		//franz -> (fritz,susi)
		u1.setFriends(new ArrayList<>(Arrays.asList(u2,u3)));
		//fritz -> (susi,petra,peter)
		u2.setFriends(new ArrayList<>(Arrays.asList(u3,u5,u6)));
		//susi -> (mona,petra)
		u3.setFriends(new ArrayList<>(Arrays.asList(u4,u5)));	
		//mona -> ()
		//petra -> (franz, mona)
		u5.setFriends(new ArrayList<>(Arrays.asList(u1,u4)));
		//peter -> (mona, sofia, max)
		u6.setFriends(new ArrayList<>(Arrays.asList(u4,u8,u9)));
		//paul -> (susi,mona,sofia)		
		u7.setFriends(new ArrayList<>(Arrays.asList(u3,u4,u8)));
		//sofia -> (max,doris)
		u8.setFriends(new ArrayList<>(Arrays.asList(u9,u10)));
		//max -> ()
		//doris - (franz,fritz,peter)
		u10.setFriends(new ArrayList<>(Arrays.asList(u1,u2,u6)));
		
		SocialNetwork sn = new SocialNetwork();
		sn.addUsers(Arrays.asList(u1,u2,u3,u4,u5,u6,u7,u8,u9,u10));
		
		return sn;
		
	}

}
