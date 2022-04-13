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

import com.liferay.evp.model.EVPKaleoForkInstance;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

/**
 * Provides the local service utility for EVPKaleoForkInstance. This utility wraps
 * <code>com.liferay.evp.service.impl.EVPKaleoForkInstanceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Val Nagy
 * @see EVPKaleoForkInstanceLocalService
 * @generated
 */
public class EVPKaleoForkInstanceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.evp.service.impl.EVPKaleoForkInstanceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static EVPKaleoForkInstance addEVPKaleoForkInstance(
		EVPKaleoForkInstance evpKaleoForkInstance) {

		return getService().addEVPKaleoForkInstance(evpKaleoForkInstance);
	}

	public static EVPKaleoForkInstance addEVPKaleoForkInstance(
			int status, int type, Map<String, Serializable> workflowContext,
			com.liferay.portal.service.ServiceContext serviceContext)
		throws PortalException, SystemException {

		return getService().addEVPKaleoForkInstance(
			status, type, workflowContext, serviceContext);
	}

	/**
	 * Creates a new evp kaleo fork instance with the primary key. Does not add the evp kaleo fork instance to the database.
	 *
	 * @param evpKaleoForkInstanceId the primary key for the new evp kaleo fork instance
	 * @return the new evp kaleo fork instance
	 */
	public static EVPKaleoForkInstance createEVPKaleoForkInstance(
		long evpKaleoForkInstanceId) {

		return getService().createEVPKaleoForkInstance(evpKaleoForkInstanceId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
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
	public static EVPKaleoForkInstance deleteEVPKaleoForkInstance(
		EVPKaleoForkInstance evpKaleoForkInstance) {

		return getService().deleteEVPKaleoForkInstance(evpKaleoForkInstance);
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
	public static EVPKaleoForkInstance deleteEVPKaleoForkInstance(
			long evpKaleoForkInstanceId)
		throws PortalException {

		return getService().deleteEVPKaleoForkInstance(evpKaleoForkInstanceId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static EVPKaleoForkInstance fetchEVPKaleoForkInstance(
		long evpKaleoForkInstanceId) {

		return getService().fetchEVPKaleoForkInstance(evpKaleoForkInstanceId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the evp kaleo fork instance with the primary key.
	 *
	 * @param evpKaleoForkInstanceId the primary key of the evp kaleo fork instance
	 * @return the evp kaleo fork instance
	 * @throws PortalException if a evp kaleo fork instance with the primary key could not be found
	 */
	public static EVPKaleoForkInstance getEVPKaleoForkInstance(
			long evpKaleoForkInstanceId)
		throws PortalException {

		return getService().getEVPKaleoForkInstance(evpKaleoForkInstanceId);
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
	public static List<EVPKaleoForkInstance> getEVPKaleoForkInstances(
		int start, int end) {

		return getService().getEVPKaleoForkInstances(start, end);
	}

	/**
	 * Returns the number of evp kaleo fork instances.
	 *
	 * @return the number of evp kaleo fork instances
	 */
	public static int getEVPKaleoForkInstancesCount() {
		return getService().getEVPKaleoForkInstancesCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static EVPKaleoForkInstance updateEVPKaleoForkInstance(
		EVPKaleoForkInstance evpKaleoForkInstance) {

		return getService().updateEVPKaleoForkInstance(evpKaleoForkInstance);
	}

	public static EVPKaleoForkInstanceLocalService getService() {
		return _service;
	}

	private static volatile EVPKaleoForkInstanceLocalService _service;

}