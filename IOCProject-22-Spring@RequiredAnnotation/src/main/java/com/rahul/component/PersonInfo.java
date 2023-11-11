package com.rahul.component;

import org.springframework.beans.factory.annotation.Required;

@SuppressWarnings("deprecation")
public class PersonInfo {

	private Integer pid;
	private String pname;
	private String paddress;

	public Integer getPid() {
		return pid;
	}

	@Required //This annotation is deprecated from 5.1 version
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	@Override
	public String toString() {
		return "PersonalInfo [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + "]";
	}
}
