package com.sunrise.xdoc.entity.catalog;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "catalog_material")
@Inheritance(strategy = InheritanceType.JOINED)
public class Material extends Product {
  private static final long serialVersionUID = 1L;
  private Long beginningQuantityInStock = 0l;
  private Double quantityInStock = 0d; // count based on base uom
  private Long minimumQuantity = 0l;
  private Boolean retailable = false;

  @Column(name = "beginning_quantity_in_stock")
  public Long getBeginningQuantityInStock() {
    return beginningQuantityInStock;
  }

  public void setBeginningQuantityInStock(Long beginningQuantityInStock) {
    this.beginningQuantityInStock = beginningQuantityInStock;
  }

  @Column(name = "quantity_in_stock")
  public Double getQuantityInStock() {
    return quantityInStock;
  }

  public void setQuantityInStock(Double quantityInStock) {
    this.quantityInStock = quantityInStock;
  }

  @Column(name = "minimum_quantity")
  public Long getMinimumQuantity() {
    return minimumQuantity;
  }

  public void setMinimumQuantity(Long minimumQuantity) {
    this.minimumQuantity = minimumQuantity;
  }

  @Column(name = "retailable")
  public Boolean getRetailable() {
    return retailable;
  }

  public void setRetailable(Boolean retailable) {
    this.retailable = retailable;
  }
}
