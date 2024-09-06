package com.rt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BankAccount")
public class BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int bankId;
	
	private String bankAcctNo;
	
	private String bankCode;
	
	private String branch;
	
}
