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

import com.liferay.evp.exception.NoSuchKaleoForkInstanceException;
import com.liferay.evp.model.EVPKaleoForkInstance;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the evp kaleo fork instance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @see EVPKaleoForkInstanceUtil
 * @generated
 */
@ProviderType
public interface EVPKaleoForkInstancePersistence
	extends BasePersistence<EVPKaleoForkInstance> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EVPKaleoForkInstanceUtil} to access the evp kaleo fork instance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the evp kaleo fork instance in the entity cache if it is enabled.
	 *
	 * @param evpKaleoForkInstance the evp kaleo fork instance
	 */
	public void cacheResult(EVPKaleoForkInstance evpKaleoForkInstance);

	/**
	 * Caches the evp kaleo fork instances in the entity cache if it is enabled.
	 *
	 * @param evpKaleoForkInstances the evp kaleo fork instances
	 */
	public void cacheResult(
		java.util.List<EVPKaleoForkInstance> evpKaleoForkInstances);

	/**
	 * Creates a new evp kaleo fork instance with the primary key. Does not add the evp kaleo fork instance to the database.
	 *
	 * @param evpKaleoForkInstanceId the primary key for the new evp kaleo fork instance
	 * @return the new evp kaleo fork instance
	 */
	public EVPKaleoForkInstance create(long evpKaleoForkInstanceId);

	/**
	 * Removes the evp kaleo fork instance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpKaleoForkInstanceId the primary key of the evp kaleo fork instance
	 * @return the evp kaleo fork instance that was removed
	 * @throws NoSuchKaleoForkInstanceException if a evp kaleo fork instance with the primary key could not be found
	 */
	public EVPKaleoForkInstance remove(long evpKaleoForkInstanceId)
		throws NoSuchKaleoForkInstanceException;

	public EVPKaleoForkInstance updateImpl(
		EVPKaleoForkInstance evpKaleoForkInstance);

	/**
	 * Returns the evp kaleo fork instance with the primary key or throws a <code>NoSuchKaleoForkInstanceException</code> if it could not be found.
	 *
	 * @param evpKaleoForkInstanceId the primary key of the evp kaleo fork instance
	 * @return the evp kaleo fork instance
	 * @throws NoSuchKaleoForkInstanceException if a evp kaleo fork instance with the primary key could not be found
	 */
	public EVPKaleoForkInstance findByPrimaryKey(long evpKaleoForkInstanceId)
		throws NoSuchKaleoForkInstanceException;

	/**
	 * Returns the evp kaleo fork instance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpKaleoForkInstanceId the primary key of the evp kaleo fork instance
	 * @return the evp kaleo fork instance, or <code>null</code> if a evp kaleo fork instance with the primary key could not be found
	 */
	public EVPKaleoForkInstance fetchByPrimaryKey(long evpKaleoForkInstanceId);

	/**
	 * Returns all the evp kaleo fork instances.
	 *
	 * @return the evp kaleo fork instances
	 */
	public java.util.List<EVPKaleoForkInstance> findAll();

	/**
	 * Returns a range of all the evp kaleo fork instances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPKaleoForkInstanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp kaleo fork instances
	 * @param end the upper bound of the range of evp kaleo fork instances (not inclusive)
	 * @return the range of evp kaleo fork instances
	 */
	public java.util.List<EVPKaleoForkInstance> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the evp kaleo fork instances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPKaleoForkInstanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp kaleo fork instances
	 * @param end the upper bound of the range of evp kaleo fork instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of evp kaleo fork instances
	 */
	public java.util.List<EVPKaleoForkInstance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPKaleoForkInstance>
			orderByComparator);

	/**
	 * Returns an ordered range of all the evp kaleo fork instances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPKaleoForkInstanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp kaleo fork instances
	 * @param end the upper bound of the range of evp kaleo fork instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of evp kaleo fork instances
	 */
	public java.util.List<EVPKaleoForkInstance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EVPKaleoForkInstance>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the evp kaleo fork instances from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of evp kaleo fork instances.
	 *
	 * @return the number of evp kaleo fork instances
	 */
	public int countAll();

}