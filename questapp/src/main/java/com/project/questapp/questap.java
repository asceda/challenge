package com.project.questapp;



import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table (name = "todo")
public class questap {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	
private Long idLong;
	@Column
private String titleString;
private Date date; 
private String statuString;
public questap () {
	
}
public Long getIdLong() {
	return idLong;
}
public void setIdLong(Long idLong) {
	this.idLong = idLong;
}
public String getTitleString() {
	return titleString;
}
public void setTitleString(String titleString) {
	this.titleString = titleString;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getStatuString() {
	return statuString;
}
public void setStatuString(String statuString) {
	this.statuString = statuString;
}

}
