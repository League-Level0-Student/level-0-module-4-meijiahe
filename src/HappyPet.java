import javax.swing.JOptionPane;

public class HappyPet {
	
	static // 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	int happinessLevel = 0;
	static String pet;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
 pet=JOptionPane.showInputDialog(null,"What kind of pet you like");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Question", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "food", "water", "clean poop" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
 if(task==0) {
	   feed();
 }
 if(task==1) {
	   water();
}
 if(task==2) {
	 cleanpoop();
 }
 
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
 for (int i=0;i<task;i++) {
	 System.out.println(i);
	 }


	}

	static // 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	void feed() {
		System.out.println("you feed your"+pet);
		happinessLevel++;
	}
	static void water() {
		System.out.println("you water your"+pet);
		happinessLevel++;
	}
	static void cleanpoop() {
		System.out.println("you clean poop of your"+pet);
		happinessLevel++;
	}
}