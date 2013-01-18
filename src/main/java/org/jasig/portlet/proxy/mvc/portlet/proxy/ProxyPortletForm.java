/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.portlet.proxy.mvc.portlet.proxy;

import java.beans.PropertyEditorSupport;


public class ProxyPortletForm {

  public static final String AUTHENTICATION_TYPE = "authType";
    
	enum ProxyAuthType {
		NONE, CAS, BASIC;
	}
	
  public static final class ProxyAuthTypeEditor extends PropertyEditorSupport {
      @Override
      public void setAsText(String text) {
          ProxyAuthType value = ProxyAuthType.valueOf(text);
          setValue(value);
      }
  }

  private String contentService;
	private String location;
	
	// filters
	private String whitelistRegexes; // TODO: support multiple whitelist entries
	private String clippingSelector;
	private String header;
	private String footer;
	
	// authentication
	private ProxyAuthType authType = ProxyAuthType.NONE;
	private String usernameKey = "user.login.id";
	private String passwordKey = "password";
	

	public String getContentService() {
		return contentService;
	}

	public void setContentService(String contentService) {
		this.contentService = contentService;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getClippingSelector() {
		return clippingSelector;
	}

	public String getWhitelistRegexes() {
		return whitelistRegexes;
	}

	public void setWhitelistRegexes(String whitelistRegexes) {
		this.whitelistRegexes = whitelistRegexes;
	}

	public void setClippingSelector(String clippingSelector) {
		this.clippingSelector = clippingSelector;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public ProxyAuthType getAuthType() {
		return authType;
	}

	public void setAuthType(ProxyAuthType authType) {
		this.authType = authType;
	}

	public String getUsernameKey() {
		return usernameKey;
	}

	public void setUsernameKey(String usernameKey) {
		this.usernameKey = usernameKey;
	}

	public String getPasswordKey() {
		return passwordKey;
	}

	public void setPasswordKey(String passwordKey) {
		this.passwordKey = passwordKey;
	}

}
