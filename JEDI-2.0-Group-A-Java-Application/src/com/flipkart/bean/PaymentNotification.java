/**
 * 
 */
package com.flipkart.bean;

/**
 * @author rudra.tiwari
 *
 */
public class PaymentNotification {
	
	
	private int studentID;
	private int referenceID;
	private int notificationID;
	private String notificationMessage;
	
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public int getReferenceID() {
		return referenceID;
	}
	public void setReferenceID(int referenceID) {
		this.referenceID = referenceID;
	}
	
	public int getNotificationID() {
		return notificationID;
	}
	public void setNotificationID(int notificationID) {
		this.notificationID = notificationID;
	}
	
	public String getNotificationMessage() {
		return notificationMessage;
	}
	public void setNotificationMessage(String notificationMessage) {
		this.notificationMessage = notificationMessage;
	}
}
