package com.bytatech.ayoos.doctor.apigateway.client.appointment.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.bytatech.ayoos.doctor.apigateway.client.appointment.ClientConfiguration;

@FeignClient(name="${appointment.name:appointment}", url="${appointment.url:104.196.121.188:8082/}", configuration = ClientConfiguration.class)
public interface ConsultationInfoResourceApiClient extends ConsultationInfoResourceApi {
}