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
 * This class is a wrapper for {@link EVPKaleoForkInstance}.
 * </p>
 *
 * @author Val Nagy
 * @see EVPKaleoForkInstance
 * @generated
 */
public class EVPKaleoForkInstanceWrapper
	extends BaseModelWrapper<EVPKaleoForkInstance>
	implements EVPKaleoForkInstance, ModelWrapper<EVPKaleoForkInstance> {

	public EVPKaleoForkInstanceWrapper(
		EVPKaleoForkInstance evpKaleoForkInstance) {

		super(evpKaleoForkInstance);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("evpKaleoForkInstanceId", getEvpKaleoForkInstanceId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("classNameId", getClassNameId());
		attributes.put("classPK", getClassPK());
		attributes.put("type", getType());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long evpKaleoForkInstanceId = (Long)attributes.get(
			"evpKaleoForkInstanceId");

		if (evpKaleoForkInstanceId != null) {
			setEvpKaleoForkInstanceId(evpKaleoForkInstanceId);
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

		Long classNameId = (Long)attributes.get("classNameId");

		if (classNameId != null) {
			setClassNameId(classNameId);
		}

		Long classPK = (Long)attributes.get("classPK");

		if (classPK != null) {
			setClassPK(classPK);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	 * Returns the fully qualified class name of this evp kaleo fork instance.
	 *
	 * @return the fully qualified class name of this evp kaleo fork instance
	 */
	@Override
	public String getClassName() {
		return model.getClassName();
	}

	/**
	 * Returns the class name ID of this evp kaleo fork instance.
	 *
	 * @return the class name ID of this evp kaleo fork instance
	 */
	@Override
	public long getClassNameId() {
		return model.getClassNameId();
	}

	/**
	 * Returns the class pk of this evp kaleo fork instance.
	 *
	 * @return the class pk of this evp kaleo fork instance
	 */
	@Override
	public long getClassPK() {
		return model.getClassPK();
	}

	/**
	 * Returns the company ID of this evp kaleo fork instance.
	 *
	 * @return the company ID of this evp kaleo fork instance
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this evp kaleo fork instance.
	 *
	 * @return the create date of this evp kaleo fork instance
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the evp kaleo fork instance ID of this evp kaleo fork instance.
	 *
	 * @return the evp kaleo fork instance ID of this evp kaleo fork instance
	 */
	@Override
	public long getEvpKaleoForkInstanceId() {
		return model.getEvpKaleoForkInstanceId();
	}

	/**
	 * Returns the modified date of this evp kaleo fork instance.
	 *
	 * @return the modified date of this evp kaleo fork instance
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this evp kaleo fork instance.
	 *
	 * @return the primary key of this evp kaleo fork instance
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this evp kaleo fork instance.
	 *
	 * @return the status of this evp kaleo fork instance
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the type of this evp kaleo fork instance.
	 *
	 * @return the type of this evp kaleo fork instance
	 */
	@Override
	public int getType() {
		return model.getType();
	}

	/**
	 * Returns the user ID of this evp kaleo fork instance.
	 *
	 * @return the user ID of this evp kaleo fork instance
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this evp kaleo fork instance.
	 *
	 * @return the user name of this evp kaleo fork instance
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this evp kaleo fork instance.
	 *
	 * @return the user uuid of this evp kaleo fork instance
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	@Override
	public void setClassName(String className) {
		model.setClassName(className);
	}

	/**
	 * Sets the class name ID of this evp kaleo fork instance.
	 *
	 * @param classNameId the class name ID of this evp kaleo fork instance
	 */
	@Override
	public void setClassNameId(long classNameId) {
		model.setClassNameId(classNameId);
	}

	/**
	 * Sets the class pk of this evp kaleo fork instance.
	 *
	 * @param classPK the class pk of this evp kaleo fork instance
	 */
	@Override
	public void setClassPK(long classPK) {
		model.setClassPK(classPK);
	}

	/**
	 * Sets the company ID of this evp kaleo fork instance.
	 *
	 * @param companyId the company ID of this evp kaleo fork instance
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this evp kaleo fork instance.
	 *
	 * @param createDate the create date of this evp kaleo fork instance
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the evp kaleo fork instance ID of this evp kaleo fork instance.
	 *
	 * @param evpKaleoForkInstanceId the evp kaleo fork instance ID of this evp kaleo fork instance
	 */
	@Override
	public void setEvpKaleoForkInstanceId(long evpKaleoForkInstanceId) {
		model.setEvpKaleoForkInstanceId(evpKaleoForkInstanceId);
	}

	/**
	 * Sets the modified date of this evp kaleo fork instance.
	 *
	 * @param modifiedDate the modified date of this evp kaleo fork instance
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this evp kaleo fork instance.
	 *
	 * @param primaryKey the primary key of this evp kaleo fork instance
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this evp kaleo fork instance.
	 *
	 * @param status the status of this evp kaleo fork instance
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the type of this evp kaleo fork instance.
	 *
	 * @param type the type of this evp kaleo fork instance
	 */
	@Override
	public void setType(int type) {
		model.setType(type);
	}

	/**
	 * Sets the user ID of this evp kaleo fork instance.
	 *
	 * @param userId the user ID of this evp kaleo fork instance
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this evp kaleo fork instance.
	 *
	 * @param userName the user name of this evp kaleo fork instance
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this evp kaleo fork instance.
	 *
	 * @param userUuid the user uuid of this evp kaleo fork instance
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected EVPKaleoForkInstanceWrapper wrap(
		EVPKaleoForkInstance evpKaleoForkInstance) {

		return new EVPKaleoForkInstanceWrapper(evpKaleoForkInstance);
	}

}