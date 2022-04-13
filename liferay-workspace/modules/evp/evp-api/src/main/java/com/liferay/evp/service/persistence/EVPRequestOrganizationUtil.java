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

import com.liferay.evp.model.EVPRequestOrganization;
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
 * The persistence utility for the evp request organization service. This utility wraps <code>com.liferay.evp.service.persistence.impl.EVPRequestOrganizationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @see EVPRequestOrganizationPersistence
 * @generated
 */
public class EVPRequestOrganizationUtil {

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
	public static void clearCache(
		EVPRequestOrganization evpRequestOrganization) {

		getPersistence().clearCache(evpRequestOrganization);
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
	public static Map<Serializable, EVPRequestOrganization> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EVPRequestOrganization> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EVPRequestOrganization> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EVPRequestOrganization> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EVPRequestOrganization> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EVPRequestOrganization update(
		EVPRequestOrganization evpRequestOrganization) {

		return getPersistence().update(evpRequestOrganization);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EVPRequestOrganization update(
		EVPRequestOrganization evpRequestOrganization,
		ServiceContext serviceContext) {

		return getPersistence().update(evpRequestOrganization, serviceContext);
	}

	/**
	 * Returns all the evp request organizations where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching evp request organizations
	 */
	public static List<EVPRequestOrganization> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

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
	public static List<EVPRequestOrganization> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

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
	public static List<EVPRequestOrganization> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<EVPRequestOrganization> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

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
	public static List<EVPRequestOrganization> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<EVPRequestOrganization> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first evp request organization in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp request organization
	 * @throws NoSuchRequestOrganizationException if a matching evp request organization could not be found
	 */
	public static EVPRequestOrganization findByCompanyId_First(
			long companyId,
			OrderByComparator<EVPRequestOrganization> orderByComparator)
		throws com.liferay.evp.exception.NoSuchRequestOrganizationException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first evp request organization in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp request organization, or <code>null</code> if a matching evp request organization could not be found
	 */
	public static EVPRequestOrganization fetchByCompanyId_First(
		long companyId,
		OrderByComparator<EVPRequestOrganization> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last evp request organization in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp request organization
	 * @throws NoSuchRequestOrganizationException if a matching evp request organization could not be found
	 */
	public static EVPRequestOrganization findByCompanyId_Last(
			long companyId,
			OrderByComparator<EVPRequestOrganization> orderByComparator)
		throws com.liferay.evp.exception.NoSuchRequestOrganizationException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last evp request organization in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp request organization, or <code>null</code> if a matching evp request organization could not be found
	 */
	public static EVPRequestOrganization fetchByCompanyId_Last(
		long companyId,
		OrderByComparator<EVPRequestOrganization> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the evp request organizations before and after the current evp request organization in the ordered set where companyId = &#63;.
	 *
	 * @param evpRequestOrganizationId the primary key of the current evp request organization
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next evp request organization
	 * @throws NoSuchRequestOrganizationException if a evp request organization with the primary key could not be found
	 */
	public static EVPRequestOrganization[] findByCompanyId_PrevAndNext(
			long evpRequestOrganizationId, long companyId,
			OrderByComparator<EVPRequestOrganization> orderByComparator)
		throws com.liferay.evp.exception.NoSuchRequestOrganizationException {

		return getPersistence().findByCompanyId_PrevAndNext(
			evpRequestOrganizationId, companyId, orderByComparator);
	}

	/**
	 * Removes all the evp request organizations where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of evp request organizations where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching evp request organizations
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Caches the evp request organization in the entity cache if it is enabled.
	 *
	 * @param evpRequestOrganization the evp request organization
	 */
	public static void cacheResult(
		EVPRequestOrganization evpRequestOrganization) {

		getPersistence().cacheResult(evpRequestOrganization);
	}

	/**
	 * Caches the evp request organizations in the entity cache if it is enabled.
	 *
	 * @param evpRequestOrganizations the evp request organizations
	 */
	public static void cacheResult(
		List<EVPRequestOrganization> evpRequestOrganizations) {

		getPersistence().cacheResult(evpRequestOrganizations);
	}

	/**
	 * Creates a new evp request organization with the primary key. Does not add the evp request organization to the database.
	 *
	 * @param evpRequestOrganizationId the primary key for the new evp request organization
	 * @return the new evp request organization
	 */
	public static EVPRequestOrganization create(long evpRequestOrganizationId) {
		return getPersistence().create(evpRequestOrganizationId);
	}

	/**
	 * Removes the evp request organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpRequestOrganizationId the primary key of the evp request organization
	 * @return the evp request organization that was removed
	 * @throws NoSuchRequestOrganizationException if a evp request organization with the primary key could not be found
	 */
	public static EVPRequestOrganization remove(long evpRequestOrganizationId)
		throws com.liferay.evp.exception.NoSuchRequestOrganizationException {

		return getPersistence().remove(evpRequestOrganizationId);
	}

	public static EVPRequestOrganization updateImpl(
		EVPRequestOrganization evpRequestOrganization) {

		return getPersistence().updateImpl(evpRequestOrganization);
	}

	/**
	 * Returns the evp request organization with the primary key or throws a <code>NoSuchRequestOrganizationException</code> if it could not be found.
	 *
	 * @param evpRequestOrganizationId the primary key of the evp request organization
	 * @return the evp request organization
	 * @throws NoSuchRequestOrganizationException if a evp request organization with the primary key could not be found
	 */
	public static EVPRequestOrganization findByPrimaryKey(
			long evpRequestOrganizationId)
		throws com.liferay.evp.exception.NoSuchRequestOrganizationException {

		return getPersistence().findByPrimaryKey(evpRequestOrganizationId);
	}

	/**
	 * Returns the evp request organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpRequestOrganizationId the primary key of the evp request organization
	 * @return the evp request organization, or <code>null</code> if a evp request organization with the primary key could not be found
	 */
	public static EVPRequestOrganization fetchByPrimaryKey(
		long evpRequestOrganizationId) {

		return getPersistence().fetchByPrimaryKey(evpRequestOrganizationId);
	}

	/**
	 * Returns all the evp request organizations.
	 *
	 * @return the evp request organizations
	 */
	public static List<EVPRequestOrganization> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<EVPRequestOrganization> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<EVPRequestOrganization> findAll(
		int start, int end,
		OrderByComparator<EVPRequestOrganization> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<EVPRequestOrganization> findAll(
		int start, int end,
		OrderByComparator<EVPRequestOrganization> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the evp request organizations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of evp request organizations.
	 *
	 * @return the number of evp request organizations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EVPRequestOrganizationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<EVPRequestOrganizationPersistence, EVPRequestOrganizationPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			EVPRequestOrganizationPersistence.class);

		ServiceTracker
			<EVPRequestOrganizationPersistence,
			 EVPRequestOrganizationPersistence> serviceTracker =
				new ServiceTracker
					<EVPRequestOrganizationPersistence,
					 EVPRequestOrganizationPersistence>(
						 bundle.getBundleContext(),
						 EVPRequestOrganizationPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}