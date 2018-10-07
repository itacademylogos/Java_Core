package ua.lviv.lgs;

public interface Iterator {
	public boolean hasNext();
	public Object next();
}

class Collection {
	private static Object[] arr;
	
	Collection (Object [] arr){
		Collection.arr = arr;
	}
	
	public class Forward implements Iterator{

		private int count = 0;
		
		@Override
		public boolean hasNext() {
			return count< arr.length;
		}

		@Override
		public Object next() {
			return arr[count++];
		}
		
	}
	
	
	public Forward createForward() {
		return new Forward();
	}
	
	
	public class Backward implements Iterator{
		int count = arr.length -1;

		@Override
		public boolean hasNext() {
			return count>=0;
		}

		@Override
		public Object next() {
			return arr[count--];
		}	
	}
	
	public Backward createBackward() {
		return new Backward();
	}
}