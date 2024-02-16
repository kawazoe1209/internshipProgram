package com.example.InternshipProgram.bankLoan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BankLoanRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void create(BankLoanApplicationForm bankLoanApplicationForm) {
        String sql = "INSERT INTO bankLoan_table(bankName, branchName, bankKinds, bankAccountNum, name, loanAmount, annualIncome, interestRate) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, bankLoanApplicationForm.getBankName(), bankLoanApplicationForm.getBranchName(), bankLoanApplicationForm.getBankKinds(), bankLoanApplicationForm.getBankAccountNum(), bankLoanApplicationForm.getName(), bankLoanApplicationForm.getLoanAmount(), bankLoanApplicationForm.getAnnualIncome(), bankLoanApplicationForm.getInterestRate());
    }

}
