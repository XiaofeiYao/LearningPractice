package com.example.mybatisplus.dao.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.example.mybatisplus.dao.entity.ImasAssertInfo;
import org.apache.coyote.Constants;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
public interface ImasAssertInfoMapper extends BaseMapper<ImasAssertInfo> {

    void updName();

}
