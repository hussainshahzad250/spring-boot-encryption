package com.hussain.entity;

import com.hussain.config.AesEncryptor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
public class CardDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Convert(converter = AesEncryptor.class)
    private String cardHolderName;

    @Convert(converter = AesEncryptor.class)
    private Integer cvv;

    private BigDecimal amount;

    private Boolean isActive;
}
