package kz.dar.post.repository;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document (indexName = "payment")
@Data

public class PaymentEntity {
    @Id
    @Field (type = FieldType.Keyword)
    private String paymentId;
    @Field (type = FieldType.Keyword)
    private String customerId;
    @Field (type = FieldType.Text)
    private String customerName;
    @Field (type = FieldType.Text)
    private String paymentStatus;
}
