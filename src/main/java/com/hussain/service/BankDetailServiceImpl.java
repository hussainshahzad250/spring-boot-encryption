package com.hussain.service;

import com.hussain.config.AesEncryptor;
import com.hussain.entity.CardDetail;
import com.hussain.repository.CardDetailRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BankDetailServiceImpl implements BankDetailService {

    private final AesEncryptor aesEncryptor;

    private final CardDetailRepository cardDetailRepository;

    @Override
    public CardDetail saveBankDetails(CardDetail cardDetail) {
        return cardDetailRepository.save(cardDetail);
    }

    @Override
    public List<CardDetail> getBankDetails() {
        return cardDetailRepository.findAll();
    }

    @Override
    public CardDetail getBankDetailById(Long id) {
        return cardDetailRepository.findById(id).orElse(null);
    }

    @Override
    public List<CardDetail> findByName(String name) {
//        return cardDetailRepository.findByCardHolderName(name);
        return cardDetailRepository.findUsingJpql(name);
//        return cardDetailRepository.findUsingNativeQuery(aesEncryptor.convertToDatabaseColumn(name));
    }
}