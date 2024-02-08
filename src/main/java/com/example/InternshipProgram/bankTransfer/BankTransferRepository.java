package com.example.InternshipProgram.bankTransfer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BankTransferRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<BankTransferHistory> select() {
        return jdbcTemplate.query("""
                        SELECT * FROM bankTransfer_table ORDER BY transferDateTime
                        """,
                new DataClassRowMapper<>(BankTransferHistory.class));
    }

    public void create(BankTransferApplicationForm bankTransferApplication) {
        String sql = "INSERT INTO bankTransfer_table(bankAccountNum, name) VALUES(?, ?)";
        jdbcTemplate.update(sql, bankTransferApplication.getBankAccountNum(), bankTransferApplication.getName());
    }

}
