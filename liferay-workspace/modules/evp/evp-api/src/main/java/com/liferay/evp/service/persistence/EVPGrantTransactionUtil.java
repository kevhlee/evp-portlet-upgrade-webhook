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

import com.liferay.evp.model.EVPGrantTransaction;
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
 * The persistence utility for the evp grant transaction service. This utility wraps <code>com.liferay.evp.service.persistence.impl.EVPGrantTransactionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @see EVPGrantTransactionPersistence
 * @generated
 */
public class EVPGrantTransactionUtil {

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
	public static void clearCache(EVPGrantTransaction evpGrantTransaction) {
		getPersistence().clearCache(evpGrantTransaction);
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
	public static Map<Serializable, EVPGrantTransaction> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EVPGrantTransaction> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EVPGrantTransaction> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EVPGrantTransaction> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EVPGrantTransaction> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EVPGrantTransaction update(
		EVPGrantTransaction evpGrantTransaction) {

		return getPersistence().update(evpGrantTransaction);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EVPGrantTransaction update(
		EVPGrantTransaction evpGrantTransaction,
		ServiceContext serviceContext) {

		return getPersistence().update(evpGrantTransaction, serviceContext);
	}

	/**
	 * Caches the evp grant transaction in the entity cache if it is enabled.
	 *
	 * @param evpGrantTransaction the evp grant transaction
	 */
	public static void cacheResult(EVPGrantTransaction evpGrantTransaction) {
		getPersistence().cacheResult(evpGrantTransaction);
	}

	/**
	 * Caches the evp grant transactions in the entity cache if it is enabled.
	 *
	 * @param evpGrantTransactions the evp grant transactions
	 */
	public static void cacheResult(
		List<EVPGrantTransaction> evpGrantTransactions) {

		getPersistence().cacheResult(evpGrantTransactions);
	}

	/**
	 * Creates a new evp grant transaction with the primary key. Does not add the evp grant transaction to the database.
	 *
	 * @param evpGrantTransactionId the primary key for the new evp grant transaction
	 * @return the new evp grant transaction
	 */
	public static EVPGrantTransaction create(long evpGrantTransactionId) {
		return getPersistence().create(evpGrantTransactionId);
	}

	/**
	 * Removes the evp grant transaction with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpGrantTransactionId the primary key of the evp grant transaction
	 * @return the evp grant transaction that was removed
	 * @throws NoSuchGrantTransactionException if a evp grant transaction with the primary key could not be found
	 */
	public static EVPGrantTransaction remove(long evpGrantTransactionId)
		throws com.liferay.evp.exception.NoSuchGrantTransactionException {

		return getPersistence().remove(evpGrantTransactionId);
	}

	public static EVPGrantTransaction updateImpl(
		EVPGrantTransaction evpGrantTransaction) {

		return getPersistence().updateImpl(evpGrantTransaction);
	}

	/**
	 * Returns the evp grant transaction with the primary key or throws a <code>NoSuchGrantTransactionException</code> if it could not be found.
	 *
	 * @param evpGrantTransactionId the primary key of the evp grant transaction
	 * @return the evp grant transaction
	 * @throws NoSuchGrantTransactionException if a evp grant transaction with the primary key could not be found
	 */
	public static EVPGrantTransaction findByPrimaryKey(
			long evpGrantTransactionId)
		throws com.liferay.evp.exception.NoSuchGrantTransactionException {

		return getPersistence().findByPrimaryKey(evpGrantTransactionId);
	}

	/**
	 * Returns the evp grant transaction with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpGrantTransactionId the primary key of the evp grant transaction
	 * @return the evp grant transaction, or <code>null</code> if a evp grant transaction with the primary key could not be found
	 */
	public static EVPGrantTransaction fetchByPrimaryKey(
		long evpGrantTransactionId) {

		return getPersistence().fetchByPrimaryKey(evpGrantTransactionId);
	}

	/**
	 * Returns all the evp grant transactions.
	 *
	 * @return the evp grant transactions
	 */
	public static List<EVPGrantTransaction> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the evp grant transactions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantTransactionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp grant transactions
	 * @param end the upper bound of the range of evp grant transactions (not inclusive)
	 * @return the range of evp grant transactions
	 */
	public static List<EVPGrantTransaction> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the evp grant transactions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantTransactionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp grant transactions
	 * @param end the upper bound of the range of evp grant transactions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of evp grant transactions
	 */
	public static List<EVPGrantTransaction> findAll(
		int start, int end,
		OrderByComparator<EVPGrantTransaction> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the evp grant transactions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantTransactionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp grant transactions
	 * @param end the upper bound of the range of evp grant transactions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of evp grant transactions
	 */
	public static List<EVPGrantTransaction> findAll(
		int start, int end,
		OrderByComparator<EVPGrantTransaction> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the evp grant transactions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of evp grant transactions.
	 *
	 * @return the number of evp grant transactions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EVPGrantTransactionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<EVPGrantTransactionPersistence, EVPGrantTransactionPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			EVPGrantTransactionPersistence.class);

		ServiceTracker
			<EVPGrantTransactionPersistence, EVPGrantTransactionPersistence>
				serviceTracker =
					new ServiceTracker
						<EVPGrantTransactionPersistence,
						 EVPGrantTransactionPersistence>(
							 bundle.getBundleContext(),
							 EVPGrantTransactionPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}