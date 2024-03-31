package task3;
import java.util.Scanner;
public class Hotel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to our hotel.");
		
		System.out.println("Available rooms are:50");
		Rooms rms = new Rooms("SingleRoom","DoubleRoom","TripleRoom");
		System.out.println(rms);
		
		
		while(true) {
		System.out.println("--------------------------");
		
		System.out.println("press 1 for Single\npress 2 for Double\npress 3 for Triple");
		int option1 = scan.nextInt();
		
		switch(option1)
		{
		
		case 1:
			
			rms.singleRoom();
			System.out.println("For Booking SingleRoom enter 1");
			int option2 = scan.nextInt();
			if(option2 == 1) {
			Payments pym1 = new Payments();
			pym1.singleRoom();
			}
			else {
				System.out.println("Please enter 1 for singleroom");
			}
			break;
			
		case 2:
			
			rms.doubleRoom();
			System.out.println("For Booking DoubleRoom  enter 2");
			int option3 = scan.nextInt();
			if(option3 == 2) {
				Payments pym1 = new Payments();
				pym1.doubleRoom();
				}
				else {
					System.out.println("Please enter 2 for doubleroom");
				}
			
			break;
			
		case 3:
			
			rms.tripleRoom();
			System.out.println("For Booking TripleRoom enter 3");
			int option4 = scan.nextInt();
			if(option4 == 3) {
				Payments pym3 = new Payments();
				pym3.tripleRoom();
				}
				else {
					System.out.println("Please enter 3 for tripleroom");
				}
		
			
			break;
			
		case 4:
			System.out.println("Thankyou!!!");
			System.exit(0);
		default:
			System.out.println("Invalid choice");	
			}
		
	}
		}
	
	}


