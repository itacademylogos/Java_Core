package ua.lviv.lgs.general;

public class Application {
	public static void main(String[] args) {
		
//		//Exmp 1: Null Pointer
//		String s = null;
//		s.concat("test string");
		
		
//		//Exmpl 2 : IndexOutOf bound 
//		int array[] = {1,2,3};
//		System.out.println(array[3]);
		
		
		//try-catch-finally
//		try {
////			String s = null;
////			s.concat("test string");
////			throw new RuntimeException("LINE 20");
//		} catch (IndexOutOfBoundsException e) {
//				System.out.println("You tried to use meythods with IndexOutOfBoundsException = "+ e);
//		}catch (NullPointerException e) {
//			System.out.println("You tried to use meythods from null reference = "+ e);
//		}catch (Throwable e) {
//			System.out.println("Last destination");
//			e.printStackTrace();
//		}finally {
//			System.out.println("CLOSED all RESOURCES");
//		}
		
		
		//try-finally
		
		
		try {
			System.out.println("tried run harmful code");
			try {
				throw new Throwable();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}finally {
			System.out.println("Close resources");
		}
		
		
	}
}
