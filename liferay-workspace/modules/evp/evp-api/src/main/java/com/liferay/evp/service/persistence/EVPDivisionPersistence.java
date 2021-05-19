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

import com.liferay.evp.exception.NoSuchDivisionException;
import com.liferay.evp.model.EVPDivision;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the evp division service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @see EVPDivisionUtil
 * @generated
 */
@ProviderType
public interface EVPDivisionPersistence extends BasePersistence<EVPDivision> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EVPDivisionUtil} to access the evp division persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the evp divisions where companyId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @return the matching evp divisions
	 */
	public java.util.List<EVPDivision> findByC_T(long companyId, int type);

	/**
	 * Returns a range of all the evp divisions where companyId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @param start the lower bound of the range of evp divisions
	 * @param end the upper bound of the range of evp divisions (not inclusive)
	 * @return the range of matching evp divisions
	 */
	public java.util.List<EVPDivision> findByC_T(
		long companyId, int type, int start, int end);

	/**
	 * Returns an ordered range of all the evp divisions where companyId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @param start the lower bound of the range of evp divisions
	 * @param end the upper bound of the range of evp divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching evp divisions
	 */
	public java.util.List<EVPDivision> findByC_T(
		long companyId, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPDivision>
			orderByComparator);

	/**
	 * Returns an ordered range of all the evp divisions where companyId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @param start the lower bound of the range of evp divisions
	 * @param end the upper bound of the range of evp divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching evp divisions
	 */
	public java.util.List<EVPDivision> findByC_T(
		long companyId, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPDivision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first evp division in the ordered set where companyId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp division
	 * @throws NoSuchDivisionException if a matching evp division could not be found
	 */
	public EVPDivision findByC_T_First(
			long companyId, int type,
			com.liferay.portal.kernel.util.OrderByComparator<EVPDivision>
				orderByComparator)
		throws NoSuchDivisionException;

	/**
	 * Returns the first evp division in the ordered set where companyId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp division, or <code>null</code> if a matching evp division could not be found
	 */
	public EVPDivision fetchByC_T_First(
		long companyId, int type,
		com.liferay.portal.kernel.util.OrderByComparator<EVPDivision>
			orderByComparator);

	/**
	 * Returns the last evp division in the ordered set where companyId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp division
	 * @throws NoSuchDivisionException if a matching evp division could not be found
	 */
	public EVPDivision findByC_T_Last(
			long companyId, int type,
			com.liferay.portal.kernel.util.OrderByComparator<EVPDivision>
				orderByComparator)
		throws NoSuchDivisionException;

	/**
	 * Returns the last evp division in the ordered set where companyId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp division, or <code>null</code> if a matching evp division could not be found
	 */
	public EVPDivision fetchByC_T_Last(
		long companyId, int type,
		com.liferay.portal.kernel.util.OrderByComparator<EVPDivision>
			orderByComparator);

	/**
	 * Returns the evp divisions before and after the current evp division in the ordered set where companyId = &#63; and type = &#63;.
	 *
	 * @param evpDivisionId the primary key of the current evp division
	 * @param companyId the company ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next evp division
	 * @throws NoSuchDivisionException if a evp division with the primary key could not be found
	 */
	public EVPDivision[] findByC_T_PrevAndNext(
			long evpDivisionId, long companyId, int type,
			com.liferay.portal.kernel.util.OrderByComparator<EVPDivision>
				orderByComparator)
		throws NoSuchDivisionException;

	/**
	 * Removes all the evp divisions where companyId = &#63; and type = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 */
	public void removeByC_T(long companyId, int type);

	/**
	 * Returns the number of evp divisions where companyId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @return the number of matching evp divisions
	 */
	public int countByC_T(long companyId, int type);

	/**
	 * Caches the evp division in the entity cache if it is enabled.
	 *
	 * @param evpDivision the evp division
	 */
	public void cacheResult(EVPDivision evpDivision);

	/**
	 * Caches the evp divisions in the entity cache if it is enabled.
	 *
	 * @param evpDivisions the evp divisions
	 */
	public void cacheResult(java.util.List<EVPDivision> evpDivisions);

	/**
	 * Creates a new evp division with the primary key. Does not add the evp division to the database.
	 *
	 * @param evpDivisionId the primary key for the new evp division
	 * @return the new evp division
	 */
	public EVPDivision create(long evpDivisionId);

	/**
	 * Removes the evp division with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpDivisionId the primary key of the evp division
	 * @return the evp division that was removed
	 * @throws NoSuchDivisionException if a evp division with the primary key could not be found
	 */
	public EVPDivision remove(long evpDivisionId)
		throws NoSuchDivisionException;

	public EVPDivision updateImpl(EVPDivision evpDivision);

	/**
	 * Returns the evp division with the primary key or throws a <code>NoSuchDivisionException</code> if it could not be found.
	 *
	 * @param evpDivisionId the primary key of the evp division
	 * @return the evp division
	 * @throws NoSuchDivisionException if a evp division with the primary key could not be found
	 */
	public EVPDivision findByPrimaryKey(long evpDivisionId)
		throws NoSuchDivisionException;

	/**
	 * Returns the evp division with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpDivisionId the primary key of the evp division
	 * @return the evp division, or <code>null</code> if a evp division with the primary key could not be found
	 */
	public EVPDivision fetchByPrimaryKey(long evpDivisionId);

	/**
	 * Returns all the evp divisions.
	 *
	 * @return the evp divisions
	 */
	public java.util.List<EVPDivision> findAll();

	/**
	 * Returns a range of all the evp divisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp divisions
	 * @param end the upper bound of the range of evp divisions (not inclusive)
	 * @return the range of evp divisions
	 */
	public java.util.List<EVPDivision> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the evp divisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp divisions
	 * @param end the upper bound of the range of evp divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of evp divisions
	 */
	public java.util.List<EVPDivision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPDivision>
			orderByComparator);

	/**
	 * Returns an ordered range of all the evp divisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp divisions
	 * @param end the upper bound of the range of evp divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of evp divisions
	 */
	public java.util.List<EVPDivision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPDivision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the evp divisions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of evp divisions.
	 *
	 * @return the number of evp divisions
	 */
	public int countAll();

}