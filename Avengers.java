import java.io.*;
import java.util.*;

class Avenger
{
	public String name, power, weapon, planet;
	public int age;


	public void getDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		name = sc.next();
		System.out.println("Enter age : ");
		age = sc.nextInt();
		System.out.println("Enter power : ");
		power = sc.next();
		System.out.println("Enter weapon : ");
		weapon = sc.next();
		System.out.println("Enter planet : ");
		planet = sc.next();
		
	}

	public void displayDetails(){
		System.out.println("name : " + name );
		System.out.println("age : " + age );
		System.out.println("power : " + power );
		System.out.println("weapon : " + weapon );
		System.out.println("planet : " + planet );
	}
}

class Avengers{
	public static void main(String args[]){
		Avenger[] av = new Avenger[5];

		for(int i=1; i<=5; i++){
			av[i].getDetails();
			av[i].displayDetails();
		}
	}
}



