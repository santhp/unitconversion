package com.tw.oops;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;

public class EncryptedHashSet {
    Set<String> set;

    public EncryptedHashSet() {
        set = new HashSet<>();
    }

    public void add(String input) throws UnsupportedEncodingException {
        set.add(Base64.getEncoder().encodeToString(input.getBytes("utf-8")));
    }
}
