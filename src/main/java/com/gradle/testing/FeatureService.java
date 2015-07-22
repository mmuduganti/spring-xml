/**
 * 
 */
package com.gradle.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mmuduganti
 *
 */
@Service
public class FeatureService {
	@Autowired
	private FeatureImpl featureImpl;
	
	@Autowired
	private SecondFeatureImpl secondFeatureImpl;
	
	public String getObjectId() {
		return featureImpl.toString();
	}
	
	public String getSecondObjectId() {
		return secondFeatureImpl.toString();
	}
}
