package com.chason.mall.member.dao;

import com.chason.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chason
 * @email chason001@126.com
 * @date 2023-07-24 16:21:52
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
