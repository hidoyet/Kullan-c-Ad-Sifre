package kullan�c�Ad�SifreKontrol;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName,password,passwordCheck,userNameCheck;
		
		Scanner input=new Scanner(System.in);
		userName="Xperson";
		password="Xpassword";
		System.out.println("l�tfen kullan�c� ad�n�z� giriniz");
		userNameCheck=input.nextLine();
		System.out.println("l�tfen �ifrenizi giriniz");
		passwordCheck=input.nextLine();
		if(passwordCheck.equals(password)&&userNameCheck.equals(userName)) {
			System.out.println("giri� ba�ar�l�");
		}else {
			System.out.println("kullan�c� ad� veya �ifre,yeni �ifre belirlemek ister misiniz");
			System.out.println("�ifrenizi de�i�tirmek istiyorsan�z evet,dei�tirmek istemiyorsan�z hay�r yaz�n");
			String choice;
			
			choice=input.nextLine();
			if(choice.equals("evet")) {
				System.out.println("Yeni �ifrenizi girin");
				passwordCheck=input.nextLine();
				if(passwordCheck.equals(password)) {
					System.out.println("�ifreniz eski �ifreniz ile ayn�");	
				}else {
					System.out.println("�ifren ba�ar� ile de�i�tirildi");
					
			}
					
			}else {
				System.out.println("�ifrenizi de�i�tirmek istemediniz");
			}
		}
	}

}
