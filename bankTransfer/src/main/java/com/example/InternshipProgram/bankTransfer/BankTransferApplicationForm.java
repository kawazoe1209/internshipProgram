package com.example.InternshipProgram.bankTransfer;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BankTransferApplicationForm {
    private String bankName;
    private Integer bankAccountNum;
    private Integer money;
    private String bankBranchName;
    private String bankSubjectName;
    private String bankAccountName;
    private String transferDate;


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

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }
    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankSubjectName(String bankSubjectName) {
        this.bankSubjectName = bankSubjectName;
    }
    public String getBankSubjectName() {
        return bankSubjectName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }
    public String getBankAccountName() {
        return bankAccountName;
    }


    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate;
    }
    public String getTransferDate() {
        return transferDate;
    }


}
