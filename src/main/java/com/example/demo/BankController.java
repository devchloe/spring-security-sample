package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    @GetMapping("/transfer")
    public void transfer(@RequestParam("accountNo") int accountNo, @RequestParam("amount") final int amount) {
        System.out.println("Transfer to" + accountNo);
    }

    @PostMapping("/transfer")
    public void transfer2(@RequestParam("accountNo") int accountNo, @RequestParam("amount") final int amount) {
        System.out.println("Transfer to" + accountNo);
    }

}
