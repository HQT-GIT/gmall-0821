package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CategoryBrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2021-03-10 20:03:47
 */
@Mapper
public interface CategoryBrandMapper extends BaseMapper<CategoryBrandEntity> {
	
}
