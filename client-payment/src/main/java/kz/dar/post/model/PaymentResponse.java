package kz.dar.post.model;

import lombok.Data;

@Data
public class PaymentResponse {

    private String paymentId;

    private String customerId;

    private String customerName;

    private String paymentStatus;
}

