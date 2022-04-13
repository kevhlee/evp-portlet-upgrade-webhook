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
 * This class is a wrapper for {@link EVPEmployee}.
 * </p>
 *
 * @author Val Nagy
 * @see EVPEmployee
 * @generated
 */
public class EVPEmployeeWrapper
	extends BaseModelWrapper<EVPEmployee>
	implements EVPEmployee, ModelWrapper<EVPEmployee> {

	public EVPEmployeeWrapper(EVPEmployee evpEmployee) {
		super(evpEmployee);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("evpEmployeeId", getEvpEmployeeId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("employeeUserId", getEmployeeUserId());
		attributes.put("managerUserId", getManagerUserId());
		attributes.put("subsidiaryEVPDivisionId", getSubsidiaryEVPDivisionId());
		attributes.put("employmentType", getEmploymentType());
		attributes.put("hireDate", getHireDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long evpEmployeeId = (Long)attributes.get("evpEmployeeId");

		if (evpEmployeeId != null) {
			setEvpEmployeeId(evpEmployeeId);
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

		Long employeeUserId = (Long)attributes.get("employeeUserId");

		if (employeeUserId != null) {
			setEmployeeUserId(employeeUserId);
		}

		Long managerUserId = (Long)attributes.get("managerUserId");

		if (managerUserId != null) {
			setManagerUserId(managerUserId);
		}

		Long subsidiaryEVPDivisionId = (Long)attributes.get(
			"subsidiaryEVPDivisionId");

		if (subsidiaryEVPDivisionId != null) {
			setSubsidiaryEVPDivisionId(subsidiaryEVPDivisionId);
		}

		Integer employmentType = (Integer)attributes.get("employmentType");

		if (employmentType != null) {
			setEmploymentType(employmentType);
		}

		Date hireDate = (Date)attributes.get("hireDate");

		if (hireDate != null) {
			setHireDate(hireDate);
		}
	}

	/**
	 * Returns the company ID of this evp employee.
	 *
	 * @return the company ID of this evp employee
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this evp employee.
	 *
	 * @return the create date of this evp employee
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the employee user ID of this evp employee.
	 *
	 * @return the employee user ID of this evp employee
	 */
	@Override
	public long getEmployeeUserId() {
		return model.getEmployeeUserId();
	}

	/**
	 * Returns the employee user uuid of this evp employee.
	 *
	 * @return the employee user uuid of this evp employee
	 */
	@Override
	public String getEmployeeUserUuid() {
		return model.getEmployeeUserUuid();
	}

	/**
	 * Returns the employment type of this evp employee.
	 *
	 * @return the employment type of this evp employee
	 */
	@Override
	public int getEmploymentType() {
		return model.getEmploymentType();
	}

	/**
	 * Returns the evp employee ID of this evp employee.
	 *
	 * @return the evp employee ID of this evp employee
	 */
	@Override
	public long getEvpEmployeeId() {
		return model.getEvpEmployeeId();
	}

	/**
	 * Returns the hire date of this evp employee.
	 *
	 * @return the hire date of this evp employee
	 */
	@Override
	public Date getHireDate() {
		return model.getHireDate();
	}

	/**
	 * Returns the manager user ID of this evp employee.
	 *
	 * @return the manager user ID of this evp employee
	 */
	@Override
	public long getManagerUserId() {
		return model.getManagerUserId();
	}

	/**
	 * Returns the manager user uuid of this evp employee.
	 *
	 * @return the manager user uuid of this evp employee
	 */
	@Override
	public String getManagerUserUuid() {
		return model.getManagerUserUuid();
	}

	/**
	 * Returns the modified date of this evp employee.
	 *
	 * @return the modified date of this evp employee
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this evp employee.
	 *
	 * @return the primary key of this evp employee
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the subsidiary evp division ID of this evp employee.
	 *
	 * @return the subsidiary evp division ID of this evp employee
	 */
	@Override
	public long getSubsidiaryEVPDivisionId() {
		return model.getSubsidiaryEVPDivisionId();
	}

	/**
	 * Returns the user ID of this evp employee.
	 *
	 * @return the user ID of this evp employee
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this evp employee.
	 *
	 * @return the user name of this evp employee
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this evp employee.
	 *
	 * @return the user uuid of this evp employee
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
	 * Sets the company ID of this evp employee.
	 *
	 * @param companyId the company ID of this evp employee
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this evp employee.
	 *
	 * @param createDate the create date of this evp employee
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the employee user ID of this evp employee.
	 *
	 * @param employeeUserId the employee user ID of this evp employee
	 */
	@Override
	public void setEmployeeUserId(long employeeUserId) {
		model.setEmployeeUserId(employeeUserId);
	}

	/**
	 * Sets the employee user uuid of this evp employee.
	 *
	 * @param employeeUserUuid the employee user uuid of this evp employee
	 */
	@Override
	public void setEmployeeUserUuid(String employeeUserUuid) {
		model.setEmployeeUserUuid(employeeUserUuid);
	}

	/**
	 * Sets the employment type of this evp employee.
	 *
	 * @param employmentType the employment type of this evp employee
	 */
	@Override
	public void setEmploymentType(int employmentType) {
		model.setEmploymentType(employmentType);
	}

	/**
	 * Sets the evp employee ID of this evp employee.
	 *
	 * @param evpEmployeeId the evp employee ID of this evp employee
	 */
	@Override
	public void setEvpEmployeeId(long evpEmployeeId) {
		model.setEvpEmployeeId(evpEmployeeId);
	}

	/**
	 * Sets the hire date of this evp employee.
	 *
	 * @param hireDate the hire date of this evp employee
	 */
	@Override
	public void setHireDate(Date hireDate) {
		model.setHireDate(hireDate);
	}

	/**
	 * Sets the manager user ID of this evp employee.
	 *
	 * @param managerUserId the manager user ID of this evp employee
	 */
	@Override
	public void setManagerUserId(long managerUserId) {
		model.setManagerUserId(managerUserId);
	}

	/**
	 * Sets the manager user uuid of this evp employee.
	 *
	 * @param managerUserUuid the manager user uuid of this evp employee
	 */
	@Override
	public void setManagerUserUuid(String managerUserUuid) {
		model.setManagerUserUuid(managerUserUuid);
	}

	/**
	 * Sets the modified date of this evp employee.
	 *
	 * @param modifiedDate the modified date of this evp employee
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this evp employee.
	 *
	 * @param primaryKey the primary key of this evp employee
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the subsidiary evp division ID of this evp employee.
	 *
	 * @param subsidiaryEVPDivisionId the subsidiary evp division ID of this evp employee
	 */
	@Override
	public void setSubsidiaryEVPDivisionId(long subsidiaryEVPDivisionId) {
		model.setSubsidiaryEVPDivisionId(subsidiaryEVPDivisionId);
	}

	/**
	 * Sets the user ID of this evp employee.
	 *
	 * @param userId the user ID of this evp employee
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this evp employee.
	 *
	 * @param userName the user name of this evp employee
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this evp employee.
	 *
	 * @param userUuid the user uuid of this evp employee
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected EVPEmployeeWrapper wrap(EVPEmployee evpEmployee) {
		return new EVPEmployeeWrapper(evpEmployee);
	}

}