package kz.dar.post.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDTO {
    private String paymentId;

    private String customerId;

    private String customerName;

    private String paymentStatus;
}
