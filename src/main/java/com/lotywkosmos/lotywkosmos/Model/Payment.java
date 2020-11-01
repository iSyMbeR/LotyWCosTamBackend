//package com.lotywkosmos.lotywkosmos.Model;
//
//import lombok.*;
//
//import javax.persistence.*;
//
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@Builder
//@Table(name = "PAYMENTS")
//public class Payment {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    @OneToOne
//    private Order idOrder;
//    boolean status;
//
//    public Payment(Order idOrder, boolean status) {
//        this.idOrder = idOrder;
//        this.status = status;
//    }
//}