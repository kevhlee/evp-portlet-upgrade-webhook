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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for EVPEmployee. This utility wraps
 * <code>com.liferay.evp.service.impl.EVPEmployeeLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Val Nagy
 * @see EVPEmployeeLocalService
 * @generated
 */
public class EVPEmployeeLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.evp.service.impl.EVPEmployeeLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the evp employee to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPEmployeeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpEmployee the evp employee
	 * @return the evp employee that was added
	 */
	public static com.liferay.evp.model.EVPEmployee addEVPEmployee(
		com.liferay.evp.model.EVPEmployee evpEmployee) {

		return getService().addEVPEmployee(evpEmployee);
	}

	public static com.liferay.evp.model.EVPEmployee addEVPEmployee(
			long userId, long employeeUserId, long managerUserId,
			long subsidiaryEVPDivisionId, int employmentType,
			java.util.Date hireDate)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().addEVPEmployee(
			userId, employeeUserId, managerUserId, subsidiaryEVPDivisionId,
			employmentType, hireDate);
	}

	/**
	 * Creates a new evp employee with the primary key. Does not add the evp employee to the database.
	 *
	 * @param evpEmployeeId the primary key for the new evp employee
	 * @return the new evp employee
	 */
	public static com.liferay.evp.model.EVPEmployee createEVPEmployee(
		long evpEmployeeId) {

		return getService().createEVPEmployee(evpEmployeeId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the evp employee from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPEmployeeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpEmployee the evp employee
	 * @return the evp employee that was removed
	 */
	public static com.liferay.evp.model.EVPEmployee deleteEVPEmployee(
		com.liferay.evp.model.EVPEmployee evpEmployee) {

		return getService().deleteEVPEmployee(evpEmployee);
	}

	/**
	 * Deletes the evp employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPEmployeeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpEmployeeId the primary key of the evp employee
	 * @return the evp employee that was removed
	 * @throws PortalException if a evp employee with the primary key could not be found
	 */
	public static com.liferay.evp.model.EVPEmployee deleteEVPEmployee(
			long evpEmployeeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteEVPEmployee(evpEmployeeId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

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
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.evp.model.EVPEmployee fetchEVPEmployee(
		long evpEmployeeId) {

		return getService().fetchEVPEmployee(evpEmployeeId);
	}

	public static com.liferay.evp.model.EVPEmployee
			fetchEVPEmployeeByEmployeeUserId(long employeeUserId)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().fetchEVPEmployeeByEmployeeUserId(employeeUserId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the evp employee with the primary key.
	 *
	 * @param evpEmployeeId the primary key of the evp employee
	 * @return the evp employee
	 * @throws PortalException if a evp employee with the primary key could not be found
	 */
	public static com.liferay.evp.model.EVPEmployee getEVPEmployee(
			long evpEmployeeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getEVPEmployee(evpEmployeeId);
	}

	public static com.liferay.evp.model.EVPEmployee
			getEVPEmployeeByEmployeeUserId(long employeeUserId)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().getEVPEmployeeByEmployeeUserId(employeeUserId);
	}

	/**
	 * Returns a range of all the evp employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp employees
	 * @param end the upper bound of the range of evp employees (not inclusive)
	 * @return the range of evp employees
	 */
	public static java.util.List<com.liferay.evp.model.EVPEmployee>
		getEVPEmployees(int start, int end) {

		return getService().getEVPEmployees(start, end);
	}

	/**
	 * Returns the number of evp employees.
	 *
	 * @return the number of evp employees
	 */
	public static int getEVPEmployeesCount() {
		return getService().getEVPEmployeesCount();
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
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the evp employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPEmployeeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpEmployee the evp employee
	 * @return the evp employee that was updated
	 */
	public static com.liferay.evp.model.EVPEmployee updateEVPEmployee(
		com.liferay.evp.model.EVPEmployee evpEmployee) {

		return getService().updateEVPEmployee(evpEmployee);
	}

	public static EVPEmployeeLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<EVPEmployeeLocalService, EVPEmployeeLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(EVPEmployeeLocalService.class);

		ServiceTracker<EVPEmployeeLocalService, EVPEmployeeLocalService>
			serviceTracker =
				new ServiceTracker
					<EVPEmployeeLocalService, EVPEmployeeLocalService>(
						bundle.getBundleContext(),
						EVPEmployeeLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}