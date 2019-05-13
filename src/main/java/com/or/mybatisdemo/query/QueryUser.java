package com.or.mybatisdemo.query;

import com.or.mybatisdemo.baseQuery.BaseQuery;

/**
 * @ClassName
 * @Description TODO
 * @Author lushuaiyu
 * @Data 2019-05-12 09:26
 * @Version 1.0
 */
public class QueryUser extends BaseQuery {
    private String id;

    private String name;

    private String age;

    private String money;

    private String level;
    private String startNum;
    private String endNum;
    private String page;
    private String limit;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStartNum() {
        return startNum;
    }

    public void setStartNum(String startNum) {
        this.startNum = startNum;
    }

    public String getEndNum() {
        return endNum;
    }

    public void setEndNum(String endNum) {
        this.endNum = endNum;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "QueryUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", money='" + money + '\'' +
                ", level='" + level + '\'' +
                ", startNum='" + startNum + '\'' +
                ", endNum='" + endNum + '\'' +
                ", page='" + page + '\'' +
                ", limit='" + limit + '\'' +
                '}';
    }
}




