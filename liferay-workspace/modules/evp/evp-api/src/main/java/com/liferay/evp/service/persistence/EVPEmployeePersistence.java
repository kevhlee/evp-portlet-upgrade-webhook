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

import com.liferay.evp.exception.NoSuchEmployeeException;
import com.liferay.evp.model.EVPEmployee;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the evp employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @see EVPEmployeeUtil
 * @generated
 */
@ProviderType
public interface EVPEmployeePersistence extends BasePersistence<EVPEmployee> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EVPEmployeeUtil} to access the evp employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the evp employee where employeeUserId = &#63; or throws a <code>NoSuchEmployeeException</code> if it could not be found.
	 *
	 * @param employeeUserId the employee user ID
	 * @return the matching evp employee
	 * @throws NoSuchEmployeeException if a matching evp employee could not be found
	 */
	public EVPEmployee findByEmployeeUserId(long employeeUserId)
		throws NoSuchEmployeeException;

	/**
	 * Returns the evp employee where employeeUserId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param employeeUserId the employee user ID
	 * @return the matching evp employee, or <code>null</code> if a matching evp employee could not be found
	 */
	public EVPEmployee fetchByEmployeeUserId(long employeeUserId);

	/**
	 * Returns the evp employee where employeeUserId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param employeeUserId the employee user ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching evp employee, or <code>null</code> if a matching evp employee could not be found
	 */
	public EVPEmployee fetchByEmployeeUserId(
		long employeeUserId, boolean useFinderCache);

	/**
	 * Removes the evp employee where employeeUserId = &#63; from the database.
	 *
	 * @param employeeUserId the employee user ID
	 * @return the evp employee that was removed
	 */
	public EVPEmployee removeByEmployeeUserId(long employeeUserId)
		throws NoSuchEmployeeException;

	/**
	 * Returns the number of evp employees where employeeUserId = &#63;.
	 *
	 * @param employeeUserId the employee user ID
	 * @return the number of matching evp employees
	 */
	public int countByEmployeeUserId(long employeeUserId);

	/**
	 * Caches the evp employee in the entity cache if it is enabled.
	 *
	 * @param evpEmployee the evp employee
	 */
	public void cacheResult(EVPEmployee evpEmployee);

	/**
	 * Caches the evp employees in the entity cache if it is enabled.
	 *
	 * @param evpEmployees the evp employees
	 */
	public void cacheResult(java.util.List<EVPEmployee> evpEmployees);

	/**
	 * Creates a new evp employee with the primary key. Does not add the evp employee to the database.
	 *
	 * @param evpEmployeeId the primary key for the new evp employee
	 * @return the new evp employee
	 */
	public EVPEmployee create(long evpEmployeeId);

	/**
	 * Removes the evp employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpEmployeeId the primary key of the evp employee
	 * @return the evp employee that was removed
	 * @throws NoSuchEmployeeException if a evp employee with the primary key could not be found
	 */
	public EVPEmployee remove(long evpEmployeeId)
		throws NoSuchEmployeeException;

	public EVPEmployee updateImpl(EVPEmployee evpEmployee);

	/**
	 * Returns the evp employee with the primary key or throws a <code>NoSuchEmployeeException</code> if it could not be found.
	 *
	 * @param evpEmployeeId the primary key of the evp employee
	 * @return the evp employee
	 * @throws NoSuchEmployeeException if a evp employee with the primary key could not be found
	 */
	public EVPEmployee findByPrimaryKey(long evpEmployeeId)
		throws NoSuchEmployeeException;

	/**
	 * Returns the evp employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpEmployeeId the primary key of the evp employee
	 * @return the evp employee, or <code>null</code> if a evp employee with the primary key could not be found
	 */
	public EVPEmployee fetchByPrimaryKey(long evpEmployeeId);

	/**
	 * Returns all the evp employees.
	 *
	 * @return the evp employees
	 */
	public java.util.List<EVPEmployee> findAll();

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
	public java.util.List<EVPEmployee> findAll(int start, int end);

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
	public java.util.List<EVPEmployee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPEmployee>
			orderByComparator);

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
	public java.util.List<EVPEmployee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPEmployee>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the evp employees from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of evp employees.
	 *
	 * @return the number of evp employees
	 */
	public int countAll();

}