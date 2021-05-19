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
 * Provides a wrapper for {@link EVPGrantRequestLocalService}.
 *
 * @author Val Nagy
 * @see EVPGrantRequestLocalService
 * @generated
 */
public class EVPGrantRequestLocalServiceWrapper
	implements EVPGrantRequestLocalService,
			   ServiceWrapper<EVPGrantRequestLocalService> {

	public EVPGrantRequestLocalServiceWrapper(
		EVPGrantRequestLocalService evpGrantRequestLocalService) {

		_evpGrantRequestLocalService = evpGrantRequestLocalService;
	}

	/**
	 * Adds the evp grant request to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPGrantRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpGrantRequest the evp grant request
	 * @return the evp grant request that was added
	 */
	@Override
	public com.liferay.evp.model.EVPGrantRequest addEVPGrantRequest(
		com.liferay.evp.model.EVPGrantRequest evpGrantRequest) {

		return _evpGrantRequestLocalService.addEVPGrantRequest(evpGrantRequest);
	}

	/**
	 * Creates a new evp grant request with the primary key. Does not add the evp grant request to the database.
	 *
	 * @param evpGrantRequestId the primary key for the new evp grant request
	 * @return the new evp grant request
	 */
	@Override
	public com.liferay.evp.model.EVPGrantRequest createEVPGrantRequest(
		long evpGrantRequestId) {

		return _evpGrantRequestLocalService.createEVPGrantRequest(
			evpGrantRequestId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpGrantRequestLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the evp grant request from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPGrantRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpGrantRequest the evp grant request
	 * @return the evp grant request that was removed
	 */
	@Override
	public com.liferay.evp.model.EVPGrantRequest deleteEVPGrantRequest(
		com.liferay.evp.model.EVPGrantRequest evpGrantRequest) {

		return _evpGrantRequestLocalService.deleteEVPGrantRequest(
			evpGrantRequest);
	}

	/**
	 * Deletes the evp grant request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPGrantRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpGrantRequestId the primary key of the evp grant request
	 * @return the evp grant request that was removed
	 * @throws PortalException if a evp grant request with the primary key could not be found
	 */
	@Override
	public com.liferay.evp.model.EVPGrantRequest deleteEVPGrantRequest(
			long evpGrantRequestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpGrantRequestLocalService.deleteEVPGrantRequest(
			evpGrantRequestId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpGrantRequestLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _evpGrantRequestLocalService.dynamicQuery();
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

		return _evpGrantRequestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPGrantRequestModelImpl</code>.
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

		return _evpGrantRequestLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPGrantRequestModelImpl</code>.
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

		return _evpGrantRequestLocalService.dynamicQuery(
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

		return _evpGrantRequestLocalService.dynamicQueryCount(dynamicQuery);
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

		return _evpGrantRequestLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.evp.model.EVPGrantRequest fetchEVPGrantRequest(
		long evpGrantRequestId) {

		return _evpGrantRequestLocalService.fetchEVPGrantRequest(
			evpGrantRequestId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _evpGrantRequestLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the evp grant request with the primary key.
	 *
	 * @param evpGrantRequestId the primary key of the evp grant request
	 * @return the evp grant request
	 * @throws PortalException if a evp grant request with the primary key could not be found
	 */
	@Override
	public com.liferay.evp.model.EVPGrantRequest getEVPGrantRequest(
			long evpGrantRequestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpGrantRequestLocalService.getEVPGrantRequest(
			evpGrantRequestId);
	}

	/**
	 * Returns a range of all the evp grant requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @return the range of evp grant requests
	 */
	@Override
	public java.util.List<com.liferay.evp.model.EVPGrantRequest>
		getEVPGrantRequests(int start, int end) {

		return _evpGrantRequestLocalService.getEVPGrantRequests(start, end);
	}

	/**
	 * Returns the number of evp grant requests.
	 *
	 * @return the number of evp grant requests
	 */
	@Override
	public int getEVPGrantRequestsCount() {
		return _evpGrantRequestLocalService.getEVPGrantRequestsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _evpGrantRequestLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _evpGrantRequestLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpGrantRequestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the evp grant request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPGrantRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpGrantRequest the evp grant request
	 * @return the evp grant request that was updated
	 */
	@Override
	public com.liferay.evp.model.EVPGrantRequest updateEVPGrantRequest(
		com.liferay.evp.model.EVPGrantRequest evpGrantRequest) {

		return _evpGrantRequestLocalService.updateEVPGrantRequest(
			evpGrantRequest);
	}

	@Override
	public EVPGrantRequestLocalService getWrappedService() {
		return _evpGrantRequestLocalService;
	}

	@Override
	public void setWrappedService(
		EVPGrantRequestLocalService evpGrantRequestLocalService) {

		_evpGrantRequestLocalService = evpGrantRequestLocalService;
	}

	private EVPGrantRequestLocalService _evpGrantRequestLocalService;

}