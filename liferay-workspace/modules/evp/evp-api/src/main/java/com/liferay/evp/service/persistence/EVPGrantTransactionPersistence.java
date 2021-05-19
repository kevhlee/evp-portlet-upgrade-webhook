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

import com.liferay.evp.exception.NoSuchGrantTransactionException;
import com.liferay.evp.model.EVPGrantTransaction;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the evp grant transaction service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @see EVPGrantTransactionUtil
 * @generated
 */
@ProviderType
public interface EVPGrantTransactionPersistence
	extends BasePersistence<EVPGrantTransaction> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EVPGrantTransactionUtil} to access the evp grant transaction persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the evp grant transaction in the entity cache if it is enabled.
	 *
	 * @param evpGrantTransaction the evp grant transaction
	 */
	public void cacheResult(EVPGrantTransaction evpGrantTransaction);

	/**
	 * Caches the evp grant transactions in the entity cache if it is enabled.
	 *
	 * @param evpGrantTransactions the evp grant transactions
	 */
	public void cacheResult(
		java.util.List<EVPGrantTransaction> evpGrantTransactions);

	/**
	 * Creates a new evp grant transaction with the primary key. Does not add the evp grant transaction to the database.
	 *
	 * @param evpGrantTransactionId the primary key for the new evp grant transaction
	 * @return the new evp grant transaction
	 */
	public EVPGrantTransaction create(long evpGrantTransactionId);

	/**
	 * Removes the evp grant transaction with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpGrantTransactionId the primary key of the evp grant transaction
	 * @return the evp grant transaction that was removed
	 * @throws NoSuchGrantTransactionException if a evp grant transaction with the primary key could not be found
	 */
	public EVPGrantTransaction remove(long evpGrantTransactionId)
		throws NoSuchGrantTransactionException;

	public EVPGrantTransaction updateImpl(
		EVPGrantTransaction evpGrantTransaction);

	/**
	 * Returns the evp grant transaction with the primary key or throws a <code>NoSuchGrantTransactionException</code> if it could not be found.
	 *
	 * @param evpGrantTransactionId the primary key of the evp grant transaction
	 * @return the evp grant transaction
	 * @throws NoSuchGrantTransactionException if a evp grant transaction with the primary key could not be found
	 */
	public EVPGrantTransaction findByPrimaryKey(long evpGrantTransactionId)
		throws NoSuchGrantTransactionException;

	/**
	 * Returns the evp grant transaction with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpGrantTransactionId the primary key of the evp grant transaction
	 * @return the evp grant transaction, or <code>null</code> if a evp grant transaction with the primary key could not be found
	 */
	public EVPGrantTransaction fetchByPrimaryKey(long evpGrantTransactionId);

	/**
	 * Returns all the evp grant transactions.
	 *
	 * @return the evp grant transactions
	 */
	public java.util.List<EVPGrantTransaction> findAll();

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
	public java.util.List<EVPGrantTransaction> findAll(int start, int end);

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
	public java.util.List<EVPGrantTransaction> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPGrantTransaction>
			orderByComparator);

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
	public java.util.List<EVPGrantTransaction> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPGrantTransaction>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the evp grant transactions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of evp grant transactions.
	 *
	 * @return the number of evp grant transactions
	 */
	public int countAll();

}