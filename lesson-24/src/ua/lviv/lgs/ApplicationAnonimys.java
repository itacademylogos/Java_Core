package ua.lviv.lgs;

public class ApplicationAnonimys {
	public static void main(String[] args) {
		CustomSecondInterface si = new CustomSecondInterface() {
			@Override
			public void test() {
				System.out.println("Custom Anonimys intreface");
			}
		};

		si.test();

		CustomSecondInterface sil = () -> System.out.println("Custom Lambda impl");
		sil.test();
		
	}
}

@FunctionalInterface
interface CustomSecondInterface {
	void test();
}