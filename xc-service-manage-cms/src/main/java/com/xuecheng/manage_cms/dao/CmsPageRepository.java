package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @ Author     ：henry
 * @ Date       ：Created in 19:36 2018/12/9
 * @ Description：${description}
 * @ Modified By：
 * @Version: $version$
 */
public interface CmsPageRepository extends MongoRepository<CmsPage , String> {
}
