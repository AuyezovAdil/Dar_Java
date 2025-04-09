package kz.dar.post.repository;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PaymentRepository extends ElasticsearchRepository<PaymentEntity, String> {
    PaymentEntity getPaymentEntityByPaymentId(String id);
    Page<PaymentEntity> getPaymentEntitiesByCustomerId (String customerId, PageRequest pageRequest);
    void deletePaymentEntityByPaymentId(String id);
}
