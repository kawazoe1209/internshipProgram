package com.example.InternshipProgram.bankLoan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BankLoanRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void create(BankLoanApplicationForm bankLoanApplicationForm) {
        String sql = "INSERT INTO bankLoan_table(bankName, bankAccountNum, loanAmount) VALUES(?, ?, ?)";
        jdbcTemplate.update(sql, bankLoanApplicationForm.getBankName(), bankLoanApplicationForm.getBankAccountNum(), bankLoanApplicationForm.getMoney());
    }

}
