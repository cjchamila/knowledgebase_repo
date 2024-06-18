package com.chamila.kb.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;

public class MyUtils {//Can use if Student is to save as BLOB in db. This code block has some value to learn I/O, Serialization concepts

	public static String serializeToString(Object obj) {
		
		try(ByteArrayOutputStream byteOut=new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(byteOut);){ 
			
			out.writeObject(obj);
			byte[] serializedBytes=byteOut.toByteArray();
			
			String serilizedStudentString=new String(serializedBytes, StandardCharsets.ISO_8859_1);
			return serilizedStudentString;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
	}
}
