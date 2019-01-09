package hibernate.simple.withoutmaven;

public class EmpPojo {

	private int eid;
	private String ename;
	private double esal;
	private String eadd;
	@Override
	public String toString() {
		return "\nEmployee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", eadd=" + eadd + "]";
	}
	public EmpPojo(int eid, String ename, double esal, String eadd) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.eadd = eadd;
	}
	
     public EmpPojo(){
    	 
     }
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
     
}
