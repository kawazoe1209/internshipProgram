package com.example.InternshipProgram.bankTransfer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BankTransferApplicationController {

    @Autowired
    private BankTransferRepository repository;

    @GetMapping("/bankTransfer")
    public String bankTransfer(Model model) {
        model.addAttribute("bankTransferApplication", new BankTransferApplicationForm());
        model.addAttribute("nameOptions", "福岡銀行");
        return "bankTransfer/bankTransferMain";
    }

    @PostMapping("/confirmation")
    public String confirmation(@ModelAttribute BankTransferApplicationForm bankTransferApplication, Model model) {
        model.addAttribute("bankName", bankTransferApplication.getBankName());
        model.addAttribute("bankAccountNum", bankTransferApplication.getBankAccountNum());
        model.addAttribute("bankTransferApplication",bankTransferApplication);
        return "bankTransfer/bankTransferConfirmation";
    }

    @PostMapping("/completion")
    public String completion(@ModelAttribute BankTransferApplicationForm bankTransferApplicationForm, Model model) {
        repository.create(bankTransferApplicationForm);
        return "bankTransfer/bankTransferCompletion";
    }

    @PostMapping("/transferList")
    public String transfer(@ModelAttribute BankTransferApplicationForm bankTransferApplicationForm, Model model) {
        repository.create(bankTransferApplicationForm);
        List<BankTransferHistory> BankTransferHistories = repository.select();
        model.addAttribute("BankTransferHistories", BankTransferHistories);
        return "bankTransfer/bankTransferList";
    }

}
