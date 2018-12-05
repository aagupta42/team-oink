//to run use 
//javac -deprecation pup.java
// java pup
//-deprecation
   	/**Show a description of each use or override of a deprecated member or class. Without -deprecation, javac shows a summary of the source files that use or override deprecated members or classes. -deprecation is shorthand for -Xlint:deprecation *//

import java.util.*; //necessary for the scanner function
//contains the collections framework
// legacy collection classes
//even model, date and time facilities, internalization, and miscellanesous utility classes
// a string tokenizer
// a random number generator
// and a bit array

public class pup
{ //<--- all variables and methods will be here

	//first declare all the variables
	//static variables <- only want one instance of them 
	//food and missed_meal values give same treatment for all objects. 
	
	private int fullness;// 1. of the major (time dependent) health parameters
	static private int food; //integer increment to fullness  
	{food=15;}	
	static private int missed_meal;//integer decrement to fullness parameter
	{missed_meal=15;}
	
	private int happiness; //2. major (time dependent) health parameter
	static private int games; //integer increment to happiness
	{games=10;}
	static private int neglect; //integer decrement to happiness parameter	
	{neglect=10;} 
		
	private int cleanliness;// 3. major (time dependent) health parameter
	static private int soap; // integer increment to cleanliness
	{soap=10;}
	static private int mud; // integer decrement to cleanliness 
	{ mud= 10; }	
	
	private String name;
	private int age; //right now manuanually entered <--- will be time dependent
	private String gender; 
	public static final Scanner CONSOLE= new Scanner(System.in); 
	//CONSOLE input will be scanned and saved into class member variables
	// public -> can be used anywhere
		//create a single shared scanner object for keyboard input
		//rationale? <-- subtle bugs are introduced when you connect more than one Scanner Object to the single InputStream object System.in
		//All keyboard operations used for this class will use this scanner object
		

//program execution starts here
//java public_static_void main (String args[])
 public static void main (String args[])
{
	pup pupper = new pup();
	pupper.pick_set();//calling a member function myclass.memberfunction()
	pupper.hunger(missed_meal);
	pupper.dirty(mud);
	pupper.sadness(neglect);
	pupper.feed(food);
	pupper.play(games);
	pupper.wash(soap);
	
	

	
	
} //end main method




//object constructor
	public pup ()//empty constructor
	{      /* public classname (things that create the object) */
	       name=name;
	       gender=gender;
	       age=1; //1 day old
	       fullness=100;
	       happiness=100;
	       cleanliness=100;
	System.out.print("your pup was born!"+"\n"+"age:  " + age + "\n"+ "fullness level:  " + fullness +"\n"+ "happiness:  " + happiness + "\n" );
	}
//member functions

	public void pick_set() //define unlabeled variables in constructor
	{
		System.out.print("pick a gender.: ");
		String GENDER= CONSOLE.nextLine();
		gender=GENDER;		
		System.out.print("name your " + GENDER + " pup: ");
		String NAME= CONSOLE.nextLine();
		name=NAME;
		System.out.print("your pup's name is: " + NAME+ "\n");
		
		}


	public void feed(int food)
	{
		fullness+=food;	 //if you feed your pet it will be more full
		System.out.print("Thanks! That was tasty!. I'm full now. "+"\n");
		System.out.print ( name + "'s  " + "fullness level is now: " + fullness + "." + "\n");
	} 

	public void hunger(int MISSED_MEAL)
	{
		fullness-=MISSED_MEAL; // if you don't feed your pet it will get hungry, ie. be less full
		System.out.print("FOOD! FEED ME PERSON!" + "\n");	
		System.out.print ( name + "'s  " + "fullness level is now: " + fullness + "." + "\n");
	}
 
	public void play(int games)
	{
		happiness+=games; //if you play games with your pet it will be more happy
		System.out.print ("Yay! that was fun! " + "\n");
		System.out.print ( name + "'s  " + "happiness level is now: " + happiness + "." + "\n");
	}

		

	public void sadness( int neglect)
	{
		happiness-=neglect;	// if you neglect your pet it will be sad || less happy
		System.out.print("I'm bored. Hey person.... HELLOO..... hello?.... can we play ball?" + "\n");	
		System.out.print ( name + "'s  " + "happiness level is now: " + happiness + "."  + "\n");
	}


	public void wash(int soap) // if you wash your pet with soap it will be more clean
	{
		cleanliness+=soap;
		System.out.print("I feel CLEAN!" + "\n");
		System.out.print ( name + "'s  " + "cleanliness level is now: " + cleanliness + "." + "\n");
	}

	public void dirty( int mud) // if you leave your pet outside it will not wash itself and get dirty
	{
		cleanliness-=mud;
		System.out.print ("Look at me! Look at the hole I dug!" + "\n");
		System.out.print ( name + "'s  " + "cleanliness level is now: " + cleanliness + "." + "\n");
	}
}
