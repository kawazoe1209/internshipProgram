package com.example.InternshipProgram.investmentTrust;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InvestmentTrustRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void create(InvestmentTrustApplicationForm trustApplicationForm) {
        String sql = "INSERT INTO investmentTrust_table(bankName, bankAccountNum, money) VALUES(?, ?, ?)";
        jdbcTemplate.update(sql, trustApplicationForm.getBankName(), trustApplicationForm.getBankAccountNum(), trustApplicationForm.getMoney());
    }

}
