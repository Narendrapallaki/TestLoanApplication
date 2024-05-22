package com.loan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanApp {

	 public int loanAmount;
	 public String designation;
	 public int craditScore;
	 public int income;
	// public boolean approvel;
}
