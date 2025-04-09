package kz.dar.post.service.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SendServiceImpl implements SendService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Override
    public void sendMessage(String message) {
        log.info("payment: " + message);
        kafkaTemplate.send("payment-info", message);
    }
}
