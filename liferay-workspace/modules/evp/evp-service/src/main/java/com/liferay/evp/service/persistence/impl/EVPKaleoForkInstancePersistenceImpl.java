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

import com.liferay.evp.exception.NoSuchKaleoForkInstanceException;
import com.liferay.evp.model.EVPKaleoForkInstance;
import com.liferay.evp.model.impl.EVPKaleoForkInstanceImpl;
import com.liferay.evp.model.impl.EVPKaleoForkInstanceModelImpl;
import com.liferay.evp.service.persistence.EVPKaleoForkInstancePersistence;
import com.liferay.evp.service.persistence.impl.constants.EVPPersistenceConstants;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
 * The persistence implementation for the evp kaleo fork instance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @generated
 */
@Component(service = EVPKaleoForkInstancePersistence.class)
public class EVPKaleoForkInstancePersistenceImpl
	extends BasePersistenceImpl<EVPKaleoForkInstance>
	implements EVPKaleoForkInstancePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>EVPKaleoForkInstanceUtil</code> to access the evp kaleo fork instance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		EVPKaleoForkInstanceImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public EVPKaleoForkInstancePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("type", "type_");

		setDBColumnNames(dbColumnNames);

		setModelClass(EVPKaleoForkInstance.class);

		setModelImplClass(EVPKaleoForkInstanceImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the evp kaleo fork instance in the entity cache if it is enabled.
	 *
	 * @param evpKaleoForkInstance the evp kaleo fork instance
	 */
	@Override
	public void cacheResult(EVPKaleoForkInstance evpKaleoForkInstance) {
		entityCache.putResult(
			EVPKaleoForkInstanceImpl.class,
			evpKaleoForkInstance.getPrimaryKey(), evpKaleoForkInstance);
	}

	/**
	 * Caches the evp kaleo fork instances in the entity cache if it is enabled.
	 *
	 * @param evpKaleoForkInstances the evp kaleo fork instances
	 */
	@Override
	public void cacheResult(List<EVPKaleoForkInstance> evpKaleoForkInstances) {
		for (EVPKaleoForkInstance evpKaleoForkInstance :
				evpKaleoForkInstances) {

			if (entityCache.getResult(
					EVPKaleoForkInstanceImpl.class,
					evpKaleoForkInstance.getPrimaryKey()) == null) {

				cacheResult(evpKaleoForkInstance);
			}
		}
	}

	/**
	 * Clears the cache for all evp kaleo fork instances.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EVPKaleoForkInstanceImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the evp kaleo fork instance.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EVPKaleoForkInstance evpKaleoForkInstance) {
		entityCache.removeResult(
			EVPKaleoForkInstanceImpl.class, evpKaleoForkInstance);
	}

	@Override
	public void clearCache(List<EVPKaleoForkInstance> evpKaleoForkInstances) {
		for (EVPKaleoForkInstance evpKaleoForkInstance :
				evpKaleoForkInstances) {

			entityCache.removeResult(
				EVPKaleoForkInstanceImpl.class, evpKaleoForkInstance);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				EVPKaleoForkInstanceImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new evp kaleo fork instance with the primary key. Does not add the evp kaleo fork instance to the database.
	 *
	 * @param evpKaleoForkInstanceId the primary key for the new evp kaleo fork instance
	 * @return the new evp kaleo fork instance
	 */
	@Override
	public EVPKaleoForkInstance create(long evpKaleoForkInstanceId) {
		EVPKaleoForkInstance evpKaleoForkInstance =
			new EVPKaleoForkInstanceImpl();

		evpKaleoForkInstance.setNew(true);
		evpKaleoForkInstance.setPrimaryKey(evpKaleoForkInstanceId);

		evpKaleoForkInstance.setCompanyId(CompanyThreadLocal.getCompanyId());

		return evpKaleoForkInstance;
	}

	/**
	 * Removes the evp kaleo fork instance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpKaleoForkInstanceId the primary key of the evp kaleo fork instance
	 * @return the evp kaleo fork instance that was removed
	 * @throws NoSuchKaleoForkInstanceException if a evp kaleo fork instance with the primary key could not be found
	 */
	@Override
	public EVPKaleoForkInstance remove(long evpKaleoForkInstanceId)
		throws NoSuchKaleoForkInstanceException {

		return remove((Serializable)evpKaleoForkInstanceId);
	}

	/**
	 * Removes the evp kaleo fork instance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the evp kaleo fork instance
	 * @return the evp kaleo fork instance that was removed
	 * @throws NoSuchKaleoForkInstanceException if a evp kaleo fork instance with the primary key could not be found
	 */
	@Override
	public EVPKaleoForkInstance remove(Serializable primaryKey)
		throws NoSuchKaleoForkInstanceException {

		Session session = null;

		try {
			session = openSession();

			EVPKaleoForkInstance evpKaleoForkInstance =
				(EVPKaleoForkInstance)session.get(
					EVPKaleoForkInstanceImpl.class, primaryKey);

			if (evpKaleoForkInstance == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKaleoForkInstanceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(evpKaleoForkInstance);
		}
		catch (NoSuchKaleoForkInstanceException noSuchEntityException) {
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
	protected EVPKaleoForkInstance removeImpl(
		EVPKaleoForkInstance evpKaleoForkInstance) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(evpKaleoForkInstance)) {
				evpKaleoForkInstance = (EVPKaleoForkInstance)session.get(
					EVPKaleoForkInstanceImpl.class,
					evpKaleoForkInstance.getPrimaryKeyObj());
			}

			if (evpKaleoForkInstance != null) {
				session.delete(evpKaleoForkInstance);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (evpKaleoForkInstance != null) {
			clearCache(evpKaleoForkInstance);
		}

		return evpKaleoForkInstance;
	}

	@Override
	public EVPKaleoForkInstance updateImpl(
		EVPKaleoForkInstance evpKaleoForkInstance) {

		boolean isNew = evpKaleoForkInstance.isNew();

		if (!(evpKaleoForkInstance instanceof EVPKaleoForkInstanceModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(evpKaleoForkInstance.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					evpKaleoForkInstance);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in evpKaleoForkInstance proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom EVPKaleoForkInstance implementation " +
					evpKaleoForkInstance.getClass());
		}

		EVPKaleoForkInstanceModelImpl evpKaleoForkInstanceModelImpl =
			(EVPKaleoForkInstanceModelImpl)evpKaleoForkInstance;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (evpKaleoForkInstance.getCreateDate() == null)) {
			if (serviceContext == null) {
				evpKaleoForkInstance.setCreateDate(now);
			}
			else {
				evpKaleoForkInstance.setCreateDate(
					serviceContext.getCreateDate(now));
			}
		}

		if (!evpKaleoForkInstanceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				evpKaleoForkInstance.setModifiedDate(now);
			}
			else {
				evpKaleoForkInstance.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(evpKaleoForkInstance);
			}
			else {
				evpKaleoForkInstance = (EVPKaleoForkInstance)session.merge(
					evpKaleoForkInstance);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			EVPKaleoForkInstanceImpl.class, evpKaleoForkInstance, false, true);

		if (isNew) {
			evpKaleoForkInstance.setNew(false);
		}

		evpKaleoForkInstance.resetOriginalValues();

		return evpKaleoForkInstance;
	}

	/**
	 * Returns the evp kaleo fork instance with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the evp kaleo fork instance
	 * @return the evp kaleo fork instance
	 * @throws NoSuchKaleoForkInstanceException if a evp kaleo fork instance with the primary key could not be found
	 */
	@Override
	public EVPKaleoForkInstance findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKaleoForkInstanceException {

		EVPKaleoForkInstance evpKaleoForkInstance = fetchByPrimaryKey(
			primaryKey);

		if (evpKaleoForkInstance == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKaleoForkInstanceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return evpKaleoForkInstance;
	}

	/**
	 * Returns the evp kaleo fork instance with the primary key or throws a <code>NoSuchKaleoForkInstanceException</code> if it could not be found.
	 *
	 * @param evpKaleoForkInstanceId the primary key of the evp kaleo fork instance
	 * @return the evp kaleo fork instance
	 * @throws NoSuchKaleoForkInstanceException if a evp kaleo fork instance with the primary key could not be found
	 */
	@Override
	public EVPKaleoForkInstance findByPrimaryKey(long evpKaleoForkInstanceId)
		throws NoSuchKaleoForkInstanceException {

		return findByPrimaryKey((Serializable)evpKaleoForkInstanceId);
	}

	/**
	 * Returns the evp kaleo fork instance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpKaleoForkInstanceId the primary key of the evp kaleo fork instance
	 * @return the evp kaleo fork instance, or <code>null</code> if a evp kaleo fork instance with the primary key could not be found
	 */
	@Override
	public EVPKaleoForkInstance fetchByPrimaryKey(long evpKaleoForkInstanceId) {
		return fetchByPrimaryKey((Serializable)evpKaleoForkInstanceId);
	}

	/**
	 * Returns all the evp kaleo fork instances.
	 *
	 * @return the evp kaleo fork instances
	 */
	@Override
	public List<EVPKaleoForkInstance> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<EVPKaleoForkInstance> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<EVPKaleoForkInstance> findAll(
		int start, int end,
		OrderByComparator<EVPKaleoForkInstance> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<EVPKaleoForkInstance> findAll(
		int start, int end,
		OrderByComparator<EVPKaleoForkInstance> orderByComparator,
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

		List<EVPKaleoForkInstance> list = null;

		if (useFinderCache) {
			list = (List<EVPKaleoForkInstance>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EVPKALEOFORKINSTANCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EVPKALEOFORKINSTANCE;

				sql = sql.concat(EVPKaleoForkInstanceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<EVPKaleoForkInstance>)QueryUtil.list(
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
	 * Removes all the evp kaleo fork instances from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EVPKaleoForkInstance evpKaleoForkInstance : findAll()) {
			remove(evpKaleoForkInstance);
		}
	}

	/**
	 * Returns the number of evp kaleo fork instances.
	 *
	 * @return the number of evp kaleo fork instances
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
					_SQL_COUNT_EVPKALEOFORKINSTANCE);

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
		return "evpKaleoForkInstanceId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EVPKALEOFORKINSTANCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EVPKaleoForkInstanceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the evp kaleo fork instance persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new EVPKaleoForkInstanceModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", EVPKaleoForkInstance.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(EVPKaleoForkInstanceImpl.class.getName());

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

	private static final String _SQL_SELECT_EVPKALEOFORKINSTANCE =
		"SELECT evpKaleoForkInstance FROM EVPKaleoForkInstance evpKaleoForkInstance";

	private static final String _SQL_COUNT_EVPKALEOFORKINSTANCE =
		"SELECT COUNT(evpKaleoForkInstance) FROM EVPKaleoForkInstance evpKaleoForkInstance";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"evpKaleoForkInstance.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No EVPKaleoForkInstance exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		EVPKaleoForkInstancePersistenceImpl.class);

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

	private static class EVPKaleoForkInstanceModelArgumentsResolver
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

			EVPKaleoForkInstanceModelImpl evpKaleoForkInstanceModelImpl =
				(EVPKaleoForkInstanceModelImpl)baseModel;

			long columnBitmask =
				evpKaleoForkInstanceModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					evpKaleoForkInstanceModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						evpKaleoForkInstanceModelImpl.getColumnBitmask(
							columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					evpKaleoForkInstanceModelImpl, columnNames, original);
			}

			return null;
		}

		private Object[] _getValue(
			EVPKaleoForkInstanceModelImpl evpKaleoForkInstanceModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						evpKaleoForkInstanceModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = evpKaleoForkInstanceModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}