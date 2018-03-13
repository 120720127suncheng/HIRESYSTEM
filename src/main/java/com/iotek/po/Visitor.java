package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

public class Visitor implements Serializable {

	private Integer id;
	private String visitorName;
	private transient String visitorPassword;
	private Integer visitorAge;
	private String visitorSex;
	private String visitorNational;//游客的民族
	private String visitorPhone;
	private String visitorEmail;
	private Timestamp visitorLoginTime;
	private Timestamp visitorCreateTime;
	private Timestamp visitorModifiedTime;
	private Integer visitorIsOn;//游客是否已登录
	private Integer visitorIsNormal;

	public Visitor() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getVisitorPassword() {
		return visitorPassword;
	}

	public void setVisitorPassword(String visitorPassword) {
		this.visitorPassword = visitorPassword;
	}

	public Integer getVisitorAge() {
		return visitorAge;
	}

	public void setVisitorAge(Integer visitorAge) {
		this.visitorAge = visitorAge;
	}

	public String getVisitorSex() {
		return visitorSex;
	}

	public void setVisitorSex(String visitorSex) {
		this.visitorSex = visitorSex;
	}

	public String getVisitorNational() {
		return visitorNational;
	}

	public void setVisitorNational(String visitorNational) {
		this.visitorNational = visitorNational;
	}

	public String getVisitorPhone() {
		return visitorPhone;
	}

	public void setVisitorPhone(String visitorPhone) {
		this.visitorPhone = visitorPhone;
	}

	public String getVisitorEmail() {
		return visitorEmail;
	}

	public void setVisitorEmail(String visitorEmail) {
		this.visitorEmail = visitorEmail;
	}

	public Timestamp getVisitorLoginTime() {
		return visitorLoginTime;
	}

	public void setVisitorLoginTime(Timestamp visitorLoginTime) {
		this.visitorLoginTime = visitorLoginTime;
	}

	public Timestamp getVisitorCreateTime() {
		return visitorCreateTime;
	}

	public void setVisitorCreateTime(Timestamp visitorCreateTime) {
		this.visitorCreateTime = visitorCreateTime;
	}

	public Timestamp getVisitorModifiedTime() {
		return visitorModifiedTime;
	}

	public void setVisitorModifiedTime(Timestamp visitorModifiedTime) {
		this.visitorModifiedTime = visitorModifiedTime;
	}

	public Integer getVisitorIsOn() {
		return visitorIsOn;
	}

	public void setVisitorIsOn(Integer visitorIsOn) {
		this.visitorIsOn = visitorIsOn;
	}

	public Integer getVisitorIsNormal() {
		return visitorIsNormal;
	}

	public void setVisitorIsNormal(Integer visitorIsNormal) {
		this.visitorIsNormal = visitorIsNormal;
	}

	@Override
	public String toString() {
		return "Visitor{" +
				"id=" + id +
				"visitorName=" + visitorName +
				"visitorPassword=" + visitorPassword +
				"visitorAge=" + visitorAge +
				"visitorSex=" + visitorSex +
				"visitorNational=" + visitorNational +
				"visitorPhone=" + visitorPhone +
				"visitorEmail=" + visitorEmail +
				"visitorLoginTime=" + visitorLoginTime +
				"visitorCreateTime=" + visitorCreateTime +
				"visitorModifiedTime=" + visitorModifiedTime +
				"visitorIsOn=" + visitorIsOn +
				"visitorIsNormal=" + visitorIsNormal +
				"}";
	}
}