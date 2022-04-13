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

import com.liferay.evp.model.EVPDivision;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

/**
 * Provides the local service utility for EVPDivision. This utility wraps
 * <code>com.liferay.evp.service.impl.EVPDivisionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Val Nagy
 * @see EVPDivisionLocalService
 * @generated
 */
public class EVPDivisionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.evp.service.impl.EVPDivisionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the evp division to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPDivisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpDivision the evp division
	 * @return the evp division that was added
	 */
	public static EVPDivision addEVPDivision(EVPDivision evpDivision) {
		return getService().addEVPDivision(evpDivision);
	}

	/**
	 * Creates a new evp division with the primary key. Does not add the evp division to the database.
	 *
	 * @param evpDivisionId the primary key for the new evp division
	 * @return the new evp division
	 */
	public static EVPDivision createEVPDivision(long evpDivisionId) {
		return getService().createEVPDivision(evpDivisionId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the evp division from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPDivisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpDivision the evp division
	 * @return the evp division that was removed
	 */
	public static EVPDivision deleteEVPDivision(EVPDivision evpDivision) {
		return getService().deleteEVPDivision(evpDivision);
	}

	/**
	 * Deletes the evp division with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPDivisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpDivisionId the primary key of the evp division
	 * @return the evp division that was removed
	 * @throws PortalException if a evp division with the primary key could not be found
	 */
	public static EVPDivision deleteEVPDivision(long evpDivisionId)
		throws PortalException {

		return getService().deleteEVPDivision(evpDivisionId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
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
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static EVPDivision fetchEVPDivision(long evpDivisionId) {
		return getService().fetchEVPDivision(evpDivisionId);
	}

	public static String fetchSubsidiaryPortletPropsValue(
			long companyId, long groupId, String portletPropsKey)
		throws SystemException {

		return getService().fetchSubsidiaryPortletPropsValue(
			companyId, groupId, portletPropsKey);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the evp division with the primary key.
	 *
	 * @param evpDivisionId the primary key of the evp division
	 * @return the evp division
	 * @throws PortalException if a evp division with the primary key could not be found
	 */
	public static EVPDivision getEVPDivision(long evpDivisionId)
		throws PortalException {

		return getService().getEVPDivision(evpDivisionId);
	}

	/**
	 * Returns a range of all the evp divisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp divisions
	 * @param end the upper bound of the range of evp divisions (not inclusive)
	 * @return the range of evp divisions
	 */
	public static List<EVPDivision> getEVPDivisions(int start, int end) {
		return getService().getEVPDivisions(start, end);
	}

	/**
	 * Returns the number of evp divisions.
	 *
	 * @return the number of evp divisions
	 */
	public static int getEVPDivisionsCount() {
		return getService().getEVPDivisionsCount();
	}

	public static Map<String, Object> getEVPStats(long companyId, long userId)
		throws PortalException, SystemException {

		return getService().getEVPStats(companyId, userId);
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
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static EVPDivision getSubsidiaryEVPDivision(long userId)
		throws PortalException, SystemException {

		return getService().getSubsidiaryEVPDivision(userId);
	}

	public static String getSubsidiaryPortletPropsValue(
			long companyId, long subsidiaryGroupId, String portletPropsKey)
		throws SystemException {

		return getService().getSubsidiaryPortletPropsValue(
			companyId, subsidiaryGroupId, portletPropsKey);
	}

	public static Map<String, Object> getSubsidiaryPortletPropsValues(
			long companyId, long groupId)
		throws SystemException {

		return getService().getSubsidiaryPortletPropsValues(companyId, groupId);
	}

	/**
	 * Updates the evp division in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPDivisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpDivision the evp division
	 * @return the evp division that was updated
	 */
	public static EVPDivision updateEVPDivision(EVPDivision evpDivision) {
		return getService().updateEVPDivision(evpDivision);
	}

	public static EVPDivisionLocalService getService() {
		return _service;
	}

	private static volatile EVPDivisionLocalService _service;

}