package io.ikka.foo.bar.api;

public interface Message {
    void setPayload(byte[] payload);
    byte[] getPayload();

}
