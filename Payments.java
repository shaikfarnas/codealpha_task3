package task3;
import java.util.Scanner;
public class Payments {
	
	void singleRoom() {
		
		System.out.println("Charges for Single room per day is Rs.1000");
		System.out.println("YOU HAVE TO PAY 500rs IN ADVANCE...");
		System.out.println("For payment........");
		System.out.print("PAY: ");
		Scanner scan = new Scanner(System.in);
		int amount1 = scan.nextInt();
		if(amount1 >= 500) {
		System.out.println("PAYMENT IS DONE.");
		System.out.println("You have paid "+amount1+"rs successfully");
		
		System.out.println("Single Room is booked Successfully:)");
		}
		else {
			System.out.println("sorry you have to pay atlest 500rs");
		}
	}
	void doubleRoom() {
		System.out.println("Charges for Double room per day is Rs.1000");
		System.out.println("YOU HAVE TO PAY 500rs IN ADVANCE...");
		System.out.println("For payment........");
		System.out.print("PAY: ");
		Scanner sc = new Scanner(System.in);
		int amount2 = sc.nextInt();
		if(amount2 >= 500) {
		System.out.println("You have paid "+amount2+"rs successfully");
		System.out.println("PAYMENT IS DONE.");
		System.out.println("Double Room is booked Successfully:)");
		}
		else {
			System.out.println("sorry you have to pay atlest 500rs");
		}
	}
	void tripleRoom() {

		System.out.println("Charges for Triple room per day is Rs.1200");
		System.out.println("YOU HAVE TO PAY 500rs IN ADVANCE...");
		System.out.println("For payment........");
		System.out.print("PAY: ");
		Scanner s = new Scanner(System.in);
		int amount3 = s.nextInt();
		if(amount3 >= 500) {
			System.out.println("You have paid "+amount3+"rs successfully");
			System.out.println("PAYMENT IS DONE.");
			System.out.println("Triple Room is booked Successfully:)");
			}
			else {
				System.out.println("sorry you have to pay atlest 500rs");
			}
		
	}
}
