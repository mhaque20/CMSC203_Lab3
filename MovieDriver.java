import java.util.Scanner;
public class MovieDriver {
public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		String title = " ";
		String rating = " ";
		int sold_tickets;
		char reply = 'y';
		
		
		do {
			
		
		System.out.println("Enter the name of a movie ");
        title = in.nextLine();
        
        Movie mTitle = new Movie();
        mTitle.setTitle(title);
        
        
        System.out.println("Enter the rating of the movie");
        rating = in.nextLine();
        
        Movie mRating = new Movie();
        mRating.setRating(rating);
        
        System.out.println("Enter the number of tickets sold for this movie");
        sold_tickets = in.nextInt();
        
        Movie mSoldTickets = new Movie();
        mSoldTickets.setSoldTickets(sold_tickets);
        
        Movie display = new Movie (title,rating,sold_tickets);
        System.out.println(display);
        
        System.out.println("Do you want to enter another? (y or n)");
        in.nextLine();
        reply = in.nextLine().charAt(0);
        
		}while(reply=='y'||reply=='Y');
		
		if(reply=='N'||reply=='n') {
        
        System.out.println("GoodBye");
		}
	}


}
