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

import com.liferay.evp.exception.NoSuchDivisionException;
import com.liferay.evp.model.EVPDivision;
import com.liferay.evp.model.impl.EVPDivisionImpl;
import com.liferay.evp.model.impl.EVPDivisionModelImpl;
import com.liferay.evp.service.persistence.EVPDivisionPersistence;
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
import com.liferay.portal.kernel.util.SetUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
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
 * The persistence implementation for the evp division service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @generated
 */
@Component(service = EVPDivisionPersistence.class)
public class EVPDivisionPersistenceImpl
	extends BasePersistenceImpl<EVPDivision> implements EVPDivisionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>EVPDivisionUtil</code> to access the evp division persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		EVPDivisionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByC_T;
	private FinderPath _finderPathWithoutPaginationFindByC_T;
	private FinderPath _finderPathCountByC_T;

	/**
	 * Returns all the evp divisions where companyId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @return the matching evp divisions
	 */
	@Override
	public List<EVPDivision> findByC_T(long companyId, int type) {
		return findByC_T(
			companyId, type, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<EVPDivision> findByC_T(
		long companyId, int type, int start, int end) {

		return findByC_T(companyId, type, start, end, null);
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
	@Override
	public List<EVPDivision> findByC_T(
		long companyId, int type, int start, int end,
		OrderByComparator<EVPDivision> orderByComparator) {

		return findByC_T(companyId, type, start, end, orderByComparator, true);
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
	@Override
	public List<EVPDivision> findByC_T(
		long companyId, int type, int start, int end,
		OrderByComparator<EVPDivision> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByC_T;
				finderArgs = new Object[] {companyId, type};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByC_T;
			finderArgs = new Object[] {
				companyId, type, start, end, orderByComparator
			};
		}

		List<EVPDivision> list = null;

		if (useFinderCache) {
			list = (List<EVPDivision>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EVPDivision evpDivision : list) {
					if ((companyId != evpDivision.getCompanyId()) ||
						(type != evpDivision.getType())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_EVPDIVISION_WHERE);

			sb.append(_FINDER_COLUMN_C_T_COMPANYID_2);

			sb.append(_FINDER_COLUMN_C_T_TYPE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EVPDivisionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyId);

				queryPos.add(type);

				list = (List<EVPDivision>)QueryUtil.list(
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
	 * Returns the first evp division in the ordered set where companyId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp division
	 * @throws NoSuchDivisionException if a matching evp division could not be found
	 */
	@Override
	public EVPDivision findByC_T_First(
			long companyId, int type,
			OrderByComparator<EVPDivision> orderByComparator)
		throws NoSuchDivisionException {

		EVPDivision evpDivision = fetchByC_T_First(
			companyId, type, orderByComparator);

		if (evpDivision != null) {
			return evpDivision;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append(", type=");
		sb.append(type);

		sb.append("}");

		throw new NoSuchDivisionException(sb.toString());
	}

	/**
	 * Returns the first evp division in the ordered set where companyId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp division, or <code>null</code> if a matching evp division could not be found
	 */
	@Override
	public EVPDivision fetchByC_T_First(
		long companyId, int type,
		OrderByComparator<EVPDivision> orderByComparator) {

		List<EVPDivision> list = findByC_T(
			companyId, type, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public EVPDivision findByC_T_Last(
			long companyId, int type,
			OrderByComparator<EVPDivision> orderByComparator)
		throws NoSuchDivisionException {

		EVPDivision evpDivision = fetchByC_T_Last(
			companyId, type, orderByComparator);

		if (evpDivision != null) {
			return evpDivision;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append(", type=");
		sb.append(type);

		sb.append("}");

		throw new NoSuchDivisionException(sb.toString());
	}

	/**
	 * Returns the last evp division in the ordered set where companyId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp division, or <code>null</code> if a matching evp division could not be found
	 */
	@Override
	public EVPDivision fetchByC_T_Last(
		long companyId, int type,
		OrderByComparator<EVPDivision> orderByComparator) {

		int count = countByC_T(companyId, type);

		if (count == 0) {
			return null;
		}

		List<EVPDivision> list = findByC_T(
			companyId, type, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public EVPDivision[] findByC_T_PrevAndNext(
			long evpDivisionId, long companyId, int type,
			OrderByComparator<EVPDivision> orderByComparator)
		throws NoSuchDivisionException {

		EVPDivision evpDivision = findByPrimaryKey(evpDivisionId);

		Session session = null;

		try {
			session = openSession();

			EVPDivision[] array = new EVPDivisionImpl[3];

			array[0] = getByC_T_PrevAndNext(
				session, evpDivision, companyId, type, orderByComparator, true);

			array[1] = evpDivision;

			array[2] = getByC_T_PrevAndNext(
				session, evpDivision, companyId, type, orderByComparator,
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

	protected EVPDivision getByC_T_PrevAndNext(
		Session session, EVPDivision evpDivision, long companyId, int type,
		OrderByComparator<EVPDivision> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_EVPDIVISION_WHERE);

		sb.append(_FINDER_COLUMN_C_T_COMPANYID_2);

		sb.append(_FINDER_COLUMN_C_T_TYPE_2);

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
			sb.append(EVPDivisionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(companyId);

		queryPos.add(type);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(evpDivision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EVPDivision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the evp divisions where companyId = &#63; and type = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 */
	@Override
	public void removeByC_T(long companyId, int type) {
		for (EVPDivision evpDivision :
				findByC_T(
					companyId, type, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(evpDivision);
		}
	}

	/**
	 * Returns the number of evp divisions where companyId = &#63; and type = &#63;.
	 *
	 * @param companyId the company ID
	 * @param type the type
	 * @return the number of matching evp divisions
	 */
	@Override
	public int countByC_T(long companyId, int type) {
		FinderPath finderPath = _finderPathCountByC_T;

		Object[] finderArgs = new Object[] {companyId, type};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EVPDIVISION_WHERE);

			sb.append(_FINDER_COLUMN_C_T_COMPANYID_2);

			sb.append(_FINDER_COLUMN_C_T_TYPE_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyId);

				queryPos.add(type);

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

	private static final String _FINDER_COLUMN_C_T_COMPANYID_2 =
		"evpDivision.companyId = ? AND ";

	private static final String _FINDER_COLUMN_C_T_TYPE_2 =
		"evpDivision.type = ?";

	public EVPDivisionPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("type", "type_");

		setDBColumnNames(dbColumnNames);

		setModelClass(EVPDivision.class);

		setModelImplClass(EVPDivisionImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the evp division in the entity cache if it is enabled.
	 *
	 * @param evpDivision the evp division
	 */
	@Override
	public void cacheResult(EVPDivision evpDivision) {
		entityCache.putResult(
			EVPDivisionImpl.class, evpDivision.getPrimaryKey(), evpDivision);
	}

	/**
	 * Caches the evp divisions in the entity cache if it is enabled.
	 *
	 * @param evpDivisions the evp divisions
	 */
	@Override
	public void cacheResult(List<EVPDivision> evpDivisions) {
		for (EVPDivision evpDivision : evpDivisions) {
			if (entityCache.getResult(
					EVPDivisionImpl.class, evpDivision.getPrimaryKey()) ==
						null) {

				cacheResult(evpDivision);
			}
		}
	}

	/**
	 * Clears the cache for all evp divisions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EVPDivisionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the evp division.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EVPDivision evpDivision) {
		entityCache.removeResult(EVPDivisionImpl.class, evpDivision);
	}

	@Override
	public void clearCache(List<EVPDivision> evpDivisions) {
		for (EVPDivision evpDivision : evpDivisions) {
			entityCache.removeResult(EVPDivisionImpl.class, evpDivision);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(EVPDivisionImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new evp division with the primary key. Does not add the evp division to the database.
	 *
	 * @param evpDivisionId the primary key for the new evp division
	 * @return the new evp division
	 */
	@Override
	public EVPDivision create(long evpDivisionId) {
		EVPDivision evpDivision = new EVPDivisionImpl();

		evpDivision.setNew(true);
		evpDivision.setPrimaryKey(evpDivisionId);

		evpDivision.setCompanyId(CompanyThreadLocal.getCompanyId());

		return evpDivision;
	}

	/**
	 * Removes the evp division with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpDivisionId the primary key of the evp division
	 * @return the evp division that was removed
	 * @throws NoSuchDivisionException if a evp division with the primary key could not be found
	 */
	@Override
	public EVPDivision remove(long evpDivisionId)
		throws NoSuchDivisionException {

		return remove((Serializable)evpDivisionId);
	}

	/**
	 * Removes the evp division with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the evp division
	 * @return the evp division that was removed
	 * @throws NoSuchDivisionException if a evp division with the primary key could not be found
	 */
	@Override
	public EVPDivision remove(Serializable primaryKey)
		throws NoSuchDivisionException {

		Session session = null;

		try {
			session = openSession();

			EVPDivision evpDivision = (EVPDivision)session.get(
				EVPDivisionImpl.class, primaryKey);

			if (evpDivision == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDivisionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(evpDivision);
		}
		catch (NoSuchDivisionException noSuchEntityException) {
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
	protected EVPDivision removeImpl(EVPDivision evpDivision) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(evpDivision)) {
				evpDivision = (EVPDivision)session.get(
					EVPDivisionImpl.class, evpDivision.getPrimaryKeyObj());
			}

			if (evpDivision != null) {
				session.delete(evpDivision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (evpDivision != null) {
			clearCache(evpDivision);
		}

		return evpDivision;
	}

	@Override
	public EVPDivision updateImpl(EVPDivision evpDivision) {
		boolean isNew = evpDivision.isNew();

		if (!(evpDivision instanceof EVPDivisionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(evpDivision.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(evpDivision);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in evpDivision proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom EVPDivision implementation " +
					evpDivision.getClass());
		}

		EVPDivisionModelImpl evpDivisionModelImpl =
			(EVPDivisionModelImpl)evpDivision;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (evpDivision.getCreateDate() == null)) {
			if (serviceContext == null) {
				evpDivision.setCreateDate(now);
			}
			else {
				evpDivision.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!evpDivisionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				evpDivision.setModifiedDate(now);
			}
			else {
				evpDivision.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(evpDivision);
			}
			else {
				evpDivision = (EVPDivision)session.merge(evpDivision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			EVPDivisionImpl.class, evpDivisionModelImpl, false, true);

		if (isNew) {
			evpDivision.setNew(false);
		}

		evpDivision.resetOriginalValues();

		return evpDivision;
	}

	/**
	 * Returns the evp division with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the evp division
	 * @return the evp division
	 * @throws NoSuchDivisionException if a evp division with the primary key could not be found
	 */
	@Override
	public EVPDivision findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDivisionException {

		EVPDivision evpDivision = fetchByPrimaryKey(primaryKey);

		if (evpDivision == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDivisionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return evpDivision;
	}

	/**
	 * Returns the evp division with the primary key or throws a <code>NoSuchDivisionException</code> if it could not be found.
	 *
	 * @param evpDivisionId the primary key of the evp division
	 * @return the evp division
	 * @throws NoSuchDivisionException if a evp division with the primary key could not be found
	 */
	@Override
	public EVPDivision findByPrimaryKey(long evpDivisionId)
		throws NoSuchDivisionException {

		return findByPrimaryKey((Serializable)evpDivisionId);
	}

	/**
	 * Returns the evp division with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpDivisionId the primary key of the evp division
	 * @return the evp division, or <code>null</code> if a evp division with the primary key could not be found
	 */
	@Override
	public EVPDivision fetchByPrimaryKey(long evpDivisionId) {
		return fetchByPrimaryKey((Serializable)evpDivisionId);
	}

	/**
	 * Returns all the evp divisions.
	 *
	 * @return the evp divisions
	 */
	@Override
	public List<EVPDivision> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<EVPDivision> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<EVPDivision> findAll(
		int start, int end, OrderByComparator<EVPDivision> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<EVPDivision> findAll(
		int start, int end, OrderByComparator<EVPDivision> orderByComparator,
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

		List<EVPDivision> list = null;

		if (useFinderCache) {
			list = (List<EVPDivision>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EVPDIVISION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EVPDIVISION;

				sql = sql.concat(EVPDivisionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<EVPDivision>)QueryUtil.list(
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
	 * Removes all the evp divisions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EVPDivision evpDivision : findAll()) {
			remove(evpDivision);
		}
	}

	/**
	 * Returns the number of evp divisions.
	 *
	 * @return the number of evp divisions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_EVPDIVISION);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "evpDivisionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EVPDIVISION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EVPDivisionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the evp division persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new EVPDivisionModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", EVPDivision.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByC_T = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_T",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"companyId", "type_"}, true);

		_finderPathWithoutPaginationFindByC_T = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_T",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"companyId", "type_"}, true);

		_finderPathCountByC_T = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_T",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"companyId", "type_"}, false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(EVPDivisionImpl.class.getName());

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

	private static final String _SQL_SELECT_EVPDIVISION =
		"SELECT evpDivision FROM EVPDivision evpDivision";

	private static final String _SQL_SELECT_EVPDIVISION_WHERE =
		"SELECT evpDivision FROM EVPDivision evpDivision WHERE ";

	private static final String _SQL_COUNT_EVPDIVISION =
		"SELECT COUNT(evpDivision) FROM EVPDivision evpDivision";

	private static final String _SQL_COUNT_EVPDIVISION_WHERE =
		"SELECT COUNT(evpDivision) FROM EVPDivision evpDivision WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "evpDivision.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No EVPDivision exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No EVPDivision exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		EVPDivisionPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"type"});

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

	private static class EVPDivisionModelArgumentsResolver
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

			EVPDivisionModelImpl evpDivisionModelImpl =
				(EVPDivisionModelImpl)baseModel;

			long columnBitmask = evpDivisionModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(evpDivisionModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						evpDivisionModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(evpDivisionModelImpl, columnNames, original);
			}

			return null;
		}

		private Object[] _getValue(
			EVPDivisionModelImpl evpDivisionModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = evpDivisionModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = evpDivisionModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}