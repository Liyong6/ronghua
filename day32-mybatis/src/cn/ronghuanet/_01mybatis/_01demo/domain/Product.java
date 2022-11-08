package cn.ronghuanet._01mybatis._01demo.domain;

import java.math.BigDecimal;

public class Product {
    private Long id;
    private String productName;
    private Long dir_id;
    private Double salePrice;
    private String supplier;
    private String brand;
    private Double cutoff;
    private Double costPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getDir_id() {
        return dir_id;
    }

    public void setDir_id(Long dir_id) {
        this.dir_id = dir_id;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getCutoff() {
        return cutoff;
    }

    public void setCutoff(Double cutoff) {
        this.cutoff = cutoff;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", productName=" + productName + ", dir_id=" + dir_id + ", salePrice=" + salePrice
                + ", supplier=" + supplier + ", brand=" + brand + ", cutoff=" + cutoff + ", costPrice=" + costPrice
                + "]";
    }

    public Product() {
    }

    public Product(Long id, String productName, Long dir_id, Double salePrice, String supplier, String brand,
                   Double cutoff, Double costPrice) {
        this.id = id;
        this.productName = productName;
        this.dir_id = dir_id;
        this.salePrice = salePrice;
        this.supplier = supplier;
        this.brand = brand;
        this.cutoff = cutoff;
        this.costPrice = costPrice;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((costPrice == null) ? 0 : costPrice.hashCode());
        result = prime * result + ((cutoff == null) ? 0 : cutoff.hashCode());
        result = prime * result + ((dir_id == null) ? 0 : dir_id.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((productName == null) ? 0 : productName.hashCode());
        result = prime * result + ((salePrice == null) ? 0 : salePrice.hashCode());
        result = prime * result + ((supplier == null) ? 0 : supplier.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (costPrice == null) {
            if (other.costPrice != null)
                return false;
        } else if (!costPrice.equals(other.costPrice))
            return false;
        if (cutoff == null) {
            if (other.cutoff != null)
                return false;
        } else if (!cutoff.equals(other.cutoff))
            return false;
        if (dir_id == null) {
            if (other.dir_id != null)
                return false;
        } else if (!dir_id.equals(other.dir_id))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (productName == null) {
            if (other.productName != null)
                return false;
        } else if (!productName.equals(other.productName))
            return false;
        if (salePrice == null) {
            if (other.salePrice != null)
                return false;
        } else if (!salePrice.equals(other.salePrice))
            return false;
        if (supplier == null) {
            if (other.supplier != null)
                return false;
        } else if (!supplier.equals(other.supplier))
            return false;
        return true;
    }

}
