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

import com.liferay.evp.exception.NoSuchServiceRequestException;
import com.liferay.evp.model.EVPServiceRequest;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the evp service request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @see EVPServiceRequestUtil
 * @generated
 */
@ProviderType
public interface EVPServiceRequestPersistence
	extends BasePersistence<EVPServiceRequest> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EVPServiceRequestUtil} to access the evp service request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the evp service requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching evp service requests
	 */
	public java.util.List<EVPServiceRequest> findByC_S(
		long companyId, int status);

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
	public java.util.List<EVPServiceRequest> findByC_S(
		long companyId, int status, int start, int end);

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
	public java.util.List<EVPServiceRequest> findByC_S(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPServiceRequest>
			orderByComparator);

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
	public java.util.List<EVPServiceRequest> findByC_S(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPServiceRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first evp service request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp service request
	 * @throws NoSuchServiceRequestException if a matching evp service request could not be found
	 */
	public EVPServiceRequest findByC_S_First(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<EVPServiceRequest>
				orderByComparator)
		throws NoSuchServiceRequestException;

	/**
	 * Returns the first evp service request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp service request, or <code>null</code> if a matching evp service request could not be found
	 */
	public EVPServiceRequest fetchByC_S_First(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<EVPServiceRequest>
			orderByComparator);

	/**
	 * Returns the last evp service request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp service request
	 * @throws NoSuchServiceRequestException if a matching evp service request could not be found
	 */
	public EVPServiceRequest findByC_S_Last(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<EVPServiceRequest>
				orderByComparator)
		throws NoSuchServiceRequestException;

	/**
	 * Returns the last evp service request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp service request, or <code>null</code> if a matching evp service request could not be found
	 */
	public EVPServiceRequest fetchByC_S_Last(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<EVPServiceRequest>
			orderByComparator);

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
	public EVPServiceRequest[] findByC_S_PrevAndNext(
			long evpServiceRequestId, long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<EVPServiceRequest>
				orderByComparator)
		throws NoSuchServiceRequestException;

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
	public java.util.List<EVPServiceRequest> findByC_S(
		long companyId, int[] statuses);

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
	public java.util.List<EVPServiceRequest> findByC_S(
		long companyId, int[] statuses, int start, int end);

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
	public java.util.List<EVPServiceRequest> findByC_S(
		long companyId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPServiceRequest>
			orderByComparator);

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
	public java.util.List<EVPServiceRequest> findByC_S(
		long companyId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPServiceRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the evp service requests where companyId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public void removeByC_S(long companyId, int status);

	/**
	 * Returns the number of evp service requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching evp service requests
	 */
	public int countByC_S(long companyId, int status);

	/**
	 * Returns the number of evp service requests where companyId = &#63; and status &ne; all &#63;.
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @return the number of matching evp service requests
	 */
	public int countByC_S(long companyId, int[] statuses);

	/**
	 * Caches the evp service request in the entity cache if it is enabled.
	 *
	 * @param evpServiceRequest the evp service request
	 */
	public void cacheResult(EVPServiceRequest evpServiceRequest);

	/**
	 * Caches the evp service requests in the entity cache if it is enabled.
	 *
	 * @param evpServiceRequests the evp service requests
	 */
	public void cacheResult(
		java.util.List<EVPServiceRequest> evpServiceRequests);

	/**
	 * Creates a new evp service request with the primary key. Does not add the evp service request to the database.
	 *
	 * @param evpServiceRequestId the primary key for the new evp service request
	 * @return the new evp service request
	 */
	public EVPServiceRequest create(long evpServiceRequestId);

	/**
	 * Removes the evp service request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpServiceRequestId the primary key of the evp service request
	 * @return the evp service request that was removed
	 * @throws NoSuchServiceRequestException if a evp service request with the primary key could not be found
	 */
	public EVPServiceRequest remove(long evpServiceRequestId)
		throws NoSuchServiceRequestException;

	public EVPServiceRequest updateImpl(EVPServiceRequest evpServiceRequest);

	/**
	 * Returns the evp service request with the primary key or throws a <code>NoSuchServiceRequestException</code> if it could not be found.
	 *
	 * @param evpServiceRequestId the primary key of the evp service request
	 * @return the evp service request
	 * @throws NoSuchServiceRequestException if a evp service request with the primary key could not be found
	 */
	public EVPServiceRequest findByPrimaryKey(long evpServiceRequestId)
		throws NoSuchServiceRequestException;

	/**
	 * Returns the evp service request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpServiceRequestId the primary key of the evp service request
	 * @return the evp service request, or <code>null</code> if a evp service request with the primary key could not be found
	 */
	public EVPServiceRequest fetchByPrimaryKey(long evpServiceRequestId);

	/**
	 * Returns all the evp service requests.
	 *
	 * @return the evp service requests
	 */
	public java.util.List<EVPServiceRequest> findAll();

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
	public java.util.List<EVPServiceRequest> findAll(int start, int end);

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
	public java.util.List<EVPServiceRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPServiceRequest>
			orderByComparator);

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
	public java.util.List<EVPServiceRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPServiceRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the evp service requests from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of evp service requests.
	 *
	 * @return the number of evp service requests
	 */
	public int countAll();

}