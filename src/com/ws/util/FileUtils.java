package com.ws.util;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.github.techgnious.IVCompressor;
import io.github.techgnious.dto.ResizeResolution;
import io.github.techgnious.dto.VideoFormats;
import io.github.techgnious.exception.VideoException;


public class FileUtils {
	
	public static List<byte[]> divideArray(byte[] source, int chunksize) {

		List<byte[]> byteArrayPortions = new ArrayList<>();

	    // 5mb is about 5.000.000 bytes
	   
	    int offset = 0;

	    // split the array
	    while(offset < source.length) {
	      // into 5 mb portions
	      byte[] portion = Arrays.copyOfRange(source, offset, offset + chunksize);

	      // update the offset to increment the copied area
	      offset += chunksize;

	      // add the byte array portions to the list
	      byteArrayPortions.add(portion);
	    }

	    return byteArrayPortions;
	}

	public static InputStream getInputStream(String pathFile) throws FileNotFoundException {
		InputStream finput = new FileInputStream(pathFile);
		return finput;
	}
	
	public static InputStream fromBase64(String base64) {
		byte[] name = getByteArray(base64);
		return new ByteArrayInputStream(name);
	}
	
	public static InputStream fromByteArray(byte[] name) {
		return new ByteArrayInputStream(name);
	}

	public static byte[] getByteArray(String base64) {
		byte[] name = org.apache.commons.codec.binary.Base64.decodeBase64(base64.getBytes());
		return name;
	}
	
	public static byte[] getByteArray(InputStream stream) throws IOException {
		byte[] targetArray = new byte[stream.available()];
		stream.read(targetArray);
		return targetArray;
	}
	
	public static String getBase64(byte[] imageBytes) {
		String imageStr = org.apache.commons.codec.binary.Base64.encodeBase64String(imageBytes);
		return imageStr;
	}
	
	public static String getBase64(InputStream stream) throws IOException {
		return getBase64(getByteArray(stream));
	}
	
	public static byte[] resizeVideo(byte[] data) throws VideoException {
		IVCompressor compress = new IVCompressor();
		
		byte[] VideoOutput=compress.reduceVideoSize(data, VideoFormats.MP4,ResizeResolution.VIDEO_DEFAULT);//for video compression
		return VideoOutput; 
	}
	

}
