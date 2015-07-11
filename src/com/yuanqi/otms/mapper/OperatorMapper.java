package com.yuanqi.otms.mapper;

import com.yuanqi.otms.po.Operator;

public interface OperatorMapper {
    int insert(Operator record);

    int insertSelective(Operator record);
}