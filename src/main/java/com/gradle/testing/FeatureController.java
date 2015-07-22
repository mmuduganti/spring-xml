/**
 * 
 */
package com.gradle.testing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mmuduganti
 *
 */
@RestController
@RequestMapping("/feature")
public class FeatureController {
	private List<Feature> features;
	private FeatureService featureService;
	
	@Autowired
	public FeatureController(List<Feature> features, FeatureService featureService) {
		this.features = features;
		this.featureService = featureService;
	}
	
	@RequestMapping("/list")
	public String getFeaturesList() {
		return features.toString();
	}
	
	@RequestMapping("/objectId")
	public String getObjectId() {
		return featureService.getObjectId();
	}
	
	@RequestMapping("/secondObjectId")
	public String getSecondObjectId() {
		return featureService.getSecondObjectId();
	}
}
