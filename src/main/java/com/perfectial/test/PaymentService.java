package com.perfectial.test;


import com.perfectial.test.model.Payment;
import com.perfectial.test.repository.PaymentDao;
import com.perfectial.test.repository.PaymentRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepositoty paymentDao;

    @Autowired
    private PaymentDao dao;

    @Transactional
    public List<Payment> getAllPayments() {
        Payment p = new Payment();
        p.setAmount(new BigDecimal("101"));
        p.setTimeStamp(LocalDateTime.now());
        dao.create(p);
        return dao.findAll();
    }
}