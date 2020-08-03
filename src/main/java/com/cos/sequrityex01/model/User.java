package com.cos.sequrityex01.model;



import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

//ORM -Object Relation Mapping

@Data
@Entity //자동으로 db에 등록해줌 ? 
public class User {
	@Id // primary Key 걸어줌
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto implement 적용
	private int id;
	private String username;
	private String password;
	private String email;
	private String role;
	@CreationTimestamp
	private Timestamp createDate;
}
