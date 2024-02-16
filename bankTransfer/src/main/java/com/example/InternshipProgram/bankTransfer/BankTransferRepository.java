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

    public void create(BankTransferApplicationForm bankTransferApplication) {
        String sql = "INSERT INTO bankTransfer_table(bankName, bankAccountNum, money, branchName, bankAccountType, name, transferDateTime) VALUES(?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, bankTransferApplication.getBankName(), bankTransferApplication.getBankAccountNum(), bankTransferApplication.getMoney(), bankTransferApplication.getBankBranchName(), bankTransferApplication.getBankSubjectName(), bankTransferApplication.getBankAccountName(), bankTransferApplication.getTransferDate());
    }

}
