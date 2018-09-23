/*
 * Copyright 2012-2013 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.s3s.ssm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

import com.s3s.ssm.service.IFoodService;
import com.s3s.ssm.service.IProductService;
import com.s3s.ssm.service.IProductTypeService;
import com.s3s.ssm.service.IUnitOfMeasureService;
import com.s3s.ssm.service.IUomCategoryService;

@Configuration
@ComponentScan(basePackages = "com.s3s.ssm.service")
@EnableAutoConfiguration
public class CatalogServiceConfig {
  @Autowired
  private IFoodService foodService;
  @Autowired
  private IProductService productService;
  @Autowired
  private IProductTypeService productTypeService;
  @Autowired
  private IUnitOfMeasureService unitOfMeasureService;
  @Autowired
  private IUomCategoryService uomCategoryService;

  @Bean(name = "/FoodService")
  public HessianServiceExporter hessianFoodServiceExporter() {
    HessianServiceExporter exporter = new HessianServiceExporter();
    exporter.setService(foodService);
    exporter.setServiceInterface(IFoodService.class);
    return exporter;
  }

  @Bean(name = "/ProductService")
  public HessianServiceExporter hessianProductServiceExporter() {
    HessianServiceExporter exporter = new HessianServiceExporter();
    exporter.setService(productService);
    exporter.setServiceInterface(IProductService.class);
    return exporter;
  }

  @Bean(name = "/ProductTypeService")
  public HessianServiceExporter hessianProductTypeServiceExporter() {
    HessianServiceExporter exporter = new HessianServiceExporter();
    exporter.setService(productTypeService);
    exporter.setServiceInterface(IProductTypeService.class);
    return exporter;
  }
  
  @Bean(name = "/UnitOfMeasureService")
  public HessianServiceExporter hessianUnitOfMeasureServiceExporter() {
    HessianServiceExporter exporter = new HessianServiceExporter();
    exporter.setService(unitOfMeasureService);
    exporter.setServiceInterface(IUnitOfMeasureService.class);
    return exporter;
  }
  
  @Bean(name = "/UomCategoryService")
  public HessianServiceExporter hessianUomCategoryServiceExporter() {
    HessianServiceExporter exporter = new HessianServiceExporter();
    exporter.setService(uomCategoryService);
    exporter.setServiceInterface(IUomCategoryService.class);
    return exporter;
  }
}
