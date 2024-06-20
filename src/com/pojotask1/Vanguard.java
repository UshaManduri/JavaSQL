package com.pojotask1;

public class Vanguard {

	/*
	 * Vanguard { "Vanguard": [ { "etfOrderId": "ABC", "secName" : "Test",
	 * "teamName" : "RCS", "transactionId" : "", "transactionDate" : "" }, {
	 * "etfOrderid": "ABC", "secName" : "Test", "teamName" : "RCS", "transactionId"
	 * : "", "transactionDate" : "" } ] }
	 */
	
	public String etfOrderId;
	public String secName;
	public String teamName;
	public String transactionId;
	public String transactionDate;
	
	@Override
	public String toString() {
		return "Vanguard [etfOrderId=" + etfOrderId + ", secName=" + secName + ", teamName=" + teamName
				+ ", transactionId=" + transactionId + ", transactionDate=" + transactionDate + "]";
	}

	public String getEtfOrderId() {
		return etfOrderId;
	}

	public void setEtfOrderId(String etfOrderId) {
		this.etfOrderId = etfOrderId;
	}

	public String getSecName() {
		return secName;
	}

	public void setSecName(String secName) {
		this.secName = secName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	
}
