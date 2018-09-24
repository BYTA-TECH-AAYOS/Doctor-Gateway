/**
 * 
 */
package com.bytatech.ayoos.doctor.apigateway.web.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.bytatech.ayoos.doctor.apigateway.client.doctor.api.ReservedSlotResourceApi;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.api.SlotStatusResourceApi;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.ReservedSlot;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.ReservedSlotDTO;





/**
 * @author rafeek
 *
 */
@RestController
@RequestMapping("/api/query")
public class SlotStatusQueryResource {
	@Autowired
	SlotStatusResourceApi  slotStatusResourceApi  ;
	/* private final Logger log = LoggerFactory.getLogger( SlotStatusQueryResource.class);
	@GetMapping("_search")
	public Set<ReservedSlot> getReservedslot(@PathVariable String profileName, @PathVariable LocalDate date) {
		log.debug("REST request to search for a page of ReservedSlots ");
		return doctorResourceApi.getReservedslotUsingGET(date, profileName);
	}
*/
}
