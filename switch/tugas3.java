//coded by irsyaadul ibaad
import java.util.*;
class Tugas3{
	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);

		System.out.println("1. Jakarta");
		System.out.println("2. Bogor");
		System.out.println("3. Garut");
		System.out.println("4. Purwakarta");

		System.out.print("Pilih tujuan : ");
		int tujuan = a.nextInt();
		System.out.print("Beli berapa tiket : ");
		int jumlah = b.nextInt();

		int jakarta = 145000;
		int bogor = 200000;
		int garut = 75000;
		int purwakarta = 75000;

		int harga;
		switch(tujuan){
			case 1: harga = jakarta * jumlah;
			if(harga > 250000){
				double diskon = harga * 0.1 ;
				double hasil = harga - diskon;
				System.out.print("Total harga tiket adalah = " + hasil);
			}
			break;

			case 2: harga = bogor * jumlah;
			if(harga > 250000){
				double diskon = harga * 0.1 ;
				double hasil = harga - diskon;;
				System.out.print("Total harga tiket adalah = " + hasil);
			}
			break;

			case 3: harga = garut * jumlah;
			if(harga > 250000){
				double diskon = harga * 0.1 ;
				double hasil = harga - diskon;
				System.out.print("Total harga tiket adalah = " + hasil);
			}
			break;

			case 4: harga = purwakarta * jumlah;
			if(harga > 250000){
				double diskon = harga * 0.1 ;
				double hasil = harga - diskon;
				System.out.print("Total harga tiket adalah = " + hasil);
			}
			break;
			default: 
			System.out.println("Error, masukkan angka tujuan 1/2/3/4");
			break;
		}
	}
}