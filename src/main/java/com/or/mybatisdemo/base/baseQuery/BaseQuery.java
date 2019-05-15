package com.or.mybatisdemo.base.baseQuery;

/**
 * @ClassName BaseQuery
 * @Description TODO
 * @Author lushuaiyu
 * @Data 2019-05-12 13:52
 * @Version 1.0
 */

public class BaseQuery {
    private Integer pageNum=1;
    private Integer pageSize=5;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
