package com.rt.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Pan_Details_data")
public class PanDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int panId;
	
	private String panNo;
	
	private String name;
	
	private String barcode;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "bankAcctNo")
	private List<BankAccount> bankAccounts;
}
