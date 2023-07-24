package com.chason.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chason.common.utils.PageUtils;
import com.chason.mall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author chason
 * @email chason001@126.com
 * @date 2023-07-24 10:32:55
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

