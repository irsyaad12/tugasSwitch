//coded by irsyaadul ibaad
import java.util.*;
class Tugas2{
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Input angka : ");
		String angka = a.nextLine();
		String output;
		switch(angka){
			case "1": output = "Satu";
			break;
			case "2": output = "Dua";
			break;
			case "3": output = "Tiga";
			break;
			case "4": output = "Empat";
			break;
			case "5": output = "Lima";
			break;
			case "6": output = "Enam";
			break;
			case "7": output = "Tujuh";
			break;
			case "8": output = "Delapan";
			break;
			case "9": output = "Sembilan";
			break;
			case "10": output = "Sepuluh";
			break;
			default: output = "Ini berapa ya?";
		}
		System.out.println(output);
	}
}