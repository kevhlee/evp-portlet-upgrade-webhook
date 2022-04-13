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
 * This class is a wrapper for {@link EVPGrantTransaction}.
 * </p>
 *
 * @author Val Nagy
 * @see EVPGrantTransaction
 * @generated
 */
public class EVPGrantTransactionWrapper
	extends BaseModelWrapper<EVPGrantTransaction>
	implements EVPGrantTransaction, ModelWrapper<EVPGrantTransaction> {

	public EVPGrantTransactionWrapper(EVPGrantTransaction evpGrantTransaction) {
		super(evpGrantTransaction);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("evpGrantTransactionId", getEvpGrantTransactionId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("evpGrantRequestId", getEvpGrantRequestId());
		attributes.put("fileEntryId", getFileEntryId());
		attributes.put("grantType", getGrantType());
		attributes.put("amount", getAmount());
		attributes.put("currencyCode", getCurrencyCode());
		attributes.put("date", getDate());
		attributes.put("note", getNote());
		attributes.put("number", getNumber());
		attributes.put("bankBICCode", getBankBICCode());
		attributes.put("bankIBANCode", getBankIBANCode());
		attributes.put("bankName", getBankName());
		attributes.put("purposeOfUse", getPurposeOfUse());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long evpGrantTransactionId = (Long)attributes.get(
			"evpGrantTransactionId");

		if (evpGrantTransactionId != null) {
			setEvpGrantTransactionId(evpGrantTransactionId);
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

		Long evpGrantRequestId = (Long)attributes.get("evpGrantRequestId");

		if (evpGrantRequestId != null) {
			setEvpGrantRequestId(evpGrantRequestId);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}

		Integer grantType = (Integer)attributes.get("grantType");

		if (grantType != null) {
			setGrantType(grantType);
		}

		Double amount = (Double)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		String currencyCode = (String)attributes.get("currencyCode");

		if (currencyCode != null) {
			setCurrencyCode(currencyCode);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		String number = (String)attributes.get("number");

		if (number != null) {
			setNumber(number);
		}

		String bankBICCode = (String)attributes.get("bankBICCode");

		if (bankBICCode != null) {
			setBankBICCode(bankBICCode);
		}

		String bankIBANCode = (String)attributes.get("bankIBANCode");

		if (bankIBANCode != null) {
			setBankIBANCode(bankIBANCode);
		}

		String bankName = (String)attributes.get("bankName");

		if (bankName != null) {
			setBankName(bankName);
		}

		String purposeOfUse = (String)attributes.get("purposeOfUse");

		if (purposeOfUse != null) {
			setPurposeOfUse(purposeOfUse);
		}
	}

	/**
	 * Returns the amount of this evp grant transaction.
	 *
	 * @return the amount of this evp grant transaction
	 */
	@Override
	public double getAmount() {
		return model.getAmount();
	}

	/**
	 * Returns the bank bic code of this evp grant transaction.
	 *
	 * @return the bank bic code of this evp grant transaction
	 */
	@Override
	public String getBankBICCode() {
		return model.getBankBICCode();
	}

	/**
	 * Returns the bank iban code of this evp grant transaction.
	 *
	 * @return the bank iban code of this evp grant transaction
	 */
	@Override
	public String getBankIBANCode() {
		return model.getBankIBANCode();
	}

	/**
	 * Returns the bank name of this evp grant transaction.
	 *
	 * @return the bank name of this evp grant transaction
	 */
	@Override
	public String getBankName() {
		return model.getBankName();
	}

	/**
	 * Returns the company ID of this evp grant transaction.
	 *
	 * @return the company ID of this evp grant transaction
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this evp grant transaction.
	 *
	 * @return the create date of this evp grant transaction
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the currency code of this evp grant transaction.
	 *
	 * @return the currency code of this evp grant transaction
	 */
	@Override
	public String getCurrencyCode() {
		return model.getCurrencyCode();
	}

	/**
	 * Returns the date of this evp grant transaction.
	 *
	 * @return the date of this evp grant transaction
	 */
	@Override
	public Date getDate() {
		return model.getDate();
	}

	/**
	 * Returns the evp grant request ID of this evp grant transaction.
	 *
	 * @return the evp grant request ID of this evp grant transaction
	 */
	@Override
	public long getEvpGrantRequestId() {
		return model.getEvpGrantRequestId();
	}

	/**
	 * Returns the evp grant transaction ID of this evp grant transaction.
	 *
	 * @return the evp grant transaction ID of this evp grant transaction
	 */
	@Override
	public long getEvpGrantTransactionId() {
		return model.getEvpGrantTransactionId();
	}

	/**
	 * Returns the file entry ID of this evp grant transaction.
	 *
	 * @return the file entry ID of this evp grant transaction
	 */
	@Override
	public long getFileEntryId() {
		return model.getFileEntryId();
	}

	/**
	 * Returns the grant type of this evp grant transaction.
	 *
	 * @return the grant type of this evp grant transaction
	 */
	@Override
	public int getGrantType() {
		return model.getGrantType();
	}

	/**
	 * Returns the modified date of this evp grant transaction.
	 *
	 * @return the modified date of this evp grant transaction
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the note of this evp grant transaction.
	 *
	 * @return the note of this evp grant transaction
	 */
	@Override
	public String getNote() {
		return model.getNote();
	}

	/**
	 * Returns the number of this evp grant transaction.
	 *
	 * @return the number of this evp grant transaction
	 */
	@Override
	public String getNumber() {
		return model.getNumber();
	}

	/**
	 * Returns the primary key of this evp grant transaction.
	 *
	 * @return the primary key of this evp grant transaction
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the purpose of use of this evp grant transaction.
	 *
	 * @return the purpose of use of this evp grant transaction
	 */
	@Override
	public String getPurposeOfUse() {
		return model.getPurposeOfUse();
	}

	/**
	 * Returns the user ID of this evp grant transaction.
	 *
	 * @return the user ID of this evp grant transaction
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this evp grant transaction.
	 *
	 * @return the user name of this evp grant transaction
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this evp grant transaction.
	 *
	 * @return the user uuid of this evp grant transaction
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
	 * Sets the amount of this evp grant transaction.
	 *
	 * @param amount the amount of this evp grant transaction
	 */
	@Override
	public void setAmount(double amount) {
		model.setAmount(amount);
	}

	/**
	 * Sets the bank bic code of this evp grant transaction.
	 *
	 * @param bankBICCode the bank bic code of this evp grant transaction
	 */
	@Override
	public void setBankBICCode(String bankBICCode) {
		model.setBankBICCode(bankBICCode);
	}

	/**
	 * Sets the bank iban code of this evp grant transaction.
	 *
	 * @param bankIBANCode the bank iban code of this evp grant transaction
	 */
	@Override
	public void setBankIBANCode(String bankIBANCode) {
		model.setBankIBANCode(bankIBANCode);
	}

	/**
	 * Sets the bank name of this evp grant transaction.
	 *
	 * @param bankName the bank name of this evp grant transaction
	 */
	@Override
	public void setBankName(String bankName) {
		model.setBankName(bankName);
	}

	/**
	 * Sets the company ID of this evp grant transaction.
	 *
	 * @param companyId the company ID of this evp grant transaction
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this evp grant transaction.
	 *
	 * @param createDate the create date of this evp grant transaction
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the currency code of this evp grant transaction.
	 *
	 * @param currencyCode the currency code of this evp grant transaction
	 */
	@Override
	public void setCurrencyCode(String currencyCode) {
		model.setCurrencyCode(currencyCode);
	}

	/**
	 * Sets the date of this evp grant transaction.
	 *
	 * @param date the date of this evp grant transaction
	 */
	@Override
	public void setDate(Date date) {
		model.setDate(date);
	}

	/**
	 * Sets the evp grant request ID of this evp grant transaction.
	 *
	 * @param evpGrantRequestId the evp grant request ID of this evp grant transaction
	 */
	@Override
	public void setEvpGrantRequestId(long evpGrantRequestId) {
		model.setEvpGrantRequestId(evpGrantRequestId);
	}

	/**
	 * Sets the evp grant transaction ID of this evp grant transaction.
	 *
	 * @param evpGrantTransactionId the evp grant transaction ID of this evp grant transaction
	 */
	@Override
	public void setEvpGrantTransactionId(long evpGrantTransactionId) {
		model.setEvpGrantTransactionId(evpGrantTransactionId);
	}

	/**
	 * Sets the file entry ID of this evp grant transaction.
	 *
	 * @param fileEntryId the file entry ID of this evp grant transaction
	 */
	@Override
	public void setFileEntryId(long fileEntryId) {
		model.setFileEntryId(fileEntryId);
	}

	/**
	 * Sets the grant type of this evp grant transaction.
	 *
	 * @param grantType the grant type of this evp grant transaction
	 */
	@Override
	public void setGrantType(int grantType) {
		model.setGrantType(grantType);
	}

	/**
	 * Sets the modified date of this evp grant transaction.
	 *
	 * @param modifiedDate the modified date of this evp grant transaction
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the note of this evp grant transaction.
	 *
	 * @param note the note of this evp grant transaction
	 */
	@Override
	public void setNote(String note) {
		model.setNote(note);
	}

	/**
	 * Sets the number of this evp grant transaction.
	 *
	 * @param number the number of this evp grant transaction
	 */
	@Override
	public void setNumber(String number) {
		model.setNumber(number);
	}

	/**
	 * Sets the primary key of this evp grant transaction.
	 *
	 * @param primaryKey the primary key of this evp grant transaction
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the purpose of use of this evp grant transaction.
	 *
	 * @param purposeOfUse the purpose of use of this evp grant transaction
	 */
	@Override
	public void setPurposeOfUse(String purposeOfUse) {
		model.setPurposeOfUse(purposeOfUse);
	}

	/**
	 * Sets the user ID of this evp grant transaction.
	 *
	 * @param userId the user ID of this evp grant transaction
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this evp grant transaction.
	 *
	 * @param userName the user name of this evp grant transaction
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this evp grant transaction.
	 *
	 * @param userUuid the user uuid of this evp grant transaction
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected EVPGrantTransactionWrapper wrap(
		EVPGrantTransaction evpGrantTransaction) {

		return new EVPGrantTransactionWrapper(evpGrantTransaction);
	}

}