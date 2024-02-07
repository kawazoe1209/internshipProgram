package com.example.bankTransfer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankTransferApplicationController {

    @Autowired
    private InternshipProgramRepository repository;

    @GetMapping("/bankTransfer")
    public String bankTransfer(Model model) {
        System.out.println(repository.select());
        model.addAttribute("greeting", new Greeting());
        return "bankTransferMain";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting,Model model) {
        System.out.println(greeting.getAccounNum());
        model.addAttribute("greeting", new Greeting());
        return "bankTransferMain";
    }
}
