package com.pojotask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Org_ETF {

	public static void main(String[] args) {

		Organization org = new Organization();
		org.setDate("2024-06-16");
		org.setEtfOrderId("etf1234");
		
		SecurityInfo securityInfo = new SecurityInfo();
		
		
		securityInfo.setIsin("1234");
		securityInfo.setName("A");
		securityInfo.setSedol("e34f4f");
		org.setSecrityInfo(securityInfo);
		
	//	translator(org);
		//ZAD value = translator(org);
		useTranslator(translator(org) );
		
	}
	
	public static ZAD translator(Organization org)  {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH);
		
		
		Date date = null;				
		try {
			date = formatter.parse(org.getDate());
		} catch (ParseException e) 
		{
			e.printStackTrace();
		}
		
		ZAD zad = new ZAD();
		zad.setDate(date);
		zad.setEtfOrderId(org.getEtfOrderId());
		
		SecurityInfo secInfo = org.getSecrityInfo();
		zad.setIsin(secInfo.getIsin());
	//	zad.setIsin(org.getSecrityInfo().getIsin());
	//	zad.setSecurityName(secInfo.getName());
		zad.setSecurityName(org.getSecrityInfo().getName());
		zad.setSedol(org.getSecrityInfo().getSedol());

		return zad;
	}

	public static int sumOfTwoNumbers(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public static void useTranslator(ZAD zad) {
		System.out.println(zad.getEtfOrderId() + " | "+ zad.getSecurityName());
	}
}
