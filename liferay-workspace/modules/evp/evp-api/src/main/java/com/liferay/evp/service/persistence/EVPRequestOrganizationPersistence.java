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

import com.liferay.evp.exception.NoSuchRequestOrganizationException;
import com.liferay.evp.model.EVPRequestOrganization;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the evp request organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @see EVPRequestOrganizationUtil
 * @generated
 */
@ProviderType
public interface EVPRequestOrganizationPersistence
	extends BasePersistence<EVPRequestOrganization> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EVPRequestOrganizationUtil} to access the evp request organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the evp request organizations where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching evp request organizations
	 */
	public java.util.List<EVPRequestOrganization> findByCompanyId(
		long companyId);

	/**
	 * Returns a range of all the evp request organizations where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPRequestOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of evp request organizations
	 * @param end the upper bound of the range of evp request organizations (not inclusive)
	 * @return the range of matching evp request organizations
	 */
	public java.util.List<EVPRequestOrganization> findByCompanyId(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the evp request organizations where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPRequestOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of evp request organizations
	 * @param end the upper bound of the range of evp request organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching evp request organizations
	 */
	public java.util.List<EVPRequestOrganization> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPRequestOrganization>
			orderByComparator);

	/**
	 * Returns an ordered range of all the evp request organizations where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPRequestOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of evp request organizations
	 * @param end the upper bound of the range of evp request organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching evp request organizations
	 */
	public java.util.List<EVPRequestOrganization> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPRequestOrganization>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first evp request organization in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp request organization
	 * @throws NoSuchRequestOrganizationException if a matching evp request organization could not be found
	 */
	public EVPRequestOrganization findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<EVPRequestOrganization> orderByComparator)
		throws NoSuchRequestOrganizationException;

	/**
	 * Returns the first evp request organization in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp request organization, or <code>null</code> if a matching evp request organization could not be found
	 */
	public EVPRequestOrganization fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EVPRequestOrganization>
			orderByComparator);

	/**
	 * Returns the last evp request organization in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp request organization
	 * @throws NoSuchRequestOrganizationException if a matching evp request organization could not be found
	 */
	public EVPRequestOrganization findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<EVPRequestOrganization> orderByComparator)
		throws NoSuchRequestOrganizationException;

	/**
	 * Returns the last evp request organization in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp request organization, or <code>null</code> if a matching evp request organization could not be found
	 */
	public EVPRequestOrganization fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EVPRequestOrganization>
			orderByComparator);

	/**
	 * Returns the evp request organizations before and after the current evp request organization in the ordered set where companyId = &#63;.
	 *
	 * @param evpRequestOrganizationId the primary key of the current evp request organization
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next evp request organization
	 * @throws NoSuchRequestOrganizationException if a evp request organization with the primary key could not be found
	 */
	public EVPRequestOrganization[] findByCompanyId_PrevAndNext(
			long evpRequestOrganizationId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<EVPRequestOrganization> orderByComparator)
		throws NoSuchRequestOrganizationException;

	/**
	 * Removes all the evp request organizations where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of evp request organizations where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching evp request organizations
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Caches the evp request organization in the entity cache if it is enabled.
	 *
	 * @param evpRequestOrganization the evp request organization
	 */
	public void cacheResult(EVPRequestOrganization evpRequestOrganization);

	/**
	 * Caches the evp request organizations in the entity cache if it is enabled.
	 *
	 * @param evpRequestOrganizations the evp request organizations
	 */
	public void cacheResult(
		java.util.List<EVPRequestOrganization> evpRequestOrganizations);

	/**
	 * Creates a new evp request organization with the primary key. Does not add the evp request organization to the database.
	 *
	 * @param evpRequestOrganizationId the primary key for the new evp request organization
	 * @return the new evp request organization
	 */
	public EVPRequestOrganization create(long evpRequestOrganizationId);

	/**
	 * Removes the evp request organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpRequestOrganizationId the primary key of the evp request organization
	 * @return the evp request organization that was removed
	 * @throws NoSuchRequestOrganizationException if a evp request organization with the primary key could not be found
	 */
	public EVPRequestOrganization remove(long evpRequestOrganizationId)
		throws NoSuchRequestOrganizationException;

	public EVPRequestOrganization updateImpl(
		EVPRequestOrganization evpRequestOrganization);

	/**
	 * Returns the evp request organization with the primary key or throws a <code>NoSuchRequestOrganizationException</code> if it could not be found.
	 *
	 * @param evpRequestOrganizationId the primary key of the evp request organization
	 * @return the evp request organization
	 * @throws NoSuchRequestOrganizationException if a evp request organization with the primary key could not be found
	 */
	public EVPRequestOrganization findByPrimaryKey(
			long evpRequestOrganizationId)
		throws NoSuchRequestOrganizationException;

	/**
	 * Returns the evp request organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpRequestOrganizationId the primary key of the evp request organization
	 * @return the evp request organization, or <code>null</code> if a evp request organization with the primary key could not be found
	 */
	public EVPRequestOrganization fetchByPrimaryKey(
		long evpRequestOrganizationId);

	/**
	 * Returns all the evp request organizations.
	 *
	 * @return the evp request organizations
	 */
	public java.util.List<EVPRequestOrganization> findAll();

	/**
	 * Returns a range of all the evp request organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPRequestOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp request organizations
	 * @param end the upper bound of the range of evp request organizations (not inclusive)
	 * @return the range of evp request organizations
	 */
	public java.util.List<EVPRequestOrganization> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the evp request organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPRequestOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp request organizations
	 * @param end the upper bound of the range of evp request organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of evp request organizations
	 */
	public java.util.List<EVPRequestOrganization> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPRequestOrganization>
			orderByComparator);

	/**
	 * Returns an ordered range of all the evp request organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPRequestOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp request organizations
	 * @param end the upper bound of the range of evp request organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of evp request organizations
	 */
	public java.util.List<EVPRequestOrganization> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPRequestOrganization>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the evp request organizations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of evp request organizations.
	 *
	 * @return the number of evp request organizations
	 */
	public int countAll();

}