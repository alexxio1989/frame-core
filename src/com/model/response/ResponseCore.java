package com.model.response;

import java.util.List;

import org.springframework.http.HttpStatus;

public class ResponseCore<O> {
	
	public ResponseCore() {
		
	}
	
	private HttpStatus httpStatus;

    public String status;
    
    private List<O> list;
	private O obj;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public List<O> getList() {
		return list;
	}

	public void setList(List<O> list) {
		this.list = list;
	}

	public O getObj() {
		return obj;
	}

	public void setObj(O obj) {
		this.obj = obj;
	}
    
}
