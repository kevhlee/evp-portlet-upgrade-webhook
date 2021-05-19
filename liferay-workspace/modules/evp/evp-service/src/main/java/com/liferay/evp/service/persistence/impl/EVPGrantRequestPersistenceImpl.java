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

import com.liferay.evp.exception.NoSuchGrantRequestException;
import com.liferay.evp.model.EVPGrantRequest;
import com.liferay.evp.model.impl.EVPGrantRequestImpl;
import com.liferay.evp.model.impl.EVPGrantRequestModelImpl;
import com.liferay.evp.service.persistence.EVPGrantRequestPersistence;
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
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

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
 * The persistence implementation for the evp grant request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @generated
 */
@Component(service = EVPGrantRequestPersistence.class)
public class EVPGrantRequestPersistenceImpl
	extends BasePersistenceImpl<EVPGrantRequest>
	implements EVPGrantRequestPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>EVPGrantRequestUtil</code> to access the evp grant request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		EVPGrantRequestImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByC_S;
	private FinderPath _finderPathWithPaginationCountByC_S;

	/**
	 * Returns all the evp grant requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching evp grant requests
	 */
	@Override
	public List<EVPGrantRequest> findByC_S(long companyId, int status) {
		return findByC_S(
			companyId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the evp grant requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @return the range of matching evp grant requests
	 */
	@Override
	public List<EVPGrantRequest> findByC_S(
		long companyId, int status, int start, int end) {

		return findByC_S(companyId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the evp grant requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching evp grant requests
	 */
	@Override
	public List<EVPGrantRequest> findByC_S(
		long companyId, int status, int start, int end,
		OrderByComparator<EVPGrantRequest> orderByComparator) {

		return findByC_S(
			companyId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the evp grant requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching evp grant requests
	 */
	@Override
	public List<EVPGrantRequest> findByC_S(
		long companyId, int status, int start, int end,
		OrderByComparator<EVPGrantRequest> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = _finderPathWithPaginationFindByC_S;
		finderArgs = new Object[] {
			companyId, status, start, end, orderByComparator
		};

		List<EVPGrantRequest> list = null;

		if (useFinderCache) {
			list = (List<EVPGrantRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EVPGrantRequest evpGrantRequest : list) {
					if ((companyId != evpGrantRequest.getCompanyId()) ||
						(status == evpGrantRequest.getStatus())) {

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

			sb.append(_SQL_SELECT_EVPGRANTREQUEST_WHERE);

			sb.append(_FINDER_COLUMN_C_S_COMPANYID_2);

			sb.append(_FINDER_COLUMN_C_S_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EVPGrantRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyId);

				queryPos.add(status);

				list = (List<EVPGrantRequest>)QueryUtil.list(
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
	 * Returns the first evp grant request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp grant request
	 * @throws NoSuchGrantRequestException if a matching evp grant request could not be found
	 */
	@Override
	public EVPGrantRequest findByC_S_First(
			long companyId, int status,
			OrderByComparator<EVPGrantRequest> orderByComparator)
		throws NoSuchGrantRequestException {

		EVPGrantRequest evpGrantRequest = fetchByC_S_First(
			companyId, status, orderByComparator);

		if (evpGrantRequest != null) {
			return evpGrantRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append(", status!=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchGrantRequestException(sb.toString());
	}

	/**
	 * Returns the first evp grant request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp grant request, or <code>null</code> if a matching evp grant request could not be found
	 */
	@Override
	public EVPGrantRequest fetchByC_S_First(
		long companyId, int status,
		OrderByComparator<EVPGrantRequest> orderByComparator) {

		List<EVPGrantRequest> list = findByC_S(
			companyId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last evp grant request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp grant request
	 * @throws NoSuchGrantRequestException if a matching evp grant request could not be found
	 */
	@Override
	public EVPGrantRequest findByC_S_Last(
			long companyId, int status,
			OrderByComparator<EVPGrantRequest> orderByComparator)
		throws NoSuchGrantRequestException {

		EVPGrantRequest evpGrantRequest = fetchByC_S_Last(
			companyId, status, orderByComparator);

		if (evpGrantRequest != null) {
			return evpGrantRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append(", status!=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchGrantRequestException(sb.toString());
	}

	/**
	 * Returns the last evp grant request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp grant request, or <code>null</code> if a matching evp grant request could not be found
	 */
	@Override
	public EVPGrantRequest fetchByC_S_Last(
		long companyId, int status,
		OrderByComparator<EVPGrantRequest> orderByComparator) {

		int count = countByC_S(companyId, status);

		if (count == 0) {
			return null;
		}

		List<EVPGrantRequest> list = findByC_S(
			companyId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the evp grant requests before and after the current evp grant request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param evpGrantRequestId the primary key of the current evp grant request
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next evp grant request
	 * @throws NoSuchGrantRequestException if a evp grant request with the primary key could not be found
	 */
	@Override
	public EVPGrantRequest[] findByC_S_PrevAndNext(
			long evpGrantRequestId, long companyId, int status,
			OrderByComparator<EVPGrantRequest> orderByComparator)
		throws NoSuchGrantRequestException {

		EVPGrantRequest evpGrantRequest = findByPrimaryKey(evpGrantRequestId);

		Session session = null;

		try {
			session = openSession();

			EVPGrantRequest[] array = new EVPGrantRequestImpl[3];

			array[0] = getByC_S_PrevAndNext(
				session, evpGrantRequest, companyId, status, orderByComparator,
				true);

			array[1] = evpGrantRequest;

			array[2] = getByC_S_PrevAndNext(
				session, evpGrantRequest, companyId, status, orderByComparator,
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

	protected EVPGrantRequest getByC_S_PrevAndNext(
		Session session, EVPGrantRequest evpGrantRequest, long companyId,
		int status, OrderByComparator<EVPGrantRequest> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_EVPGRANTREQUEST_WHERE);

		sb.append(_FINDER_COLUMN_C_S_COMPANYID_2);

		sb.append(_FINDER_COLUMN_C_S_STATUS_2);

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
			sb.append(EVPGrantRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(companyId);

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						evpGrantRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EVPGrantRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the evp grant requests where companyId = &#63; and status &ne; all &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @return the matching evp grant requests
	 */
	@Override
	public List<EVPGrantRequest> findByC_S(long companyId, int[] statuses) {
		return findByC_S(
			companyId, statuses, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the evp grant requests where companyId = &#63; and status &ne; all &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @return the range of matching evp grant requests
	 */
	@Override
	public List<EVPGrantRequest> findByC_S(
		long companyId, int[] statuses, int start, int end) {

		return findByC_S(companyId, statuses, start, end, null);
	}

	/**
	 * Returns an ordered range of all the evp grant requests where companyId = &#63; and status &ne; all &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching evp grant requests
	 */
	@Override
	public List<EVPGrantRequest> findByC_S(
		long companyId, int[] statuses, int start, int end,
		OrderByComparator<EVPGrantRequest> orderByComparator) {

		return findByC_S(
			companyId, statuses, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the evp grant requests where companyId = &#63; and status &ne; &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching evp grant requests
	 */
	@Override
	public List<EVPGrantRequest> findByC_S(
		long companyId, int[] statuses, int start, int end,
		OrderByComparator<EVPGrantRequest> orderByComparator,
		boolean useFinderCache) {

		if (statuses == null) {
			statuses = new int[0];
		}
		else if (statuses.length > 1) {
			statuses = ArrayUtil.sortedUnique(statuses);
		}

		if (statuses.length == 1) {
			return findByC_S(
				companyId, statuses[0], start, end, orderByComparator);
		}

		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderArgs = new Object[] {
					companyId, StringUtil.merge(statuses)
				};
			}
		}
		else if (useFinderCache) {
			finderArgs = new Object[] {
				companyId, StringUtil.merge(statuses), start, end,
				orderByComparator
			};
		}

		List<EVPGrantRequest> list = null;

		if (useFinderCache) {
			list = (List<EVPGrantRequest>)finderCache.getResult(
				_finderPathWithPaginationFindByC_S, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EVPGrantRequest evpGrantRequest : list) {
					if ((companyId != evpGrantRequest.getCompanyId()) ||
						!ArrayUtil.contains(
							statuses, evpGrantRequest.getStatus())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = new StringBundler();

			sb.append(_SQL_SELECT_EVPGRANTREQUEST_WHERE);

			sb.append(_FINDER_COLUMN_C_S_COMPANYID_2);

			if (statuses.length > 0) {
				sb.append("(");

				sb.append(_FINDER_COLUMN_C_S_STATUS_7);

				sb.append(StringUtil.merge(statuses));

				sb.append(")");

				sb.append(")");
			}

			sb.setStringAt(
				removeConjunction(sb.stringAt(sb.index() - 1)), sb.index() - 1);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EVPGrantRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyId);

				list = (List<EVPGrantRequest>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(
						_finderPathWithPaginationFindByC_S, finderArgs, list);
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
	 * Removes all the evp grant requests where companyId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	@Override
	public void removeByC_S(long companyId, int status) {
		for (EVPGrantRequest evpGrantRequest :
				findByC_S(
					companyId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(evpGrantRequest);
		}
	}

	/**
	 * Returns the number of evp grant requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching evp grant requests
	 */
	@Override
	public int countByC_S(long companyId, int status) {
		FinderPath finderPath = _finderPathWithPaginationCountByC_S;

		Object[] finderArgs = new Object[] {companyId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EVPGRANTREQUEST_WHERE);

			sb.append(_FINDER_COLUMN_C_S_COMPANYID_2);

			sb.append(_FINDER_COLUMN_C_S_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyId);

				queryPos.add(status);

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

	/**
	 * Returns the number of evp grant requests where companyId = &#63; and status &ne; all &#63;.
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @return the number of matching evp grant requests
	 */
	@Override
	public int countByC_S(long companyId, int[] statuses) {
		if (statuses == null) {
			statuses = new int[0];
		}
		else if (statuses.length > 1) {
			statuses = ArrayUtil.sortedUnique(statuses);
		}

		Object[] finderArgs = new Object[] {
			companyId, StringUtil.merge(statuses)
		};

		Long count = (Long)finderCache.getResult(
			_finderPathWithPaginationCountByC_S, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler();

			sb.append(_SQL_COUNT_EVPGRANTREQUEST_WHERE);

			sb.append(_FINDER_COLUMN_C_S_COMPANYID_2);

			if (statuses.length > 0) {
				sb.append("(");

				sb.append(_FINDER_COLUMN_C_S_STATUS_7);

				sb.append(StringUtil.merge(statuses));

				sb.append(")");

				sb.append(")");
			}

			sb.setStringAt(
				removeConjunction(sb.stringAt(sb.index() - 1)), sb.index() - 1);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathWithPaginationCountByC_S, finderArgs, count);
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

	private static final String _FINDER_COLUMN_C_S_COMPANYID_2 =
		"evpGrantRequest.companyId = ? AND ";

	private static final String _FINDER_COLUMN_C_S_STATUS_2 =
		"evpGrantRequest.status != ?";

	private static final String _FINDER_COLUMN_C_S_STATUS_7 =
		"evpGrantRequest.status NOT IN (";

	public EVPGrantRequestPersistenceImpl() {
		setModelClass(EVPGrantRequest.class);

		setModelImplClass(EVPGrantRequestImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the evp grant request in the entity cache if it is enabled.
	 *
	 * @param evpGrantRequest the evp grant request
	 */
	@Override
	public void cacheResult(EVPGrantRequest evpGrantRequest) {
		entityCache.putResult(
			EVPGrantRequestImpl.class, evpGrantRequest.getPrimaryKey(),
			evpGrantRequest);
	}

	/**
	 * Caches the evp grant requests in the entity cache if it is enabled.
	 *
	 * @param evpGrantRequests the evp grant requests
	 */
	@Override
	public void cacheResult(List<EVPGrantRequest> evpGrantRequests) {
		for (EVPGrantRequest evpGrantRequest : evpGrantRequests) {
			if (entityCache.getResult(
					EVPGrantRequestImpl.class,
					evpGrantRequest.getPrimaryKey()) == null) {

				cacheResult(evpGrantRequest);
			}
		}
	}

	/**
	 * Clears the cache for all evp grant requests.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EVPGrantRequestImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the evp grant request.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EVPGrantRequest evpGrantRequest) {
		entityCache.removeResult(EVPGrantRequestImpl.class, evpGrantRequest);
	}

	@Override
	public void clearCache(List<EVPGrantRequest> evpGrantRequests) {
		for (EVPGrantRequest evpGrantRequest : evpGrantRequests) {
			entityCache.removeResult(
				EVPGrantRequestImpl.class, evpGrantRequest);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(EVPGrantRequestImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new evp grant request with the primary key. Does not add the evp grant request to the database.
	 *
	 * @param evpGrantRequestId the primary key for the new evp grant request
	 * @return the new evp grant request
	 */
	@Override
	public EVPGrantRequest create(long evpGrantRequestId) {
		EVPGrantRequest evpGrantRequest = new EVPGrantRequestImpl();

		evpGrantRequest.setNew(true);
		evpGrantRequest.setPrimaryKey(evpGrantRequestId);

		evpGrantRequest.setCompanyId(CompanyThreadLocal.getCompanyId());

		return evpGrantRequest;
	}

	/**
	 * Removes the evp grant request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpGrantRequestId the primary key of the evp grant request
	 * @return the evp grant request that was removed
	 * @throws NoSuchGrantRequestException if a evp grant request with the primary key could not be found
	 */
	@Override
	public EVPGrantRequest remove(long evpGrantRequestId)
		throws NoSuchGrantRequestException {

		return remove((Serializable)evpGrantRequestId);
	}

	/**
	 * Removes the evp grant request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the evp grant request
	 * @return the evp grant request that was removed
	 * @throws NoSuchGrantRequestException if a evp grant request with the primary key could not be found
	 */
	@Override
	public EVPGrantRequest remove(Serializable primaryKey)
		throws NoSuchGrantRequestException {

		Session session = null;

		try {
			session = openSession();

			EVPGrantRequest evpGrantRequest = (EVPGrantRequest)session.get(
				EVPGrantRequestImpl.class, primaryKey);

			if (evpGrantRequest == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchGrantRequestException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(evpGrantRequest);
		}
		catch (NoSuchGrantRequestException noSuchEntityException) {
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
	protected EVPGrantRequest removeImpl(EVPGrantRequest evpGrantRequest) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(evpGrantRequest)) {
				evpGrantRequest = (EVPGrantRequest)session.get(
					EVPGrantRequestImpl.class,
					evpGrantRequest.getPrimaryKeyObj());
			}

			if (evpGrantRequest != null) {
				session.delete(evpGrantRequest);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (evpGrantRequest != null) {
			clearCache(evpGrantRequest);
		}

		return evpGrantRequest;
	}

	@Override
	public EVPGrantRequest updateImpl(EVPGrantRequest evpGrantRequest) {
		boolean isNew = evpGrantRequest.isNew();

		if (!(evpGrantRequest instanceof EVPGrantRequestModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(evpGrantRequest.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					evpGrantRequest);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in evpGrantRequest proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom EVPGrantRequest implementation " +
					evpGrantRequest.getClass());
		}

		EVPGrantRequestModelImpl evpGrantRequestModelImpl =
			(EVPGrantRequestModelImpl)evpGrantRequest;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (evpGrantRequest.getCreateDate() == null)) {
			if (serviceContext == null) {
				evpGrantRequest.setCreateDate(now);
			}
			else {
				evpGrantRequest.setCreateDate(
					serviceContext.getCreateDate(now));
			}
		}

		if (!evpGrantRequestModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				evpGrantRequest.setModifiedDate(now);
			}
			else {
				evpGrantRequest.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(evpGrantRequest);
			}
			else {
				evpGrantRequest = (EVPGrantRequest)session.merge(
					evpGrantRequest);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			EVPGrantRequestImpl.class, evpGrantRequest, false, true);

		if (isNew) {
			evpGrantRequest.setNew(false);
		}

		evpGrantRequest.resetOriginalValues();

		return evpGrantRequest;
	}

	/**
	 * Returns the evp grant request with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the evp grant request
	 * @return the evp grant request
	 * @throws NoSuchGrantRequestException if a evp grant request with the primary key could not be found
	 */
	@Override
	public EVPGrantRequest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchGrantRequestException {

		EVPGrantRequest evpGrantRequest = fetchByPrimaryKey(primaryKey);

		if (evpGrantRequest == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchGrantRequestException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return evpGrantRequest;
	}

	/**
	 * Returns the evp grant request with the primary key or throws a <code>NoSuchGrantRequestException</code> if it could not be found.
	 *
	 * @param evpGrantRequestId the primary key of the evp grant request
	 * @return the evp grant request
	 * @throws NoSuchGrantRequestException if a evp grant request with the primary key could not be found
	 */
	@Override
	public EVPGrantRequest findByPrimaryKey(long evpGrantRequestId)
		throws NoSuchGrantRequestException {

		return findByPrimaryKey((Serializable)evpGrantRequestId);
	}

	/**
	 * Returns the evp grant request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpGrantRequestId the primary key of the evp grant request
	 * @return the evp grant request, or <code>null</code> if a evp grant request with the primary key could not be found
	 */
	@Override
	public EVPGrantRequest fetchByPrimaryKey(long evpGrantRequestId) {
		return fetchByPrimaryKey((Serializable)evpGrantRequestId);
	}

	/**
	 * Returns all the evp grant requests.
	 *
	 * @return the evp grant requests
	 */
	@Override
	public List<EVPGrantRequest> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the evp grant requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @return the range of evp grant requests
	 */
	@Override
	public List<EVPGrantRequest> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the evp grant requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of evp grant requests
	 */
	@Override
	public List<EVPGrantRequest> findAll(
		int start, int end,
		OrderByComparator<EVPGrantRequest> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the evp grant requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp grant requests
	 * @param end the upper bound of the range of evp grant requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of evp grant requests
	 */
	@Override
	public List<EVPGrantRequest> findAll(
		int start, int end,
		OrderByComparator<EVPGrantRequest> orderByComparator,
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

		List<EVPGrantRequest> list = null;

		if (useFinderCache) {
			list = (List<EVPGrantRequest>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EVPGRANTREQUEST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EVPGRANTREQUEST;

				sql = sql.concat(EVPGrantRequestModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<EVPGrantRequest>)QueryUtil.list(
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
	 * Removes all the evp grant requests from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EVPGrantRequest evpGrantRequest : findAll()) {
			remove(evpGrantRequest);
		}
	}

	/**
	 * Returns the number of evp grant requests.
	 *
	 * @return the number of evp grant requests
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_EVPGRANTREQUEST);

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
		return "evpGrantRequestId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EVPGRANTREQUEST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EVPGrantRequestModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the evp grant request persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new EVPGrantRequestModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", EVPGrantRequest.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByC_S = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_S",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"companyId", "status"}, true);

		_finderPathWithPaginationCountByC_S = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByC_S",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"companyId", "status"}, false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(EVPGrantRequestImpl.class.getName());

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

	private static final String _SQL_SELECT_EVPGRANTREQUEST =
		"SELECT evpGrantRequest FROM EVPGrantRequest evpGrantRequest";

	private static final String _SQL_SELECT_EVPGRANTREQUEST_WHERE =
		"SELECT evpGrantRequest FROM EVPGrantRequest evpGrantRequest WHERE ";

	private static final String _SQL_COUNT_EVPGRANTREQUEST =
		"SELECT COUNT(evpGrantRequest) FROM EVPGrantRequest evpGrantRequest";

	private static final String _SQL_COUNT_EVPGRANTREQUEST_WHERE =
		"SELECT COUNT(evpGrantRequest) FROM EVPGrantRequest evpGrantRequest WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "evpGrantRequest.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No EVPGrantRequest exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No EVPGrantRequest exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		EVPGrantRequestPersistenceImpl.class);

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

	private static class EVPGrantRequestModelArgumentsResolver
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

			EVPGrantRequestModelImpl evpGrantRequestModelImpl =
				(EVPGrantRequestModelImpl)baseModel;

			long columnBitmask = evpGrantRequestModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					evpGrantRequestModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						evpGrantRequestModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					evpGrantRequestModelImpl, columnNames, original);
			}

			return null;
		}

		private Object[] _getValue(
			EVPGrantRequestModelImpl evpGrantRequestModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						evpGrantRequestModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = evpGrantRequestModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}