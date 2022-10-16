package com.objects.context;

public interface Parser<T> {
    T parse(String str);
}