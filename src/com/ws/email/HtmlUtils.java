package com.ws.email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HtmlUtils {
	
	

	public static String bufferHtml(String template) {
		String content = "";
		try {
			BufferedReader in = new BufferedReader(new FileReader(template));
		    String str;
		    while ((str = in.readLine()) != null) {
		        content +=str;
		    }
		    in.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		return content;
	}

}
