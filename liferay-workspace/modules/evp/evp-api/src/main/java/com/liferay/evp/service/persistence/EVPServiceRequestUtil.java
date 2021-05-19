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

import com.liferay.evp.model.EVPServiceRequest;
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
 * The persistence utility for the evp service request service. This utility wraps <code>com.liferay.evp.service.persistence.impl.EVPServiceRequestPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @see EVPServiceRequestPersistence
 * @generated
 */
public class EVPServiceRequestUtil {

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
	public static void clearCache(EVPServiceRequest evpServiceRequest) {
		getPersistence().clearCache(evpServiceRequest);
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
	public static Map<Serializable, EVPServiceRequest> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EVPServiceRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EVPServiceRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EVPServiceRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EVPServiceRequest> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EVPServiceRequest update(
		EVPServiceRequest evpServiceRequest) {

		return getPersistence().update(evpServiceRequest);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EVPServiceRequest update(
		EVPServiceRequest evpServiceRequest, ServiceContext serviceContext) {

		return getPersistence().update(evpServiceRequest, serviceContext);
	}

	/**
	 * Returns all the evp service requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching evp service requests
	 */
	public static List<EVPServiceRequest> findByC_S(
		long companyId, int status) {

		return getPersistence().findByC_S(companyId, status);
	}

	/**
	 * Returns a range of all the evp service requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @return the range of matching evp service requests
	 */
	public static List<EVPServiceRequest> findByC_S(
		long companyId, int status, int start, int end) {

		return getPersistence().findByC_S(companyId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the evp service requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching evp service requests
	 */
	public static List<EVPServiceRequest> findByC_S(
		long companyId, int status, int start, int end,
		OrderByComparator<EVPServiceRequest> orderByComparator) {

		return getPersistence().findByC_S(
			companyId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the evp service requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching evp service requests
	 */
	public static List<EVPServiceRequest> findByC_S(
		long companyId, int status, int start, int end,
		OrderByComparator<EVPServiceRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByC_S(
			companyId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first evp service request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp service request
	 * @throws NoSuchServiceRequestException if a matching evp service request could not be found
	 */
	public static EVPServiceRequest findByC_S_First(
			long companyId, int status,
			OrderByComparator<EVPServiceRequest> orderByComparator)
		throws com.liferay.evp.exception.NoSuchServiceRequestException {

		return getPersistence().findByC_S_First(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the first evp service request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp service request, or <code>null</code> if a matching evp service request could not be found
	 */
	public static EVPServiceRequest fetchByC_S_First(
		long companyId, int status,
		OrderByComparator<EVPServiceRequest> orderByComparator) {

		return getPersistence().fetchByC_S_First(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the last evp service request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp service request
	 * @throws NoSuchServiceRequestException if a matching evp service request could not be found
	 */
	public static EVPServiceRequest findByC_S_Last(
			long companyId, int status,
			OrderByComparator<EVPServiceRequest> orderByComparator)
		throws com.liferay.evp.exception.NoSuchServiceRequestException {

		return getPersistence().findByC_S_Last(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the last evp service request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp service request, or <code>null</code> if a matching evp service request could not be found
	 */
	public static EVPServiceRequest fetchByC_S_Last(
		long companyId, int status,
		OrderByComparator<EVPServiceRequest> orderByComparator) {

		return getPersistence().fetchByC_S_Last(
			companyId, status, orderByComparator);
	}

	/**
	 * Returns the evp service requests before and after the current evp service request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param evpServiceRequestId the primary key of the current evp service request
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next evp service request
	 * @throws NoSuchServiceRequestException if a evp service request with the primary key could not be found
	 */
	public static EVPServiceRequest[] findByC_S_PrevAndNext(
			long evpServiceRequestId, long companyId, int status,
			OrderByComparator<EVPServiceRequest> orderByComparator)
		throws com.liferay.evp.exception.NoSuchServiceRequestException {

		return getPersistence().findByC_S_PrevAndNext(
			evpServiceRequestId, companyId, status, orderByComparator);
	}

	/**
	 * Returns all the evp service requests where companyId = &#63; and status &ne; all &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @return the matching evp service requests
	 */
	public static List<EVPServiceRequest> findByC_S(
		long companyId, int[] statuses) {

		return getPersistence().findByC_S(companyId, statuses);
	}

	/**
	 * Returns a range of all the evp service requests where companyId = &#63; and status &ne; all &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @return the range of matching evp service requests
	 */
	public static List<EVPServiceRequest> findByC_S(
		long companyId, int[] statuses, int start, int end) {

		return getPersistence().findByC_S(companyId, statuses, start, end);
	}

	/**
	 * Returns an ordered range of all the evp service requests where companyId = &#63; and status &ne; all &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching evp service requests
	 */
	public static List<EVPServiceRequest> findByC_S(
		long companyId, int[] statuses, int start, int end,
		OrderByComparator<EVPServiceRequest> orderByComparator) {

		return getPersistence().findByC_S(
			companyId, statuses, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the evp service requests where companyId = &#63; and status &ne; &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching evp service requests
	 */
	public static List<EVPServiceRequest> findByC_S(
		long companyId, int[] statuses, int start, int end,
		OrderByComparator<EVPServiceRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByC_S(
			companyId, statuses, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the evp service requests where companyId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public static void removeByC_S(long companyId, int status) {
		getPersistence().removeByC_S(companyId, status);
	}

	/**
	 * Returns the number of evp service requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching evp service requests
	 */
	public static int countByC_S(long companyId, int status) {
		return getPersistence().countByC_S(companyId, status);
	}

	/**
	 * Returns the number of evp service requests where companyId = &#63; and status &ne; all &#63;.
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @return the number of matching evp service requests
	 */
	public static int countByC_S(long companyId, int[] statuses) {
		return getPersistence().countByC_S(companyId, statuses);
	}

	/**
	 * Caches the evp service request in the entity cache if it is enabled.
	 *
	 * @param evpServiceRequest the evp service request
	 */
	public static void cacheResult(EVPServiceRequest evpServiceRequest) {
		getPersistence().cacheResult(evpServiceRequest);
	}

	/**
	 * Caches the evp service requests in the entity cache if it is enabled.
	 *
	 * @param evpServiceRequests the evp service requests
	 */
	public static void cacheResult(List<EVPServiceRequest> evpServiceRequests) {
		getPersistence().cacheResult(evpServiceRequests);
	}

	/**
	 * Creates a new evp service request with the primary key. Does not add the evp service request to the database.
	 *
	 * @param evpServiceRequestId the primary key for the new evp service request
	 * @return the new evp service request
	 */
	public static EVPServiceRequest create(long evpServiceRequestId) {
		return getPersistence().create(evpServiceRequestId);
	}

	/**
	 * Removes the evp service request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpServiceRequestId the primary key of the evp service request
	 * @return the evp service request that was removed
	 * @throws NoSuchServiceRequestException if a evp service request with the primary key could not be found
	 */
	public static EVPServiceRequest remove(long evpServiceRequestId)
		throws com.liferay.evp.exception.NoSuchServiceRequestException {

		return getPersistence().remove(evpServiceRequestId);
	}

	public static EVPServiceRequest updateImpl(
		EVPServiceRequest evpServiceRequest) {

		return getPersistence().updateImpl(evpServiceRequest);
	}

	/**
	 * Returns the evp service request with the primary key or throws a <code>NoSuchServiceRequestException</code> if it could not be found.
	 *
	 * @param evpServiceRequestId the primary key of the evp service request
	 * @return the evp service request
	 * @throws NoSuchServiceRequestException if a evp service request with the primary key could not be found
	 */
	public static EVPServiceRequest findByPrimaryKey(long evpServiceRequestId)
		throws com.liferay.evp.exception.NoSuchServiceRequestException {

		return getPersistence().findByPrimaryKey(evpServiceRequestId);
	}

	/**
	 * Returns the evp service request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpServiceRequestId the primary key of the evp service request
	 * @return the evp service request, or <code>null</code> if a evp service request with the primary key could not be found
	 */
	public static EVPServiceRequest fetchByPrimaryKey(
		long evpServiceRequestId) {

		return getPersistence().fetchByPrimaryKey(evpServiceRequestId);
	}

	/**
	 * Returns all the evp service requests.
	 *
	 * @return the evp service requests
	 */
	public static List<EVPServiceRequest> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the evp service requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @return the range of evp service requests
	 */
	public static List<EVPServiceRequest> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the evp service requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of evp service requests
	 */
	public static List<EVPServiceRequest> findAll(
		int start, int end,
		OrderByComparator<EVPServiceRequest> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the evp service requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of evp service requests
	 */
	public static List<EVPServiceRequest> findAll(
		int start, int end,
		OrderByComparator<EVPServiceRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the evp service requests from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of evp service requests.
	 *
	 * @return the number of evp service requests
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EVPServiceRequestPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<EVPServiceRequestPersistence, EVPServiceRequestPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			EVPServiceRequestPersistence.class);

		ServiceTracker
			<EVPServiceRequestPersistence, EVPServiceRequestPersistence>
				serviceTracker =
					new ServiceTracker
						<EVPServiceRequestPersistence,
						 EVPServiceRequestPersistence>(
							 bundle.getBundleContext(),
							 EVPServiceRequestPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}