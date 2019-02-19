package com.twf.book.product.domain;

import javax.persistence.*;

public class Product {
    @Id
    private Integer id;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 产品状态：0待审，1上架，2下架，3停售，4测试
     */
    private Integer status;

    /**
     * 产品价格 单位分
     */
    private Integer price;

    /**
     * 产品详情
     */
    private String detail;

    /**
     * 删除标志，默认0不删除，1删除
     */
    private Integer deleted;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private String updateTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取产品名称
     *
     * @return name - 产品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置产品名称
     *
     * @param name 产品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取产品状态：0待审，1上架，2下架，3停售，4测试
     *
     * @return status - 产品状态：0待审，1上架，2下架，3停售，4测试
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置产品状态：0待审，1上架，2下架，3停售，4测试
     *
     * @param status 产品状态：0待审，1上架，2下架，3停售，4测试
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取产品价格 单位分
     *
     * @return price - 产品价格 单位分
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 设置产品价格 单位分
     *
     * @param price 产品价格 单位分
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 获取产品详情
     *
     * @return detail - 产品详情
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置产品详情
     *
     * @param detail 产品详情
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * 获取删除标志，默认0不删除，1删除
     *
     * @return deleted - 删除标志，默认0不删除，1删除
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置删除标志，默认0不删除，1删除
     *
     * @param deleted 删除标志，默认0不删除，1删除
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}