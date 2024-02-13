package com.example.InternshipProgram.investmentTrust;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class InvestmentTrustApplicationController {

    @Autowired
    private InvestmentTrustRepository repository;

    @GetMapping("/investmentTrust")
    public String bankTransfer(Model model) {
        model.addAttribute("investmentTrustApplication", new InvestmentTrustApplicationForm());
        model.addAttribute("nameOptions", "福岡銀行");
        return "investmentTrust/investmentTrustMain";
    }

    @PostMapping("/investmentTrustConfirmation")
    public String confirmation(@ModelAttribute InvestmentTrustApplicationForm trustApplicationForm, Model model) {
        model.addAttribute("bankName", trustApplicationForm.getBankName());
        model.addAttribute("bankAccountNum", trustApplicationForm.getBankAccountNum());
        model.addAttribute("investmentTrustApplication",trustApplicationForm);
        return "investmentTrust/investmentTrustConfirmation";
    }
    @PostMapping("/investmentTrustCompletion")
    public String completion(@ModelAttribute InvestmentTrustApplicationForm trustApplicationForm, Model model) {
        repository.create(trustApplicationForm);
        return "investmentTrust/investmentTrustCompletion";
    }
}
