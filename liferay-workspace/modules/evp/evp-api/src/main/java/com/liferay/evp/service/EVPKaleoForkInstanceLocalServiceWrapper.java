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
 * Provides a wrapper for {@link EVPKaleoForkInstanceLocalService}.
 *
 * @author Val Nagy
 * @see EVPKaleoForkInstanceLocalService
 * @generated
 */
public class EVPKaleoForkInstanceLocalServiceWrapper
	implements EVPKaleoForkInstanceLocalService,
			   ServiceWrapper<EVPKaleoForkInstanceLocalService> {

	public EVPKaleoForkInstanceLocalServiceWrapper(
		EVPKaleoForkInstanceLocalService evpKaleoForkInstanceLocalService) {

		_evpKaleoForkInstanceLocalService = evpKaleoForkInstanceLocalService;
	}

	/**
	 * Adds the evp kaleo fork instance to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPKaleoForkInstanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpKaleoForkInstance the evp kaleo fork instance
	 * @return the evp kaleo fork instance that was added
	 */
	@Override
	public com.liferay.evp.model.EVPKaleoForkInstance addEVPKaleoForkInstance(
		com.liferay.evp.model.EVPKaleoForkInstance evpKaleoForkInstance) {

		return _evpKaleoForkInstanceLocalService.addEVPKaleoForkInstance(
			evpKaleoForkInstance);
	}

	@Override
	public com.liferay.evp.model.EVPKaleoForkInstance addEVPKaleoForkInstance(
			int status, int type,
			java.util.Map<String, java.io.Serializable> workflowContext,
			com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _evpKaleoForkInstanceLocalService.addEVPKaleoForkInstance(
			status, type, workflowContext, serviceContext);
	}

	/**
	 * Creates a new evp kaleo fork instance with the primary key. Does not add the evp kaleo fork instance to the database.
	 *
	 * @param evpKaleoForkInstanceId the primary key for the new evp kaleo fork instance
	 * @return the new evp kaleo fork instance
	 */
	@Override
	public com.liferay.evp.model.EVPKaleoForkInstance
		createEVPKaleoForkInstance(long evpKaleoForkInstanceId) {

		return _evpKaleoForkInstanceLocalService.createEVPKaleoForkInstance(
			evpKaleoForkInstanceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpKaleoForkInstanceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the evp kaleo fork instance from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPKaleoForkInstanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpKaleoForkInstance the evp kaleo fork instance
	 * @return the evp kaleo fork instance that was removed
	 */
	@Override
	public com.liferay.evp.model.EVPKaleoForkInstance
		deleteEVPKaleoForkInstance(
			com.liferay.evp.model.EVPKaleoForkInstance evpKaleoForkInstance) {

		return _evpKaleoForkInstanceLocalService.deleteEVPKaleoForkInstance(
			evpKaleoForkInstance);
	}

	/**
	 * Deletes the evp kaleo fork instance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPKaleoForkInstanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpKaleoForkInstanceId the primary key of the evp kaleo fork instance
	 * @return the evp kaleo fork instance that was removed
	 * @throws PortalException if a evp kaleo fork instance with the primary key could not be found
	 */
	@Override
	public com.liferay.evp.model.EVPKaleoForkInstance
			deleteEVPKaleoForkInstance(long evpKaleoForkInstanceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpKaleoForkInstanceLocalService.deleteEVPKaleoForkInstance(
			evpKaleoForkInstanceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpKaleoForkInstanceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _evpKaleoForkInstanceLocalService.dynamicQuery();
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

		return _evpKaleoForkInstanceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPKaleoForkInstanceModelImpl</code>.
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

		return _evpKaleoForkInstanceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPKaleoForkInstanceModelImpl</code>.
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

		return _evpKaleoForkInstanceLocalService.dynamicQuery(
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

		return _evpKaleoForkInstanceLocalService.dynamicQueryCount(
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

		return _evpKaleoForkInstanceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.evp.model.EVPKaleoForkInstance fetchEVPKaleoForkInstance(
		long evpKaleoForkInstanceId) {

		return _evpKaleoForkInstanceLocalService.fetchEVPKaleoForkInstance(
			evpKaleoForkInstanceId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _evpKaleoForkInstanceLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the evp kaleo fork instance with the primary key.
	 *
	 * @param evpKaleoForkInstanceId the primary key of the evp kaleo fork instance
	 * @return the evp kaleo fork instance
	 * @throws PortalException if a evp kaleo fork instance with the primary key could not be found
	 */
	@Override
	public com.liferay.evp.model.EVPKaleoForkInstance getEVPKaleoForkInstance(
			long evpKaleoForkInstanceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpKaleoForkInstanceLocalService.getEVPKaleoForkInstance(
			evpKaleoForkInstanceId);
	}

	/**
	 * Returns a range of all the evp kaleo fork instances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPKaleoForkInstanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp kaleo fork instances
	 * @param end the upper bound of the range of evp kaleo fork instances (not inclusive)
	 * @return the range of evp kaleo fork instances
	 */
	@Override
	public java.util.List<com.liferay.evp.model.EVPKaleoForkInstance>
		getEVPKaleoForkInstances(int start, int end) {

		return _evpKaleoForkInstanceLocalService.getEVPKaleoForkInstances(
			start, end);
	}

	/**
	 * Returns the number of evp kaleo fork instances.
	 *
	 * @return the number of evp kaleo fork instances
	 */
	@Override
	public int getEVPKaleoForkInstancesCount() {
		return _evpKaleoForkInstanceLocalService.
			getEVPKaleoForkInstancesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _evpKaleoForkInstanceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _evpKaleoForkInstanceLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpKaleoForkInstanceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the evp kaleo fork instance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPKaleoForkInstanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpKaleoForkInstance the evp kaleo fork instance
	 * @return the evp kaleo fork instance that was updated
	 */
	@Override
	public com.liferay.evp.model.EVPKaleoForkInstance
		updateEVPKaleoForkInstance(
			com.liferay.evp.model.EVPKaleoForkInstance evpKaleoForkInstance) {

		return _evpKaleoForkInstanceLocalService.updateEVPKaleoForkInstance(
			evpKaleoForkInstance);
	}

	@Override
	public EVPKaleoForkInstanceLocalService getWrappedService() {
		return _evpKaleoForkInstanceLocalService;
	}

	@Override
	public void setWrappedService(
		EVPKaleoForkInstanceLocalService evpKaleoForkInstanceLocalService) {

		_evpKaleoForkInstanceLocalService = evpKaleoForkInstanceLocalService;
	}

	private EVPKaleoForkInstanceLocalService _evpKaleoForkInstanceLocalService;

}