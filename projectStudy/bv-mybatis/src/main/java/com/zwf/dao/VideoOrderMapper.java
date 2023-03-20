package com.zwf.dao;

import com.zwf.domain.User;
import com.zwf.domain.VideoOrder;

import java.util.List;

public interface VideoOrderMapper {

    List<VideoOrder> queryVideoOrderList();

    List<User> queryUserOrder();
}
