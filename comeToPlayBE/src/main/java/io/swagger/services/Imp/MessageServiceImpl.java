package io.swagger.services.Imp;

import io.swagger.model.Message;
import io.swagger.repositories.MessageRepository;
import io.swagger.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageRepository messageRepository;

    @Override
    public void createMessage(Message message) {
        messageRepository.save(message);

    }

    @Override
    public void deleteMessageByMessageId(String messageId) {
        messageRepository.delete(messageId);
    }

    @Override
    public Iterable<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    @Override
    public Message getMessageById(String messageId) {
        return messageRepository.findOne(messageId);
    }
}
