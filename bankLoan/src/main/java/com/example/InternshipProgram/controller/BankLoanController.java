package com.example.InternshipProgram.controller;

import com.example.InternshipProgram.entity.BankLoanForm;
import com.example.InternshipProgram.service.BankLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankLoanController {

    @Autowired
    private BankLoanService bankLoanService;

    @GetMapping("/bankLoan")
    public String bankTransfer(Model model) {
        model.addAttribute("bankLoanApplication", new BankLoanForm());
        model.addAttribute("nameOptions", "福岡銀行");
        return "bankLoan/bankLoanMain";
    }

    @PostMapping("/bankLoanConfirmation")
    public String confirmation(@ModelAttribute BankLoanForm bankLoanForm, Model model) {
        bankLoanForm.setBankName("1000");
        model.addAttribute("bankName", bankLoanForm.getBankName());
        model.addAttribute("bankAccountNum", bankLoanForm.getBankAccountNum());
        model.addAttribute("bankLoanApplication", bankLoanForm);
        return "bankLoan/bankLoanConfirmation";
    }

    @PostMapping("/bankLoanCompletion")
    public String completion(@ModelAttribute BankLoanForm bankLoanForm, Model model) {
        bankLoanService.create(bankLoanForm);
        return "bankLoan/bankLoanCompletion";
    }

}
