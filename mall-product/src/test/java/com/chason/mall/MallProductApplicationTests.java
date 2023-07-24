package com.chason.mall;

import com.chason.mall.product.entity.BrandEntity;
import com.chason.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brand = new BrandEntity();
        brand.setName("xiaomi");
        brandService.save(brand);
    }

    @Test
    void select() {

        List<BrandEntity> list = brandService.list();
        for (BrandEntity brandEntity : list) {
            System.out.println(brandEntity);
        }
    }

}
