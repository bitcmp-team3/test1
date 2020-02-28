package model.dto;

import java.sql.Date;

public class CustomerDTO {
	private String  custNo ;
	private String  pw ; 
	private String  custName ; 
	private String  custTel ;
	private Date joinDate ; 
	private Date birthDay;
	
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustTel() {
		return custTel;
	}
	public void setCustTel(String custTel) {
		this.custTel = custTel;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	@Override
	public String toString() {
		return "CustomerDTO [custNo=" + custNo + ", pw=" + pw + ", custName=" + custName + ", custTel=" + custTel
				+ ", joinDate=" + joinDate + ", birthDay=" + birthDay + "]";
	}
	
}
