package com.or.mybatisdemo.base.baseMapper;


import java.util.List;
import java.util.Map;

/**
 * @ClassName
 * @Description TODO
 * @Author lushuaiyu
 * @Data 2019-05-15 08:07
 * @Version 1.0
 */
public interface BaseMapper<T> {
    /**
     * 通用多条件查询方法
     * @Author chengpunan
     * @Description  lushuaiyu
     * @Date 08:12 2019-05-15
     * @Param [map]
     * @return java.util.List<T>
     */
    public List<T> queryParams(Map<String, Object> map);
}
