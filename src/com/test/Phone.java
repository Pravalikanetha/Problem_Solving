package com.test;

public interface Phone {
	default void message2(String msg) {
        System.out.println("Phone: " + msg);
    }
}
