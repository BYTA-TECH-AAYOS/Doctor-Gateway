package com.bytatech.ayoos.doctor.apigateway.repository.search;

import com.bytatech.ayoos.doctor.apigateway.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, String> {
}
