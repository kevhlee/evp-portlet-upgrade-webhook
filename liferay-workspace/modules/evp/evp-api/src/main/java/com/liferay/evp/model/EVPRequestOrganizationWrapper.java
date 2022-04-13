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
 * This class is a wrapper for {@link EVPRequestOrganization}.
 * </p>
 *
 * @author Val Nagy
 * @see EVPRequestOrganization
 * @generated
 */
public class EVPRequestOrganizationWrapper
	extends BaseModelWrapper<EVPRequestOrganization>
	implements EVPRequestOrganization, ModelWrapper<EVPRequestOrganization> {

	public EVPRequestOrganizationWrapper(
		EVPRequestOrganization evpRequestOrganization) {

		super(evpRequestOrganization);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"evpRequestOrganizationId", getEvpRequestOrganizationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("subsidiaryGroupId", getSubsidiaryGroupId());
		attributes.put("description", getDescription());
		attributes.put("taxIdentificationNumber", getTaxIdentificationNumber());
		attributes.put("nonprofitType", getNonprofitType());
		attributes.put("verified", isVerified());
		attributes.put("shared", isShared());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long evpRequestOrganizationId = (Long)attributes.get(
			"evpRequestOrganizationId");

		if (evpRequestOrganizationId != null) {
			setEvpRequestOrganizationId(evpRequestOrganizationId);
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

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long subsidiaryGroupId = (Long)attributes.get("subsidiaryGroupId");

		if (subsidiaryGroupId != null) {
			setSubsidiaryGroupId(subsidiaryGroupId);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String taxIdentificationNumber = (String)attributes.get(
			"taxIdentificationNumber");

		if (taxIdentificationNumber != null) {
			setTaxIdentificationNumber(taxIdentificationNumber);
		}

		Integer nonprofitType = (Integer)attributes.get("nonprofitType");

		if (nonprofitType != null) {
			setNonprofitType(nonprofitType);
		}

		Boolean verified = (Boolean)attributes.get("verified");

		if (verified != null) {
			setVerified(verified);
		}

		Boolean shared = (Boolean)attributes.get("shared");

		if (shared != null) {
			setShared(shared);
		}
	}

	/**
	 * Returns the company ID of this evp request organization.
	 *
	 * @return the company ID of this evp request organization
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this evp request organization.
	 *
	 * @return the create date of this evp request organization
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this evp request organization.
	 *
	 * @return the description of this evp request organization
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the evp request organization ID of this evp request organization.
	 *
	 * @return the evp request organization ID of this evp request organization
	 */
	@Override
	public long getEvpRequestOrganizationId() {
		return model.getEvpRequestOrganizationId();
	}

	/**
	 * Returns the modified date of this evp request organization.
	 *
	 * @return the modified date of this evp request organization
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nonprofit type of this evp request organization.
	 *
	 * @return the nonprofit type of this evp request organization
	 */
	@Override
	public int getNonprofitType() {
		return model.getNonprofitType();
	}

	/**
	 * Returns the organization ID of this evp request organization.
	 *
	 * @return the organization ID of this evp request organization
	 */
	@Override
	public long getOrganizationId() {
		return model.getOrganizationId();
	}

	/**
	 * Returns the primary key of this evp request organization.
	 *
	 * @return the primary key of this evp request organization
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the shared of this evp request organization.
	 *
	 * @return the shared of this evp request organization
	 */
	@Override
	public boolean getShared() {
		return model.getShared();
	}

	/**
	 * Returns the subsidiary group ID of this evp request organization.
	 *
	 * @return the subsidiary group ID of this evp request organization
	 */
	@Override
	public long getSubsidiaryGroupId() {
		return model.getSubsidiaryGroupId();
	}

	/**
	 * Returns the tax identification number of this evp request organization.
	 *
	 * @return the tax identification number of this evp request organization
	 */
	@Override
	public String getTaxIdentificationNumber() {
		return model.getTaxIdentificationNumber();
	}

	/**
	 * Returns the user ID of this evp request organization.
	 *
	 * @return the user ID of this evp request organization
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this evp request organization.
	 *
	 * @return the user name of this evp request organization
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this evp request organization.
	 *
	 * @return the user uuid of this evp request organization
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the verified of this evp request organization.
	 *
	 * @return the verified of this evp request organization
	 */
	@Override
	public boolean getVerified() {
		return model.getVerified();
	}

	/**
	 * Returns <code>true</code> if this evp request organization is shared.
	 *
	 * @return <code>true</code> if this evp request organization is shared; <code>false</code> otherwise
	 */
	@Override
	public boolean isShared() {
		return model.isShared();
	}

	/**
	 * Returns <code>true</code> if this evp request organization is verified.
	 *
	 * @return <code>true</code> if this evp request organization is verified; <code>false</code> otherwise
	 */
	@Override
	public boolean isVerified() {
		return model.isVerified();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this evp request organization.
	 *
	 * @param companyId the company ID of this evp request organization
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this evp request organization.
	 *
	 * @param createDate the create date of this evp request organization
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this evp request organization.
	 *
	 * @param description the description of this evp request organization
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the evp request organization ID of this evp request organization.
	 *
	 * @param evpRequestOrganizationId the evp request organization ID of this evp request organization
	 */
	@Override
	public void setEvpRequestOrganizationId(long evpRequestOrganizationId) {
		model.setEvpRequestOrganizationId(evpRequestOrganizationId);
	}

	/**
	 * Sets the modified date of this evp request organization.
	 *
	 * @param modifiedDate the modified date of this evp request organization
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nonprofit type of this evp request organization.
	 *
	 * @param nonprofitType the nonprofit type of this evp request organization
	 */
	@Override
	public void setNonprofitType(int nonprofitType) {
		model.setNonprofitType(nonprofitType);
	}

	/**
	 * Sets the organization ID of this evp request organization.
	 *
	 * @param organizationId the organization ID of this evp request organization
	 */
	@Override
	public void setOrganizationId(long organizationId) {
		model.setOrganizationId(organizationId);
	}

	/**
	 * Sets the primary key of this evp request organization.
	 *
	 * @param primaryKey the primary key of this evp request organization
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets whether this evp request organization is shared.
	 *
	 * @param shared the shared of this evp request organization
	 */
	@Override
	public void setShared(boolean shared) {
		model.setShared(shared);
	}

	/**
	 * Sets the subsidiary group ID of this evp request organization.
	 *
	 * @param subsidiaryGroupId the subsidiary group ID of this evp request organization
	 */
	@Override
	public void setSubsidiaryGroupId(long subsidiaryGroupId) {
		model.setSubsidiaryGroupId(subsidiaryGroupId);
	}

	/**
	 * Sets the tax identification number of this evp request organization.
	 *
	 * @param taxIdentificationNumber the tax identification number of this evp request organization
	 */
	@Override
	public void setTaxIdentificationNumber(String taxIdentificationNumber) {
		model.setTaxIdentificationNumber(taxIdentificationNumber);
	}

	/**
	 * Sets the user ID of this evp request organization.
	 *
	 * @param userId the user ID of this evp request organization
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this evp request organization.
	 *
	 * @param userName the user name of this evp request organization
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this evp request organization.
	 *
	 * @param userUuid the user uuid of this evp request organization
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets whether this evp request organization is verified.
	 *
	 * @param verified the verified of this evp request organization
	 */
	@Override
	public void setVerified(boolean verified) {
		model.setVerified(verified);
	}

	@Override
	protected EVPRequestOrganizationWrapper wrap(
		EVPRequestOrganization evpRequestOrganization) {

		return new EVPRequestOrganizationWrapper(evpRequestOrganization);
	}

}