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

    private String branchName;
    private String bankAccountType;
    private String name;

    //private Integer purchaseMoney;

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundName() {
        return this.fundName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    //public void setBranchBankName(String bankName) {
      //  this.branchBankName = branchBankName;
    //}

    public String getBankName(){
        return this.bankName;
    }


//    public String getBranchBankName(){
  //      return this.branchBankName;
    //}


    public void setBankAccountNum(Integer bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public void setBranchBankAccountNum(Integer branchBankAccountNum) {
        this.bankAccountNum = branchBankAccountNum;
    }

    //public Integer getBranchBankAccountNum(){
     //   return this.branchBankAccountNum;
    //}

    public Integer getBankAccountNum(){
        return this.bankAccountNum;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getMoney(){
        return this.money;
    }

///////
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName(){
        return this.branchName;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public String getBankAccountType(){
        return this.bankAccountType;
    }

}
