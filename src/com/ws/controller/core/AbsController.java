package com.ws.controller.core;

import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.response.ResponseCore;

public abstract class AbsController<I>{
	

    @PostMapping(value = "/save" ,  produces = "application/json")
	public abstract ResponseEntity<ResponseCore<I>> save(@RequestBody I obj) throws DataAccessException, SQLException ;
    
    @PostMapping(value = "/update" ,  produces = "application/json")
    public abstract ResponseEntity<ResponseCore<I>> update(@RequestBody I obj) throws DataAccessException, SQLException ;
    
    @PostMapping(value = "/delete" ,  produces = "application/json")
    public abstract ResponseEntity<ResponseCore<I>> delete(@RequestBody I obj) throws DataAccessException, SQLException ;
    
    @PostMapping(value = "/retrieve" ,  produces = "application/json")
    public abstract ResponseEntity<ResponseCore<I>> retrieve(@RequestBody I obj) throws DataAccessException, SQLException ;

    @GetMapping(value = "/get" ,  produces = "application/json")
    public abstract ResponseEntity<ResponseCore<I>> get(@RequestParam Integer id) throws DataAccessException, SQLException ;
    
    @GetMapping(value = "/getallbyid" ,  produces = "application/json")
    public abstract ResponseEntity<ResponseCore<I>> getAll(@RequestParam Integer id) throws DataAccessException, SQLException ;
    
    @GetMapping(value = "/getall" ,  produces = "application/json")
    public abstract ResponseEntity<ResponseCore<I>> getAll() throws DataAccessException, SQLException ;
    
    
}
