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

package com.liferay.evp.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for EVPGrantTransaction. This utility wraps
 * <code>com.liferay.evp.service.impl.EVPGrantTransactionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Val Nagy
 * @see EVPGrantTransactionLocalService
 * @generated
 */
public class EVPGrantTransactionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.evp.service.impl.EVPGrantTransactionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the evp grant transaction to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPGrantTransactionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpGrantTransaction the evp grant transaction
	 * @return the evp grant transaction that was added
	 */
	public static com.liferay.evp.model.EVPGrantTransaction
		addEVPGrantTransaction(
			com.liferay.evp.model.EVPGrantTransaction evpGrantTransaction) {

		return getService().addEVPGrantTransaction(evpGrantTransaction);
	}

	public static com.liferay.evp.model.EVPGrantTransaction
			addEVPGrantTransaction(
				long companyId, long userId, java.util.Date createDate,
				long evpGrantRequestId, long fileEntryId, int grantType,
				double amount, String currencyCode, java.util.Date date,
				String note, String number, String bankBICCode,
				String bankIBANCode, String bankName, String purposeOfUse)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().addEVPGrantTransaction(
			companyId, userId, createDate, evpGrantRequestId, fileEntryId,
			grantType, amount, currencyCode, date, note, number, bankBICCode,
			bankIBANCode, bankName, purposeOfUse);
	}

	/**
	 * Creates a new evp grant transaction with the primary key. Does not add the evp grant transaction to the database.
	 *
	 * @param evpGrantTransactionId the primary key for the new evp grant transaction
	 * @return the new evp grant transaction
	 */
	public static com.liferay.evp.model.EVPGrantTransaction
		createEVPGrantTransaction(long evpGrantTransactionId) {

		return getService().createEVPGrantTransaction(evpGrantTransactionId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the evp grant transaction from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPGrantTransactionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpGrantTransaction the evp grant transaction
	 * @return the evp grant transaction that was removed
	 */
	public static com.liferay.evp.model.EVPGrantTransaction
		deleteEVPGrantTransaction(
			com.liferay.evp.model.EVPGrantTransaction evpGrantTransaction) {

		return getService().deleteEVPGrantTransaction(evpGrantTransaction);
	}

	/**
	 * Deletes the evp grant transaction with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPGrantTransactionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpGrantTransactionId the primary key of the evp grant transaction
	 * @return the evp grant transaction that was removed
	 * @throws PortalException if a evp grant transaction with the primary key could not be found
	 */
	public static com.liferay.evp.model.EVPGrantTransaction
			deleteEVPGrantTransaction(long evpGrantTransactionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteEVPGrantTransaction(evpGrantTransactionId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPGrantTransactionModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPGrantTransactionModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.evp.model.EVPGrantTransaction
		fetchEVPGrantTransaction(long evpGrantTransactionId) {

		return getService().fetchEVPGrantTransaction(evpGrantTransactionId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the evp grant transaction with the primary key.
	 *
	 * @param evpGrantTransactionId the primary key of the evp grant transaction
	 * @return the evp grant transaction
	 * @throws PortalException if a evp grant transaction with the primary key could not be found
	 */
	public static com.liferay.evp.model.EVPGrantTransaction
			getEVPGrantTransaction(long evpGrantTransactionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getEVPGrantTransaction(evpGrantTransactionId);
	}

	/**
	 * Returns a range of all the evp grant transactions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPGrantTransactionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp grant transactions
	 * @param end the upper bound of the range of evp grant transactions (not inclusive)
	 * @return the range of evp grant transactions
	 */
	public static java.util.List<com.liferay.evp.model.EVPGrantTransaction>
		getEVPGrantTransactions(int start, int end) {

		return getService().getEVPGrantTransactions(start, end);
	}

	/**
	 * Returns the number of evp grant transactions.
	 *
	 * @return the number of evp grant transactions
	 */
	public static int getEVPGrantTransactionsCount() {
		return getService().getEVPGrantTransactionsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the evp grant transaction in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPGrantTransactionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpGrantTransaction the evp grant transaction
	 * @return the evp grant transaction that was updated
	 */
	public static com.liferay.evp.model.EVPGrantTransaction
		updateEVPGrantTransaction(
			com.liferay.evp.model.EVPGrantTransaction evpGrantTransaction) {

		return getService().updateEVPGrantTransaction(evpGrantTransaction);
	}

	public static EVPGrantTransactionLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<EVPGrantTransactionLocalService, EVPGrantTransactionLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			EVPGrantTransactionLocalService.class);

		ServiceTracker
			<EVPGrantTransactionLocalService, EVPGrantTransactionLocalService>
				serviceTracker =
					new ServiceTracker
						<EVPGrantTransactionLocalService,
						 EVPGrantTransactionLocalService>(
							 bundle.getBundleContext(),
							 EVPGrantTransactionLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}