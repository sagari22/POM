package rough;

import com.qtpselenium.util.TestUtil;
import com.qtpselenium.util.Xlsx_Reader;

public class GetRunmode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Xlsx_Reader xls = new Xlsx_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\data\\Testcase.xlsx");
		
		/*for(int rowNum=2;rowNum<=xls.getRowCount("Test Cases");rowNum++){
			if(xls.getCellData("Test Cases", "RunMode", rowNum).equals("Y")){
				System.out.println(xls.getCellData("Test Cases", "TCID", rowNum));	
			}
			
			
		}*/
		System.out.println(TestUtil.isExecutable("Test3", xls));
	}

}
