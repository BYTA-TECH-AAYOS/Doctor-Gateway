package com.bytatech.ayoos.doctor.apigateway.web.rest;

import com.bytatech.ayoos.doctor.apigateway.client.doctor.api.DoctorSettingsResourceApi;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.DoctorSettingsDTO;
import com.codahale.metrics.annotation.Timed;

import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * REST controller for managing DoctorSettings.
 */
@RestController
@RequestMapping("/api/Command")
public class DoctorSettingsCommandResource {

    private final Logger log = LoggerFactory.getLogger(DoctorSettingsCommandResource .class);
    
	private final DoctorSettingsResourceApi doctorSettingsResourceApi;

    public DoctorSettingsCommandResource(DoctorSettingsResourceApi doctorSettingsResourceApi) {
		this.doctorSettingsResourceApi = doctorSettingsResourceApi;
	}

	@PostMapping("/doctor-settings")
	public void createDoctorSettings(@RequestBody DoctorSettingsDTO doctorSettingsDTO) {
		log.debug("REST request to save DoctorSettings : {}", doctorSettingsDTO);
		doctorSettingsResourceApi.createDoctorSettingsUsingPOST(doctorSettingsDTO);

	}

	@PutMapping("/doctor-settings")
	public void updateDoctorSettings(@RequestBody DoctorSettingsDTO doctorSettingsDTO) {
		log.debug("REST request to update DoctorSettings : {}", doctorSettingsDTO);
		doctorSettingsResourceApi.updateDoctorSettingsUsingPUT(doctorSettingsDTO);
	}

	@DeleteMapping("/doctor-settings/{id}")
	public void deleteDoctorSettings(@PathVariable Long id) {
		log.debug("REST request to delete DoctorSettings : {}", id);
		doctorSettingsResourceApi.deleteDoctorSettingsUsingDELETE(id);

	}
}
