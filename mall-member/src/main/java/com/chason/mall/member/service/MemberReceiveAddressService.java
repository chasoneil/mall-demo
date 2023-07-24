package com.chason.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chason.common.utils.PageUtils;
import com.chason.mall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author chason
 * @email chason001@126.com
 * @date 2023-07-24 16:21:52
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

