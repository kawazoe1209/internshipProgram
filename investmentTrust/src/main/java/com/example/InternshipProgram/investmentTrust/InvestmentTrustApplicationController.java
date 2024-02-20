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
        model.addAttribute("nameOptions", "にじそら銀行");
        model.addAttribute("branchNameOptions1", "香椎支店");
        model.addAttribute("branchNameOptions2", "千早支店");
        model.addAttribute("bankAccountTypeOptions1", "普通");
        model.addAttribute("bankAccountTypeOptions2", "定期");
        //model.addAttribute("message", "下記の申し込みでよろしいでしょうか");
        //model.addAttribute("fundNameOptions", "銘柄１");
        return "investmentTrust/investmentTrustMain";
    }

    @PostMapping("/investmentTrustConfirmation")
    public String confirmation(@ModelAttribute InvestmentTrustApplicationForm trustApplicationForm, Model model) {
        model.addAttribute("bankName", trustApplicationForm.getBankName());
        model.addAttribute("bankAccountNum", trustApplicationForm.getBankAccountNum());
        model.addAttribute("investmentTrustApplication",trustApplicationForm);
        model.addAttribute("branchName",trustApplicationForm.getBranchName());
        model.addAttribute("name",trustApplicationForm.getName());
        model.addAttribute("bankAccountType",trustApplicationForm.getBankAccountType());
        model.addAttribute("money",trustApplicationForm.getMoney());
        model.addAttribute("fundName",trustApplicationForm.getFundName());
        model.addAttribute("message","下記の内容でよろしいでしょうか");
        return "investmentTrust/investmentTrustConfirmation";
    }


    @PostMapping("/investmentTrustCompletion")
    public String completion(@ModelAttribute InvestmentTrustApplicationForm trustApplicationForm, Model model) {
        repository.create(trustApplicationForm);
        return "investmentTrust/investmentTrustCompletion";
    }
}
