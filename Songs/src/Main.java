import java.util.Scanner;

public class SL1
{
	public static void main(String[] args) {
		System.out.println("Which song would you like?");
		System.out.println("If you would like 'The wheels on the bus' enter Bus,"
				+ " if you want 'Happy Birthday' enter Birthday"
				+ " and if you want 'YMCA' enter Y");
		String Input, name;
		Scanner in = new Scanner(System.in);
		Input = in.nextLine();
		
		if (Input.equals("Bus")) {
			System.out.print(B());
		} 
		else {
			if (Input.equals("Birthday")) {
				System.out.println("Enter Name:");
				name = in.nextLine();
				System.out.println("Happy Birthday to you, Happy Birthday to you. Happy"
						+ " Birthday, dear " + name + ". Happy Birthday to you.");
				}
			else {
				if(Input.equals("Y")) {
					System.out.println(Y());
					} 
				else {
					
				}
			}
		}
		int age, year;
		if(Input.equals("Birthday")) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("Wait! Don't leave! hehe.");
			System.out.println("Hello, what was your name again?");
			name = in.nextLine();
			System.out.println("Right! Silly me!");
			System.out.println("How old are you?");
			age = in.nextInt();
			if(age < 18) {
			year = 2018 - age;
			System.out.println("Oh, Happy Birthday, " + name + ". Hope you have a "
					+ "wonderful day on your " + age + " year of life. so you were born "
							+ "on " + year + ", after the 2000s. NICE!!");
			}
			else if(age >= 18 && age <= 50) {
				year = 2018 - age;
				System.out.println("Damn, Nigga! We gonna go out and drink today. it's not every "
						+ "day you turn " + age + ", am I right? " + name + ", go out there and tell "
								+ "them 'I was born on " + year + " so suck my d**k.'");
			}
			
		}
		else {}
		
	}
	
	static String B() {
		return "The wheels on the bus go round and round, round and round, round and round. "
				+ "The Wheels on the bus go round and round all through the town.";
	}
	
	static String Y() {
		return "YMCA, biatch!!!";
	}
	
	static void Song() {
		String town = " all through the town.";

		System.out.print(bus());
		wheels();
		System.out.print(", ");
		wheels();
		System.out.print(", ");
		wheels();
		System.out.print(". ");
		System.out.print(bus());
		wheels();
		System.out.print(town);

	}
	
	static void wheels(){
		System.out.print("round and round");
	}
	
	static String bus(){
		return "The Wheels on the bus go ";
	}
}
