package com.chason.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chason.common.utils.PageUtils;
import com.chason.mall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author chason
 * @email chason001@126.com
 * @date 2023-07-24 15:31:17
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

