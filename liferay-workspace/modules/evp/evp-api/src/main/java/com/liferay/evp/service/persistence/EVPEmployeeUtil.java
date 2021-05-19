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

package com.liferay.evp.service.persistence;

import com.liferay.evp.model.EVPEmployee;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the evp employee service. This utility wraps <code>com.liferay.evp.service.persistence.impl.EVPEmployeePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @see EVPEmployeePersistence
 * @generated
 */
public class EVPEmployeeUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(EVPEmployee evpEmployee) {
		getPersistence().clearCache(evpEmployee);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, EVPEmployee> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EVPEmployee> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EVPEmployee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EVPEmployee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EVPEmployee> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EVPEmployee update(EVPEmployee evpEmployee) {
		return getPersistence().update(evpEmployee);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EVPEmployee update(
		EVPEmployee evpEmployee, ServiceContext serviceContext) {

		return getPersistence().update(evpEmployee, serviceContext);
	}

	/**
	 * Returns the evp employee where employeeUserId = &#63; or throws a <code>NoSuchEmployeeException</code> if it could not be found.
	 *
	 * @param employeeUserId the employee user ID
	 * @return the matching evp employee
	 * @throws NoSuchEmployeeException if a matching evp employee could not be found
	 */
	public static EVPEmployee findByEmployeeUserId(long employeeUserId)
		throws com.liferay.evp.exception.NoSuchEmployeeException {

		return getPersistence().findByEmployeeUserId(employeeUserId);
	}

	/**
	 * Returns the evp employee where employeeUserId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param employeeUserId the employee user ID
	 * @return the matching evp employee, or <code>null</code> if a matching evp employee could not be found
	 */
	public static EVPEmployee fetchByEmployeeUserId(long employeeUserId) {
		return getPersistence().fetchByEmployeeUserId(employeeUserId);
	}

	/**
	 * Returns the evp employee where employeeUserId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param employeeUserId the employee user ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching evp employee, or <code>null</code> if a matching evp employee could not be found
	 */
	public static EVPEmployee fetchByEmployeeUserId(
		long employeeUserId, boolean useFinderCache) {

		return getPersistence().fetchByEmployeeUserId(
			employeeUserId, useFinderCache);
	}

	/**
	 * Removes the evp employee where employeeUserId = &#63; from the database.
	 *
	 * @param employeeUserId the employee user ID
	 * @return the evp employee that was removed
	 */
	public static EVPEmployee removeByEmployeeUserId(long employeeUserId)
		throws com.liferay.evp.exception.NoSuchEmployeeException {

		return getPersistence().removeByEmployeeUserId(employeeUserId);
	}

	/**
	 * Returns the number of evp employees where employeeUserId = &#63;.
	 *
	 * @param employeeUserId the employee user ID
	 * @return the number of matching evp employees
	 */
	public static int countByEmployeeUserId(long employeeUserId) {
		return getPersistence().countByEmployeeUserId(employeeUserId);
	}

	/**
	 * Caches the evp employee in the entity cache if it is enabled.
	 *
	 * @param evpEmployee the evp employee
	 */
	public static void cacheResult(EVPEmployee evpEmployee) {
		getPersistence().cacheResult(evpEmployee);
	}

	/**
	 * Caches the evp employees in the entity cache if it is enabled.
	 *
	 * @param evpEmployees the evp employees
	 */
	public static void cacheResult(List<EVPEmployee> evpEmployees) {
		getPersistence().cacheResult(evpEmployees);
	}

	/**
	 * Creates a new evp employee with the primary key. Does not add the evp employee to the database.
	 *
	 * @param evpEmployeeId the primary key for the new evp employee
	 * @return the new evp employee
	 */
	public static EVPEmployee create(long evpEmployeeId) {
		return getPersistence().create(evpEmployeeId);
	}

	/**
	 * Removes the evp employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpEmployeeId the primary key of the evp employee
	 * @return the evp employee that was removed
	 * @throws NoSuchEmployeeException if a evp employee with the primary key could not be found
	 */
	public static EVPEmployee remove(long evpEmployeeId)
		throws com.liferay.evp.exception.NoSuchEmployeeException {

		return getPersistence().remove(evpEmployeeId);
	}

	public static EVPEmployee updateImpl(EVPEmployee evpEmployee) {
		return getPersistence().updateImpl(evpEmployee);
	}

	/**
	 * Returns the evp employee with the primary key or throws a <code>NoSuchEmployeeException</code> if it could not be found.
	 *
	 * @param evpEmployeeId the primary key of the evp employee
	 * @return the evp employee
	 * @throws NoSuchEmployeeException if a evp employee with the primary key could not be found
	 */
	public static EVPEmployee findByPrimaryKey(long evpEmployeeId)
		throws com.liferay.evp.exception.NoSuchEmployeeException {

		return getPersistence().findByPrimaryKey(evpEmployeeId);
	}

	/**
	 * Returns the evp employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpEmployeeId the primary key of the evp employee
	 * @return the evp employee, or <code>null</code> if a evp employee with the primary key could not be found
	 */
	public static EVPEmployee fetchByPrimaryKey(long evpEmployeeId) {
		return getPersistence().fetchByPrimaryKey(evpEmployeeId);
	}

	/**
	 * Returns all the evp employees.
	 *
	 * @return the evp employees
	 */
	public static List<EVPEmployee> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the evp employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp employees
	 * @param end the upper bound of the range of evp employees (not inclusive)
	 * @return the range of evp employees
	 */
	public static List<EVPEmployee> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the evp employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp employees
	 * @param end the upper bound of the range of evp employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of evp employees
	 */
	public static List<EVPEmployee> findAll(
		int start, int end, OrderByComparator<EVPEmployee> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the evp employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp employees
	 * @param end the upper bound of the range of evp employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of evp employees
	 */
	public static List<EVPEmployee> findAll(
		int start, int end, OrderByComparator<EVPEmployee> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the evp employees from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of evp employees.
	 *
	 * @return the number of evp employees
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EVPEmployeePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<EVPEmployeePersistence, EVPEmployeePersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(EVPEmployeePersistence.class);

		ServiceTracker<EVPEmployeePersistence, EVPEmployeePersistence>
			serviceTracker =
				new ServiceTracker
					<EVPEmployeePersistence, EVPEmployeePersistence>(
						bundle.getBundleContext(), EVPEmployeePersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}