import javax.swing.JOptionPane;

public class chooseyourownadventure {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog(null,
				"You are at a field, you have two place to go, one is HOUSE, one is FOREST.");
		if (answer.equals("HOUSE")) {
			answer = JOptionPane.showInputDialog(null, "You go to the house and you see a cute snake.");
			if (answer.equals("RUN")) {
				JOptionPane.showMessageDialog(null, "You run away and see a scary old women.");
			}
			if (answer.equals("PET THE SNAKE")) {
				JOptionPane.showMessageDialog(null, "You have been bitten by that snake, you search the room");
			}
		}

		if (answer.equals("FOREST")) {
			answer = JOptionPane.showInputDialog(null, "you see a lo of cute snakes.");
			if (answer.equals("KEEP GOING")) {
				JOptionPane.showMessageDialog(null, "When you keep going to the forest, you see a cave.");
			}
			if (answer.equals("ATTACK THE SNAKES")) {
				JOptionPane.showMessageDialog(null, "You have been poisoned by the snake and you find a little girl.");
			}
		}
	}
}
