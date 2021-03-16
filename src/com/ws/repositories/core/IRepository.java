package com.ws.repositories.core;

import org.springframework.http.ResponseEntity;

import com.model.response.ResponseCore;

public interface IRepository<I> {
	
	public ResponseEntity<ResponseCore<I>>  save(I obj) ;
    
    public ResponseEntity<ResponseCore<I>>  update(I obj);
 
    public ResponseEntity<ResponseCore<I>>  delete(I obj);
    
    public ResponseEntity<ResponseCore<I>>  deleteAll(Object id);
    
    public ResponseEntity<ResponseCore<I>>  retrieve(I obj);
    
    public ResponseEntity<ResponseCore<I>>  get(Object id);
    
    public ResponseEntity<ResponseCore<I>>  getAll(Object id);
    
    public ResponseEntity<ResponseCore<I>>  getAll();
    
 

}
