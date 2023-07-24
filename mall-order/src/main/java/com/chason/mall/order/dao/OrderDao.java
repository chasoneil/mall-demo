package com.chason.mall.order.dao;

import com.chason.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chason
 * @email chason001@126.com
 * @date 2023-07-24 15:31:17
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
