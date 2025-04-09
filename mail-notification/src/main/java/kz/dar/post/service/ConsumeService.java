package kz.dar.post.service;

import kz.dar.post.model.MessageDTO;

public interface ConsumeService {
    void consumeMessage(MessageDTO message);
}
