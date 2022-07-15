package com.coursemanagesystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name="course")
@SQLDelete(sql = "UPDATE course SET deleted=true WHERE id=?")
@Where(clause = "deleted=false")
public class Course 
{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private  int id;
	

	@Column(name="Course_Name",length=20)
	@NotEmpty
	@Size(min=1, message="Course Name must be min of 1 characters...")
	private String name;
	
	@Column(name="Course_Description",length=50)
	@NotEmpty(message="Fillup The Course Details")
	private String description;
	
	@Column(name="Course_Duration",length=15)
	@NotEmpty(message="Fillup The Course Time Duration")
	private String duration;
	
	@Column(name="Course_Fee")
	@NotNull(message="Fillup The Course Fee")
	private int fee;
	
	@Column(name="Course_Image")
	private String image;

	public Course() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int id, @NotEmpty @Size(min = 1, message = "Course Name must be min of 1 characters...") String name,
			@NotEmpty(message = "Fillup The Course Details") String description,
			@NotEmpty(message = "Fillup The Course Time Duration") String duration,
			@NotNull(message = "Fillup The Course Fee") int fee, String image) 
	{
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.duration = duration;
		this.fee = fee;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() 
	{
		return "Course [id=" + id + ", name=" + name + ", description=" + description + ", duration=" + duration
				+ ", fee=" + fee + ", image=" + image + "]";
	}
	
}
