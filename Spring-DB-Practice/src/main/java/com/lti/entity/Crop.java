package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_crop")
public class Crop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="myseq")
	@SequenceGenerator(name="myseq" , sequenceName= "partno_seq", allocationSize = 10)
	@Column(name="cropid")
	private int cropId;
	
	@Column(name="cropname")
	private String cropName;
	
	@Column(name="croptype")
	private String cropType;
	
	@Column(name="cropmsp")
	private double cropMsp;
	
	public int getCropId() {
		return cropId;
	}
	public void setCropId(int cropId) {
		this.cropId = cropId;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public String getCropType() {
		return cropType;
	}
	public void setCropType(String cropType) {
		this.cropType = cropType;
	}
	public double getCropMsp() {
		return cropMsp;
	}
	public void setCropMsp(double cropMsp) {
		this.cropMsp = cropMsp;
	}
	
	@Override
	public String toString() {
		return "Crop [cropId=" + cropId + ", cropName=" + cropName + ", cropType=" + cropType + ", cropMsp=" + cropMsp
				+ "]";
	}
	
	
	

}
