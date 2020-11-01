//package com.lotywkosmos.lotywkosmos.Service;
//
//import com.lotywkosmos.lotywkosmos.Model.Payment;
//import com.lotywkosmos.lotywkosmos.Repository.PaymentRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class PaymentService {
//    private final PaymentRepository paymentRepository;//injection
//
//    public List<Payment> getPayment(){
//        return paymentRepository.findAll();
//    }
//
//    public Payment getSinglePayment(long id) {
//        return paymentRepository.findById(id)
//                .orElseThrow();
//    }
//
//    public void addPaymentToBase(Payment payment) {
//        paymentRepository.save(payment);
//    }
//}
