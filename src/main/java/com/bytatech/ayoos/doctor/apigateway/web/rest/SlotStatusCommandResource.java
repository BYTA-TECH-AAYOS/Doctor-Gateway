package com.bytatech.ayoos.doctor.apigateway.web.rest;

import com.bytatech.ayoos.doctor.apigateway.client.doctor.api.SlotStatusResourceApi;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.SlotStatusDTO;
import com.codahale.metrics.annotation.Timed;




import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
 * REST controller for managing SlotStatus.
 */
@RestController
@RequestMapping("/api/command")
public class SlotStatusCommandResource {

	private final Logger log = LoggerFactory.getLogger(SlotStatusCommandResource.class);
	private final SlotStatusResourceApi slotStatusResourceApi;

	public SlotStatusCommandResource(SlotStatusResourceApi slotStatusResourceApi) {
		this.slotStatusResourceApi = slotStatusResourceApi;
	}

	@PostMapping("/slot-statuses")
	public void createSlotStatus(@RequestBody SlotStatusDTO slotStatusDTO) {
		log.debug("REST request to save SlotStatus : {}", slotStatusDTO);
		slotStatusResourceApi.createSlotStatusUsingPOST(slotStatusDTO);

	}

	@PutMapping("/slot-statuses")
	public void updateSlotStatus(@RequestBody SlotStatusDTO slotStatusDTO) {
		log.debug("REST request to update SlotStatus : {}", slotStatusDTO);
		slotStatusResourceApi.updateSlotStatusUsingPUT(slotStatusDTO);
	}

	@DeleteMapping("/slot-statuses/{id}")
	public void deleteSlotStatus(@PathVariable Long id) {
		log.debug("REST request to delete SlotStatus : {}", id);
		slotStatusResourceApi.deleteSlotStatusUsingDELETE(id);

	}
}
