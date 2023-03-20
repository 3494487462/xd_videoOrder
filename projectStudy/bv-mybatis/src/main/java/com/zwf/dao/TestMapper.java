package com.zwf.dao;

import com.zwf.domain.Test;
import org.apache.ibatis.annotations.Param;


import java.util.List;
import java.util.Map;

public interface TestMapper {
    Test selectId(@Param("id") int id);

    Test selectMOhu(@Param("password") String password, @Param("str") String str);

    int add(@Param("user_name") String userName, @Param("password") String psw);

    //批量查询
    int addFor(List<Test> list);

    int update(Test test);

    int updateIf(Test test);

    int delete(Map map);
}
