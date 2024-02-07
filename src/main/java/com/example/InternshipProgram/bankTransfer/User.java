package com.example.InternshipProgram.bankTransfer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int accountNum;
    private String name;
    private String money;
}

