package com.perfectial.test.repository;

import com.perfectial.test.model.Payment;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentHibernateDao extends AbstractHibernateDao<Payment> implements PaymentDao {

    public PaymentHibernateDao() {
        super();

        setClazz(Payment.class);
    }

    // API

}