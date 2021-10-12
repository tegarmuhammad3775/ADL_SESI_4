package Array_Package;

import java.util.Scanner;

public class BelajarArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BelajarArray bel = new BelajarArray();
		bel.arrGame();
	}
	
	public void arrGame() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan ukuran : ");
		int size = sc.nextInt();
		int idx1 = 1;
		int idx2 = 1;
		int prevIdx1 = idx1;
		int prevIdx2 = idx2;
		boolean isWin = false;
		boolean isLose = false;
		boolean exitGame = (isWin == true && isLose == true);
		
	    String[][] arr = new String[size][size];
		
	    if(isWin == false && isLose == false) {
	    	for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if(i == 0 || i == size - 1 || j == 0 || j == size - 1){
						if((i == size-2) && (j == size-1)) {
							arr[i][j] = " ";
						}
						else {
							arr[i][j] = "*";
						}	
					}
					else{
						if(i == 1 && j == 1){
							arr[idx1][idx2]="@";
						}
						else{
						   arr[i][j] = " ";
						}	
					}
				}
			}
			
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
	    }
	    
		
		while(exitGame == false){
			System.out.print("Masukan arah (a ke kiri, d ke kanan, w keatas, s kebawah) : ");
			String arah = sc.next();
			if(arah.equalsIgnoreCase("a")){
				prevIdx1 = idx1;
				prevIdx2 = idx2;
				idx2 -= 1;
			}
			else if(arah.equalsIgnoreCase("d")) {
				prevIdx1 = idx1;
				prevIdx2 = idx2;
				idx2 += 1;
			}
			else if(arah.equalsIgnoreCase("w")) {
				prevIdx1 = idx1;
				prevIdx2 = idx2;
				idx1 -= 1;
			}
			else if(arah.equalsIgnoreCase("s")) {
				prevIdx1 = idx1;
				prevIdx2 = idx2;
				idx1 += 1;
			}
			else{
				idx1 = idx1;
				idx2 = idx2;
			}
			
			for (int i = 0; i < size && isWin == false && isLose == false ; i++) {
				for (int j = 0; j < size && isWin == false && isLose == false ; j++) {
					if(i == 0 || i == size - 1 || j == 0 || j == size - 1){	
						  if((idx1 == size - 2) && (idx2 == size - 1)){
							 System.out.println("Hasil : Selamat Anda menang!");
							 isWin = true;
							 exitGame = !exitGame;
						  }
						  else if(idx1 == 0 || idx1 == size - 1 || idx2 == 0 || idx2 == size - 1){
							 System.out.println("Hasil : Game over!");
							 isLose = true;
							 exitGame = !exitGame;
						 }
						  else if((i == size-2) && (j == size-1)) {
								arr[i][j] = " ";
						  }
						  else {
								arr[i][j] = "*";
						  }
					}
					else{
						if( idx1 != 0 && idx2 != 0){
								arr[prevIdx1][prevIdx2]=" ";
								arr[idx1][idx2]="@";
						}
						else{
						   arr[i][j] = " ";
						}	
					}
					
				}
				
			}
			
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if(i < size && j < size && isWin == false && isLose == false) {
						System.out.print(arr[i][j]);
					}
				}
				System.out.println();
			}
		
		}
		
		
	}

}
