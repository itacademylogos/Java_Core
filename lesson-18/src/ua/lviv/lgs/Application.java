package ua.lviv.lgs;import java.nio.channels.ShutdownChannelGroupException;

public class Application {
	public static void main(String[] args) {

		//With one generic
		SimpleGenerics<Integer> iOb = new SimpleGenerics<>(88);
		iOb.showType();
	
		int value = iOb.getOb();
		System.out.println("Value orf simple generic is "+ value);
		
		SimpleGenerics<String> sOb = new SimpleGenerics<>("Java");
		sOb.showType();
	
		String valueS = sOb.getOb();
		System.out.println("Value orf simple generic is "+ valueS);
		System.out.println();
		
		
		//with two generics
		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(90, "Run Forest run");
		tgObj.showTypes();
		
		int valueTgObj = tgObj.getOb1();
		System.out.println("Value orf simple generic is "+ valueTgObj);
		
		String valueStgObj = tgObj.getOb2();
		System.out.println("Value orf simple generic is "+ valueStgObj);
		System.out.println();
		
		//Restrictios
		Integer [] iNums = {1,2,3,4,5};
		Restricriction<Integer> iObRes = new Restricriction<>(iNums);
		double averageIobRes = iObRes.average();
		System.out.println("Average iOb is = "+averageIobRes);
		
		
		Double [] dNums = {1.1,2.2,3.3,4.4,5.5};
		Restricriction<Double> dObRes = new Restricriction<>(dNums);
		double averageDobRes = dObRes.average();
		System.out.println("Average dOb is = "+averageDobRes);
		
		
		//will not work because of bounds
//		String [] stringsRes = {"1","2","3"};
//		Restricriction<String> stringRes = new Restricriction<>(stringsRes);
		
		
		//wildCards
		TwoC tc [] = {
				new TwoC(0,0),
				new TwoC(7,8),
				new TwoC(18,4),
				new TwoC(-1,-23),
		};
		
		Coords<TwoC> tclocs = new Coords<>(tc);
		System.out.println("Value of tclocs");
		Coords.showXY(tclocs);
		
		//will not compile
//		Coords.showXYZ(tc);
//		Coords.showXYZT(tc);
		
		FourC fd[] = {
				new FourC(1, 2,3, 4),
				new FourC(6, 8,14, 8),
				new FourC(22, 21,33, 44),
				new FourC(71, 42,63, 43),
				new FourC(31, 12,32, 41)
		};
		
		Coords<FourC> fclocs = new Coords<>(fd);
		System.out.println("in array fcocs is: ");
		Coords.showXY(fclocs);
		Coords.showXYZ(fclocs);
		Coords.showXYZT(fclocs);
		
		
		
		Generic3<String, Integer> x = new Generic3<>("Value is: ",99);
		System.out.println(x.getOb());
		System.out.println(x.getOb2());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
