package com.example.InternshipProgram.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankLoanHistory {
    private String bankName;
    private String branchName;
    private String bankAccountType;
    private Integer bankAccountNum;
    private String name;
    private String tradingName;
    private Integer money;
}

