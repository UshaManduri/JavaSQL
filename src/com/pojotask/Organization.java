package com.pojotask;

// JSON format
/*Organization
{
	"Organization" : {
	"etfOrderId" : "ETF1234",
	"date" : "2024-06-16",
	"securityInfo" : {
		"isin" : "abcdefgh",
		"sedol" : "abcd1234",
		"name" : "VOO"
		}
	}
}*/
public class Organization {
	
	public String etfOrderId;
	public String date;
	public SecurityInfo secrityInfo;
	
	@Override
	public String toString() {
		return "Organization [etfOrderId=" + etfOrderId + ", date=" + date + ", secrityInfo=" + secrityInfo + "]";
	}

	public String getEtfOrderId() {
		return etfOrderId;
	}

	public void setEtfOrderId(String etfOrderId) {
		this.etfOrderId = etfOrderId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public SecurityInfo getSecrityInfo() {
		return secrityInfo;
	}

	public void setSecrityInfo(SecurityInfo secrityInfo) {
		this.secrityInfo = secrityInfo;
	}
	
}


