package com.pojotask1;

import java.util.*;

public class Bank {

	public static void main(String[] args) {

		List<Vanguard> vanList = new ArrayList<>();

		Vanguard van = new Vanguard();

		van.setEtfOrderId("111");
		van.setSecName("AAA");
		van.setTeamName("A1");
		van.setTransactionDate("06-19-2024");
		van.setTransactionId("11AA");

		Vanguard van1 = new Vanguard();

		van1.setEtfOrderId("222");
		van1.setSecName("BBB");
		van1.setTeamName("B2");
		van1.setTransactionDate("06-19-2024");
		van1.setTransactionId("22BB");

		vanList.add(van);
		vanList.add(van1);

		System.out.println(listGetter(vanList));
	}

	public static JPMC listGetter(List<Vanguard> vanObj) {

		JPMC jpmc = new JPMC();

		ArrayList<SecurityDetail> secList = new ArrayList<>();
		ArrayList<TransactionDetail> tranList = new ArrayList<>();

//		for (Vanguard vanLoop : vanObj) {

		vanObj.stream().forEach(vanLoop -> {

			jpmc.setFileFormat("s");
			jpmc.setFileName("ss");

			SecurityDetail secDet = new SecurityDetail();

			secDet.setEtfOrderId(vanLoop.getEtfOrderId());
			secDet.setSecurityName(vanLoop.getSecName());
			secDet.setTeam(vanLoop.getTeamName());

			secList.add(secDet);

			TransactionDetail tranDet = new TransactionDetail();

			tranDet.setEtfOrderId(vanLoop.getEtfOrderId());
			tranDet.setTransactionDate(vanLoop.getTransactionDate());
			tranDet.setTransactionId(vanLoop.getTransactionId());

			tranList.add(tranDet);
		});

		jpmc.setSecurityDetails(secList);
		jpmc.setTransactionDetails(tranList);

		return jpmc;

	}
}
