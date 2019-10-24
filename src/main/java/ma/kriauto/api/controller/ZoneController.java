package ma.kriauto.api.controller;

import ma.kriauto.api.common.ErrorLabel;
import ma.kriauto.api.exception.CustomErrorType;
import ma.kriauto.api.model.Profile;
import ma.kriauto.api.model.Zone;
import ma.kriauto.api.service.ProfileService;
import ma.kriauto.api.service.ZoneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ZoneController {
	
	
	@Autowired
	private ZoneService zoneService;
	
	@Autowired
	private ProfileService profileService;
		
	@CrossOrigin
    @PostMapping("/updatezone")
    public ResponseEntity<?> updatezone(@RequestHeader(value="Authorization") String authorization, @RequestBody Zone zone) {
      log.info("-- Start updatezone "+zone);
      String token = authorization.replaceAll("Basic", "");
  	  Profile current = profileService.fetchProfileByToken(token);
  	  if(null == current){
		return new ResponseEntity(new CustomErrorType(ErrorLabel.USER_NOT_FOUND),HttpStatus.NOT_FOUND);
	  }else if(!current.getIsActive()){
		  return new ResponseEntity(new CustomErrorType(ErrorLabel.USER_NOT_ACTIVE),HttpStatus.FORBIDDEN);
	  }else if(zone.getLabel() == "" || zone.getLat1() == 0.0 || zone.getLon1() == 0.0 || zone.getLat2() == 0.0 || zone.getLon2() == 0.0 || zone.getLat3() == 0.0 || zone.getLon3() == 0.0 || zone.getLat4() == 0.0 || zone.getLon4() == 0.0 || zone.getLat5() == 0.0 || zone.getLon5() == 0.0 || zone.getLat6() == 0.0 || zone.getLon6() == 0.0){
		  return new ResponseEntity(new CustomErrorType(ErrorLabel.ZONE_NOT_DEFINED),HttpStatus.NOT_FOUND);
	  }
  	  zoneService.save(zone);
  	  log.info("-- End updatezone --");
  	  return new ResponseEntity(new CustomErrorType(ErrorLabel.DATA_SAVED),HttpStatus.OK);
    }
}
