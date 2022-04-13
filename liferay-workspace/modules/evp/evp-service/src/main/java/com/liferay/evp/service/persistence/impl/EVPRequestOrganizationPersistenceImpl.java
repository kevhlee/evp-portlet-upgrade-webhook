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

package com.liferay.evp.service.persistence.impl;

import com.liferay.evp.exception.NoSuchRequestOrganizationException;
import com.liferay.evp.model.EVPRequestOrganization;
import com.liferay.evp.model.impl.EVPRequestOrganizationImpl;
import com.liferay.evp.model.impl.EVPRequestOrganizationModelImpl;
import com.liferay.evp.service.persistence.EVPRequestOrganizationPersistence;
import com.liferay.evp.service.persistence.impl.constants.EVPPersistenceConstants;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the evp request organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @generated
 */
@Component(service = EVPRequestOrganizationPersistence.class)
public class EVPRequestOrganizationPersistenceImpl
	extends BasePersistenceImpl<EVPRequestOrganization>
	implements EVPRequestOrganizationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>EVPRequestOrganizationUtil</code> to access the evp request organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		EVPRequestOrganizationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByCompanyId;
	private FinderPath _finderPathWithoutPaginationFindByCompanyId;
	private FinderPath _finderPathCountByCompanyId;

	/**
	 * Returns all the evp request organizations where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching evp request organizations
	 */
	@Override
	public List<EVPRequestOrganization> findByCompanyId(long companyId) {
		return findByCompanyId(
			companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<EVPRequestOrganization> findByCompanyId(
		long companyId, int start, int end) {

		return findByCompanyId(companyId, start, end, null);
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
	@Override
	public List<EVPRequestOrganization> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<EVPRequestOrganization> orderByComparator) {

		return findByCompanyId(companyId, start, end, orderByComparator, true);
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
	@Override
	public List<EVPRequestOrganization> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<EVPRequestOrganization> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByCompanyId;
				finderArgs = new Object[] {companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByCompanyId;
			finderArgs = new Object[] {
				companyId, start, end, orderByComparator
			};
		}

		List<EVPRequestOrganization> list = null;

		if (useFinderCache) {
			list = (List<EVPRequestOrganization>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EVPRequestOrganization evpRequestOrganization : list) {
					if (companyId != evpRequestOrganization.getCompanyId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_EVPREQUESTORGANIZATION_WHERE);

			sb.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EVPRequestOrganizationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyId);

				list = (List<EVPRequestOrganization>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first evp request organization in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp request organization
	 * @throws NoSuchRequestOrganizationException if a matching evp request organization could not be found
	 */
	@Override
	public EVPRequestOrganization findByCompanyId_First(
			long companyId,
			OrderByComparator<EVPRequestOrganization> orderByComparator)
		throws NoSuchRequestOrganizationException {

		EVPRequestOrganization evpRequestOrganization = fetchByCompanyId_First(
			companyId, orderByComparator);

		if (evpRequestOrganization != null) {
			return evpRequestOrganization;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchRequestOrganizationException(sb.toString());
	}

	/**
	 * Returns the first evp request organization in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp request organization, or <code>null</code> if a matching evp request organization could not be found
	 */
	@Override
	public EVPRequestOrganization fetchByCompanyId_First(
		long companyId,
		OrderByComparator<EVPRequestOrganization> orderByComparator) {

		List<EVPRequestOrganization> list = findByCompanyId(
			companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last evp request organization in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp request organization
	 * @throws NoSuchRequestOrganizationException if a matching evp request organization could not be found
	 */
	@Override
	public EVPRequestOrganization findByCompanyId_Last(
			long companyId,
			OrderByComparator<EVPRequestOrganization> orderByComparator)
		throws NoSuchRequestOrganizationException {

		EVPRequestOrganization evpRequestOrganization = fetchByCompanyId_Last(
			companyId, orderByComparator);

		if (evpRequestOrganization != null) {
			return evpRequestOrganization;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchRequestOrganizationException(sb.toString());
	}

	/**
	 * Returns the last evp request organization in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp request organization, or <code>null</code> if a matching evp request organization could not be found
	 */
	@Override
	public EVPRequestOrganization fetchByCompanyId_Last(
		long companyId,
		OrderByComparator<EVPRequestOrganization> orderByComparator) {

		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<EVPRequestOrganization> list = findByCompanyId(
			companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public EVPRequestOrganization[] findByCompanyId_PrevAndNext(
			long evpRequestOrganizationId, long companyId,
			OrderByComparator<EVPRequestOrganization> orderByComparator)
		throws NoSuchRequestOrganizationException {

		EVPRequestOrganization evpRequestOrganization = findByPrimaryKey(
			evpRequestOrganizationId);

		Session session = null;

		try {
			session = openSession();

			EVPRequestOrganization[] array = new EVPRequestOrganizationImpl[3];

			array[0] = getByCompanyId_PrevAndNext(
				session, evpRequestOrganization, companyId, orderByComparator,
				true);

			array[1] = evpRequestOrganization;

			array[2] = getByCompanyId_PrevAndNext(
				session, evpRequestOrganization, companyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected EVPRequestOrganization getByCompanyId_PrevAndNext(
		Session session, EVPRequestOrganization evpRequestOrganization,
		long companyId,
		OrderByComparator<EVPRequestOrganization> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_EVPREQUESTORGANIZATION_WHERE);

		sb.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(EVPRequestOrganizationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						evpRequestOrganization)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EVPRequestOrganization> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the evp request organizations where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	@Override
	public void removeByCompanyId(long companyId) {
		for (EVPRequestOrganization evpRequestOrganization :
				findByCompanyId(
					companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(evpRequestOrganization);
		}
	}

	/**
	 * Returns the number of evp request organizations where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching evp request organizations
	 */
	@Override
	public int countByCompanyId(long companyId) {
		FinderPath finderPath = _finderPathCountByCompanyId;

		Object[] finderArgs = new Object[] {companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EVPREQUESTORGANIZATION_WHERE);

			sb.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 =
		"evpRequestOrganization.companyId = ?";

	public EVPRequestOrganizationPersistenceImpl() {
		setModelClass(EVPRequestOrganization.class);

		setModelImplClass(EVPRequestOrganizationImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the evp request organization in the entity cache if it is enabled.
	 *
	 * @param evpRequestOrganization the evp request organization
	 */
	@Override
	public void cacheResult(EVPRequestOrganization evpRequestOrganization) {
		entityCache.putResult(
			EVPRequestOrganizationImpl.class,
			evpRequestOrganization.getPrimaryKey(), evpRequestOrganization);
	}

	/**
	 * Caches the evp request organizations in the entity cache if it is enabled.
	 *
	 * @param evpRequestOrganizations the evp request organizations
	 */
	@Override
	public void cacheResult(
		List<EVPRequestOrganization> evpRequestOrganizations) {

		for (EVPRequestOrganization evpRequestOrganization :
				evpRequestOrganizations) {

			if (entityCache.getResult(
					EVPRequestOrganizationImpl.class,
					evpRequestOrganization.getPrimaryKey()) == null) {

				cacheResult(evpRequestOrganization);
			}
		}
	}

	/**
	 * Clears the cache for all evp request organizations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EVPRequestOrganizationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the evp request organization.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EVPRequestOrganization evpRequestOrganization) {
		entityCache.removeResult(
			EVPRequestOrganizationImpl.class, evpRequestOrganization);
	}

	@Override
	public void clearCache(
		List<EVPRequestOrganization> evpRequestOrganizations) {

		for (EVPRequestOrganization evpRequestOrganization :
				evpRequestOrganizations) {

			entityCache.removeResult(
				EVPRequestOrganizationImpl.class, evpRequestOrganization);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				EVPRequestOrganizationImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new evp request organization with the primary key. Does not add the evp request organization to the database.
	 *
	 * @param evpRequestOrganizationId the primary key for the new evp request organization
	 * @return the new evp request organization
	 */
	@Override
	public EVPRequestOrganization create(long evpRequestOrganizationId) {
		EVPRequestOrganization evpRequestOrganization =
			new EVPRequestOrganizationImpl();

		evpRequestOrganization.setNew(true);
		evpRequestOrganization.setPrimaryKey(evpRequestOrganizationId);

		evpRequestOrganization.setCompanyId(CompanyThreadLocal.getCompanyId());

		return evpRequestOrganization;
	}

	/**
	 * Removes the evp request organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpRequestOrganizationId the primary key of the evp request organization
	 * @return the evp request organization that was removed
	 * @throws NoSuchRequestOrganizationException if a evp request organization with the primary key could not be found
	 */
	@Override
	public EVPRequestOrganization remove(long evpRequestOrganizationId)
		throws NoSuchRequestOrganizationException {

		return remove((Serializable)evpRequestOrganizationId);
	}

	/**
	 * Removes the evp request organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the evp request organization
	 * @return the evp request organization that was removed
	 * @throws NoSuchRequestOrganizationException if a evp request organization with the primary key could not be found
	 */
	@Override
	public EVPRequestOrganization remove(Serializable primaryKey)
		throws NoSuchRequestOrganizationException {

		Session session = null;

		try {
			session = openSession();

			EVPRequestOrganization evpRequestOrganization =
				(EVPRequestOrganization)session.get(
					EVPRequestOrganizationImpl.class, primaryKey);

			if (evpRequestOrganization == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRequestOrganizationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(evpRequestOrganization);
		}
		catch (NoSuchRequestOrganizationException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected EVPRequestOrganization removeImpl(
		EVPRequestOrganization evpRequestOrganization) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(evpRequestOrganization)) {
				evpRequestOrganization = (EVPRequestOrganization)session.get(
					EVPRequestOrganizationImpl.class,
					evpRequestOrganization.getPrimaryKeyObj());
			}

			if (evpRequestOrganization != null) {
				session.delete(evpRequestOrganization);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (evpRequestOrganization != null) {
			clearCache(evpRequestOrganization);
		}

		return evpRequestOrganization;
	}

	@Override
	public EVPRequestOrganization updateImpl(
		EVPRequestOrganization evpRequestOrganization) {

		boolean isNew = evpRequestOrganization.isNew();

		if (!(evpRequestOrganization instanceof
				EVPRequestOrganizationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(evpRequestOrganization.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					evpRequestOrganization);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in evpRequestOrganization proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom EVPRequestOrganization implementation " +
					evpRequestOrganization.getClass());
		}

		EVPRequestOrganizationModelImpl evpRequestOrganizationModelImpl =
			(EVPRequestOrganizationModelImpl)evpRequestOrganization;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (evpRequestOrganization.getCreateDate() == null)) {
			if (serviceContext == null) {
				evpRequestOrganization.setCreateDate(date);
			}
			else {
				evpRequestOrganization.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!evpRequestOrganizationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				evpRequestOrganization.setModifiedDate(date);
			}
			else {
				evpRequestOrganization.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(evpRequestOrganization);
			}
			else {
				evpRequestOrganization = (EVPRequestOrganization)session.merge(
					evpRequestOrganization);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			EVPRequestOrganizationImpl.class, evpRequestOrganizationModelImpl,
			false, true);

		if (isNew) {
			evpRequestOrganization.setNew(false);
		}

		evpRequestOrganization.resetOriginalValues();

		return evpRequestOrganization;
	}

	/**
	 * Returns the evp request organization with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the evp request organization
	 * @return the evp request organization
	 * @throws NoSuchRequestOrganizationException if a evp request organization with the primary key could not be found
	 */
	@Override
	public EVPRequestOrganization findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRequestOrganizationException {

		EVPRequestOrganization evpRequestOrganization = fetchByPrimaryKey(
			primaryKey);

		if (evpRequestOrganization == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRequestOrganizationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return evpRequestOrganization;
	}

	/**
	 * Returns the evp request organization with the primary key or throws a <code>NoSuchRequestOrganizationException</code> if it could not be found.
	 *
	 * @param evpRequestOrganizationId the primary key of the evp request organization
	 * @return the evp request organization
	 * @throws NoSuchRequestOrganizationException if a evp request organization with the primary key could not be found
	 */
	@Override
	public EVPRequestOrganization findByPrimaryKey(
			long evpRequestOrganizationId)
		throws NoSuchRequestOrganizationException {

		return findByPrimaryKey((Serializable)evpRequestOrganizationId);
	}

	/**
	 * Returns the evp request organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpRequestOrganizationId the primary key of the evp request organization
	 * @return the evp request organization, or <code>null</code> if a evp request organization with the primary key could not be found
	 */
	@Override
	public EVPRequestOrganization fetchByPrimaryKey(
		long evpRequestOrganizationId) {

		return fetchByPrimaryKey((Serializable)evpRequestOrganizationId);
	}

	/**
	 * Returns all the evp request organizations.
	 *
	 * @return the evp request organizations
	 */
	@Override
	public List<EVPRequestOrganization> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<EVPRequestOrganization> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<EVPRequestOrganization> findAll(
		int start, int end,
		OrderByComparator<EVPRequestOrganization> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<EVPRequestOrganization> findAll(
		int start, int end,
		OrderByComparator<EVPRequestOrganization> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<EVPRequestOrganization> list = null;

		if (useFinderCache) {
			list = (List<EVPRequestOrganization>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EVPREQUESTORGANIZATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EVPREQUESTORGANIZATION;

				sql = sql.concat(EVPRequestOrganizationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<EVPRequestOrganization>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the evp request organizations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EVPRequestOrganization evpRequestOrganization : findAll()) {
			remove(evpRequestOrganization);
		}
	}

	/**
	 * Returns the number of evp request organizations.
	 *
	 * @return the number of evp request organizations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_EVPREQUESTORGANIZATION);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "evpRequestOrganizationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EVPREQUESTORGANIZATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EVPRequestOrganizationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the evp request organization persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new EVPRequestOrganizationModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", EVPRequestOrganization.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByCompanyId = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"companyId"}, true);

		_finderPathWithoutPaginationFindByCompanyId = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] {Long.class.getName()}, new String[] {"companyId"},
			true);

		_finderPathCountByCompanyId = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] {Long.class.getName()}, new String[] {"companyId"},
			false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(EVPRequestOrganizationImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	@Override
	@Reference(
		target = EVPPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = EVPPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = EVPPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_EVPREQUESTORGANIZATION =
		"SELECT evpRequestOrganization FROM EVPRequestOrganization evpRequestOrganization";

	private static final String _SQL_SELECT_EVPREQUESTORGANIZATION_WHERE =
		"SELECT evpRequestOrganization FROM EVPRequestOrganization evpRequestOrganization WHERE ";

	private static final String _SQL_COUNT_EVPREQUESTORGANIZATION =
		"SELECT COUNT(evpRequestOrganization) FROM EVPRequestOrganization evpRequestOrganization";

	private static final String _SQL_COUNT_EVPREQUESTORGANIZATION_WHERE =
		"SELECT COUNT(evpRequestOrganization) FROM EVPRequestOrganization evpRequestOrganization WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"evpRequestOrganization.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No EVPRequestOrganization exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No EVPRequestOrganization exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		EVPRequestOrganizationPersistenceImpl.class);

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();
	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class EVPRequestOrganizationModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			EVPRequestOrganizationModelImpl evpRequestOrganizationModelImpl =
				(EVPRequestOrganizationModelImpl)baseModel;

			long columnBitmask =
				evpRequestOrganizationModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					evpRequestOrganizationModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						evpRequestOrganizationModelImpl.getColumnBitmask(
							columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					evpRequestOrganizationModelImpl, columnNames, original);
			}

			return null;
		}

		private static Object[] _getValue(
			EVPRequestOrganizationModelImpl evpRequestOrganizationModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						evpRequestOrganizationModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] =
						evpRequestOrganizationModelImpl.getColumnValue(
							columnName);
				}
			}

			return arguments;
		}

		private static final Map<FinderPath, Long>
			_finderPathColumnBitmasksCache = new ConcurrentHashMap<>();

	}

}