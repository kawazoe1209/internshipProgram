package com.example.InternshipProgram.service;

import com.example.InternshipProgram.entity.BankLoanForm;
import com.example.InternshipProgram.repository.BankLoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BankLoanService {
    @Autowired
    private BankLoanRepository bankLoanRepository;

    public void create(BankLoanForm bankLoanForm) {
        bankLoanRepository.create(bankLoanForm);
    }
}
