package com.chason.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chason.common.utils.PageUtils;
import com.chason.mall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author chason
 * @email chason001@126.com
 * @date 2023-07-24 10:32:55
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

