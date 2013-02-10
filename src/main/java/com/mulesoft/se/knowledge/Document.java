package com.mulesoft.se.knowledge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Document {

	private String messageId;
	private Date date;
	private String email;
	private String from;
	private String refId;
	private String subject;
	
	public Date getDate() {
		return date;
	}
	public void setDate(String date) {
		try {
			this.date = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy").parse(strip(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getEmail() {
		return strip(email);
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessageId() {
		return strip(messageId);
	}
	public void setMessageId(String id) {
		this.messageId = id;
	}
	public String getFrom() {
		return strip(from);
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getRefId() {
		return strip(refId);
	}
	public void setRefId(String original) {
		this.refId = original;
	}
	
	private String strip(String field) {
		String newField = field.replaceAll("\n", "").replaceAll("\r", "");
		System.out.println(newField);
		return newField;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
