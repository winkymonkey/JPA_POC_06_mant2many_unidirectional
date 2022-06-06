package org.example.jpa.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Branch {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "BRANCH_ID")
	private int branchId;

	@Column(name = "BRANCH_NAME")
	private String branchName;

	@Column(name = "BRANCH_SHORT_NAME")
	private String branchShortName;

	@Column(name = "DESCRIPTION")
	private String description;
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name = "BRANCH_SUBJECT", 
		joinColumns = @JoinColumn(name = "BRANCH_ID"), 
		inverseJoinColumns = @JoinColumn(name = "SUBJECT_ID"))
	private List<Subject> subjects;
	
	
	
	/* *************************************************************** */
	public int getBranchId() {
		return this.branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return this.branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchShortName() {
		return this.branchShortName;
	}
	public void setBranchShortName(String branchShortName) {
		this.branchShortName = branchShortName;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Subject> getSubjects() {
		return this.subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	public void addSubject(Subject subject){
		this.subjects.add(subject);
	}
}