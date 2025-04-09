package kz.dar.post.model;

import lombok.Data;

@Data
public class PaymentRequest {

    private String paymentId;

    private String customerId;

    private String customerName;

    private String paymentStatus;
}
