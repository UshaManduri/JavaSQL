package com.pojotask1;

public class TransactionDetail {

	public String etfOrderId;
	public String transactionId;
	public String transactionDate;
	@Override
	public String toString() {
		return "TransactionDetail [etfOrderId=" + etfOrderId + ", transactionId=" + transactionId + ", transactionDate="
				+ transactionDate + "]";
	}
	public String getEtfOrderId() {
		return etfOrderId;
	}
	public void setEtfOrderId(String etfOrderId) {
		this.etfOrderId = etfOrderId;
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
