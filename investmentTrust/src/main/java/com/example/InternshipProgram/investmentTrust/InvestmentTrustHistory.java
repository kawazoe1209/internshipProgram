package com.example.InternshipProgram.investmentTrust;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvestmentTrustHistory {
    private String fundName;
    private String bankName;
    private String branchName;
    private String bankAccountType;
    private Integer bankAccountNum;
    private String name;
    private Integer money;
    private Integer BorrowedAnnualIncome;
    private Integer interestRate;
}

