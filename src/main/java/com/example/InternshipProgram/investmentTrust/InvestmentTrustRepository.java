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

    public List<InvestmentTrustHistory> select() {
        return jdbcTemplate.query("""
                        SELECT * FROM investmentTrust_table
                        """,
                new DataClassRowMapper<>(InvestmentTrustHistory.class));
    }
}
