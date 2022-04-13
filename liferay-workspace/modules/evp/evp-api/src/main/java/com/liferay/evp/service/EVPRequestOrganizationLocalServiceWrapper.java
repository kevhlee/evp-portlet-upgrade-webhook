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

package com.liferay.evp.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EVPRequestOrganizationLocalService}.
 *
 * @author Val Nagy
 * @see EVPRequestOrganizationLocalService
 * @generated
 */
public class EVPRequestOrganizationLocalServiceWrapper
	implements EVPRequestOrganizationLocalService,
			   ServiceWrapper<EVPRequestOrganizationLocalService> {

	public EVPRequestOrganizationLocalServiceWrapper(
		EVPRequestOrganizationLocalService evpRequestOrganizationLocalService) {

		_evpRequestOrganizationLocalService =
			evpRequestOrganizationLocalService;
	}

	/**
	 * Adds the evp request organization to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPRequestOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpRequestOrganization the evp request organization
	 * @return the evp request organization that was added
	 */
	@Override
	public com.liferay.evp.model.EVPRequestOrganization
		addEVPRequestOrganization(
			com.liferay.evp.model.EVPRequestOrganization
				evpRequestOrganization) {

		return _evpRequestOrganizationLocalService.addEVPRequestOrganization(
			evpRequestOrganization);
	}

	@Override
	public com.liferay.evp.model.EVPRequestOrganization
			addEVPRequestOrganization(
				long companyId, long userId, java.util.Date createDate,
				String organizationName, String taxIdentificationNumber,
				String street1, String city, String zip, long regionId,
				long countryId, String url)
		throws Exception {

		return _evpRequestOrganizationLocalService.addEVPRequestOrganization(
			companyId, userId, createDate, organizationName,
			taxIdentificationNumber, street1, city, zip, regionId, countryId,
			url);
	}

	/**
	 * Creates a new evp request organization with the primary key. Does not add the evp request organization to the database.
	 *
	 * @param evpRequestOrganizationId the primary key for the new evp request organization
	 * @return the new evp request organization
	 */
	@Override
	public com.liferay.evp.model.EVPRequestOrganization
		createEVPRequestOrganization(long evpRequestOrganizationId) {

		return _evpRequestOrganizationLocalService.createEVPRequestOrganization(
			evpRequestOrganizationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpRequestOrganizationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the evp request organization from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPRequestOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpRequestOrganization the evp request organization
	 * @return the evp request organization that was removed
	 */
	@Override
	public com.liferay.evp.model.EVPRequestOrganization
		deleteEVPRequestOrganization(
			com.liferay.evp.model.EVPRequestOrganization
				evpRequestOrganization) {

		return _evpRequestOrganizationLocalService.deleteEVPRequestOrganization(
			evpRequestOrganization);
	}

	/**
	 * Deletes the evp request organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPRequestOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpRequestOrganizationId the primary key of the evp request organization
	 * @return the evp request organization that was removed
	 * @throws PortalException if a evp request organization with the primary key could not be found
	 */
	@Override
	public com.liferay.evp.model.EVPRequestOrganization
			deleteEVPRequestOrganization(long evpRequestOrganizationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpRequestOrganizationLocalService.deleteEVPRequestOrganization(
			evpRequestOrganizationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpRequestOrganizationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _evpRequestOrganizationLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _evpRequestOrganizationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPRequestOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _evpRequestOrganizationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPRequestOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _evpRequestOrganizationLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _evpRequestOrganizationLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _evpRequestOrganizationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.evp.model.EVPRequestOrganization
		fetchEVPRequestOrganization(long evpRequestOrganizationId) {

		return _evpRequestOrganizationLocalService.fetchEVPRequestOrganization(
			evpRequestOrganizationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _evpRequestOrganizationLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the evp request organization with the primary key.
	 *
	 * @param evpRequestOrganizationId the primary key of the evp request organization
	 * @return the evp request organization
	 * @throws PortalException if a evp request organization with the primary key could not be found
	 */
	@Override
	public com.liferay.evp.model.EVPRequestOrganization
			getEVPRequestOrganization(long evpRequestOrganizationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpRequestOrganizationLocalService.getEVPRequestOrganization(
			evpRequestOrganizationId);
	}

	/**
	 * Returns a range of all the evp request organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPRequestOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp request organizations
	 * @param end the upper bound of the range of evp request organizations (not inclusive)
	 * @return the range of evp request organizations
	 */
	@Override
	public java.util.List<com.liferay.evp.model.EVPRequestOrganization>
		getEVPRequestOrganizations(int start, int end) {

		return _evpRequestOrganizationLocalService.getEVPRequestOrganizations(
			start, end);
	}

	/**
	 * Returns the number of evp request organizations.
	 *
	 * @return the number of evp request organizations
	 */
	@Override
	public int getEVPRequestOrganizationsCount() {
		return _evpRequestOrganizationLocalService.
			getEVPRequestOrganizationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _evpRequestOrganizationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _evpRequestOrganizationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpRequestOrganizationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the evp request organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPRequestOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpRequestOrganization the evp request organization
	 * @return the evp request organization that was updated
	 */
	@Override
	public com.liferay.evp.model.EVPRequestOrganization
		updateEVPRequestOrganization(
			com.liferay.evp.model.EVPRequestOrganization
				evpRequestOrganization) {

		return _evpRequestOrganizationLocalService.updateEVPRequestOrganization(
			evpRequestOrganization);
	}

	@Override
	public EVPRequestOrganizationLocalService getWrappedService() {
		return _evpRequestOrganizationLocalService;
	}

	@Override
	public void setWrappedService(
		EVPRequestOrganizationLocalService evpRequestOrganizationLocalService) {

		_evpRequestOrganizationLocalService =
			evpRequestOrganizationLocalService;
	}

	private EVPRequestOrganizationLocalService
		_evpRequestOrganizationLocalService;

}