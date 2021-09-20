package org.dimas.learn;

public class Main {

    public static void main(String[] args) {
	// write your code here
//         user1  instance of user
        User user1 = new User();
        user1.setName("John Doe");
        user1.setAge(30);
        user1.setAddress("UK");

//         user2 instance of user
        User user2 = new User();
        user2.setName("James Gosling");
        user2.setAge(40);
        user2.setAddress("USA");


        System.out.println("\t Object USER1");
        System.out.println("Name :"+user1.getName());
        System.out.println("Age : "+user1.getAge());
        System.out.println("Address : "+user1.getAddress());


        System.out.println("\t Object USER2");
        System.out.println("Name :"+user2.getName());
        System.out.println("Age : "+user2.getAge());
        System.out.println("Address : "+user2.getAddress());

    }
}
