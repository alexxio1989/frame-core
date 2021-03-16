package com.ws.enums;

public class ModPagamento {
	
	public enum EnumModPagamento{
		
		CC("CC","Carta di Credito"),
		RIN("RIN","Ritiro in Negozio"),
		PAC("PAC","Pagamento alla Consegna")
		
		
		;
		
		private EnumModPagamento(String code , String desc){
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
		
		public static EnumModPagamento getEnum(String code) {
			for (EnumModPagamento enumData : EnumModPagamento.values()) {
				if(code.equalsIgnoreCase(enumData.getCode())) {
					return enumData;
				}
			}
			return null;
		}
		
		
	}

}

