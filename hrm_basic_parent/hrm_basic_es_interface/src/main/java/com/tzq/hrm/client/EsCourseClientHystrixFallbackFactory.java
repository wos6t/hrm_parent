package com.tzq.hrm.client;


import com.tzq.hrm.doc.EsCourse;
import com.tzq.hrm.query.EsCourseQuery;
import com.tzq.hrm.util.AjaxResult;
import com.tzq.hrm.util.PageList;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yaohuaipeng
 * @date 2018/10/8-16:18
 */
@Component//组成的
public class EsCourseClientHystrixFallbackFactory implements FallbackFactory<EsCourseClient> {

    @Override
    public EsCourseClient create(Throwable throwable) {
        return new EsCourseClient() {
            @Override
            public AjaxResult save(EsCourse esCourse) {
                return null;
            }

            @Override
            public AjaxResult delete(Integer id) {
                return null;
            }

            @Override
            public EsCourse get(Long id) {
                return null;
            }

            @Override
            public List<EsCourse> list() {
                return null;
            }

            @Override
            public PageList<EsCourse> json(EsCourseQuery query) {
                return null;
            }

            @Override
            public AjaxResult batchSave(List <EsCourse> esCourseList) {
                return null;
            }

            @Override
            public void batchDel(List <EsCourse> esCourseList) {

            }
        };
    }
}
