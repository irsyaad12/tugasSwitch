//coded by irsyaadul ibaad
import java.util.*;
class Tugas1{
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Input nilai (A/B/C/D) : ");
		String nilai = a.nextLine();
		String output;
		switch(nilai){
			case "A": output = "Excellent";
			break;
			case "B": output = "Good";
			break;
			case "C": output = "Average";
			break;
			case "D": output = "Fail";
			break;
			default: output = "Error";
			break;
		}
		System.out.println(output);
	}
}