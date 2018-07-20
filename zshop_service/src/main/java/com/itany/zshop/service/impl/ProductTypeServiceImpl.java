package com.itany.zshop.service.impl;

import com.itany.zshop.dao.ProductTypeDao;
import com.itany.zshop.pojo.ProductType;
import com.itany.zshop.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author：汤小洋
 * Date：2018-07-20 16:13
 * Description：<描述>
 */
@Service
@Transactional
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeDao productTypeDao;

    @Override
    public List<ProductType> findAll() {
        return productTypeDao.selectAll();
    }
}
