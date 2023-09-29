package com.cmb.javaspring.inter;

import java.util.List;

import com.cmb.javaspring.models.Product;

public interface IProductService   
{  
    List<Product> findAll();
}  