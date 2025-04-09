package kz.dar.post.service;

import kz.dar.post.model.PaymentRequest;
import kz.dar.post.model.PaymentResponse;
import kz.dar.post.repository.PaymentEntity;
import kz.dar.post.repository.PaymentRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    static ModelMapper modelMapper = new ModelMapper();
    static {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }


    @Override
    public PaymentResponse createPayment(PaymentRequest paymentRequest) {
        paymentRequest.setPaymentId(UUID.randomUUID().toString());
        PaymentEntity paymentEntity = modelMapper.map(paymentRequest, PaymentEntity.class);
        paymentEntity = paymentRepository.save(paymentEntity);
        return modelMapper.map(paymentEntity, PaymentResponse.class);
    }

    @Override
    public PaymentResponse updatePayment(PaymentRequest paymentRequest) {
        PaymentEntity paymentEntity=modelMapper.map(paymentRequest, PaymentEntity.class);
        PaymentEntity dbEntity=paymentRepository.getPaymentEntityByPaymentId(
                paymentRequest.getPaymentId());
        dbEntity.setPaymentId(paymentRequest.getPaymentId());
        dbEntity.setCustomerId(paymentRequest.getCustomerId());
        dbEntity.setCustomerName(paymentRequest.getCustomerName());
        dbEntity.setPaymentStatus(paymentRequest.getPaymentStatus());
        paymentEntity = paymentRepository.save(dbEntity);
        return modelMapper.map(paymentEntity, PaymentResponse.class);
    }

    @Override
    public PaymentResponse getPaymentById(String paymentId) {
        PaymentEntity paymentEntity=paymentRepository.getPaymentEntityByPaymentId(paymentId);
        return modelMapper.map(paymentEntity, PaymentResponse.class);
    }

    @Override
    public void deletePaymentById(String paymentId) {
        PaymentEntity paymentEntity=paymentRepository.getPaymentEntityByPaymentId(paymentId);
    }

    @Override
    public Page<PaymentResponse> getPaymentByCustomer(String customerId, Pageable pageable) {
        return paymentRepository.getPaymentEntitiesByCustomerId(customerId, (PageRequest) pageable)
                .map(payment -> modelMapper.map(payment, PaymentResponse.class));
    }
}
