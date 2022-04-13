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

import com.liferay.evp.exception.NoSuchServiceRequestException;
import com.liferay.evp.model.EVPServiceRequest;
import com.liferay.evp.model.impl.EVPServiceRequestImpl;
import com.liferay.evp.model.impl.EVPServiceRequestModelImpl;
import com.liferay.evp.service.persistence.EVPServiceRequestPersistence;
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
 * The persistence implementation for the evp service request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @generated
 */
@Component(service = EVPServiceRequestPersistence.class)
public class EVPServiceRequestPersistenceImpl
	extends BasePersistenceImpl<EVPServiceRequest>
	implements EVPServiceRequestPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>EVPServiceRequestUtil</code> to access the evp service request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		EVPServiceRequestImpl.class.getName();

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
	 * Returns all the evp service requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching evp service requests
	 */
	@Override
	public List<EVPServiceRequest> findByC_S(long companyId, int status) {
		return findByC_S(
			companyId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the evp service requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @return the range of matching evp service requests
	 */
	@Override
	public List<EVPServiceRequest> findByC_S(
		long companyId, int status, int start, int end) {

		return findByC_S(companyId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the evp service requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching evp service requests
	 */
	@Override
	public List<EVPServiceRequest> findByC_S(
		long companyId, int status, int start, int end,
		OrderByComparator<EVPServiceRequest> orderByComparator) {

		return findByC_S(
			companyId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the evp service requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching evp service requests
	 */
	@Override
	public List<EVPServiceRequest> findByC_S(
		long companyId, int status, int start, int end,
		OrderByComparator<EVPServiceRequest> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = _finderPathWithPaginationFindByC_S;
		finderArgs = new Object[] {
			companyId, status, start, end, orderByComparator
		};

		List<EVPServiceRequest> list = null;

		if (useFinderCache) {
			list = (List<EVPServiceRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EVPServiceRequest evpServiceRequest : list) {
					if ((companyId != evpServiceRequest.getCompanyId()) ||
						(status == evpServiceRequest.getStatus())) {

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

			sb.append(_SQL_SELECT_EVPSERVICEREQUEST_WHERE);

			sb.append(_FINDER_COLUMN_C_S_COMPANYID_2);

			sb.append(_FINDER_COLUMN_C_S_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EVPServiceRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyId);

				queryPos.add(status);

				list = (List<EVPServiceRequest>)QueryUtil.list(
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
	 * Returns the first evp service request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp service request
	 * @throws NoSuchServiceRequestException if a matching evp service request could not be found
	 */
	@Override
	public EVPServiceRequest findByC_S_First(
			long companyId, int status,
			OrderByComparator<EVPServiceRequest> orderByComparator)
		throws NoSuchServiceRequestException {

		EVPServiceRequest evpServiceRequest = fetchByC_S_First(
			companyId, status, orderByComparator);

		if (evpServiceRequest != null) {
			return evpServiceRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append(", status!=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchServiceRequestException(sb.toString());
	}

	/**
	 * Returns the first evp service request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evp service request, or <code>null</code> if a matching evp service request could not be found
	 */
	@Override
	public EVPServiceRequest fetchByC_S_First(
		long companyId, int status,
		OrderByComparator<EVPServiceRequest> orderByComparator) {

		List<EVPServiceRequest> list = findByC_S(
			companyId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last evp service request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp service request
	 * @throws NoSuchServiceRequestException if a matching evp service request could not be found
	 */
	@Override
	public EVPServiceRequest findByC_S_Last(
			long companyId, int status,
			OrderByComparator<EVPServiceRequest> orderByComparator)
		throws NoSuchServiceRequestException {

		EVPServiceRequest evpServiceRequest = fetchByC_S_Last(
			companyId, status, orderByComparator);

		if (evpServiceRequest != null) {
			return evpServiceRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("companyId=");
		sb.append(companyId);

		sb.append(", status!=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchServiceRequestException(sb.toString());
	}

	/**
	 * Returns the last evp service request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evp service request, or <code>null</code> if a matching evp service request could not be found
	 */
	@Override
	public EVPServiceRequest fetchByC_S_Last(
		long companyId, int status,
		OrderByComparator<EVPServiceRequest> orderByComparator) {

		int count = countByC_S(companyId, status);

		if (count == 0) {
			return null;
		}

		List<EVPServiceRequest> list = findByC_S(
			companyId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the evp service requests before and after the current evp service request in the ordered set where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param evpServiceRequestId the primary key of the current evp service request
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next evp service request
	 * @throws NoSuchServiceRequestException if a evp service request with the primary key could not be found
	 */
	@Override
	public EVPServiceRequest[] findByC_S_PrevAndNext(
			long evpServiceRequestId, long companyId, int status,
			OrderByComparator<EVPServiceRequest> orderByComparator)
		throws NoSuchServiceRequestException {

		EVPServiceRequest evpServiceRequest = findByPrimaryKey(
			evpServiceRequestId);

		Session session = null;

		try {
			session = openSession();

			EVPServiceRequest[] array = new EVPServiceRequestImpl[3];

			array[0] = getByC_S_PrevAndNext(
				session, evpServiceRequest, companyId, status,
				orderByComparator, true);

			array[1] = evpServiceRequest;

			array[2] = getByC_S_PrevAndNext(
				session, evpServiceRequest, companyId, status,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected EVPServiceRequest getByC_S_PrevAndNext(
		Session session, EVPServiceRequest evpServiceRequest, long companyId,
		int status, OrderByComparator<EVPServiceRequest> orderByComparator,
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

		sb.append(_SQL_SELECT_EVPSERVICEREQUEST_WHERE);

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
			sb.append(EVPServiceRequestModelImpl.ORDER_BY_JPQL);
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
						evpServiceRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<EVPServiceRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the evp service requests where companyId = &#63; and status &ne; all &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @return the matching evp service requests
	 */
	@Override
	public List<EVPServiceRequest> findByC_S(long companyId, int[] statuses) {
		return findByC_S(
			companyId, statuses, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the evp service requests where companyId = &#63; and status &ne; all &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @return the range of matching evp service requests
	 */
	@Override
	public List<EVPServiceRequest> findByC_S(
		long companyId, int[] statuses, int start, int end) {

		return findByC_S(companyId, statuses, start, end, null);
	}

	/**
	 * Returns an ordered range of all the evp service requests where companyId = &#63; and status &ne; all &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching evp service requests
	 */
	@Override
	public List<EVPServiceRequest> findByC_S(
		long companyId, int[] statuses, int start, int end,
		OrderByComparator<EVPServiceRequest> orderByComparator) {

		return findByC_S(
			companyId, statuses, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the evp service requests where companyId = &#63; and status &ne; &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching evp service requests
	 */
	@Override
	public List<EVPServiceRequest> findByC_S(
		long companyId, int[] statuses, int start, int end,
		OrderByComparator<EVPServiceRequest> orderByComparator,
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

		List<EVPServiceRequest> list = null;

		if (useFinderCache) {
			list = (List<EVPServiceRequest>)finderCache.getResult(
				_finderPathWithPaginationFindByC_S, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EVPServiceRequest evpServiceRequest : list) {
					if ((companyId != evpServiceRequest.getCompanyId()) ||
						!ArrayUtil.contains(
							statuses, evpServiceRequest.getStatus())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = new StringBundler();

			sb.append(_SQL_SELECT_EVPSERVICEREQUEST_WHERE);

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
				sb.append(EVPServiceRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(companyId);

				list = (List<EVPServiceRequest>)QueryUtil.list(
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
	 * Removes all the evp service requests where companyId = &#63; and status &ne; &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	@Override
	public void removeByC_S(long companyId, int status) {
		for (EVPServiceRequest evpServiceRequest :
				findByC_S(
					companyId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(evpServiceRequest);
		}
	}

	/**
	 * Returns the number of evp service requests where companyId = &#63; and status &ne; &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching evp service requests
	 */
	@Override
	public int countByC_S(long companyId, int status) {
		FinderPath finderPath = _finderPathWithPaginationCountByC_S;

		Object[] finderArgs = new Object[] {companyId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_EVPSERVICEREQUEST_WHERE);

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
	 * Returns the number of evp service requests where companyId = &#63; and status &ne; all &#63;.
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @return the number of matching evp service requests
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

			sb.append(_SQL_COUNT_EVPSERVICEREQUEST_WHERE);

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
		"evpServiceRequest.companyId = ? AND ";

	private static final String _FINDER_COLUMN_C_S_STATUS_2 =
		"evpServiceRequest.status != ?";

	private static final String _FINDER_COLUMN_C_S_STATUS_7 =
		"evpServiceRequest.status NOT IN (";

	public EVPServiceRequestPersistenceImpl() {
		setModelClass(EVPServiceRequest.class);

		setModelImplClass(EVPServiceRequestImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the evp service request in the entity cache if it is enabled.
	 *
	 * @param evpServiceRequest the evp service request
	 */
	@Override
	public void cacheResult(EVPServiceRequest evpServiceRequest) {
		entityCache.putResult(
			EVPServiceRequestImpl.class, evpServiceRequest.getPrimaryKey(),
			evpServiceRequest);
	}

	/**
	 * Caches the evp service requests in the entity cache if it is enabled.
	 *
	 * @param evpServiceRequests the evp service requests
	 */
	@Override
	public void cacheResult(List<EVPServiceRequest> evpServiceRequests) {
		for (EVPServiceRequest evpServiceRequest : evpServiceRequests) {
			if (entityCache.getResult(
					EVPServiceRequestImpl.class,
					evpServiceRequest.getPrimaryKey()) == null) {

				cacheResult(evpServiceRequest);
			}
		}
	}

	/**
	 * Clears the cache for all evp service requests.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EVPServiceRequestImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the evp service request.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EVPServiceRequest evpServiceRequest) {
		entityCache.removeResult(
			EVPServiceRequestImpl.class, evpServiceRequest);
	}

	@Override
	public void clearCache(List<EVPServiceRequest> evpServiceRequests) {
		for (EVPServiceRequest evpServiceRequest : evpServiceRequests) {
			entityCache.removeResult(
				EVPServiceRequestImpl.class, evpServiceRequest);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(EVPServiceRequestImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new evp service request with the primary key. Does not add the evp service request to the database.
	 *
	 * @param evpServiceRequestId the primary key for the new evp service request
	 * @return the new evp service request
	 */
	@Override
	public EVPServiceRequest create(long evpServiceRequestId) {
		EVPServiceRequest evpServiceRequest = new EVPServiceRequestImpl();

		evpServiceRequest.setNew(true);
		evpServiceRequest.setPrimaryKey(evpServiceRequestId);

		evpServiceRequest.setCompanyId(CompanyThreadLocal.getCompanyId());

		return evpServiceRequest;
	}

	/**
	 * Removes the evp service request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpServiceRequestId the primary key of the evp service request
	 * @return the evp service request that was removed
	 * @throws NoSuchServiceRequestException if a evp service request with the primary key could not be found
	 */
	@Override
	public EVPServiceRequest remove(long evpServiceRequestId)
		throws NoSuchServiceRequestException {

		return remove((Serializable)evpServiceRequestId);
	}

	/**
	 * Removes the evp service request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the evp service request
	 * @return the evp service request that was removed
	 * @throws NoSuchServiceRequestException if a evp service request with the primary key could not be found
	 */
	@Override
	public EVPServiceRequest remove(Serializable primaryKey)
		throws NoSuchServiceRequestException {

		Session session = null;

		try {
			session = openSession();

			EVPServiceRequest evpServiceRequest =
				(EVPServiceRequest)session.get(
					EVPServiceRequestImpl.class, primaryKey);

			if (evpServiceRequest == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchServiceRequestException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(evpServiceRequest);
		}
		catch (NoSuchServiceRequestException noSuchEntityException) {
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
	protected EVPServiceRequest removeImpl(
		EVPServiceRequest evpServiceRequest) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(evpServiceRequest)) {
				evpServiceRequest = (EVPServiceRequest)session.get(
					EVPServiceRequestImpl.class,
					evpServiceRequest.getPrimaryKeyObj());
			}

			if (evpServiceRequest != null) {
				session.delete(evpServiceRequest);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (evpServiceRequest != null) {
			clearCache(evpServiceRequest);
		}

		return evpServiceRequest;
	}

	@Override
	public EVPServiceRequest updateImpl(EVPServiceRequest evpServiceRequest) {
		boolean isNew = evpServiceRequest.isNew();

		if (!(evpServiceRequest instanceof EVPServiceRequestModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(evpServiceRequest.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					evpServiceRequest);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in evpServiceRequest proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom EVPServiceRequest implementation " +
					evpServiceRequest.getClass());
		}

		EVPServiceRequestModelImpl evpServiceRequestModelImpl =
			(EVPServiceRequestModelImpl)evpServiceRequest;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (evpServiceRequest.getCreateDate() == null)) {
			if (serviceContext == null) {
				evpServiceRequest.setCreateDate(date);
			}
			else {
				evpServiceRequest.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!evpServiceRequestModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				evpServiceRequest.setModifiedDate(date);
			}
			else {
				evpServiceRequest.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(evpServiceRequest);
			}
			else {
				evpServiceRequest = (EVPServiceRequest)session.merge(
					evpServiceRequest);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			EVPServiceRequestImpl.class, evpServiceRequest, false, true);

		if (isNew) {
			evpServiceRequest.setNew(false);
		}

		evpServiceRequest.resetOriginalValues();

		return evpServiceRequest;
	}

	/**
	 * Returns the evp service request with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the evp service request
	 * @return the evp service request
	 * @throws NoSuchServiceRequestException if a evp service request with the primary key could not be found
	 */
	@Override
	public EVPServiceRequest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchServiceRequestException {

		EVPServiceRequest evpServiceRequest = fetchByPrimaryKey(primaryKey);

		if (evpServiceRequest == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchServiceRequestException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return evpServiceRequest;
	}

	/**
	 * Returns the evp service request with the primary key or throws a <code>NoSuchServiceRequestException</code> if it could not be found.
	 *
	 * @param evpServiceRequestId the primary key of the evp service request
	 * @return the evp service request
	 * @throws NoSuchServiceRequestException if a evp service request with the primary key could not be found
	 */
	@Override
	public EVPServiceRequest findByPrimaryKey(long evpServiceRequestId)
		throws NoSuchServiceRequestException {

		return findByPrimaryKey((Serializable)evpServiceRequestId);
	}

	/**
	 * Returns the evp service request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpServiceRequestId the primary key of the evp service request
	 * @return the evp service request, or <code>null</code> if a evp service request with the primary key could not be found
	 */
	@Override
	public EVPServiceRequest fetchByPrimaryKey(long evpServiceRequestId) {
		return fetchByPrimaryKey((Serializable)evpServiceRequestId);
	}

	/**
	 * Returns all the evp service requests.
	 *
	 * @return the evp service requests
	 */
	@Override
	public List<EVPServiceRequest> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the evp service requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @return the range of evp service requests
	 */
	@Override
	public List<EVPServiceRequest> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the evp service requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of evp service requests
	 */
	@Override
	public List<EVPServiceRequest> findAll(
		int start, int end,
		OrderByComparator<EVPServiceRequest> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the evp service requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPServiceRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp service requests
	 * @param end the upper bound of the range of evp service requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of evp service requests
	 */
	@Override
	public List<EVPServiceRequest> findAll(
		int start, int end,
		OrderByComparator<EVPServiceRequest> orderByComparator,
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

		List<EVPServiceRequest> list = null;

		if (useFinderCache) {
			list = (List<EVPServiceRequest>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EVPSERVICEREQUEST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EVPSERVICEREQUEST;

				sql = sql.concat(EVPServiceRequestModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<EVPServiceRequest>)QueryUtil.list(
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
	 * Removes all the evp service requests from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EVPServiceRequest evpServiceRequest : findAll()) {
			remove(evpServiceRequest);
		}
	}

	/**
	 * Returns the number of evp service requests.
	 *
	 * @return the number of evp service requests
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_EVPSERVICEREQUEST);

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
		return "evpServiceRequestId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EVPSERVICEREQUEST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EVPServiceRequestModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the evp service request persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new EVPServiceRequestModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", EVPServiceRequest.class.getName()));

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
		entityCache.removeCache(EVPServiceRequestImpl.class.getName());

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

	private static final String _SQL_SELECT_EVPSERVICEREQUEST =
		"SELECT evpServiceRequest FROM EVPServiceRequest evpServiceRequest";

	private static final String _SQL_SELECT_EVPSERVICEREQUEST_WHERE =
		"SELECT evpServiceRequest FROM EVPServiceRequest evpServiceRequest WHERE ";

	private static final String _SQL_COUNT_EVPSERVICEREQUEST =
		"SELECT COUNT(evpServiceRequest) FROM EVPServiceRequest evpServiceRequest";

	private static final String _SQL_COUNT_EVPSERVICEREQUEST_WHERE =
		"SELECT COUNT(evpServiceRequest) FROM EVPServiceRequest evpServiceRequest WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "evpServiceRequest.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No EVPServiceRequest exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No EVPServiceRequest exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		EVPServiceRequestPersistenceImpl.class);

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

	private static class EVPServiceRequestModelArgumentsResolver
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

			EVPServiceRequestModelImpl evpServiceRequestModelImpl =
				(EVPServiceRequestModelImpl)baseModel;

			long columnBitmask = evpServiceRequestModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					evpServiceRequestModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						evpServiceRequestModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					evpServiceRequestModelImpl, columnNames, original);
			}

			return null;
		}

		private static Object[] _getValue(
			EVPServiceRequestModelImpl evpServiceRequestModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						evpServiceRequestModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = evpServiceRequestModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static final Map<FinderPath, Long>
			_finderPathColumnBitmasksCache = new ConcurrentHashMap<>();

	}

}