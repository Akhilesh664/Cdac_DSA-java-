package d4;

import day4.EmpManagement;

public class ArrayofEmp {
    public static void main(String[] args) {
        Emp[] e;
        
        e = EmpManegement.createEmpArray();
        
        EmpManegement.displayEmpArray(e);
        
        EmpManegement.updateEmpSal(e);
        
        System.out.println("object after update");
		
        EmpManegement.displayEmpArray(e);
		
		EmpManegement.deleteEmp(e);
		
		EmpManegement.displayEmpArray(e);
    }
}
