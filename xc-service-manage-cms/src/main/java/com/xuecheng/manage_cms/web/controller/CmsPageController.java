package com.xuecheng.manage_cms.web.controller;

import com.xuecheng.api.cms.CmsPageControllerApi;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.manage_cms.service.CmsPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：henry
 * @ Date       ：Created in 17:54 2018/12/9
 * @ Description：${description}
 * @ Modified By：
 * @Version: $version$
 */
@RestController
@RequestMapping("cms/page")
public class CmsPageController implements CmsPageControllerApi {

    @Autowired
    private CmsPageService cmsPageService;

    @Override
    @GetMapping("/list/{page}/{size}")
    public QueryResponseResult findList(@PathVariable("page") int page, @PathVariable("size") int size, QueryPageRequest queryPageRequest) {
       /* QueryResult queryResult = new QueryResult();
        queryResult.setTotal(2);//静态数据列表         
        List list = new ArrayList();
        CmsPage cmsPage = new CmsPage();
        cmsPage.setPageName("测试页面");
        list.add(cmsPage);
        queryResult.setList(list);
        QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS, queryResult);*/

        return cmsPageService.findList(page, size, queryPageRequest);
    }

}
