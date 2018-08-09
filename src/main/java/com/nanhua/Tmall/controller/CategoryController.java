package com.nanhua.Tmall.controller;

import com.nanhua.Tmall.pojo.Category;
import com.nanhua.Tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/test")
public class CategoryController
{
    @Autowired
    @Qualifier("categoryService")
    private CategoryService service;

    public void setService(CategoryService service)
    {
        this.service = service;
    }

    @RequestMapping("/listCategory")
    public String list(Model model , HttpServletRequest request)
    {
        System.out.println("当前的访问路径是："  +  request.getRequestURI());
        List<Category> categories = service.getCategory();
        model.addAttribute("categories",categories);
        return "/listCategory.jsp";
    }
}
