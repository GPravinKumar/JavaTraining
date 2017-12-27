package com.sapient.vo;

public class Emp implements Comparable<Emp> {
	
	private int eid;
	private String ename;
	private Double esal;
	
	public Emp(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public Double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	@Override
	public int compareTo(Emp emp) {
		Integer e1=this.eid;
		Integer e2=emp.eid;
		return e1.compareTo(e2);
	}
	
	

}
