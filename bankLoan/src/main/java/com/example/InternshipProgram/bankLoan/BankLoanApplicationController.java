package com.example.InternshipProgram.bankLoan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class BankLoanApplicationController {

    @Autowired
    private BankLoanRepository repository;

    @GetMapping("/bankLoan")
    public String bankTransfer(Model model) {
        model.addAttribute("bankLoanApplication", new BankLoanApplicationForm());
        Map<Integer, String> nameOptions = new HashMap<>();
        nameOptions.put(1, "選択してください");
        nameOptions.put(2, "福岡銀行");
        model.addAttribute("nameOptions",nameOptions);
        Map<Integer, String> kindsOptions = new HashMap<>();
        kindsOptions.put(1, "選択してください");
        kindsOptions.put(2, "普通預金");
        kindsOptions.put(3, "定期預金");
        kindsOptions.put(4, "当座預金");
        model.addAttribute("kindsOptions",kindsOptions);
        Map<Integer, String> rateOptions = new HashMap<>();
        rateOptions.put(1, "選択してください");
        rateOptions.put(2, "固定金利");
        rateOptions.put(3, "変動金利");
        model.addAttribute("rateOptions",rateOptions);
        return "bankLoan/bankLoanMain";
    }

    /*@GetMapping("/bankLoanConfirmation")
    public String confirmation(Model model){
        model.addAttribute("message", "確認画面テスト");
        return "bankLoan/bankLoanConfirmation";
    }*/

    @PostMapping("/bankLoanConfirmation")
    public String confirmation(@ModelAttribute BankLoanApplicationForm bankLoanApplicationForm, Model model) {
        model.addAttribute("bankName", bankLoanApplicationForm.getBankName());
        model.addAttribute("branchName", bankLoanApplicationForm.getBranchName());
        model.addAttribute("bankKinds", bankLoanApplicationForm.getBankKinds());
        model.addAttribute("bankAccountNum", bankLoanApplicationForm.getBankAccountNum());
        model.addAttribute("Name", bankLoanApplicationForm.getName());
        model.addAttribute("loanAmount", bankLoanApplicationForm.getLoanAmount());
        model.addAttribute("annualIncome", bankLoanApplicationForm.getAnnualIncome());
        model.addAttribute("interestRate", bankLoanApplicationForm.getInterestRate());
        model.addAttribute("bankLoanApplication",bankLoanApplicationForm);
        return "bankLoan/bankLoanConfirmation";
    }

    @PostMapping("/bankLoanCompletion")
    public String completion(@ModelAttribute BankLoanApplicationForm bankLoanApplicationForm, Model model) {
        repository.create(bankLoanApplicationForm);
        return "bankLoan/bankLoanCompletion";
    }

}
