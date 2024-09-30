package d8;

import java.util.ArrayList;

public class EmpArrayList {
	
	public static void main(String[] args) {
		
		
		// create arraylist instance
		ArrayList<Emp> al = EmpManagement.addEmp();
		EmpManagement.dispEmp(al);
		EmpManagement.deleteEmp(al);
		EmpManagement.dispEmp(al);
		EmpManagement.updateEmp(al);
		EmpManagement.dispEmp(al);
	
	}

}
