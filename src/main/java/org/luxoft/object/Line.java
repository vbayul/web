package org.luxoft.object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "line")
public class Line {

	@Id @GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="idfile")
	private int idfile;
	@Column(name="longWord")
	private String longWord;
	@Column(name="shortWord")
	private String shortWord;
	@Column(name="lineLength")
	private int lineLength;
	@Column(name="avgWord")
	private double avgWord;

	public int getIdfile() {
		return idfile;
	}
	public void setIdfile(int idfile) {
		this.idfile = idfile;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLongWord() {
		return longWord;
	}
	public void setLongWord(String longWord) {
		this.longWord = longWord;
	}
	public String getShortWord() {
		return shortWord;
	}
	public void setShortWord(String shortWord) {
		this.shortWord = shortWord;
	}
	public int getLineLength() {
		return lineLength;
	}
	public void setLineLength(int lineLength) {
		this.lineLength = lineLength;
	}
	public double getAvgWord() {
		return avgWord;
	}
	public void setAvgWord(double avgWord) {
		this.avgWord = avgWord;
	}	
}