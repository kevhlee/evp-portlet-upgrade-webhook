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

import com.liferay.evp.exception.NoSuchGrantRequestException;
import com.liferay.evp.model.EVPGrantRequest;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the evp grant request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @see EVPGrantRequestUtil
 * @generated
 */
@ProviderType
public interface EVPGrantRequestPersistence
	extends BasePersistence<EVPGrantRequest> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EVPGrantRequestUtil} to access the evp grant request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the evp grant requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching evp grant requests
	 */
	public java.util.List<EVPGrantRequest> findByC_S(
		long companyId, int status);

	/**
	 * Returns a range of all the evp grant requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @return the range of matching evp grant requests
	 */
	public java.util.List<EVPGrantRequest> findByC_S(
		long companyId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the evp grant requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching evp grant requests
	 */
	public java.util.List<EVPGrantRequest> findByC_S(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPGrantRequest>
			orderByComparator);

	/**
	 * Returns an ordered range of all the evp grant requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching evp grant requests
	 */
	public java.util.List<EVPGrantRequest> findByC_S(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPGrantRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first evp grant request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp grant request
	 * @throws NoSuchGrantRequestException if a matching evp grant request could not be found
	 */
	public EVPGrantRequest findByC_S_First(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<EVPGrantRequest>
				orderByComparator)
		throws NoSuchGrantRequestException;

	/**
	 * Returns the first evp grant request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp grant request, or <code>null</code> if a matching evp grant request could not be found
	 */
	public EVPGrantRequest fetchByC_S_First(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<EVPGrantRequest>
			orderByComparator);

	/**
	 * Returns the last evp grant request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp grant request
	 * @throws NoSuchGrantRequestException if a matching evp grant request could not be found
	 */
	public EVPGrantRequest findByC_S_Last(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<EVPGrantRequest>
				orderByComparator)
		throws NoSuchGrantRequestException;

	/**
	 * Returns the last evp grant request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp grant request, or <code>null</code> if a matching evp grant request could not be found
	 */
	public EVPGrantRequest fetchByC_S_Last(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<EVPGrantRequest>
			orderByComparator);

	/**
	 * Returns the evp grant requests before and after the current evp grant request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param evpGrantRequestId the primary key of the current evp grant request
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next evp grant request
	 * @throws NoSuchGrantRequestException if a evp grant request with the primary key could not be found
	 */
	public EVPGrantRequest[] findByC_S_PrevAndNext(
			long evpGrantRequestId, long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<EVPGrantRequest>
				orderByComparator)
		throws NoSuchGrantRequestException;

	/**
	 * Returns all the evp grant requests where companyId = &#63; and status &ne; all &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @return the matching evp grant requests
	 */
	public java.util.List<EVPGrantRequest> findByC_S(
		long companyId, int[] statuses);

	/**
	 * Returns a range of all the evp grant requests where companyId = &#63; and status &ne; all &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @return the range of matching evp grant requests
	 */
	public java.util.List<EVPGrantRequest> findByC_S(
		long companyId, int[] statuses, int start, int end);

	/**
	 * Returns an ordered range of all the evp grant requests where companyId = &#63; and status &ne; all &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching evp grant requests
	 */
	public java.util.List<EVPGrantRequest> findByC_S(
		long companyId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPGrantRequest>
			orderByComparator);

	/**
	 * Returns an ordered range of all the evp grant requests where companyId = &#63; and status &ne; &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching evp grant requests
	 */
	public java.util.List<EVPGrantRequest> findByC_S(
		long companyId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPGrantRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the evp grant requests where companyId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public void removeByC_S(long companyId, int status);

	/**
	 * Returns the number of evp grant requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching evp grant requests
	 */
	public int countByC_S(long companyId, int status);

	/**
	 * Returns the number of evp grant requests where companyId = &#63; and status &ne; all &#63;.
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @return the number of matching evp grant requests
	 */
	public int countByC_S(long companyId, int[] statuses);

	/**
	 * Caches the evp grant request in the entity cache if it is enabled.
	 *
	 * @param evpGrantRequest the evp grant request
	 */
	public void cacheResult(EVPGrantRequest evpGrantRequest);

	/**
	 * Caches the evp grant requests in the entity cache if it is enabled.
	 *
	 * @param evpGrantRequests the evp grant requests
	 */
	public void cacheResult(java.util.List<EVPGrantRequest> evpGrantRequests);

	/**
	 * Creates a new evp grant request with the primary key. Does not add the evp grant request to the database.
	 *
	 * @param evpGrantRequestId the primary key for the new evp grant request
	 * @return the new evp grant request
	 */
	public EVPGrantRequest create(long evpGrantRequestId);

	/**
	 * Removes the evp grant request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpGrantRequestId the primary key of the evp grant request
	 * @return the evp grant request that was removed
	 * @throws NoSuchGrantRequestException if a evp grant request with the primary key could not be found
	 */
	public EVPGrantRequest remove(long evpGrantRequestId)
		throws NoSuchGrantRequestException;

	public EVPGrantRequest updateImpl(EVPGrantRequest evpGrantRequest);

	/**
	 * Returns the evp grant request with the primary key or throws a <code>NoSuchGrantRequestException</code> if it could not be found.
	 *
	 * @param evpGrantRequestId the primary key of the evp grant request
	 * @return the evp grant request
	 * @throws NoSuchGrantRequestException if a evp grant request with the primary key could not be found
	 */
	public EVPGrantRequest findByPrimaryKey(long evpGrantRequestId)
		throws NoSuchGrantRequestException;

	/**
	 * Returns the evp grant request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpGrantRequestId the primary key of the evp grant request
	 * @return the evp grant request, or <code>null</code> if a evp grant request with the primary key could not be found
	 */
	public EVPGrantRequest fetchByPrimaryKey(long evpGrantRequestId);

	/**
	 * Returns all the evp grant requests.
	 *
	 * @return the evp grant requests
	 */
	public java.util.List<EVPGrantRequest> findAll();

	/**
	 * Returns a range of all the evp grant requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @return the range of evp grant requests
	 */
	public java.util.List<EVPGrantRequest> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the evp grant requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of evp grant requests
	 */
	public java.util.List<EVPGrantRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPGrantRequest>
			orderByComparator);

	/**
	 * Returns an ordered range of all the evp grant requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of evp grant requests
	 */
	public java.util.List<EVPGrantRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPGrantRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the evp grant requests from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of evp grant requests.
	 *
	 * @return the number of evp grant requests
	 */
	public int countAll();

}