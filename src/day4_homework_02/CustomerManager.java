package day4_homework_02;

public class CustomerManager {
	
	// Obje Olusturarak Herhangi Bir Database Bagimliligi Olmamasi Icin
	// Database lerin Ortak Class ini Kullaniyoruz
	BaseDatabaseManager databaseManager;

	public void getCustomers() {
		
		// Database lerin Ortak Class i Uzerinden 
		// Kullanilmasi Gereken Tum Fonksiyon Ve Islemlere Ulasabiliriz
		databaseManager.getData();
	}
}