import java.util.Scanner;

public class inputOutput4 {
public static void main (String [] args){

	Scanner input = new Scanner (System.in);
		String nama;
		char jenisKelamin;
		int tinggiBadan;
		boolean menikah;

System.out.print("Masukan Nama : ");
nama = input.nextLine();
System.out.print("Masukan jenisKelamin : ");
jenisKelamin = input.next().charAt(0);
System.out.print("Masukan Masukan Tinggi Badan : ");
tinggiBadan = input.nextInt();
System.out.print("Masukan Status Menikah : true/false");
menikah = input.nextBoolean();

}



}