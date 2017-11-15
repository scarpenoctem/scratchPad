package main;

public class Main {
	public static void main(String[] args) {
		Integer integerType = new Integer(4);
		int intArr[] = {1, 23, 3, 5};
		int intArrNonInit[] = null;
		String str = "John";
		System.out.print(utilities.MapUtil.returnType(integerType));
		System.out.print(utilities.MapUtil.returnType(intArr));
		System.out.print(utilities.MapUtil.returnType(str));
		System.out.print(utilities.MapUtil.returnType(intArrNonInit));
		
		//Account account implements Account;
	}
}
