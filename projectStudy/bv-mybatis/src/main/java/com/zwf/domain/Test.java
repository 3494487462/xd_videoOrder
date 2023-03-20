package com.zwf.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Test implements Serializable {
    Integer id;
    String userName;
    String psw;
}
