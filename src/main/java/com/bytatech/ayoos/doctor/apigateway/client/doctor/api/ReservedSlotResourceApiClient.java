package com.bytatech.ayoos.doctor.apigateway.client.doctor.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.ClientConfiguration;

@FeignClient(name="${doctor.name:doctor}", url="${doctor.url:http://localhost:9082/}", configuration = ClientConfiguration.class)
public interface ReservedSlotResourceApiClient extends ReservedSlotResourceApi {
}