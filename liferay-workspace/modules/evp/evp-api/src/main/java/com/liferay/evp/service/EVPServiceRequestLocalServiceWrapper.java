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
 * Provides a wrapper for {@link EVPServiceRequestLocalService}.
 *
 * @author Val Nagy
 * @see EVPServiceRequestLocalService
 * @generated
 */
public class EVPServiceRequestLocalServiceWrapper
	implements EVPServiceRequestLocalService,
			   ServiceWrapper<EVPServiceRequestLocalService> {

	public EVPServiceRequestLocalServiceWrapper(
		EVPServiceRequestLocalService evpServiceRequestLocalService) {

		_evpServiceRequestLocalService = evpServiceRequestLocalService;
	}

	/**
	 * Adds the evp service request to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPServiceRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpServiceRequest the evp service request
	 * @return the evp service request that was added
	 */
	@Override
	public com.liferay.evp.model.EVPServiceRequest addEVPServiceRequest(
		com.liferay.evp.model.EVPServiceRequest evpServiceRequest) {

		return _evpServiceRequestLocalService.addEVPServiceRequest(
			evpServiceRequest);
	}

	/**
	 * Creates a new evp service request with the primary key. Does not add the evp service request to the database.
	 *
	 * @param evpServiceRequestId the primary key for the new evp service request
	 * @return the new evp service request
	 */
	@Override
	public com.liferay.evp.model.EVPServiceRequest createEVPServiceRequest(
		long evpServiceRequestId) {

		return _evpServiceRequestLocalService.createEVPServiceRequest(
			evpServiceRequestId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpServiceRequestLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the evp service request from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPServiceRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpServiceRequest the evp service request
	 * @return the evp service request that was removed
	 */
	@Override
	public com.liferay.evp.model.EVPServiceRequest deleteEVPServiceRequest(
		com.liferay.evp.model.EVPServiceRequest evpServiceRequest) {

		return _evpServiceRequestLocalService.deleteEVPServiceRequest(
			evpServiceRequest);
	}

	/**
	 * Deletes the evp service request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPServiceRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpServiceRequestId the primary key of the evp service request
	 * @return the evp service request that was removed
	 * @throws PortalException if a evp service request with the primary key could not be found
	 */
	@Override
	public com.liferay.evp.model.EVPServiceRequest deleteEVPServiceRequest(
			long evpServiceRequestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpServiceRequestLocalService.deleteEVPServiceRequest(
			evpServiceRequestId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpServiceRequestLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _evpServiceRequestLocalService.dynamicQuery();
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

		return _evpServiceRequestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPServiceRequestModelImpl</code>.
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

		return _evpServiceRequestLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPServiceRequestModelImpl</code>.
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

		return _evpServiceRequestLocalService.dynamicQuery(
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

		return _evpServiceRequestLocalService.dynamicQueryCount(dynamicQuery);
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

		return _evpServiceRequestLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.evp.model.EVPServiceRequest fetchEVPServiceRequest(
		long evpServiceRequestId) {

		return _evpServiceRequestLocalService.fetchEVPServiceRequest(
			evpServiceRequestId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _evpServiceRequestLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the evp service request with the primary key.
	 *
	 * @param evpServiceRequestId the primary key of the evp service request
	 * @return the evp service request
	 * @throws PortalException if a evp service request with the primary key could not be found
	 */
	@Override
	public com.liferay.evp.model.EVPServiceRequest getEVPServiceRequest(
			long evpServiceRequestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpServiceRequestLocalService.getEVPServiceRequest(
			evpServiceRequestId);
	}

	/**
	 * Returns a range of all the evp service requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @return the range of evp service requests
	 */
	@Override
	public java.util.List<com.liferay.evp.model.EVPServiceRequest>
		getEVPServiceRequests(int start, int end) {

		return _evpServiceRequestLocalService.getEVPServiceRequests(start, end);
	}

	/**
	 * Returns the number of evp service requests.
	 *
	 * @return the number of evp service requests
	 */
	@Override
	public int getEVPServiceRequestsCount() {
		return _evpServiceRequestLocalService.getEVPServiceRequestsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _evpServiceRequestLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _evpServiceRequestLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpServiceRequestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the evp service request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPServiceRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpServiceRequest the evp service request
	 * @return the evp service request that was updated
	 */
	@Override
	public com.liferay.evp.model.EVPServiceRequest updateEVPServiceRequest(
		com.liferay.evp.model.EVPServiceRequest evpServiceRequest) {

		return _evpServiceRequestLocalService.updateEVPServiceRequest(
			evpServiceRequest);
	}

	@Override
	public EVPServiceRequestLocalService getWrappedService() {
		return _evpServiceRequestLocalService;
	}

	@Override
	public void setWrappedService(
		EVPServiceRequestLocalService evpServiceRequestLocalService) {

		_evpServiceRequestLocalService = evpServiceRequestLocalService;
	}

	private EVPServiceRequestLocalService _evpServiceRequestLocalService;

}