/**
 * 
 */
package com.bytatech.ayoos.doctor.apigateway.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.doctor.apigateway.client.doctor.api.DoctorResourceApi;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.api.DoctorSessionInfoResourceApi;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.DoctorSessionInfoDTO;
import com.bytatech.ayoos.doctor.apigateway.service.UserService;
import com.codahale.metrics.annotation.Timed;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

import org.mapstruct.ap.shaded.freemarker.template.SimpleDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author rafeek
 *
 */
@RestController
@RequestMapping("/api/command")
public class DoctorSessionInfoCommandResource {
	
	@Autowired
	UserService userService;
	@Autowired
	DoctorResourceApi doctorResourceApi;
	@Autowired
	private DoctorSessionInfoResourceApi sessionsResourceApi;
	private final Logger log = LoggerFactory.getLogger(DoctorSessionInfoCommandResource.class);
	
	@PostMapping("/sessions/createSessions")
	public void createSession(@RequestBody List<DoctorSessionInfoDTO> doctorSessionInfoList) {
		LocalDate date= null;
		for(DoctorSessionInfoDTO sessionsList : doctorSessionInfoList) {
			log.debug("REST request to save Session : {}", sessionsList);
			date=sessionsList.getDate();
			sessionsResourceApi.createDoctorSessionInfoUsingPOST(sessionsList);
			
		}
		String profileName =userService.getCurrentUserLogin();
	System.out.println("===============profileName==============="+profileName  );
	System.out.println("======Date======="+date);	
	/*String datenew=new SimpleDateFormat("yyyy-MM-dd").format(date.of(date.getYear(), date.getMonthValue(), date.getDayOfMonth()));
	System.out.println(datenew+"parsed formatted+++++++++++++++++++");*/
	doctorResourceApi.setBusySessionsUsingGET(date.toString(), profileName);
	
		
		
	}
	@PutMapping("/sessions")

	public void updateSession(@RequestBody List<DoctorSessionInfoDTO> doctorSessionInfoList) {
		
		for(DoctorSessionInfoDTO sessionslist : doctorSessionInfoList) {
		 log.debug("REST request to update Session : {}", doctorSessionInfoList);
		sessionsResourceApi.updateDoctorSessionInfoUsingPUT(sessionslist);
		}
	}

	/*@PostMapping("/sessions")
    public void createSession(@RequestBody DoctorSessionInfoDTO doctorSessionInfoDTO) {
		 log.debug("REST request to save Session : {}", doctorSessionInfoDTO);
		sessionsResourceApi.createDoctorSessionInfoUsingPOST(doctorSessionInfoDTO);
	}*/

	/*@PutMapping("/sessions")

	public void updateSession(@RequestBody DoctorSessionInfoDTO doctorSessionInfoDTO) {
		 log.debug("REST request to update Session : {}", doctorSessionInfoDTO);
		sessionsResourceApi.updateDoctorSessionInfoUsingPUT(doctorSessionInfoDTO);
	}*/

	@DeleteMapping("/sessions/{id}")
	public void deleteSession(@PathVariable Long id) {
		 log.debug("REST request to delete Session : {}", id);
		sessionsResourceApi.deleteDoctorSessionInfoUsingDELETE(id);
	}

}
