package com.chason.mall.coupon.dao;

import com.chason.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chason
 * @email chason001@126.com
 * @date 2023-07-24 15:43:36
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
