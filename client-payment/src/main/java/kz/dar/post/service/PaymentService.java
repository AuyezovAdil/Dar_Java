package kz.dar.post.service;

import kz.dar.post.model.PaymentRequest;
import kz.dar.post.model.PaymentResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PaymentService {
    PaymentResponse createPayment(PaymentRequest paymentRequest);
    PaymentResponse updatePayment(PaymentRequest paymentRequest);
    PaymentResponse getPaymentById(String paymentId);
    void deletePaymentById(String paymentId);
    Page<PaymentResponse> getPaymentByCustomer(String customerId, Pageable pageable);
}
