package com.example.InternshipProgram.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankLoanForm {
    @NonNull
    private String bankName;
    @NonNull
    private Integer bankAccountNum;
    @NonNull
    private Integer money;
}
