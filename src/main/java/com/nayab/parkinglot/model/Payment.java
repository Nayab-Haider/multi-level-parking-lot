package com.nayab.parkinglot.model;

import java.time.LocalDateTime;

public class Payment {
    private String paymentId;
    private String parkingTicketId;
    private PaymentStatus paymentStatus;
    private Double cost;
    private LocalDateTime paymentInitiatedTime;
    private LocalDateTime paymentCompletionTime;
}
