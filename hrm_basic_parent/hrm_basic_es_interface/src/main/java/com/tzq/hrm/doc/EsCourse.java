package com.tzq.hrm.doc;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.math.BigDecimal;
import java.util.Date;
/*
* 全文检索,课程类
* */
@Document(indexName = "hrm",type = "course")
public class EsCourse {
    @Id
    private Long id;
    private String name;//课程名
    private String users;//适用人群
    private Long courseTypeId;//课程大分类id
    private String courseTypeName;//课程大分类名称
    private Long gradeId;//课程等级
    private String gradeName;//课程等级名称
    private Integer status;//课程状态
    private Long tenantId;//教育机构
    private String tenantName;//教育机构名称


    private Long userId;//创建用户
    private String userName;//创建用户名称
    private Date startTime; //上线时间
    private Date endTime;//下线时间
    private String intro;//介绍
    private String resources; //图片
    private Date expires; //过期时间
    private BigDecimal priceOld; //原价
    private BigDecimal price; //
    private String qq; //

    @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word")
    private String all;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public Long getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(Long courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    public String getCourseTypeName() {
        return courseTypeName;
    }

    public void setCourseTypeName(String courseTypeName) {
        this.courseTypeName = courseTypeName;
    }

    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public Date getExpires() {
        return expires;
    }

    public void setExpires(Date expires) {
        this.expires = expires;
    }

    public BigDecimal getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(BigDecimal priceOld) {
        this.priceOld = priceOld;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Override
    public String toString() {
        return "EsCourse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", users='" + users + '\'' +
                ", courseTypeId=" + courseTypeId +
                ", courseTypeName='" + courseTypeName + '\'' +
                ", gradeId=" + gradeId +
                ", gradeName='" + gradeName + '\'' +
                ", status=" + status +
                ", tenantId=" + tenantId +
                ", tenantName='" + tenantName + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", intro='" + intro + '\'' +
                ", resources='" + resources + '\'' +
                ", expires=" + expires +
                ", priceOld=" + priceOld +
                ", price=" + price +
                ", qq='" + qq + '\'' +
                '}';
    }
//分词器,已空格分开
    public String getAll() {
        String tmp =  name
        +" "+ users
        +" "+ courseTypeName
        +" "+ gradeName
        +" "+ tenantName
        +" "+ userName
        +" "+ intro;
        return tmp;
    }

    public void setAll(String all) {
        this.all = all;
    }
}
