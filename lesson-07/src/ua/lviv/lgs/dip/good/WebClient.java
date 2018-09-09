package ua.lviv.lgs.dip.good;

public class WebClient {
	DataAccessable dataAccessable = new WebDataAccess();

	void fetchData() {
		dataAccessable.executeAccess();
		System.out.println("Data is fetched");
	}
}
