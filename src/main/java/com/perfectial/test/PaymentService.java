package com.perfectial.test;


import com.perfectial.test.model.Payment;
import com.perfectial.test.repository.PaymentRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepositoty paymentDao;

    public List<Payment> getAllPayments() {
        return paymentDao.getAllPayments();
    }

    //@Transactional
//    public Payment getPayment(String id) {
//        return paymentDao.getPaymentById(id);
//    }
}