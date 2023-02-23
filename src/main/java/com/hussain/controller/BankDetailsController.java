package com.hussain.controller;

import com.hussain.entity.CardDetail;
import com.hussain.service.BankDetailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/bankDetail")
public class BankDetailsController {

    private final BankDetailService bankDetailService;

    @PostMapping
    public CardDetail saveBankDetails(@RequestBody CardDetail cardDetail){
        return bankDetailService.saveBankDetails(cardDetail);
    }

    @GetMapping
    public List<CardDetail> getCardDetail(){
        return bankDetailService.getBankDetails();
    }

    @GetMapping("/{id}")
    public CardDetail getCardDetailById(@PathVariable Long id){
        return bankDetailService.getBankDetailById(id);
    }

    @GetMapping("/findByName")
    public List<CardDetail> findByName(@RequestParam String name){
        return bankDetailService.findByName(name);
    }
}
