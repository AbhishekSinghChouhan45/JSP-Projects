package com.nt.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Customers implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer cId;
	@NonNull
	private String cName;
	@NonNull
	private String cUsername;
	@NonNull
	private String cPassword;
	@NonNull
	private Date cDob;
	@NonNull
	private String cType;
	@NonNull
	private String cGender;
	@NonNull
	private Long cNumber;
	@NonNull
	private String cAddress;
	@NonNull
	private Double cBalance;
	@NonNull
	private String cIdentity;
	//Non constructor properties
	private Integer cAge;
	private Timestamp creationDate;
	private Timestamp lastUpdate;
	
}
