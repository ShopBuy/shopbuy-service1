package com.codegym.shopbuyservice.repository;

import com.codegym.shopbuyservice.entity.Category;
import com.codegym.shopbuyservice.entity.ImageProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IImageProductReposittory extends JpaRepository<ImageProduct,Long> {
}
