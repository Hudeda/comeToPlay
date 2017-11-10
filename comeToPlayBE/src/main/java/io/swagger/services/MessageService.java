package io.swagger.services;

import io.swagger.model.Message;

public interface MessageService {

    public void createMessage(Message message);

    public void deleteMessageByMessageId(String messageId);

    public Iterable<Message> getAllMessages();

    public Message getMessageById(String messageId);
}
