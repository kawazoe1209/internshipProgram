package com.example.InternshipProgram.bankLoan;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BankLoanApplicationForm {
    private String bankName;
    private Integer bankAccountNum;
    private String branchName;
    private String bankKinds;
    private String name;
    private Integer loanAmount;
    private Integer annualIncome;
    private String interestRate;

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName(){
        return this.bankName;
    }

    public void setBankAccountNum(Integer bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public Integer getBankAccountNum(){
        return this.bankAccountNum;
    }

    public void setBankKinds(String bankKinds) {
        this.bankKinds = bankKinds;
    }

    public String getBankKinds(){
        return this.bankKinds;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName(){
        return this.branchName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Integer getLoanAmount(){
        return this.loanAmount;
    }

    public void setAnnualIncome(Integer annualIncome) {
        this.annualIncome = annualIncome;
    }

    public Integer getAnnualIncome(){
        return this.annualIncome;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getInterestRate(){
        return this.interestRate;
    }
}
