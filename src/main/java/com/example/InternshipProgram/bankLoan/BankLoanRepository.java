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

    public List<BankLoanHistory> select() {
        return jdbcTemplate.query("""
                        SELECT * FROM bankLoan_table
                        """,
                new DataClassRowMapper<>(BankLoanHistory.class));
    }

    public void create(BankLoanApplicationForm bankLoanApplicationForm) {
        String sql = "INSERT INTO bankLoan_table(bankName, bankAccountNum, money) VALUES(?, ?, ?)";
        jdbcTemplate.update(sql, bankLoanApplicationForm.getBankName(), bankLoanApplicationForm.getBankAccountNum(), bankLoanApplicationForm.getMoney());
    }

}
