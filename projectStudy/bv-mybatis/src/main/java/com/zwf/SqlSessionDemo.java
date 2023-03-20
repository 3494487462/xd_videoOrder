package com.zwf;

import com.zwf.dao.TestMapper;
import com.zwf.dao.VideoOrderMapper;
import com.zwf.domain.Test;
import com.zwf.domain.VideoOrder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SqlSessionDemo {


    public static void main(String [] args) throws IOException {

        String resouce = "config/mybatis-config.xml";

        //读取配置文件
        InputStream inputStream =  Resources.getResourceAsStream(resouce);

        //构建Session工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取Session,true是自动开启事务
        try(SqlSession sqlSession = sqlSessionFactory.openSession(true)){

            TestMapper testMapper = sqlSession.getMapper(TestMapper.class);
            VideoOrderMapper videoOrderMapper = sqlSession.getMapper(VideoOrderMapper.class);


//            查询
//            Test test1 = testMapper.selectId(2);
//            testMapper.selectId(2);

            Test test2 = testMapper.selectMOhu("2","h");
            System.out.println(test2);

//            插入
//            int r = testMapper.add("ddd","456");
//            System.out.println("添加成功" + r);

//            批量插入
//            Test testq = new Test();
//            testq.setPsw("1");
//            testq.setUserName("a");
//            Test testw = new Test();
//            testw.setPsw("2");
//            testw.setUserName("f");
//            List<Test> list = new ArrayList<>();
//            list.add(testq);
//            list.add(testw);
//            int row = testMapper.addFor(list);
//            System.out.println(row);

            //更新
//            Test testr = new Test();
//            testr.setPsw("1555");
//            testr.setUserName("b");
//            testr.setId(6);
//            testMapper.update(testr);
//            testMapper.updateIf(testr);

            //删除
//            Map<String, Object> map = new HashMap<>();
//            map.put("id",2);
//            testMapper.delete(map);

            //多表查询
//            List<VideoOrder> videoOrderList = videoOrderMapper.queryVideoOrderList();
//
//            System.out.println(videoOrderList);
//            System.out.println(videoOrderMapper.queryUserOrder());

        }

    }

}
