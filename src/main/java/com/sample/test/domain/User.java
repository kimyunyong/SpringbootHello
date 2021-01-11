package com.sample.test.domain;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = {"upw"})
public class User {
	private String uid;
	private String upw;
	private String uname;
	private Integer upoint;
	
	private Date lastLogin;
}