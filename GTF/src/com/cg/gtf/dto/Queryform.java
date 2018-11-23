package com.cg.gtf.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="query_master")
public class Queryform 
{
	
	@Id
	@Column(name="query_id")
	@NotNull(message="Query Id cannot be Empty")
	private int queryId;
	@Column(name="technology")
	private String technology;
	@Column(name="query")
	private String question;
	@Column(name="query_raised_by")
	private String questionBy;
	@Column(name="solutions")
	private String solution;
	@Column(name="solution_given_by")
	private String answerBy;
	public int getQueryId() {
		return queryId;
	}
	public void setQueryId(int queryId) {
		this.queryId = queryId;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getQuestionBy() {
		return questionBy;
	}
	public void setQuestionBy(String questionBy) {
		this.questionBy = questionBy;
	}
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public String getAnswerBy() {
		return answerBy;
	}
	public void setAnswerBy(String answerBy) {
		this.answerBy = answerBy;
	}
	@Override
	public String toString() {
		return "Queryform [queryId=" + queryId + ", technology=" + technology
				+ ", question=" + question + ", questionBy=" + questionBy
				+ ", solution=" + solution + ", answerBy=" + answerBy + "]";
	}
	public Queryform(int queryId, String technology, String question,
			String questionBy, String solution, String answerBy) {
		super();
		this.queryId = queryId;
		this.technology = technology;
		this.question = question;
		this.questionBy = questionBy;
		this.solution = solution;
		this.answerBy = answerBy;
	}
	public Queryform() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
