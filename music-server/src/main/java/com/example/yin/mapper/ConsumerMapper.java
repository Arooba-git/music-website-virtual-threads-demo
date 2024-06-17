package com.example.yin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.yin.model.domain.Consumer;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsumerMapper extends BaseMapper<Consumer> {
    @Select("SELECT * FROM consumer")
    List<Consumer> selectList();
}
