package com.UST.Flightservices.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="payment_info")

public class Paymentinfo {

    @Id
    @GeneratedValue
    @GenericGenerator(name= "uuid2" ,strategy = "org.hibernate.id.UUIDGenerator")
    private String paymentId;
    private String accountNo;
    private String CardType;
    private double amount;
    private Long passangerId;

}
