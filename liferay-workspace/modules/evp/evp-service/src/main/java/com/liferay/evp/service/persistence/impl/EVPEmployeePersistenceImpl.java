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

import com.liferay.evp.exception.NoSuchEmployeeException;
import com.liferay.evp.model.EVPEmployee;
import com.liferay.evp.model.impl.EVPEmployeeImpl;
import com.liferay.evp.model.impl.EVPEmployeeModelImpl;
import com.liferay.evp.service.persistence.EVPEmployeePersistence;
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
 * The persistence implementation for the evp employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @generated
 */
@Component(service = EVPEmployeePersistence.class)
public class EVPEmployeePersistenceImpl
	extends BasePersistenceImpl<EVPEmployee> implements EVPEmployeePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>EVPEmployeeUtil</code> to access the evp employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		EVPEmployeeImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchByEmployeeUserId;
	private FinderPath _finderPathCountByEmployeeUserId;

	/**
	 * Returns the evp employee where employeeUserId = &#63; or throws a <code>NoSuchEmployeeException</code> if it could not be found.
	 *
	 * @param employeeUserId the employee user ID
	 * @return the matching evp employee
	 * @throws NoSuchEmployeeException if a matching evp employee could not be found
	 */
	@Override
	public EVPEmployee findByEmployeeUserId(long employeeUserId)
		throws NoSuchEmployeeException {

		EVPEmployee evpEmployee = fetchByEmployeeUserId(employeeUserId);

		if (evpEmployee == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("employeeUserId=");
			sb.append(employeeUserId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchEmployeeException(sb.toString());
		}

		return evpEmployee;
	}

	/**
	 * Returns the evp employee where employeeUserId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param employeeUserId the employee user ID
	 * @return the matching evp employee, or <code>null</code> if a matching evp employee could not be found
	 */
	@Override
	public EVPEmployee fetchByEmployeeUserId(long employeeUserId) {
		return fetchByEmployeeUserId(employeeUserId, true);
	}

	/**
	 * Returns the evp employee where employeeUserId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param employeeUserId the employee user ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching evp employee, or <code>null</code> if a matching evp employee could not be found
	 */
	@Override
	public EVPEmployee fetchByEmployeeUserId(
		long employeeUserId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {employeeUserId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByEmployeeUserId, finderArgs, this);
		}

		if (result instanceof EVPEmployee) {
			EVPEmployee evpEmployee = (EVPEmployee)result;

			if (employeeUserId != evpEmployee.getEmployeeUserId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_EVPEMPLOYEE_WHERE);

			sb.append(_FINDER_COLUMN_EMPLOYEEUSERID_EMPLOYEEUSERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(employeeUserId);

				List<EVPEmployee> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByEmployeeUserId, finderArgs, list);
					}
				}
				else {
					EVPEmployee evpEmployee = list.get(0);

					result = evpEmployee;

					cacheResult(evpEmployee);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (EVPEmployee)result;
		}
	}

	/**
	 * Removes the evp employee where employeeUserId = &#63; from the database.
	 *
	 * @param employeeUserId the employee user ID
	 * @return the evp employee that was removed
	 */
	@Override
	public EVPEmployee removeByEmployeeUserId(long employeeUserId)
		throws NoSuchEmployeeException {

		EVPEmployee evpEmployee = findByEmployeeUserId(employeeUserId);

		return remove(evpEmployee);
	}

	/**
	 * Returns the number of evp employees where employeeUserId = &#63;.
	 *
	 * @param employeeUserId the employee user ID
	 * @return the number of matching evp employees
	 */
	@Override
	public int countByEmployeeUserId(long employeeUserId) {
		FinderPath finderPath = _finderPathCountByEmployeeUserId;

		Object[] finderArgs = new Object[] {employeeUserId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EVPEMPLOYEE_WHERE);

			sb.append(_FINDER_COLUMN_EMPLOYEEUSERID_EMPLOYEEUSERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(employeeUserId);

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

	private static final String _FINDER_COLUMN_EMPLOYEEUSERID_EMPLOYEEUSERID_2 =
		"evpEmployee.employeeUserId = ?";

	public EVPEmployeePersistenceImpl() {
		setModelClass(EVPEmployee.class);

		setModelImplClass(EVPEmployeeImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the evp employee in the entity cache if it is enabled.
	 *
	 * @param evpEmployee the evp employee
	 */
	@Override
	public void cacheResult(EVPEmployee evpEmployee) {
		entityCache.putResult(
			EVPEmployeeImpl.class, evpEmployee.getPrimaryKey(), evpEmployee);

		finderCache.putResult(
			_finderPathFetchByEmployeeUserId,
			new Object[] {evpEmployee.getEmployeeUserId()}, evpEmployee);
	}

	/**
	 * Caches the evp employees in the entity cache if it is enabled.
	 *
	 * @param evpEmployees the evp employees
	 */
	@Override
	public void cacheResult(List<EVPEmployee> evpEmployees) {
		for (EVPEmployee evpEmployee : evpEmployees) {
			if (entityCache.getResult(
					EVPEmployeeImpl.class, evpEmployee.getPrimaryKey()) ==
						null) {

				cacheResult(evpEmployee);
			}
		}
	}

	/**
	 * Clears the cache for all evp employees.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EVPEmployeeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the evp employee.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EVPEmployee evpEmployee) {
		entityCache.removeResult(EVPEmployeeImpl.class, evpEmployee);
	}

	@Override
	public void clearCache(List<EVPEmployee> evpEmployees) {
		for (EVPEmployee evpEmployee : evpEmployees) {
			entityCache.removeResult(EVPEmployeeImpl.class, evpEmployee);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(EVPEmployeeImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		EVPEmployeeModelImpl evpEmployeeModelImpl) {

		Object[] args = new Object[] {evpEmployeeModelImpl.getEmployeeUserId()};

		finderCache.putResult(
			_finderPathCountByEmployeeUserId, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByEmployeeUserId, args, evpEmployeeModelImpl,
			false);
	}

	/**
	 * Creates a new evp employee with the primary key. Does not add the evp employee to the database.
	 *
	 * @param evpEmployeeId the primary key for the new evp employee
	 * @return the new evp employee
	 */
	@Override
	public EVPEmployee create(long evpEmployeeId) {
		EVPEmployee evpEmployee = new EVPEmployeeImpl();

		evpEmployee.setNew(true);
		evpEmployee.setPrimaryKey(evpEmployeeId);

		evpEmployee.setCompanyId(CompanyThreadLocal.getCompanyId());

		return evpEmployee;
	}

	/**
	 * Removes the evp employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpEmployeeId the primary key of the evp employee
	 * @return the evp employee that was removed
	 * @throws NoSuchEmployeeException if a evp employee with the primary key could not be found
	 */
	@Override
	public EVPEmployee remove(long evpEmployeeId)
		throws NoSuchEmployeeException {

		return remove((Serializable)evpEmployeeId);
	}

	/**
	 * Removes the evp employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the evp employee
	 * @return the evp employee that was removed
	 * @throws NoSuchEmployeeException if a evp employee with the primary key could not be found
	 */
	@Override
	public EVPEmployee remove(Serializable primaryKey)
		throws NoSuchEmployeeException {

		Session session = null;

		try {
			session = openSession();

			EVPEmployee evpEmployee = (EVPEmployee)session.get(
				EVPEmployeeImpl.class, primaryKey);

			if (evpEmployee == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(evpEmployee);
		}
		catch (NoSuchEmployeeException noSuchEntityException) {
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
	protected EVPEmployee removeImpl(EVPEmployee evpEmployee) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(evpEmployee)) {
				evpEmployee = (EVPEmployee)session.get(
					EVPEmployeeImpl.class, evpEmployee.getPrimaryKeyObj());
			}

			if (evpEmployee != null) {
				session.delete(evpEmployee);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (evpEmployee != null) {
			clearCache(evpEmployee);
		}

		return evpEmployee;
	}

	@Override
	public EVPEmployee updateImpl(EVPEmployee evpEmployee) {
		boolean isNew = evpEmployee.isNew();

		if (!(evpEmployee instanceof EVPEmployeeModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(evpEmployee.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(evpEmployee);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in evpEmployee proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom EVPEmployee implementation " +
					evpEmployee.getClass());
		}

		EVPEmployeeModelImpl evpEmployeeModelImpl =
			(EVPEmployeeModelImpl)evpEmployee;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (evpEmployee.getCreateDate() == null)) {
			if (serviceContext == null) {
				evpEmployee.setCreateDate(date);
			}
			else {
				evpEmployee.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!evpEmployeeModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				evpEmployee.setModifiedDate(date);
			}
			else {
				evpEmployee.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(evpEmployee);
			}
			else {
				evpEmployee = (EVPEmployee)session.merge(evpEmployee);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			EVPEmployeeImpl.class, evpEmployeeModelImpl, false, true);

		cacheUniqueFindersCache(evpEmployeeModelImpl);

		if (isNew) {
			evpEmployee.setNew(false);
		}

		evpEmployee.resetOriginalValues();

		return evpEmployee;
	}

	/**
	 * Returns the evp employee with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the evp employee
	 * @return the evp employee
	 * @throws NoSuchEmployeeException if a evp employee with the primary key could not be found
	 */
	@Override
	public EVPEmployee findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeException {

		EVPEmployee evpEmployee = fetchByPrimaryKey(primaryKey);

		if (evpEmployee == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return evpEmployee;
	}

	/**
	 * Returns the evp employee with the primary key or throws a <code>NoSuchEmployeeException</code> if it could not be found.
	 *
	 * @param evpEmployeeId the primary key of the evp employee
	 * @return the evp employee
	 * @throws NoSuchEmployeeException if a evp employee with the primary key could not be found
	 */
	@Override
	public EVPEmployee findByPrimaryKey(long evpEmployeeId)
		throws NoSuchEmployeeException {

		return findByPrimaryKey((Serializable)evpEmployeeId);
	}

	/**
	 * Returns the evp employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpEmployeeId the primary key of the evp employee
	 * @return the evp employee, or <code>null</code> if a evp employee with the primary key could not be found
	 */
	@Override
	public EVPEmployee fetchByPrimaryKey(long evpEmployeeId) {
		return fetchByPrimaryKey((Serializable)evpEmployeeId);
	}

	/**
	 * Returns all the evp employees.
	 *
	 * @return the evp employees
	 */
	@Override
	public List<EVPEmployee> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the evp employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp employees
	 * @param end the upper bound of the range of evp employees (not inclusive)
	 * @return the range of evp employees
	 */
	@Override
	public List<EVPEmployee> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the evp employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp employees
	 * @param end the upper bound of the range of evp employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of evp employees
	 */
	@Override
	public List<EVPEmployee> findAll(
		int start, int end, OrderByComparator<EVPEmployee> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the evp employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp employees
	 * @param end the upper bound of the range of evp employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of evp employees
	 */
	@Override
	public List<EVPEmployee> findAll(
		int start, int end, OrderByComparator<EVPEmployee> orderByComparator,
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

		List<EVPEmployee> list = null;

		if (useFinderCache) {
			list = (List<EVPEmployee>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EVPEMPLOYEE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EVPEMPLOYEE;

				sql = sql.concat(EVPEmployeeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<EVPEmployee>)QueryUtil.list(
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
	 * Removes all the evp employees from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EVPEmployee evpEmployee : findAll()) {
			remove(evpEmployee);
		}
	}

	/**
	 * Returns the number of evp employees.
	 *
	 * @return the number of evp employees
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_EVPEMPLOYEE);

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
		return "evpEmployeeId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EVPEMPLOYEE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EVPEmployeeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the evp employee persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new EVPEmployeeModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", EVPEmployee.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchByEmployeeUserId = _createFinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByEmployeeUserId",
			new String[] {Long.class.getName()},
			new String[] {"employeeUserId"}, true);

		_finderPathCountByEmployeeUserId = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEmployeeUserId",
			new String[] {Long.class.getName()},
			new String[] {"employeeUserId"}, false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(EVPEmployeeImpl.class.getName());

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

	private static final String _SQL_SELECT_EVPEMPLOYEE =
		"SELECT evpEmployee FROM EVPEmployee evpEmployee";

	private static final String _SQL_SELECT_EVPEMPLOYEE_WHERE =
		"SELECT evpEmployee FROM EVPEmployee evpEmployee WHERE ";

	private static final String _SQL_COUNT_EVPEMPLOYEE =
		"SELECT COUNT(evpEmployee) FROM EVPEmployee evpEmployee";

	private static final String _SQL_COUNT_EVPEMPLOYEE_WHERE =
		"SELECT COUNT(evpEmployee) FROM EVPEmployee evpEmployee WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "evpEmployee.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No EVPEmployee exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No EVPEmployee exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		EVPEmployeePersistenceImpl.class);

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

	private static class EVPEmployeeModelArgumentsResolver
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

			EVPEmployeeModelImpl evpEmployeeModelImpl =
				(EVPEmployeeModelImpl)baseModel;

			long columnBitmask = evpEmployeeModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(evpEmployeeModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						evpEmployeeModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(evpEmployeeModelImpl, columnNames, original);
			}

			return null;
		}

		private static Object[] _getValue(
			EVPEmployeeModelImpl evpEmployeeModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = evpEmployeeModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = evpEmployeeModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static final Map<FinderPath, Long>
			_finderPathColumnBitmasksCache = new ConcurrentHashMap<>();

	}

}