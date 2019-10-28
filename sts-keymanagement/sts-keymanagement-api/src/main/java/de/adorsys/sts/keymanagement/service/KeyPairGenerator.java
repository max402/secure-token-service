package de.adorsys.sts.keymanagement.service;

import de.adorsys.keymanagement.api.types.entity.KeyPairEntry;
import de.adorsys.keymanagement.api.types.template.provided.ProvidedKeyPair;

import javax.security.auth.callback.CallbackHandler;
import java.util.function.Supplier;

public interface KeyPairGenerator {

    ProvidedKeyPair generateSignatureKey(String alias, Supplier<char[]> keyPassword);

    ProvidedKeyPair generateEncryptionKey(String alias, Supplier<char[]> keyPassword);
}
