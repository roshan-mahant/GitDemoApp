package com.access.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="sp_tab")
public class Specialization {
	
	@Id
	@GeneratedValue
    @Column(name="sp_code")
	private Integer spcode;
	
	@Column(name="sp_name")
	private String spname;
	
	@Column(name="sp_note")
	private String spnote;
	
}
