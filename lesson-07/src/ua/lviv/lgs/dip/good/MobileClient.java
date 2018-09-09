package ua.lviv.lgs.dip.good;

public class MobileClient {
	DataAccessable dataAccessable =new MobileDataAccess();
	
	void fetchData() {
		dataAccessable.executeAccess();
		System.out.println("Data is fetched");
	}
}
