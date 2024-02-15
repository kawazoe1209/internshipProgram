package com.example.InternshipProgram.bankLoan;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BankLoanApplicationForm {
    private String bankName;
    private Integer bankAccountNum;
    private Integer money;

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

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getMoney(){
        return this.money;
    }
}
