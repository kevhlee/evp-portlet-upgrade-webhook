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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EVPDivisionLocalService}.
 *
 * @author Val Nagy
 * @see EVPDivisionLocalService
 * @generated
 */
public class EVPDivisionLocalServiceWrapper
	implements EVPDivisionLocalService,
			   ServiceWrapper<EVPDivisionLocalService> {

	public EVPDivisionLocalServiceWrapper(
		EVPDivisionLocalService evpDivisionLocalService) {

		_evpDivisionLocalService = evpDivisionLocalService;
	}

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
	@Override
	public com.liferay.evp.model.EVPDivision addEVPDivision(
		com.liferay.evp.model.EVPDivision evpDivision) {

		return _evpDivisionLocalService.addEVPDivision(evpDivision);
	}

	/**
	 * Creates a new evp division with the primary key. Does not add the evp division to the database.
	 *
	 * @param evpDivisionId the primary key for the new evp division
	 * @return the new evp division
	 */
	@Override
	public com.liferay.evp.model.EVPDivision createEVPDivision(
		long evpDivisionId) {

		return _evpDivisionLocalService.createEVPDivision(evpDivisionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpDivisionLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public com.liferay.evp.model.EVPDivision deleteEVPDivision(
		com.liferay.evp.model.EVPDivision evpDivision) {

		return _evpDivisionLocalService.deleteEVPDivision(evpDivision);
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
	@Override
	public com.liferay.evp.model.EVPDivision deleteEVPDivision(
			long evpDivisionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpDivisionLocalService.deleteEVPDivision(evpDivisionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpDivisionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _evpDivisionLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _evpDivisionLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _evpDivisionLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _evpDivisionLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _evpDivisionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _evpDivisionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.evp.model.EVPDivision fetchEVPDivision(
		long evpDivisionId) {

		return _evpDivisionLocalService.fetchEVPDivision(evpDivisionId);
	}

	@Override
	public String fetchSubsidiaryPortletPropsValue(
			long companyId, long groupId, String portletPropsKey)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _evpDivisionLocalService.fetchSubsidiaryPortletPropsValue(
			companyId, groupId, portletPropsKey);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _evpDivisionLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the evp division with the primary key.
	 *
	 * @param evpDivisionId the primary key of the evp division
	 * @return the evp division
	 * @throws PortalException if a evp division with the primary key could not be found
	 */
	@Override
	public com.liferay.evp.model.EVPDivision getEVPDivision(long evpDivisionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpDivisionLocalService.getEVPDivision(evpDivisionId);
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
	@Override
	public java.util.List<com.liferay.evp.model.EVPDivision> getEVPDivisions(
		int start, int end) {

		return _evpDivisionLocalService.getEVPDivisions(start, end);
	}

	/**
	 * Returns the number of evp divisions.
	 *
	 * @return the number of evp divisions
	 */
	@Override
	public int getEVPDivisionsCount() {
		return _evpDivisionLocalService.getEVPDivisionsCount();
	}

	@Override
	public java.util.Map<String, Object> getEVPStats(
			long companyId, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _evpDivisionLocalService.getEVPStats(companyId, userId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _evpDivisionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _evpDivisionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evpDivisionLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.liferay.evp.model.EVPDivision getSubsidiaryEVPDivision(
			long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _evpDivisionLocalService.getSubsidiaryEVPDivision(userId);
	}

	@Override
	public String getSubsidiaryPortletPropsValue(
			long companyId, long subsidiaryGroupId, String portletPropsKey)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _evpDivisionLocalService.getSubsidiaryPortletPropsValue(
			companyId, subsidiaryGroupId, portletPropsKey);
	}

	@Override
	public java.util.Map<String, Object> getSubsidiaryPortletPropsValues(
			long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _evpDivisionLocalService.getSubsidiaryPortletPropsValues(
			companyId, groupId);
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
	@Override
	public com.liferay.evp.model.EVPDivision updateEVPDivision(
		com.liferay.evp.model.EVPDivision evpDivision) {

		return _evpDivisionLocalService.updateEVPDivision(evpDivision);
	}

	@Override
	public EVPDivisionLocalService getWrappedService() {
		return _evpDivisionLocalService;
	}

	@Override
	public void setWrappedService(
		EVPDivisionLocalService evpDivisionLocalService) {

		_evpDivisionLocalService = evpDivisionLocalService;
	}

	private EVPDivisionLocalService _evpDivisionLocalService;

}