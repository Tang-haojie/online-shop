package com.leyou.search.repository;

import com.leyou.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author Miracle Luna
 * @Date 2022/3/30 15:46
 * @Version 1.0
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {
}
