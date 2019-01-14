package com.perfectial.test.controller;

import com.perfectial.test.PaymentService;
import com.perfectial.test.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("/sample")
    public List<Payment> greeting() {
      return paymentService.getAllPayments();
    }

   }