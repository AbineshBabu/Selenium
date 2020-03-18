package testcase;

import utility.ReadExcel;

public class StoreData {
	
	String filepath="./Testdata/testdata.xls";
	
	static String username;
	static String password;
	
	public void Store() throws Exception {
		ReadExcel r=new ReadExcel(filepath);
		
		double a=r.getNumber(0, 1, 0);
		String username1=doubleToString(a);
		username=username1;
		
		String password1=r.getAlphabets(0, 1, 1);
		password=password1;
		
	}
	

	public String doubleToString(double d) {
		int a=(int) d;
		String data=String.valueOf(a);
		return data;
	}

}
