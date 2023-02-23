package com.hussain.service;

import com.hussain.entity.CardDetail;

import java.util.List;

public interface BankDetailService {
    CardDetail saveBankDetails(CardDetail cardDetail);

    List<CardDetail> getBankDetails();

    CardDetail getBankDetailById(Long id);

    List<CardDetail> findByName(String name);
}
