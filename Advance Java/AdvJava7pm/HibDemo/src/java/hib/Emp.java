package hib;

public class Emp  implements java.io.Serializable {


     private int empno;
     private String ename;
     private String job;
     private Integer sal;
     private Integer deptno;

    public Emp() {
    }

	
    public Emp(int empno) {
        this.empno = empno;
    }
    public Emp(int empno, String ename, String job, Integer sal, Integer deptno) {
       this.empno = empno;
       this.ename = ename;
       this.job = job;
       this.sal = sal;
       this.deptno = deptno;
    }
   
    public int getEmpno() {
        return this.empno;
    }
    
    public void setEmpno(int empno) {
        this.empno = empno;
    }
    public String getEname() {
        return this.ename;
    }
    
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getJob() {
        return this.job;
    }
    
    public void setJob(String job) {
        this.job = job;
    }
    public Integer getSal() {
        return this.sal;
    }
    
    public void setSal(Integer sal) {
        this.sal = sal;
    }
    public Integer getDeptno() {
        return this.deptno;
    }
    
    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }




}


