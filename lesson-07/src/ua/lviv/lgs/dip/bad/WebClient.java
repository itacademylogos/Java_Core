package ua.lviv.lgs.dip.bad;

public class WebClient {
	DataAccess dataAccess = new DataAccess();
	
	void fetchData() {
		dataAccess.executeAccess();
		System.out.println("Data is fetched");
	}
	
}
