package com.pojotask;

import java.util.Date;

// JSON format
/*Response body

BOF
{
	"ZAD" : {
	"etfOrderId" : "",
	"isin" : ,
	"sedol" : ,
	"date" : ,
	"securityName" : ""
	}
	
}*/

public class ZAD {

	public String etfOrderId;
	public String isin;
	public String sedol;
	public Date date;
	public String securityName;
	
	@Override
	public String toString() {
		return "ZAD [etfOrderId=" + etfOrderId + ", isin=" + isin + ", sedol=" + sedol + ", date=" + date
				+ ", securityName=" + securityName + "]";
	}
	
	public String getEtfOrderId() {
		return etfOrderId;
	}
	public void setEtfOrderId(String etfOrderId) {
		this.etfOrderId = etfOrderId;
	}
	public String getIsin() {
		return isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	public String getSedol() {
		return sedol;
	}
	public void setSedol(String sedol) {
		this.sedol = sedol;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSecurityName() {
		return securityName;
	}
	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}
	
}
