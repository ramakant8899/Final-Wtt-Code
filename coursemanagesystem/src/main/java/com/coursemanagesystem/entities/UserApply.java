package com.coursemanagesystem.entities;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="ApplyDetails")
public class UserApply 
{	 
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="UserApply_Id")
	private int id;
	
	@NotEmpty(message="Fill Up Your Name....")
	@Column(length=30)
	@Pattern(regexp = "[a-zA-Z]+\\.?", message="Invalid Name.....")
	private String name;
	
	@Email(message="Invalid Email...")
	@Column(length=30, unique = true)
	private String email;
	
	
	@NotEmpty
	@Column(length=20)
	private String qualification;
	
	@NotBlank
	@Column(length=15,unique = true)
	@Pattern(regexp= "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[6789]\\d{9}$",message="Invalid Contact Number....")
	private String phoneno;
	
	@NotEmpty
	@Column(length=50)
	private String address;
	
	@Column(name="Apply_Date",length=15)
	private Date addedDate;
	
	
	@ManyToOne
	@JoinColumn(name="id")
	private Course course;


	public UserApply() 
	{
		super();
	}


	public UserApply(int id,
			@NotEmpty(message = "Fill Up Your Name....") @Pattern(regexp = "[a-zA-Z]+\\.?", message = "Invalid Name.....") String name,
			@Email(message = "Invalid Email...") String email, @NotEmpty String qualification,
			@NotBlank @Pattern(regexp = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[6789]\\d{9}$", message = "Invalid Contact Number....") String phoneno,
			@NotEmpty String address, Date addedDate, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.qualification = qualification;
		this.phoneno = phoneno;
		this.address = address;
		this.addedDate = addedDate;
		this.course = course;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Date getAddedDate() {
		return addedDate;
	}


	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "UserApply [id=" + id + ", name=" + name + ", email=" + email + ", qualification=" + qualification
				+ ", phoneno=" + phoneno + ", address=" + address + ", addedDate=" + addedDate + ", course=" + course
				+ "]";
	}


	
	
	
}
