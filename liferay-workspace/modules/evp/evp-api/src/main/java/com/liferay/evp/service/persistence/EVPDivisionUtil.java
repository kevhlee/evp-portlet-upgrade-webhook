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

import com.liferay.evp.model.EVPDivision;
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
 * The persistence utility for the evp division service. This utility wraps <code>com.liferay.evp.service.persistence.impl.EVPDivisionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @see EVPDivisionPersistence
 * @generated
 */
public class EVPDivisionUtil {

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
	public static void clearCache(EVPDivision evpDivision) {
		getPersistence().clearCache(evpDivision);
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
	public static Map<Serializable, EVPDivision> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EVPDivision> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EVPDivision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EVPDivision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EVPDivision> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EVPDivision update(EVPDivision evpDivision) {
		return getPersistence().update(evpDivision);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EVPDivision update(
		EVPDivision evpDivision, ServiceContext serviceContext) {

		return getPersistence().update(evpDivision, serviceContext);
	}

	/**
	 * Returns all the evp divisions where companyId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @return the matching evp divisions
	 */
	public static List<EVPDivision> findByC_T(long companyId, int type) {
		return getPersistence().findByC_T(companyId, type);
	}

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
	public static List<EVPDivision> findByC_T(
		long companyId, int type, int start, int end) {

		return getPersistence().findByC_T(companyId, type, start, end);
	}

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
	public static List<EVPDivision> findByC_T(
		long companyId, int type, int start, int end,
		OrderByComparator<EVPDivision> orderByComparator) {

		return getPersistence().findByC_T(
			companyId, type, start, end, orderByComparator);
	}

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
	public static List<EVPDivision> findByC_T(
		long companyId, int type, int start, int end,
		OrderByComparator<EVPDivision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByC_T(
			companyId, type, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first evp division in the ordered set where companyId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp division
	 * @throws NoSuchDivisionException if a matching evp division could not be found
	 */
	public static EVPDivision findByC_T_First(
			long companyId, int type,
			OrderByComparator<EVPDivision> orderByComparator)
		throws com.liferay.evp.exception.NoSuchDivisionException {

		return getPersistence().findByC_T_First(
			companyId, type, orderByComparator);
	}

	/**
	 * Returns the first evp division in the ordered set where companyId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp division, or <code>null</code> if a matching evp division could not be found
	 */
	public static EVPDivision fetchByC_T_First(
		long companyId, int type,
		OrderByComparator<EVPDivision> orderByComparator) {

		return getPersistence().fetchByC_T_First(
			companyId, type, orderByComparator);
	}

	/**
	 * Returns the last evp division in the ordered set where companyId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp division
	 * @throws NoSuchDivisionException if a matching evp division could not be found
	 */
	public static EVPDivision findByC_T_Last(
			long companyId, int type,
			OrderByComparator<EVPDivision> orderByComparator)
		throws com.liferay.evp.exception.NoSuchDivisionException {

		return getPersistence().findByC_T_Last(
			companyId, type, orderByComparator);
	}

	/**
	 * Returns the last evp division in the ordered set where companyId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp division, or <code>null</code> if a matching evp division could not be found
	 */
	public static EVPDivision fetchByC_T_Last(
		long companyId, int type,
		OrderByComparator<EVPDivision> orderByComparator) {

		return getPersistence().fetchByC_T_Last(
			companyId, type, orderByComparator);
	}

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
	public static EVPDivision[] findByC_T_PrevAndNext(
			long evpDivisionId, long companyId, int type,
			OrderByComparator<EVPDivision> orderByComparator)
		throws com.liferay.evp.exception.NoSuchDivisionException {

		return getPersistence().findByC_T_PrevAndNext(
			evpDivisionId, companyId, type, orderByComparator);
	}

	/**
	 * Removes all the evp divisions where companyId = &#63; and type = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 */
	public static void removeByC_T(long companyId, int type) {
		getPersistence().removeByC_T(companyId, type);
	}

	/**
	 * Returns the number of evp divisions where companyId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @return the number of matching evp divisions
	 */
	public static int countByC_T(long companyId, int type) {
		return getPersistence().countByC_T(companyId, type);
	}

	/**
	 * Caches the evp division in the entity cache if it is enabled.
	 *
	 * @param evpDivision the evp division
	 */
	public static void cacheResult(EVPDivision evpDivision) {
		getPersistence().cacheResult(evpDivision);
	}

	/**
	 * Caches the evp divisions in the entity cache if it is enabled.
	 *
	 * @param evpDivisions the evp divisions
	 */
	public static void cacheResult(List<EVPDivision> evpDivisions) {
		getPersistence().cacheResult(evpDivisions);
	}

	/**
	 * Creates a new evp division with the primary key. Does not add the evp division to the database.
	 *
	 * @param evpDivisionId the primary key for the new evp division
	 * @return the new evp division
	 */
	public static EVPDivision create(long evpDivisionId) {
		return getPersistence().create(evpDivisionId);
	}

	/**
	 * Removes the evp division with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpDivisionId the primary key of the evp division
	 * @return the evp division that was removed
	 * @throws NoSuchDivisionException if a evp division with the primary key could not be found
	 */
	public static EVPDivision remove(long evpDivisionId)
		throws com.liferay.evp.exception.NoSuchDivisionException {

		return getPersistence().remove(evpDivisionId);
	}

	public static EVPDivision updateImpl(EVPDivision evpDivision) {
		return getPersistence().updateImpl(evpDivision);
	}

	/**
	 * Returns the evp division with the primary key or throws a <code>NoSuchDivisionException</code> if it could not be found.
	 *
	 * @param evpDivisionId the primary key of the evp division
	 * @return the evp division
	 * @throws NoSuchDivisionException if a evp division with the primary key could not be found
	 */
	public static EVPDivision findByPrimaryKey(long evpDivisionId)
		throws com.liferay.evp.exception.NoSuchDivisionException {

		return getPersistence().findByPrimaryKey(evpDivisionId);
	}

	/**
	 * Returns the evp division with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpDivisionId the primary key of the evp division
	 * @return the evp division, or <code>null</code> if a evp division with the primary key could not be found
	 */
	public static EVPDivision fetchByPrimaryKey(long evpDivisionId) {
		return getPersistence().fetchByPrimaryKey(evpDivisionId);
	}

	/**
	 * Returns all the evp divisions.
	 *
	 * @return the evp divisions
	 */
	public static List<EVPDivision> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<EVPDivision> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<EVPDivision> findAll(
		int start, int end, OrderByComparator<EVPDivision> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<EVPDivision> findAll(
		int start, int end, OrderByComparator<EVPDivision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the evp divisions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of evp divisions.
	 *
	 * @return the number of evp divisions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EVPDivisionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<EVPDivisionPersistence, EVPDivisionPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(EVPDivisionPersistence.class);

		ServiceTracker<EVPDivisionPersistence, EVPDivisionPersistence>
			serviceTracker =
				new ServiceTracker
					<EVPDivisionPersistence, EVPDivisionPersistence>(
						bundle.getBundleContext(), EVPDivisionPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}