package com.ecommerce.project.service;

import com.ecommerce.project.ExceptionHandler.ResponseNotFoundException;
import com.ecommerce.project.model.Category;
import com.ecommerce.project.model.Product;
import com.ecommerce.project.payload.ProductDTO;

import com.ecommerce.project.repositories.CategoryRepository;
import com.ecommerce.project.repositories.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ProductRepository productRepository;

    public ProductDTO addProduct(Long categoryId, Product product){
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() ->
                new ResponseNotFoundException("category", "categoryId", categoryId));
        product.setImage("default.png");
        product.setCategory(category);
        double specialprice= product.getPrice()-((product.getDiscount()*0.01))* product.getPrice();
        product.setSpecialPrice(specialprice);
        Product savedProduct= productRepository.save(product);
        return modelMapper.map(savedProduct,ProductDTO.class);
    }
}
