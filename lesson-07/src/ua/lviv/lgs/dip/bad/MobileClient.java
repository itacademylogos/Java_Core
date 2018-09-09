package ua.lviv.lgs.dip.bad;

public class MobileClient {
	DataAccess dataAccess = new DataAccess();
	
	void fetchData() {
		dataAccess.executeAccess();
		System.out.println("Data is fetched");
	}
}
