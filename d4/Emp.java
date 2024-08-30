package d4;

public class Emp {
    public int eno; 
    public String ename;
    public float sal;
    
    
    public Emp(int eno, String ename, float sal) {
        this.eno = eno;
        this.ename = ename;
        this.sal = sal;
    
    }

    public void dispEmp() {
        System.out.println("Employee Number: " + eno + ", Name: " + ename + ", Salary: " + sal);
    }
}
