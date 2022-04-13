/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.evp.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EVPGrantRequest}.
 * </p>
 *
 * @author Val Nagy
 * @see EVPGrantRequest
 * @generated
 */
public class EVPGrantRequestWrapper
	extends BaseModelWrapper<EVPGrantRequest>
	implements EVPGrantRequest, ModelWrapper<EVPGrantRequest> {

	public EVPGrantRequestWrapper(EVPGrantRequest evpGrantRequest) {
		super(evpGrantRequest);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("evpGrantRequestId", getEvpGrantRequestId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("contactEmailAddressId", getContactEmailAddressId());
		attributes.put("contactPhoneId", getContactPhoneId());
		attributes.put("contactUserId", getContactUserId());
		attributes.put(
			"evpRequestOrganizationId", getEvpRequestOrganizationId());
		attributes.put("parentEVPGrantRequestId", getParentEVPGrantRequestId());
		attributes.put(
			"requestOrganizationAddressId", getRequestOrganizationAddressId());
		attributes.put(
			"requestOrganizationWebsiteId", getRequestOrganizationWebsiteId());
		attributes.put("subsidiaryGroupId", getSubsidiaryGroupId());
		attributes.put("description", getDescription());
		attributes.put("employmentType", getEmploymentType());
		attributes.put("employmentHoursPerWeek", getEmploymentHoursPerWeek());
		attributes.put("purpose", getPurpose());
		attributes.put("purposeOther", getPurposeOther());
		attributes.put("behalfOf", getBehalfOf());
		attributes.put("behalfOfOther", getBehalfOfOther());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long evpGrantRequestId = (Long)attributes.get("evpGrantRequestId");

		if (evpGrantRequestId != null) {
			setEvpGrantRequestId(evpGrantRequestId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long contactEmailAddressId = (Long)attributes.get(
			"contactEmailAddressId");

		if (contactEmailAddressId != null) {
			setContactEmailAddressId(contactEmailAddressId);
		}

		Long contactPhoneId = (Long)attributes.get("contactPhoneId");

		if (contactPhoneId != null) {
			setContactPhoneId(contactPhoneId);
		}

		Long contactUserId = (Long)attributes.get("contactUserId");

		if (contactUserId != null) {
			setContactUserId(contactUserId);
		}

		Long evpRequestOrganizationId = (Long)attributes.get(
			"evpRequestOrganizationId");

		if (evpRequestOrganizationId != null) {
			setEvpRequestOrganizationId(evpRequestOrganizationId);
		}

		Long parentEVPGrantRequestId = (Long)attributes.get(
			"parentEVPGrantRequestId");

		if (parentEVPGrantRequestId != null) {
			setParentEVPGrantRequestId(parentEVPGrantRequestId);
		}

		Long requestOrganizationAddressId = (Long)attributes.get(
			"requestOrganizationAddressId");

		if (requestOrganizationAddressId != null) {
			setRequestOrganizationAddressId(requestOrganizationAddressId);
		}

		Long requestOrganizationWebsiteId = (Long)attributes.get(
			"requestOrganizationWebsiteId");

		if (requestOrganizationWebsiteId != null) {
			setRequestOrganizationWebsiteId(requestOrganizationWebsiteId);
		}

		Long subsidiaryGroupId = (Long)attributes.get("subsidiaryGroupId");

		if (subsidiaryGroupId != null) {
			setSubsidiaryGroupId(subsidiaryGroupId);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Integer employmentType = (Integer)attributes.get("employmentType");

		if (employmentType != null) {
			setEmploymentType(employmentType);
		}

		Integer employmentHoursPerWeek = (Integer)attributes.get(
			"employmentHoursPerWeek");

		if (employmentHoursPerWeek != null) {
			setEmploymentHoursPerWeek(employmentHoursPerWeek);
		}

		String purpose = (String)attributes.get("purpose");

		if (purpose != null) {
			setPurpose(purpose);
		}

		String purposeOther = (String)attributes.get("purposeOther");

		if (purposeOther != null) {
			setPurposeOther(purposeOther);
		}

		String behalfOf = (String)attributes.get("behalfOf");

		if (behalfOf != null) {
			setBehalfOf(behalfOf);
		}

		String behalfOfOther = (String)attributes.get("behalfOfOther");

		if (behalfOfOther != null) {
			setBehalfOfOther(behalfOfOther);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	/**
	 * Returns the behalf of of this evp grant request.
	 *
	 * @return the behalf of of this evp grant request
	 */
	@Override
	public String getBehalfOf() {
		return model.getBehalfOf();
	}

	/**
	 * Returns the behalf of other of this evp grant request.
	 *
	 * @return the behalf of other of this evp grant request
	 */
	@Override
	public String getBehalfOfOther() {
		return model.getBehalfOfOther();
	}

	/**
	 * Returns the company ID of this evp grant request.
	 *
	 * @return the company ID of this evp grant request
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contact email address ID of this evp grant request.
	 *
	 * @return the contact email address ID of this evp grant request
	 */
	@Override
	public long getContactEmailAddressId() {
		return model.getContactEmailAddressId();
	}

	/**
	 * Returns the contact phone ID of this evp grant request.
	 *
	 * @return the contact phone ID of this evp grant request
	 */
	@Override
	public long getContactPhoneId() {
		return model.getContactPhoneId();
	}

	/**
	 * Returns the contact user ID of this evp grant request.
	 *
	 * @return the contact user ID of this evp grant request
	 */
	@Override
	public long getContactUserId() {
		return model.getContactUserId();
	}

	/**
	 * Returns the contact user uuid of this evp grant request.
	 *
	 * @return the contact user uuid of this evp grant request
	 */
	@Override
	public String getContactUserUuid() {
		return model.getContactUserUuid();
	}

	/**
	 * Returns the create date of this evp grant request.
	 *
	 * @return the create date of this evp grant request
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this evp grant request.
	 *
	 * @return the description of this evp grant request
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the employment hours per week of this evp grant request.
	 *
	 * @return the employment hours per week of this evp grant request
	 */
	@Override
	public int getEmploymentHoursPerWeek() {
		return model.getEmploymentHoursPerWeek();
	}

	/**
	 * Returns the employment type of this evp grant request.
	 *
	 * @return the employment type of this evp grant request
	 */
	@Override
	public int getEmploymentType() {
		return model.getEmploymentType();
	}

	/**
	 * Returns the evp grant request ID of this evp grant request.
	 *
	 * @return the evp grant request ID of this evp grant request
	 */
	@Override
	public long getEvpGrantRequestId() {
		return model.getEvpGrantRequestId();
	}

	/**
	 * Returns the evp request organization ID of this evp grant request.
	 *
	 * @return the evp request organization ID of this evp grant request
	 */
	@Override
	public long getEvpRequestOrganizationId() {
		return model.getEvpRequestOrganizationId();
	}

	/**
	 * Returns the modified date of this evp grant request.
	 *
	 * @return the modified date of this evp grant request
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the parent evp grant request ID of this evp grant request.
	 *
	 * @return the parent evp grant request ID of this evp grant request
	 */
	@Override
	public long getParentEVPGrantRequestId() {
		return model.getParentEVPGrantRequestId();
	}

	/**
	 * Returns the primary key of this evp grant request.
	 *
	 * @return the primary key of this evp grant request
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the purpose of this evp grant request.
	 *
	 * @return the purpose of this evp grant request
	 */
	@Override
	public String getPurpose() {
		return model.getPurpose();
	}

	/**
	 * Returns the purpose other of this evp grant request.
	 *
	 * @return the purpose other of this evp grant request
	 */
	@Override
	public String getPurposeOther() {
		return model.getPurposeOther();
	}

	/**
	 * Returns the request organization address ID of this evp grant request.
	 *
	 * @return the request organization address ID of this evp grant request
	 */
	@Override
	public long getRequestOrganizationAddressId() {
		return model.getRequestOrganizationAddressId();
	}

	/**
	 * Returns the request organization website ID of this evp grant request.
	 *
	 * @return the request organization website ID of this evp grant request
	 */
	@Override
	public long getRequestOrganizationWebsiteId() {
		return model.getRequestOrganizationWebsiteId();
	}

	/**
	 * Returns the status of this evp grant request.
	 *
	 * @return the status of this evp grant request
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this evp grant request.
	 *
	 * @return the status by user ID of this evp grant request
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this evp grant request.
	 *
	 * @return the status by user name of this evp grant request
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this evp grant request.
	 *
	 * @return the status by user uuid of this evp grant request
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this evp grant request.
	 *
	 * @return the status date of this evp grant request
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the subsidiary group ID of this evp grant request.
	 *
	 * @return the subsidiary group ID of this evp grant request
	 */
	@Override
	public long getSubsidiaryGroupId() {
		return model.getSubsidiaryGroupId();
	}

	/**
	 * Returns the user ID of this evp grant request.
	 *
	 * @return the user ID of this evp grant request
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this evp grant request.
	 *
	 * @return the user name of this evp grant request
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this evp grant request.
	 *
	 * @return the user uuid of this evp grant request
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns <code>true</code> if this evp grant request is approved.
	 *
	 * @return <code>true</code> if this evp grant request is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this evp grant request is denied.
	 *
	 * @return <code>true</code> if this evp grant request is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this evp grant request is a draft.
	 *
	 * @return <code>true</code> if this evp grant request is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this evp grant request is expired.
	 *
	 * @return <code>true</code> if this evp grant request is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this evp grant request is inactive.
	 *
	 * @return <code>true</code> if this evp grant request is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this evp grant request is incomplete.
	 *
	 * @return <code>true</code> if this evp grant request is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this evp grant request is pending.
	 *
	 * @return <code>true</code> if this evp grant request is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this evp grant request is scheduled.
	 *
	 * @return <code>true</code> if this evp grant request is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the behalf of of this evp grant request.
	 *
	 * @param behalfOf the behalf of of this evp grant request
	 */
	@Override
	public void setBehalfOf(String behalfOf) {
		model.setBehalfOf(behalfOf);
	}

	/**
	 * Sets the behalf of other of this evp grant request.
	 *
	 * @param behalfOfOther the behalf of other of this evp grant request
	 */
	@Override
	public void setBehalfOfOther(String behalfOfOther) {
		model.setBehalfOfOther(behalfOfOther);
	}

	/**
	 * Sets the company ID of this evp grant request.
	 *
	 * @param companyId the company ID of this evp grant request
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contact email address ID of this evp grant request.
	 *
	 * @param contactEmailAddressId the contact email address ID of this evp grant request
	 */
	@Override
	public void setContactEmailAddressId(long contactEmailAddressId) {
		model.setContactEmailAddressId(contactEmailAddressId);
	}

	/**
	 * Sets the contact phone ID of this evp grant request.
	 *
	 * @param contactPhoneId the contact phone ID of this evp grant request
	 */
	@Override
	public void setContactPhoneId(long contactPhoneId) {
		model.setContactPhoneId(contactPhoneId);
	}

	/**
	 * Sets the contact user ID of this evp grant request.
	 *
	 * @param contactUserId the contact user ID of this evp grant request
	 */
	@Override
	public void setContactUserId(long contactUserId) {
		model.setContactUserId(contactUserId);
	}

	/**
	 * Sets the contact user uuid of this evp grant request.
	 *
	 * @param contactUserUuid the contact user uuid of this evp grant request
	 */
	@Override
	public void setContactUserUuid(String contactUserUuid) {
		model.setContactUserUuid(contactUserUuid);
	}

	/**
	 * Sets the create date of this evp grant request.
	 *
	 * @param createDate the create date of this evp grant request
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this evp grant request.
	 *
	 * @param description the description of this evp grant request
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the employment hours per week of this evp grant request.
	 *
	 * @param employmentHoursPerWeek the employment hours per week of this evp grant request
	 */
	@Override
	public void setEmploymentHoursPerWeek(int employmentHoursPerWeek) {
		model.setEmploymentHoursPerWeek(employmentHoursPerWeek);
	}

	/**
	 * Sets the employment type of this evp grant request.
	 *
	 * @param employmentType the employment type of this evp grant request
	 */
	@Override
	public void setEmploymentType(int employmentType) {
		model.setEmploymentType(employmentType);
	}

	/**
	 * Sets the evp grant request ID of this evp grant request.
	 *
	 * @param evpGrantRequestId the evp grant request ID of this evp grant request
	 */
	@Override
	public void setEvpGrantRequestId(long evpGrantRequestId) {
		model.setEvpGrantRequestId(evpGrantRequestId);
	}

	/**
	 * Sets the evp request organization ID of this evp grant request.
	 *
	 * @param evpRequestOrganizationId the evp request organization ID of this evp grant request
	 */
	@Override
	public void setEvpRequestOrganizationId(long evpRequestOrganizationId) {
		model.setEvpRequestOrganizationId(evpRequestOrganizationId);
	}

	/**
	 * Sets the modified date of this evp grant request.
	 *
	 * @param modifiedDate the modified date of this evp grant request
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the parent evp grant request ID of this evp grant request.
	 *
	 * @param parentEVPGrantRequestId the parent evp grant request ID of this evp grant request
	 */
	@Override
	public void setParentEVPGrantRequestId(long parentEVPGrantRequestId) {
		model.setParentEVPGrantRequestId(parentEVPGrantRequestId);
	}

	/**
	 * Sets the primary key of this evp grant request.
	 *
	 * @param primaryKey the primary key of this evp grant request
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the purpose of this evp grant request.
	 *
	 * @param purpose the purpose of this evp grant request
	 */
	@Override
	public void setPurpose(String purpose) {
		model.setPurpose(purpose);
	}

	/**
	 * Sets the purpose other of this evp grant request.
	 *
	 * @param purposeOther the purpose other of this evp grant request
	 */
	@Override
	public void setPurposeOther(String purposeOther) {
		model.setPurposeOther(purposeOther);
	}

	/**
	 * Sets the request organization address ID of this evp grant request.
	 *
	 * @param requestOrganizationAddressId the request organization address ID of this evp grant request
	 */
	@Override
	public void setRequestOrganizationAddressId(
		long requestOrganizationAddressId) {

		model.setRequestOrganizationAddressId(requestOrganizationAddressId);
	}

	/**
	 * Sets the request organization website ID of this evp grant request.
	 *
	 * @param requestOrganizationWebsiteId the request organization website ID of this evp grant request
	 */
	@Override
	public void setRequestOrganizationWebsiteId(
		long requestOrganizationWebsiteId) {

		model.setRequestOrganizationWebsiteId(requestOrganizationWebsiteId);
	}

	/**
	 * Sets the status of this evp grant request.
	 *
	 * @param status the status of this evp grant request
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this evp grant request.
	 *
	 * @param statusByUserId the status by user ID of this evp grant request
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this evp grant request.
	 *
	 * @param statusByUserName the status by user name of this evp grant request
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this evp grant request.
	 *
	 * @param statusByUserUuid the status by user uuid of this evp grant request
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this evp grant request.
	 *
	 * @param statusDate the status date of this evp grant request
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the subsidiary group ID of this evp grant request.
	 *
	 * @param subsidiaryGroupId the subsidiary group ID of this evp grant request
	 */
	@Override
	public void setSubsidiaryGroupId(long subsidiaryGroupId) {
		model.setSubsidiaryGroupId(subsidiaryGroupId);
	}

	/**
	 * Sets the user ID of this evp grant request.
	 *
	 * @param userId the user ID of this evp grant request
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this evp grant request.
	 *
	 * @param userName the user name of this evp grant request
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this evp grant request.
	 *
	 * @param userUuid the user uuid of this evp grant request
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected EVPGrantRequestWrapper wrap(EVPGrantRequest evpGrantRequest) {
		return new EVPGrantRequestWrapper(evpGrantRequest);
	}

}