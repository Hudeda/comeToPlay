package io.swagger.services;

public interface PasswordService {

    public String encrypt(String unencryptedString);

    public String decrypt(String encryptedString);
}
