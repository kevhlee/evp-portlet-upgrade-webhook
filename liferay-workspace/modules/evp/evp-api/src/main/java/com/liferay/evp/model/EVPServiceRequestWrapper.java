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
 * This class is a wrapper for {@link EVPServiceRequest}.
 * </p>
 *
 * @author Val Nagy
 * @see EVPServiceRequest
 * @generated
 */
public class EVPServiceRequestWrapper
	extends BaseModelWrapper<EVPServiceRequest>
	implements EVPServiceRequest, ModelWrapper<EVPServiceRequest> {

	public EVPServiceRequestWrapper(EVPServiceRequest evpServiceRequest) {
		super(evpServiceRequest);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("evpServiceRequestId", getEvpServiceRequestId());
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
		attributes.put("managerUserId", getManagerUserId());
		attributes.put(
			"parentEVPServiceRequestId", getParentEVPServiceRequestId());
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
		attributes.put("requestedStartDate", getRequestedStartDate());
		attributes.put("requestedEndDate", getRequestedEndDate());
		attributes.put("requestedTotalHours", getRequestedTotalHours());
		attributes.put("promoteTrip", isPromoteTrip());
		attributes.put("confirmedStartDate", getConfirmedStartDate());
		attributes.put("confirmedEndDate", getConfirmedEndDate());
		attributes.put("confirmedTotalHours", getConfirmedTotalHours());
		attributes.put("contactBenefit", getContactBenefit());
		attributes.put("contactComments", getContactComments());
		attributes.put("hash", getHash());
		attributes.put("feedbackDescription", getFeedbackDescription());
		attributes.put("employeeBenefit", getEmployeeBenefit());
		attributes.put("recipientBenefit", getRecipientBenefit());
		attributes.put("shareStory", isShareStory());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long evpServiceRequestId = (Long)attributes.get("evpServiceRequestId");

		if (evpServiceRequestId != null) {
			setEvpServiceRequestId(evpServiceRequestId);
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

		Long managerUserId = (Long)attributes.get("managerUserId");

		if (managerUserId != null) {
			setManagerUserId(managerUserId);
		}

		Long parentEVPServiceRequestId = (Long)attributes.get(
			"parentEVPServiceRequestId");

		if (parentEVPServiceRequestId != null) {
			setParentEVPServiceRequestId(parentEVPServiceRequestId);
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

		Date requestedStartDate = (Date)attributes.get("requestedStartDate");

		if (requestedStartDate != null) {
			setRequestedStartDate(requestedStartDate);
		}

		Date requestedEndDate = (Date)attributes.get("requestedEndDate");

		if (requestedEndDate != null) {
			setRequestedEndDate(requestedEndDate);
		}

		Integer requestedTotalHours = (Integer)attributes.get(
			"requestedTotalHours");

		if (requestedTotalHours != null) {
			setRequestedTotalHours(requestedTotalHours);
		}

		Boolean promoteTrip = (Boolean)attributes.get("promoteTrip");

		if (promoteTrip != null) {
			setPromoteTrip(promoteTrip);
		}

		Date confirmedStartDate = (Date)attributes.get("confirmedStartDate");

		if (confirmedStartDate != null) {
			setConfirmedStartDate(confirmedStartDate);
		}

		Date confirmedEndDate = (Date)attributes.get("confirmedEndDate");

		if (confirmedEndDate != null) {
			setConfirmedEndDate(confirmedEndDate);
		}

		Integer confirmedTotalHours = (Integer)attributes.get(
			"confirmedTotalHours");

		if (confirmedTotalHours != null) {
			setConfirmedTotalHours(confirmedTotalHours);
		}

		String contactBenefit = (String)attributes.get("contactBenefit");

		if (contactBenefit != null) {
			setContactBenefit(contactBenefit);
		}

		String contactComments = (String)attributes.get("contactComments");

		if (contactComments != null) {
			setContactComments(contactComments);
		}

		String hash = (String)attributes.get("hash");

		if (hash != null) {
			setHash(hash);
		}

		String feedbackDescription = (String)attributes.get(
			"feedbackDescription");

		if (feedbackDescription != null) {
			setFeedbackDescription(feedbackDescription);
		}

		String employeeBenefit = (String)attributes.get("employeeBenefit");

		if (employeeBenefit != null) {
			setEmployeeBenefit(employeeBenefit);
		}

		String recipientBenefit = (String)attributes.get("recipientBenefit");

		if (recipientBenefit != null) {
			setRecipientBenefit(recipientBenefit);
		}

		Boolean shareStory = (Boolean)attributes.get("shareStory");

		if (shareStory != null) {
			setShareStory(shareStory);
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
	 * Returns the behalf of of this evp service request.
	 *
	 * @return the behalf of of this evp service request
	 */
	@Override
	public String getBehalfOf() {
		return model.getBehalfOf();
	}

	/**
	 * Returns the behalf of other of this evp service request.
	 *
	 * @return the behalf of other of this evp service request
	 */
	@Override
	public String getBehalfOfOther() {
		return model.getBehalfOfOther();
	}

	/**
	 * Returns the company ID of this evp service request.
	 *
	 * @return the company ID of this evp service request
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the confirmed end date of this evp service request.
	 *
	 * @return the confirmed end date of this evp service request
	 */
	@Override
	public Date getConfirmedEndDate() {
		return model.getConfirmedEndDate();
	}

	/**
	 * Returns the confirmed start date of this evp service request.
	 *
	 * @return the confirmed start date of this evp service request
	 */
	@Override
	public Date getConfirmedStartDate() {
		return model.getConfirmedStartDate();
	}

	/**
	 * Returns the confirmed total hours of this evp service request.
	 *
	 * @return the confirmed total hours of this evp service request
	 */
	@Override
	public int getConfirmedTotalHours() {
		return model.getConfirmedTotalHours();
	}

	/**
	 * Returns the contact benefit of this evp service request.
	 *
	 * @return the contact benefit of this evp service request
	 */
	@Override
	public String getContactBenefit() {
		return model.getContactBenefit();
	}

	/**
	 * Returns the contact comments of this evp service request.
	 *
	 * @return the contact comments of this evp service request
	 */
	@Override
	public String getContactComments() {
		return model.getContactComments();
	}

	/**
	 * Returns the contact email address ID of this evp service request.
	 *
	 * @return the contact email address ID of this evp service request
	 */
	@Override
	public long getContactEmailAddressId() {
		return model.getContactEmailAddressId();
	}

	/**
	 * Returns the contact phone ID of this evp service request.
	 *
	 * @return the contact phone ID of this evp service request
	 */
	@Override
	public long getContactPhoneId() {
		return model.getContactPhoneId();
	}

	/**
	 * Returns the contact user ID of this evp service request.
	 *
	 * @return the contact user ID of this evp service request
	 */
	@Override
	public long getContactUserId() {
		return model.getContactUserId();
	}

	/**
	 * Returns the contact user uuid of this evp service request.
	 *
	 * @return the contact user uuid of this evp service request
	 */
	@Override
	public String getContactUserUuid() {
		return model.getContactUserUuid();
	}

	/**
	 * Returns the create date of this evp service request.
	 *
	 * @return the create date of this evp service request
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this evp service request.
	 *
	 * @return the description of this evp service request
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the employee benefit of this evp service request.
	 *
	 * @return the employee benefit of this evp service request
	 */
	@Override
	public String getEmployeeBenefit() {
		return model.getEmployeeBenefit();
	}

	/**
	 * Returns the employment hours per week of this evp service request.
	 *
	 * @return the employment hours per week of this evp service request
	 */
	@Override
	public int getEmploymentHoursPerWeek() {
		return model.getEmploymentHoursPerWeek();
	}

	/**
	 * Returns the employment type of this evp service request.
	 *
	 * @return the employment type of this evp service request
	 */
	@Override
	public int getEmploymentType() {
		return model.getEmploymentType();
	}

	/**
	 * Returns the evp request organization ID of this evp service request.
	 *
	 * @return the evp request organization ID of this evp service request
	 */
	@Override
	public long getEvpRequestOrganizationId() {
		return model.getEvpRequestOrganizationId();
	}

	/**
	 * Returns the evp service request ID of this evp service request.
	 *
	 * @return the evp service request ID of this evp service request
	 */
	@Override
	public long getEvpServiceRequestId() {
		return model.getEvpServiceRequestId();
	}

	/**
	 * Returns the feedback description of this evp service request.
	 *
	 * @return the feedback description of this evp service request
	 */
	@Override
	public String getFeedbackDescription() {
		return model.getFeedbackDescription();
	}

	/**
	 * Returns the hash of this evp service request.
	 *
	 * @return the hash of this evp service request
	 */
	@Override
	public String getHash() {
		return model.getHash();
	}

	/**
	 * Returns the manager user ID of this evp service request.
	 *
	 * @return the manager user ID of this evp service request
	 */
	@Override
	public long getManagerUserId() {
		return model.getManagerUserId();
	}

	/**
	 * Returns the manager user uuid of this evp service request.
	 *
	 * @return the manager user uuid of this evp service request
	 */
	@Override
	public String getManagerUserUuid() {
		return model.getManagerUserUuid();
	}

	/**
	 * Returns the modified date of this evp service request.
	 *
	 * @return the modified date of this evp service request
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the parent evp service request ID of this evp service request.
	 *
	 * @return the parent evp service request ID of this evp service request
	 */
	@Override
	public long getParentEVPServiceRequestId() {
		return model.getParentEVPServiceRequestId();
	}

	/**
	 * Returns the primary key of this evp service request.
	 *
	 * @return the primary key of this evp service request
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the promote trip of this evp service request.
	 *
	 * @return the promote trip of this evp service request
	 */
	@Override
	public boolean getPromoteTrip() {
		return model.getPromoteTrip();
	}

	/**
	 * Returns the purpose of this evp service request.
	 *
	 * @return the purpose of this evp service request
	 */
	@Override
	public String getPurpose() {
		return model.getPurpose();
	}

	/**
	 * Returns the purpose other of this evp service request.
	 *
	 * @return the purpose other of this evp service request
	 */
	@Override
	public String getPurposeOther() {
		return model.getPurposeOther();
	}

	/**
	 * Returns the recipient benefit of this evp service request.
	 *
	 * @return the recipient benefit of this evp service request
	 */
	@Override
	public String getRecipientBenefit() {
		return model.getRecipientBenefit();
	}

	/**
	 * Returns the requested end date of this evp service request.
	 *
	 * @return the requested end date of this evp service request
	 */
	@Override
	public Date getRequestedEndDate() {
		return model.getRequestedEndDate();
	}

	/**
	 * Returns the requested start date of this evp service request.
	 *
	 * @return the requested start date of this evp service request
	 */
	@Override
	public Date getRequestedStartDate() {
		return model.getRequestedStartDate();
	}

	/**
	 * Returns the requested total hours of this evp service request.
	 *
	 * @return the requested total hours of this evp service request
	 */
	@Override
	public int getRequestedTotalHours() {
		return model.getRequestedTotalHours();
	}

	/**
	 * Returns the request organization address ID of this evp service request.
	 *
	 * @return the request organization address ID of this evp service request
	 */
	@Override
	public long getRequestOrganizationAddressId() {
		return model.getRequestOrganizationAddressId();
	}

	/**
	 * Returns the request organization website ID of this evp service request.
	 *
	 * @return the request organization website ID of this evp service request
	 */
	@Override
	public long getRequestOrganizationWebsiteId() {
		return model.getRequestOrganizationWebsiteId();
	}

	/**
	 * Returns the share story of this evp service request.
	 *
	 * @return the share story of this evp service request
	 */
	@Override
	public boolean getShareStory() {
		return model.getShareStory();
	}

	/**
	 * Returns the status of this evp service request.
	 *
	 * @return the status of this evp service request
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this evp service request.
	 *
	 * @return the status by user ID of this evp service request
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this evp service request.
	 *
	 * @return the status by user name of this evp service request
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this evp service request.
	 *
	 * @return the status by user uuid of this evp service request
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this evp service request.
	 *
	 * @return the status date of this evp service request
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the subsidiary group ID of this evp service request.
	 *
	 * @return the subsidiary group ID of this evp service request
	 */
	@Override
	public long getSubsidiaryGroupId() {
		return model.getSubsidiaryGroupId();
	}

	/**
	 * Returns the user ID of this evp service request.
	 *
	 * @return the user ID of this evp service request
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this evp service request.
	 *
	 * @return the user name of this evp service request
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this evp service request.
	 *
	 * @return the user uuid of this evp service request
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns <code>true</code> if this evp service request is approved.
	 *
	 * @return <code>true</code> if this evp service request is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this evp service request is denied.
	 *
	 * @return <code>true</code> if this evp service request is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this evp service request is a draft.
	 *
	 * @return <code>true</code> if this evp service request is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this evp service request is expired.
	 *
	 * @return <code>true</code> if this evp service request is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this evp service request is inactive.
	 *
	 * @return <code>true</code> if this evp service request is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this evp service request is incomplete.
	 *
	 * @return <code>true</code> if this evp service request is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this evp service request is pending.
	 *
	 * @return <code>true</code> if this evp service request is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this evp service request is promote trip.
	 *
	 * @return <code>true</code> if this evp service request is promote trip; <code>false</code> otherwise
	 */
	@Override
	public boolean isPromoteTrip() {
		return model.isPromoteTrip();
	}

	/**
	 * Returns <code>true</code> if this evp service request is scheduled.
	 *
	 * @return <code>true</code> if this evp service request is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	/**
	 * Returns <code>true</code> if this evp service request is share story.
	 *
	 * @return <code>true</code> if this evp service request is share story; <code>false</code> otherwise
	 */
	@Override
	public boolean isShareStory() {
		return model.isShareStory();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the behalf of of this evp service request.
	 *
	 * @param behalfOf the behalf of of this evp service request
	 */
	@Override
	public void setBehalfOf(String behalfOf) {
		model.setBehalfOf(behalfOf);
	}

	/**
	 * Sets the behalf of other of this evp service request.
	 *
	 * @param behalfOfOther the behalf of other of this evp service request
	 */
	@Override
	public void setBehalfOfOther(String behalfOfOther) {
		model.setBehalfOfOther(behalfOfOther);
	}

	/**
	 * Sets the company ID of this evp service request.
	 *
	 * @param companyId the company ID of this evp service request
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the confirmed end date of this evp service request.
	 *
	 * @param confirmedEndDate the confirmed end date of this evp service request
	 */
	@Override
	public void setConfirmedEndDate(Date confirmedEndDate) {
		model.setConfirmedEndDate(confirmedEndDate);
	}

	/**
	 * Sets the confirmed start date of this evp service request.
	 *
	 * @param confirmedStartDate the confirmed start date of this evp service request
	 */
	@Override
	public void setConfirmedStartDate(Date confirmedStartDate) {
		model.setConfirmedStartDate(confirmedStartDate);
	}

	/**
	 * Sets the confirmed total hours of this evp service request.
	 *
	 * @param confirmedTotalHours the confirmed total hours of this evp service request
	 */
	@Override
	public void setConfirmedTotalHours(int confirmedTotalHours) {
		model.setConfirmedTotalHours(confirmedTotalHours);
	}

	/**
	 * Sets the contact benefit of this evp service request.
	 *
	 * @param contactBenefit the contact benefit of this evp service request
	 */
	@Override
	public void setContactBenefit(String contactBenefit) {
		model.setContactBenefit(contactBenefit);
	}

	/**
	 * Sets the contact comments of this evp service request.
	 *
	 * @param contactComments the contact comments of this evp service request
	 */
	@Override
	public void setContactComments(String contactComments) {
		model.setContactComments(contactComments);
	}

	/**
	 * Sets the contact email address ID of this evp service request.
	 *
	 * @param contactEmailAddressId the contact email address ID of this evp service request
	 */
	@Override
	public void setContactEmailAddressId(long contactEmailAddressId) {
		model.setContactEmailAddressId(contactEmailAddressId);
	}

	/**
	 * Sets the contact phone ID of this evp service request.
	 *
	 * @param contactPhoneId the contact phone ID of this evp service request
	 */
	@Override
	public void setContactPhoneId(long contactPhoneId) {
		model.setContactPhoneId(contactPhoneId);
	}

	/**
	 * Sets the contact user ID of this evp service request.
	 *
	 * @param contactUserId the contact user ID of this evp service request
	 */
	@Override
	public void setContactUserId(long contactUserId) {
		model.setContactUserId(contactUserId);
	}

	/**
	 * Sets the contact user uuid of this evp service request.
	 *
	 * @param contactUserUuid the contact user uuid of this evp service request
	 */
	@Override
	public void setContactUserUuid(String contactUserUuid) {
		model.setContactUserUuid(contactUserUuid);
	}

	/**
	 * Sets the create date of this evp service request.
	 *
	 * @param createDate the create date of this evp service request
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this evp service request.
	 *
	 * @param description the description of this evp service request
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the employee benefit of this evp service request.
	 *
	 * @param employeeBenefit the employee benefit of this evp service request
	 */
	@Override
	public void setEmployeeBenefit(String employeeBenefit) {
		model.setEmployeeBenefit(employeeBenefit);
	}

	/**
	 * Sets the employment hours per week of this evp service request.
	 *
	 * @param employmentHoursPerWeek the employment hours per week of this evp service request
	 */
	@Override
	public void setEmploymentHoursPerWeek(int employmentHoursPerWeek) {
		model.setEmploymentHoursPerWeek(employmentHoursPerWeek);
	}

	/**
	 * Sets the employment type of this evp service request.
	 *
	 * @param employmentType the employment type of this evp service request
	 */
	@Override
	public void setEmploymentType(int employmentType) {
		model.setEmploymentType(employmentType);
	}

	/**
	 * Sets the evp request organization ID of this evp service request.
	 *
	 * @param evpRequestOrganizationId the evp request organization ID of this evp service request
	 */
	@Override
	public void setEvpRequestOrganizationId(long evpRequestOrganizationId) {
		model.setEvpRequestOrganizationId(evpRequestOrganizationId);
	}

	/**
	 * Sets the evp service request ID of this evp service request.
	 *
	 * @param evpServiceRequestId the evp service request ID of this evp service request
	 */
	@Override
	public void setEvpServiceRequestId(long evpServiceRequestId) {
		model.setEvpServiceRequestId(evpServiceRequestId);
	}

	/**
	 * Sets the feedback description of this evp service request.
	 *
	 * @param feedbackDescription the feedback description of this evp service request
	 */
	@Override
	public void setFeedbackDescription(String feedbackDescription) {
		model.setFeedbackDescription(feedbackDescription);
	}

	/**
	 * Sets the hash of this evp service request.
	 *
	 * @param hash the hash of this evp service request
	 */
	@Override
	public void setHash(String hash) {
		model.setHash(hash);
	}

	/**
	 * Sets the manager user ID of this evp service request.
	 *
	 * @param managerUserId the manager user ID of this evp service request
	 */
	@Override
	public void setManagerUserId(long managerUserId) {
		model.setManagerUserId(managerUserId);
	}

	/**
	 * Sets the manager user uuid of this evp service request.
	 *
	 * @param managerUserUuid the manager user uuid of this evp service request
	 */
	@Override
	public void setManagerUserUuid(String managerUserUuid) {
		model.setManagerUserUuid(managerUserUuid);
	}

	/**
	 * Sets the modified date of this evp service request.
	 *
	 * @param modifiedDate the modified date of this evp service request
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the parent evp service request ID of this evp service request.
	 *
	 * @param parentEVPServiceRequestId the parent evp service request ID of this evp service request
	 */
	@Override
	public void setParentEVPServiceRequestId(long parentEVPServiceRequestId) {
		model.setParentEVPServiceRequestId(parentEVPServiceRequestId);
	}

	/**
	 * Sets the primary key of this evp service request.
	 *
	 * @param primaryKey the primary key of this evp service request
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets whether this evp service request is promote trip.
	 *
	 * @param promoteTrip the promote trip of this evp service request
	 */
	@Override
	public void setPromoteTrip(boolean promoteTrip) {
		model.setPromoteTrip(promoteTrip);
	}

	/**
	 * Sets the purpose of this evp service request.
	 *
	 * @param purpose the purpose of this evp service request
	 */
	@Override
	public void setPurpose(String purpose) {
		model.setPurpose(purpose);
	}

	/**
	 * Sets the purpose other of this evp service request.
	 *
	 * @param purposeOther the purpose other of this evp service request
	 */
	@Override
	public void setPurposeOther(String purposeOther) {
		model.setPurposeOther(purposeOther);
	}

	/**
	 * Sets the recipient benefit of this evp service request.
	 *
	 * @param recipientBenefit the recipient benefit of this evp service request
	 */
	@Override
	public void setRecipientBenefit(String recipientBenefit) {
		model.setRecipientBenefit(recipientBenefit);
	}

	/**
	 * Sets the requested end date of this evp service request.
	 *
	 * @param requestedEndDate the requested end date of this evp service request
	 */
	@Override
	public void setRequestedEndDate(Date requestedEndDate) {
		model.setRequestedEndDate(requestedEndDate);
	}

	/**
	 * Sets the requested start date of this evp service request.
	 *
	 * @param requestedStartDate the requested start date of this evp service request
	 */
	@Override
	public void setRequestedStartDate(Date requestedStartDate) {
		model.setRequestedStartDate(requestedStartDate);
	}

	/**
	 * Sets the requested total hours of this evp service request.
	 *
	 * @param requestedTotalHours the requested total hours of this evp service request
	 */
	@Override
	public void setRequestedTotalHours(int requestedTotalHours) {
		model.setRequestedTotalHours(requestedTotalHours);
	}

	/**
	 * Sets the request organization address ID of this evp service request.
	 *
	 * @param requestOrganizationAddressId the request organization address ID of this evp service request
	 */
	@Override
	public void setRequestOrganizationAddressId(
		long requestOrganizationAddressId) {

		model.setRequestOrganizationAddressId(requestOrganizationAddressId);
	}

	/**
	 * Sets the request organization website ID of this evp service request.
	 *
	 * @param requestOrganizationWebsiteId the request organization website ID of this evp service request
	 */
	@Override
	public void setRequestOrganizationWebsiteId(
		long requestOrganizationWebsiteId) {

		model.setRequestOrganizationWebsiteId(requestOrganizationWebsiteId);
	}

	/**
	 * Sets whether this evp service request is share story.
	 *
	 * @param shareStory the share story of this evp service request
	 */
	@Override
	public void setShareStory(boolean shareStory) {
		model.setShareStory(shareStory);
	}

	/**
	 * Sets the status of this evp service request.
	 *
	 * @param status the status of this evp service request
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this evp service request.
	 *
	 * @param statusByUserId the status by user ID of this evp service request
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this evp service request.
	 *
	 * @param statusByUserName the status by user name of this evp service request
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this evp service request.
	 *
	 * @param statusByUserUuid the status by user uuid of this evp service request
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this evp service request.
	 *
	 * @param statusDate the status date of this evp service request
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the subsidiary group ID of this evp service request.
	 *
	 * @param subsidiaryGroupId the subsidiary group ID of this evp service request
	 */
	@Override
	public void setSubsidiaryGroupId(long subsidiaryGroupId) {
		model.setSubsidiaryGroupId(subsidiaryGroupId);
	}

	/**
	 * Sets the user ID of this evp service request.
	 *
	 * @param userId the user ID of this evp service request
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this evp service request.
	 *
	 * @param userName the user name of this evp service request
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this evp service request.
	 *
	 * @param userUuid the user uuid of this evp service request
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected EVPServiceRequestWrapper wrap(
		EVPServiceRequest evpServiceRequest) {

		return new EVPServiceRequestWrapper(evpServiceRequest);
	}

}