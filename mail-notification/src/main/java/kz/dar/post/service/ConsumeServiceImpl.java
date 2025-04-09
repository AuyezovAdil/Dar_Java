package kz.dar.post.service;

import kz.dar.post.model.MessageDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j

public class ConsumeServiceImpl implements ConsumeService {

    @Override
    @KafkaListener(id="&{spring.kafka.consumer.group-id}", topics=
    "${spring.kafka.topic.in}", containerFactory="singleFactory")
    public void consumeMessage(MessageDTO message) {
        log.info("message"+message);

    }
}
