package org.example.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Subject {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "SUBJECT_ID")
	private int subjectId;

	@Column(name = "SUBJECT_DESC")
	private String subjectDesc;

	@Column(name = "SUBJECT_NAME")
	private String subjectName;
	
	
	
	/* *************************************************************** */
	public int getSubjectId() {
		return this.subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectDesc() {
		return this.subjectDesc;
	}
	public void setSubjectDesc(String subjectDesc) {
		this.subjectDesc = subjectDesc;
	}
	public String getSubjectName() {
		return this.subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
}