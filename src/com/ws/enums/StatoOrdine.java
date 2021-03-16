package com.ws.enums;

public class StatoOrdine {
	
	public enum EnumStatoOrdine{
		
			PAGATO("P" , "Pagato"),
			PRESA_IN_CARICO("PIC" , "Presa in Carico"),
			IN_CONSEGNA("IC" , "In Consegna"),
			CONSEGNATO("C" , "Consegnato")
		
		;
		
		private EnumStatoOrdine(String code , String desc){
			setCode(code);
			setDesc(desc);
		}
		
		private String code;
		private String desc;
		
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		
		public static EnumStatoOrdine getEnum(String code) {
			for (EnumStatoOrdine enumData : EnumStatoOrdine.values()) {
				if(code.equalsIgnoreCase(enumData.getCode())) {
					return enumData;
				}
			}
			return null;
		}
		
		
	}

}
