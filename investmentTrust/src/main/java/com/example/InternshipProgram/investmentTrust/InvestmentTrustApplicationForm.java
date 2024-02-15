package com.example.InternshipProgram.investmentTrust;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InvestmentTrustApplicationForm {
    private String fundName;
    private String bankName;
    private Integer bankAccountNum;
    private Integer money;

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundName() {
        return this.fundName;
    }

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
