package com.example.ajax;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class RsData<T> {
    private String resultCode;
    private String msg;
    private T data;
}