package com.example.InternshipProgram.bankLoan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankLoanApplicationController {

    @Autowired
    private BankLoanRepository repository;

    @GetMapping("/bankLoan")
    public String bankTransfer(Model model) {
        model.addAttribute("bankLoanApplication", new BankLoanApplicationForm());
        model.addAttribute("nameOptions", "福岡銀行");
        return "bankLoan/bankLoanMain";
    }

    @PostMapping("/bankLoanConfirmation")
    public String confirmation(@ModelAttribute BankLoanApplicationForm bankLoanApplicationForm, Model model) {
        model.addAttribute("bankName", bankLoanApplicationForm.getBankName());
        model.addAttribute("bankAccountNum", bankLoanApplicationForm.getBankAccountNum());
        model.addAttribute("bankLoanApplication",bankLoanApplicationForm);
        return "bankLoan/bankLoanConfirmation";
    }

    @PostMapping("/bankLoanCompletion")
    public String completion(@ModelAttribute BankLoanApplicationForm bankLoanApplicationForm, Model model) {
        repository.create(bankLoanApplicationForm);
        return "bankLoan/bankLoanCompletion";
    }

}
