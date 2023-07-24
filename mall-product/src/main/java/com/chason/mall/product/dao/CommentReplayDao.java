package com.chason.mall.product.dao;

import com.chason.mall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author chason
 * @email chason001@126.com
 * @date 2023-07-24 10:32:55
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
