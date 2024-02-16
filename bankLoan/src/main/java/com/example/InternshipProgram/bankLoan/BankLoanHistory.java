package com.example.InternshipProgram.bankLoan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankLoanHistory {
    private String bankName;
    private Integer bankAccountNum;
    private String branchName;
    private String bankKinds;
    private String name;
    private Integer loanAmount;
    private Integer annualIncome;
    private String interestRate;
}

