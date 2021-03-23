package myFortuneCookie;

import java.util.Random;

public class MyFortuneCookie {
	
static String[] myFortuneCookie= {"Be on the alert to recognize your prime at whatever time of your life it may occur", 
			   "The early bird gets the worm, but the second mouse gets the cheese",
			   "Your road to glory will be rocky, but fulfilling",
			   "Courage is not simply one of the virtues, but the form of every virtue at the testing point",
			   "Don’t worry about money. The best things in life are free",
			   "Don’t pursue happiness – create it",
			   "Nothing is so much to be feared as fear",
			   "All things are difficult before they are easy",
			   "A ship in harbor is safe, but that’s not why ships are built"
			   
		};

	public static void main(String[] args) {
		//To avoid getting the same fortune every single time we will create a random object
Random random=new Random();
int r=random.nextInt(myFortuneCookie.length);
System.out.println(myFortuneCookie[r]);

	}

}
