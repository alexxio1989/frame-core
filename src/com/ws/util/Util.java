package com.ws.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.model.response.ResponseCore;

public class Util {
	
	public static  <O> ResponseEntity<ResponseCore<O>> getResponseOK(O obj , java.util.List<O> list){
		ResponseCore<O> genericResponse = new ResponseCore<O>();
		genericResponse.setObj(obj);
		genericResponse.setList(list);
		genericResponse.setStatus("Operazione riuscita con successo");
		ResponseEntity<ResponseCore<O>> res = new ResponseEntity<ResponseCore<O>>(genericResponse, HttpStatus.OK);
		return res;
	}
	
	public static  <O> ResponseEntity<ResponseCore<O>> getResponseKO(){
		ResponseCore<O> genericResponse = new ResponseCore<O>();
		genericResponse.setStatus("Operazione in errore");
		ResponseEntity<ResponseCore<O>> res = new ResponseEntity<ResponseCore<O>>(genericResponse, HttpStatus.BAD_GATEWAY);
		return res;
	}

}
