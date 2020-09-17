package com.example.mybatisplus.dao.mapper;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.example.mybatisplus.dao.entity.ImasAssertInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class ImasAssertInfoMapperTest {

    @Resource
    private ImasAssertInfoMapper imasAssertInfoMapper;

    @Test
    public void selectCount(){
        Wrapper<ImasAssertInfo> wrapper = new EntityWrapper<>();
        wrapper.like("asset_name","%机%")
                .notLike("asset_name","%动%");
        Integer count = imasAssertInfoMapper.selectCount(wrapper);
        System.out.println(count);
    }

    @Test
    public void updName(){
        Map<String, Object> params = new HashMap<>();
        params.put("id",2);
        params.put("asset_name","电机1");
//        int i= imasAssertInfoMapper.updName(params);
        imasAssertInfoMapper.updName();
        System.err.println(123);
    }

}