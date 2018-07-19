import javax.swing.JOptionPane;

public class testscores {
public static void main(String[] args) {
String answer=JOptionPane.showInputDialog(null,"What is your score?");
double score=Double.parseDouble(answer);
if(score<95.5) {
	JOptionPane.showMessageDialog(null, "You might just didn't study so hard?");
}
if(score>95.5) {
	JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
}
}
}

