package kz.dar.post.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import kz.dar.post.model.PaymentRequest;
import kz.dar.post.model.PaymentResponse;
import kz.dar.post.service.PaymentService;
import kz.dar.post.service.message.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")

public class PaymentController {
    @Autowired
    private PaymentService paymentService;

//    @Autowired          написано при просмотре 18-ой темы
//    private SendService sendService;
//
//    ObjectMapper objectMapper = new ObjectMapper();

    @PostMapping
    public PaymentResponse createPayment(@RequestBody PaymentRequest paymentRequest) {
//        написано при просмотре 18-ой темы
//        PaymentResponse paymentResponse = paymentService.createPayment(paymentRequest);
//        sendService.sendMessage(objectMapper.writeValueAsString(paymentResponse));
//        return paymentResponse;

        return paymentService.createPayment(paymentRequest);
    }
    @PutMapping
    public PaymentResponse updatePayment(@RequestParam String paymentId,
                                         @RequestBody PaymentRequest paymentRequest) {
        return paymentService.updatePayment(paymentRequest);
    }
    @GetMapping
    public PaymentResponse getPaymentById(@RequestParam String paymentId) {
        return paymentService.getPaymentById(paymentId);
    }
    @GetMapping("/customer")
    public Page<PaymentResponse> getPaymentByCustomerId(@RequestParam String customerId, Pageable pageable) {
     return paymentService.getPaymentByCustomer(customerId, pageable);
    }
    @DeleteMapping
    public void deletePaymentById(@RequestParam String paymentId) {
        paymentService.deletePaymentById(paymentId);
    }
}
