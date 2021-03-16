package com.ws.enums;

public class Response {
	
	public enum Enum{
		
		SAVE_LETTURA_OK("Salvataggio lettura avvenuto con successo" , "Saved correctly"),
		SAVE_OK("Salvataggio avvenuto con successo" , "Saved correctly"),
		SAVE_KO("Errore durante il salvataggio" , "Saved in error"),
		UPDATE_OK("Aggiornamento avvenuto con successo" , "Update done well"),
		UPDATE_KO("Errore durante l'aggiornamento" , "Error during update"),
		DELETE_OK("Eliminazione avvenuto con successo" , "Delete done well"),
		DELETE_KO("Errore durante l'Eliminazione" , "Error during deleting"),
		EMAIL_ALREADY_USED("Email già usata" , "Email already used"),
		INSERT_ORDINE_OK("Ordine inserito correttamente" , ""),
		INSERT_ORDINE_KO("Errore durante l'inserimento dell'ordine" , ""),
		EMAIL_OR_PASSWORD("Email o password errata" , ""),
		ERRORE_RECUPERO_DATI("Errore durante il recupero dei dati" , ""),
		RECUPERO_DATI_OK("Recupero dati avvenuto con successo" , ""),
		
		;
		
		private Enum(String it , String eng){
			setIt(it);
			setEng(eng);
		}
		
		private String it;
		private String eng;
		
		public String getIt() {
			return it;
		}
		public void setIt(String it) {
			this.it = it;
		}
		public String getEng() {
			return eng;
		}
		public void setEng(String eng) {
			this.eng = eng;
		}
	}

}
