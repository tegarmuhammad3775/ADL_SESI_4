package Array_Package;

import java.util.Scanner;

public class BelajarArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input jumlah barang : ");
		int jumlah = sc.nextInt();
		String[] arr = new String[jumlah];
		System.out.println("Inputkan barang :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		System.out.println("List barang :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+". "+arr[i]);
		}
		
	}

}
