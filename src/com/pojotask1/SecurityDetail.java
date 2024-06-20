package com.pojotask1;

public class SecurityDetail {

	public String etfOrderId;
	public String securityName;
	public String team;
	public String secName;
	public String teamName;
	@Override
	public String toString() {
		return "SecurityDetail [etfOrderId=" + etfOrderId + ", securityName=" + securityName + ", team=" + team
				+ ", secName=" + secName + ", teamName=" + teamName + "]";
	}
	public String getEtfOrderId() {
		return etfOrderId;
	}
	public void setEtfOrderId(String etfOrderId) {
		this.etfOrderId = etfOrderId;
	}
	public String getSecurityName() {
		return securityName;
	}
	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
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
	
}
