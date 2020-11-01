//package com.lotywkosmos.lotywkosmos.Controllers;
//
//import com.lotywkosmos.lotywkosmos.Model.Payment;
//import com.lotywkosmos.lotywkosmos.Model.PortLink;
//import com.lotywkosmos.lotywkosmos.Service.PaymentService;
//import com.lotywkosmos.lotywkosmos.Service.PortLinkService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//public class PaymentController {
//
//
//    private final PaymentService paymentService;
//
//    @GetMapping("/payments")
//    public List<Payment> getPortLinks(){
//        return paymentService.getPayment();
//    }
//
//    @GetMapping("/payments/{id}")
//    public Payment getSinglePortLink(@PathVariable long id) {
//        return paymentService.getSinglePayment(id);
//    }
//}
