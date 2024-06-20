package com.pojotask1;

import java.util.ArrayList;

public class JPMC {
	
	/*
	 * Bank { "JPMC" : { "fileName" : "price", "fileFormat" : "csv",
	 * "securityDetails": [ { "etfOrderId": "ABC", // etfOrderId "securityName" :
	 * "Test", //secName "team" : "RCS" //teamName }, { "etfOrderid": "ABC",
	 * "secName" : "Test", "teamName" : "RCS" } 
	 * ], 
	 * "transactionDetails" : [ {
	 * "etfOrderId" : "", //etfOrderId "transactionId" : "", //transactionId
	 * "transactionDate" : "" //transactionDate }, { "etfOrderId" : "",
	 * "transactionId" : "", "transactionDate" : "" } ]
	 * 
	 * } }
	 */
	
	public String fileName;
	public String fileFormat;
	public ArrayList<SecurityDetail> securityDetails;
	public ArrayList<TransactionDetail> transactionDetails;
	
	@Override
	public String toString() {
		return "JPMC [fileName=" + fileName + ", fileFormat=" + fileFormat + ", securityDetails=" + securityDetails
				+ ", transactionDetails=" + transactionDetails + "]";
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileFormat() {
		return fileFormat;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	public ArrayList<SecurityDetail> getSecurityDetails() {
		return securityDetails;
	}

	public void setSecurityDetails(ArrayList<SecurityDetail> securityDetails) {
		this.securityDetails = securityDetails;
	}

	public ArrayList<TransactionDetail> getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(ArrayList<TransactionDetail> transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

}
