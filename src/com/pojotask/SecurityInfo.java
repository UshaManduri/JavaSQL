package com.pojotask;

public class SecurityInfo {

		public String isin;
		public String sedol;
		public String name;
		
		@Override
		public String toString() {
			return "SecurityInfo [isin=" + isin + ", sedol=" + sedol + ", name=" + name + "]";
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
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
}
