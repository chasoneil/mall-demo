package com.chason.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chason.common.utils.PageUtils;
import com.chason.mall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author chason
 * @email chason001@126.com
 * @date 2023-07-24 10:32:55
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

