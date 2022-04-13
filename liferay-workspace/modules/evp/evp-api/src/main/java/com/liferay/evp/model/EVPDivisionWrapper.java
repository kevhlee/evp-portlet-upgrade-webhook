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
 * This class is a wrapper for {@link EVPDivision}.
 * </p>
 *
 * @author Val Nagy
 * @see EVPDivision
 * @generated
 */
public class EVPDivisionWrapper
	extends BaseModelWrapper<EVPDivision>
	implements EVPDivision, ModelWrapper<EVPDivision> {

	public EVPDivisionWrapper(EVPDivision evpDivision) {
		super(evpDivision);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("evpDivisionId", getEvpDivisionId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("parentEVPDivisionId", getParentEVPDivisionId());
		attributes.put("abbreviation", getAbbreviation());
		attributes.put("type", getType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long evpDivisionId = (Long)attributes.get("evpDivisionId");

		if (evpDivisionId != null) {
			setEvpDivisionId(evpDivisionId);
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

		Long parentEVPDivisionId = (Long)attributes.get("parentEVPDivisionId");

		if (parentEVPDivisionId != null) {
			setParentEVPDivisionId(parentEVPDivisionId);
		}

		String abbreviation = (String)attributes.get("abbreviation");

		if (abbreviation != null) {
			setAbbreviation(abbreviation);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}
	}

	/**
	 * Returns the abbreviation of this evp division.
	 *
	 * @return the abbreviation of this evp division
	 */
	@Override
	public String getAbbreviation() {
		return model.getAbbreviation();
	}

	/**
	 * Returns the company ID of this evp division.
	 *
	 * @return the company ID of this evp division
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this evp division.
	 *
	 * @return the create date of this evp division
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the evp division ID of this evp division.
	 *
	 * @return the evp division ID of this evp division
	 */
	@Override
	public long getEvpDivisionId() {
		return model.getEvpDivisionId();
	}

	/**
	 * Returns the modified date of this evp division.
	 *
	 * @return the modified date of this evp division
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	@Override
	public long getOrganizationGroupId() {
		return model.getOrganizationGroupId();
	}

	/**
	 * Returns the organization ID of this evp division.
	 *
	 * @return the organization ID of this evp division
	 */
	@Override
	public long getOrganizationId() {
		return model.getOrganizationId();
	}

	/**
	 * Returns the parent evp division ID of this evp division.
	 *
	 * @return the parent evp division ID of this evp division
	 */
	@Override
	public long getParentEVPDivisionId() {
		return model.getParentEVPDivisionId();
	}

	/**
	 * Returns the primary key of this evp division.
	 *
	 * @return the primary key of this evp division
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the type of this evp division.
	 *
	 * @return the type of this evp division
	 */
	@Override
	public int getType() {
		return model.getType();
	}

	/**
	 * Returns the user ID of this evp division.
	 *
	 * @return the user ID of this evp division
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this evp division.
	 *
	 * @return the user name of this evp division
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this evp division.
	 *
	 * @return the user uuid of this evp division
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the abbreviation of this evp division.
	 *
	 * @param abbreviation the abbreviation of this evp division
	 */
	@Override
	public void setAbbreviation(String abbreviation) {
		model.setAbbreviation(abbreviation);
	}

	/**
	 * Sets the company ID of this evp division.
	 *
	 * @param companyId the company ID of this evp division
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this evp division.
	 *
	 * @param createDate the create date of this evp division
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the evp division ID of this evp division.
	 *
	 * @param evpDivisionId the evp division ID of this evp division
	 */
	@Override
	public void setEvpDivisionId(long evpDivisionId) {
		model.setEvpDivisionId(evpDivisionId);
	}

	/**
	 * Sets the modified date of this evp division.
	 *
	 * @param modifiedDate the modified date of this evp division
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the organization ID of this evp division.
	 *
	 * @param organizationId the organization ID of this evp division
	 */
	@Override
	public void setOrganizationId(long organizationId) {
		model.setOrganizationId(organizationId);
	}

	/**
	 * Sets the parent evp division ID of this evp division.
	 *
	 * @param parentEVPDivisionId the parent evp division ID of this evp division
	 */
	@Override
	public void setParentEVPDivisionId(long parentEVPDivisionId) {
		model.setParentEVPDivisionId(parentEVPDivisionId);
	}

	/**
	 * Sets the primary key of this evp division.
	 *
	 * @param primaryKey the primary key of this evp division
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the type of this evp division.
	 *
	 * @param type the type of this evp division
	 */
	@Override
	public void setType(int type) {
		model.setType(type);
	}

	/**
	 * Sets the user ID of this evp division.
	 *
	 * @param userId the user ID of this evp division
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this evp division.
	 *
	 * @param userName the user name of this evp division
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this evp division.
	 *
	 * @param userUuid the user uuid of this evp division
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected EVPDivisionWrapper wrap(EVPDivision evpDivision) {
		return new EVPDivisionWrapper(evpDivision);
	}

}