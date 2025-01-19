package com.example.InternshipProgram.bankLoan;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class BankLoanApplicationForm {
    private String bankName;
    private Integer bankAccountNum;
    private Integer money;
}
