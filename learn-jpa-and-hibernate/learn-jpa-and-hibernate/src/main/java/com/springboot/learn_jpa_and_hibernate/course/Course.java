package com.springboot.learn_jpa_and_hibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
@Id
private long id;
@Column
private String name;
@Column
private String author;
@Override
public String toString() {
	return "Course [lid=" + id + ", name=" + name + ", author=" + author + "]";
}
public long getid() {
	return id;
}
public String getName() {
	return name;
}
public String getAuthor() {
	return author;
}
public void setLid(long lid) {
	this.id = lid;
}
public void setName(String name) {
	this.name = name;
}
public void setAuthor(String author) {
	this.author = author;
}
public Course(long lid, String name, String author) {
	super();
	this.id = lid;
	this.name = name;
	this.author = author;
}
public Course() {};
}
