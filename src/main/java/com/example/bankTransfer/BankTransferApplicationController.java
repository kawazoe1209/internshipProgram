package com.example.bankTransfer;

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
    private InternshipProgramRepository repository;

    @GetMapping("/bankTransfer")
    public String bankTransfer(Model model) {
        model.addAttribute("bankTransferApplication", new BankTransferApplication());
        return "bankTransfer/bankTransferMain";
    }

    @PostMapping("/confirmation")
    public String confirmation(@ModelAttribute BankTransferApplication bankTransferApplication, Model model) {
        model.addAttribute("accountNum", bankTransferApplication.getAccountNum());
        model.addAttribute("name", bankTransferApplication.getName());
        model.addAttribute("bankTransferApplication",bankTransferApplication);
        return "bankTransfer/transferConfirmation";
    }

    @PostMapping("/transfer")
    public String transfer(@ModelAttribute BankTransferApplication bankTransferApplication, Model model) {
        repository.create(bankTransferApplication);
        List<User> users = repository.select();
        model.addAttribute("users", users);
        return "bankTransfer/bankTransferList";
    }

}
