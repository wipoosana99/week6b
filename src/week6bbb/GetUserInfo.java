package week6bbb;

import java.util.Scanner;
public class GetUserInfo {
	public static void main(String[]args) {
		String name;
		int age;
		Scanner importDevicve = new Scanner(System.in);
		System.out.print("Please enter your name >> ");
		name = importDevicve.nextLine();
		System.out.print("Please enter your age >> ");
		age = importDevicve.nextInt();
		System.out.println("Your name is " + name + " and you are " + age + "years old");
	}
}