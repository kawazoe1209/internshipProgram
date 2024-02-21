package com.example.InternshipProgram.bankTransfer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BankTransferApplicationController {

    @Autowired
    private BankTransferRepository repository;

    @GetMapping("/bankTransfer")
    public String bankTransfer(Model model) {
        model.addAttribute("bankTransferApplication", new BankTransferApplicationForm());
        Map<Integer, String> nameOptions = new HashMap<>();
        nameOptions.put(1, "福岡");
        nameOptions.put(2, "S");
        nameOptions.put(3, "N");
        model.addAttribute("nameOptions",nameOptions);
        Map<Integer, String> nameOptions1 = new HashMap<>();
        nameOptions1.put(1, "普通");
        nameOptions1.put(2, "当座");
        nameOptions1.put(3, "定期");
        nameOptions1.put(4, "貯蓄");
        nameOptions1.put(5, "外貨");
        nameOptions1.put(6, "通知");
        nameOptions1.put(7, "別段");
        nameOptions1.put(8, "納税準備");
        model.addAttribute("nameOptions1",nameOptions1);
        return "bankTransfer/bankTransferMain";

    }

    @PostMapping("/bankTransferConfirmation")
    public String confirmation(@ModelAttribute BankTransferApplicationForm bankTransferApplication, Model model) {
        model.addAttribute("bankName", bankTransferApplication.getBankName());
        model.addAttribute("bankBranchName", bankTransferApplication.getBankBranchName());
        model.addAttribute("bankSubjectName", bankTransferApplication.getBankSubjectName());
        model.addAttribute("bankAccountNum", bankTransferApplication.getBankAccountNum());
        model.addAttribute("bankAccountName", bankTransferApplication.getBankAccountName());
        model.addAttribute("transferDate", bankTransferApplication.getTransferDate());
        model.addAttribute("bankTransferApplication",bankTransferApplication);
        return "bankTransfer/bankTransferConfirmation";

    }

    @PostMapping("/bankTransferCompletion")
    public String completion(@ModelAttribute BankTransferApplicationForm bankTransferApplicationForm, Model model) {
        repository.create(bankTransferApplicationForm);
        return "bankTransfer/bankTransferCompletion";
    }

    @PostMapping("/transferList")
    public String transfer(@ModelAttribute BankTransferApplicationForm bankTransferApplicationForm, Model model) {
        repository.create(bankTransferApplicationForm);
        return "bankTransfer/bankTransferList";
    }

}
