package com.perfectial.test.repository;


import com.perfectial.test.model.Payment;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PaymentRepositoty {

    public List<Payment> getAllPayments() {
        List<Payment> payments = new ArrayList<>();
        payments.add(new Payment(new BigDecimal("1238126387123"), LocalDateTime.now()));
        return payments;
    }
}
