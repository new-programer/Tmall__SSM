package com.nanhua.Tmall.service.impl;

import com.nanhua.Tmall.mapper.CategoryMapper;
import com.nanhua.Tmall.pojo.Category;
import com.nanhua.Tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService
{
    //    @Qualifier("CategoryMapper") 这里这个不能写（如果写了这个会报错：NoSuchBeanDefinitionException:
    // No qualifying bean of type [com.nanhua.Tmall.mapper.CategoryMapper] found for dependency:
    // expected at least 1 bean which qualifies as autowire candidate for this dependency）

    @Autowired    //若 只有这个注解则是by type方式注入
    private CategoryMapper categoryMapper;

    public void setCategoryMapper(CategoryMapper categoryMapper)
    {
        this.categoryMapper = categoryMapper;
    }

    @Override
    @Transactional  //事务注解
    public List<Category> getCategory()
    {
        return categoryMapper.selectCategory();
    }
}
