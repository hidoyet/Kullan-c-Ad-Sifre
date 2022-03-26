package kullanýcýAdýSifreKontrol;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName,password,passwordCheck,userNameCheck;
		
		Scanner input=new Scanner(System.in);
		userName="Xperson";
		password="Xpassword";
		System.out.println("lütfen kullanýcý adýnýzý giriniz");
		userNameCheck=input.nextLine();
		System.out.println("lütfen þifrenizi giriniz");
		passwordCheck=input.nextLine();
		if(passwordCheck.equals(password)&&userNameCheck.equals(userName)) {
			System.out.println("giriþ baþarýlý");
		}else {
			System.out.println("kullanýcý adý veya þifre,yeni þifre belirlemek ister misiniz");
			System.out.println("þifrenizi deðiþtirmek istiyorsanýz evet,deiþtirmek istemiyorsanýz hayýr yazýn");
			String choice;
			
			choice=input.nextLine();
			if(choice.equals("evet")) {
				System.out.println("Yeni þifrenizi girin");
				passwordCheck=input.nextLine();
				if(passwordCheck.equals(password)) {
					System.out.println("þifreniz eski þifreniz ile ayný");	
				}else {
					System.out.println("þifren baþarý ile deðiþtirildi");
					
			}
					
			}else {
				System.out.println("þifrenizi deðiþtirmek istemediniz");
			}
		}
	}

}
