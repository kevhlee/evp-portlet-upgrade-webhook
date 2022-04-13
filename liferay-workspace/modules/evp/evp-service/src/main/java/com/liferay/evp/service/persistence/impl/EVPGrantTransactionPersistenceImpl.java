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

import com.liferay.evp.exception.NoSuchGrantTransactionException;
import com.liferay.evp.model.EVPGrantTransaction;
import com.liferay.evp.model.impl.EVPGrantTransactionImpl;
import com.liferay.evp.model.impl.EVPGrantTransactionModelImpl;
import com.liferay.evp.service.persistence.EVPGrantTransactionPersistence;
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
 * The persistence implementation for the evp grant transaction service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Val Nagy
 * @generated
 */
@Component(service = EVPGrantTransactionPersistence.class)
public class EVPGrantTransactionPersistenceImpl
	extends BasePersistenceImpl<EVPGrantTransaction>
	implements EVPGrantTransactionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>EVPGrantTransactionUtil</code> to access the evp grant transaction persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		EVPGrantTransactionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public EVPGrantTransactionPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("date", "date_");
		dbColumnNames.put("number", "number_");

		setDBColumnNames(dbColumnNames);

		setModelClass(EVPGrantTransaction.class);

		setModelImplClass(EVPGrantTransactionImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the evp grant transaction in the entity cache if it is enabled.
	 *
	 * @param evpGrantTransaction the evp grant transaction
	 */
	@Override
	public void cacheResult(EVPGrantTransaction evpGrantTransaction) {
		entityCache.putResult(
			EVPGrantTransactionImpl.class, evpGrantTransaction.getPrimaryKey(),
			evpGrantTransaction);
	}

	/**
	 * Caches the evp grant transactions in the entity cache if it is enabled.
	 *
	 * @param evpGrantTransactions the evp grant transactions
	 */
	@Override
	public void cacheResult(List<EVPGrantTransaction> evpGrantTransactions) {
		for (EVPGrantTransaction evpGrantTransaction : evpGrantTransactions) {
			if (entityCache.getResult(
					EVPGrantTransactionImpl.class,
					evpGrantTransaction.getPrimaryKey()) == null) {

				cacheResult(evpGrantTransaction);
			}
		}
	}

	/**
	 * Clears the cache for all evp grant transactions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EVPGrantTransactionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the evp grant transaction.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EVPGrantTransaction evpGrantTransaction) {
		entityCache.removeResult(
			EVPGrantTransactionImpl.class, evpGrantTransaction);
	}

	@Override
	public void clearCache(List<EVPGrantTransaction> evpGrantTransactions) {
		for (EVPGrantTransaction evpGrantTransaction : evpGrantTransactions) {
			entityCache.removeResult(
				EVPGrantTransactionImpl.class, evpGrantTransaction);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(EVPGrantTransactionImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new evp grant transaction with the primary key. Does not add the evp grant transaction to the database.
	 *
	 * @param evpGrantTransactionId the primary key for the new evp grant transaction
	 * @return the new evp grant transaction
	 */
	@Override
	public EVPGrantTransaction create(long evpGrantTransactionId) {
		EVPGrantTransaction evpGrantTransaction = new EVPGrantTransactionImpl();

		evpGrantTransaction.setNew(true);
		evpGrantTransaction.setPrimaryKey(evpGrantTransactionId);

		evpGrantTransaction.setCompanyId(CompanyThreadLocal.getCompanyId());

		return evpGrantTransaction;
	}

	/**
	 * Removes the evp grant transaction with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpGrantTransactionId the primary key of the evp grant transaction
	 * @return the evp grant transaction that was removed
	 * @throws NoSuchGrantTransactionException if a evp grant transaction with the primary key could not be found
	 */
	@Override
	public EVPGrantTransaction remove(long evpGrantTransactionId)
		throws NoSuchGrantTransactionException {

		return remove((Serializable)evpGrantTransactionId);
	}

	/**
	 * Removes the evp grant transaction with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the evp grant transaction
	 * @return the evp grant transaction that was removed
	 * @throws NoSuchGrantTransactionException if a evp grant transaction with the primary key could not be found
	 */
	@Override
	public EVPGrantTransaction remove(Serializable primaryKey)
		throws NoSuchGrantTransactionException {

		Session session = null;

		try {
			session = openSession();

			EVPGrantTransaction evpGrantTransaction =
				(EVPGrantTransaction)session.get(
					EVPGrantTransactionImpl.class, primaryKey);

			if (evpGrantTransaction == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchGrantTransactionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(evpGrantTransaction);
		}
		catch (NoSuchGrantTransactionException noSuchEntityException) {
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
	protected EVPGrantTransaction removeImpl(
		EVPGrantTransaction evpGrantTransaction) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(evpGrantTransaction)) {
				evpGrantTransaction = (EVPGrantTransaction)session.get(
					EVPGrantTransactionImpl.class,
					evpGrantTransaction.getPrimaryKeyObj());
			}

			if (evpGrantTransaction != null) {
				session.delete(evpGrantTransaction);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (evpGrantTransaction != null) {
			clearCache(evpGrantTransaction);
		}

		return evpGrantTransaction;
	}

	@Override
	public EVPGrantTransaction updateImpl(
		EVPGrantTransaction evpGrantTransaction) {

		boolean isNew = evpGrantTransaction.isNew();

		if (!(evpGrantTransaction instanceof EVPGrantTransactionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(evpGrantTransaction.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					evpGrantTransaction);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in evpGrantTransaction proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom EVPGrantTransaction implementation " +
					evpGrantTransaction.getClass());
		}

		EVPGrantTransactionModelImpl evpGrantTransactionModelImpl =
			(EVPGrantTransactionModelImpl)evpGrantTransaction;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (evpGrantTransaction.getCreateDate() == null)) {
			if (serviceContext == null) {
				evpGrantTransaction.setCreateDate(date);
			}
			else {
				evpGrantTransaction.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!evpGrantTransactionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				evpGrantTransaction.setModifiedDate(date);
			}
			else {
				evpGrantTransaction.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(evpGrantTransaction);
			}
			else {
				evpGrantTransaction = (EVPGrantTransaction)session.merge(
					evpGrantTransaction);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			EVPGrantTransactionImpl.class, evpGrantTransaction, false, true);

		if (isNew) {
			evpGrantTransaction.setNew(false);
		}

		evpGrantTransaction.resetOriginalValues();

		return evpGrantTransaction;
	}

	/**
	 * Returns the evp grant transaction with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the evp grant transaction
	 * @return the evp grant transaction
	 * @throws NoSuchGrantTransactionException if a evp grant transaction with the primary key could not be found
	 */
	@Override
	public EVPGrantTransaction findByPrimaryKey(Serializable primaryKey)
		throws NoSuchGrantTransactionException {

		EVPGrantTransaction evpGrantTransaction = fetchByPrimaryKey(primaryKey);

		if (evpGrantTransaction == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchGrantTransactionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return evpGrantTransaction;
	}

	/**
	 * Returns the evp grant transaction with the primary key or throws a <code>NoSuchGrantTransactionException</code> if it could not be found.
	 *
	 * @param evpGrantTransactionId the primary key of the evp grant transaction
	 * @return the evp grant transaction
	 * @throws NoSuchGrantTransactionException if a evp grant transaction with the primary key could not be found
	 */
	@Override
	public EVPGrantTransaction findByPrimaryKey(long evpGrantTransactionId)
		throws NoSuchGrantTransactionException {

		return findByPrimaryKey((Serializable)evpGrantTransactionId);
	}

	/**
	 * Returns the evp grant transaction with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param evpGrantTransactionId the primary key of the evp grant transaction
	 * @return the evp grant transaction, or <code>null</code> if a evp grant transaction with the primary key could not be found
	 */
	@Override
	public EVPGrantTransaction fetchByPrimaryKey(long evpGrantTransactionId) {
		return fetchByPrimaryKey((Serializable)evpGrantTransactionId);
	}

	/**
	 * Returns all the evp grant transactions.
	 *
	 * @return the evp grant transactions
	 */
	@Override
	public List<EVPGrantTransaction> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the evp grant transactions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantTransactionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp grant transactions
	 * @param end the upper bound of the range of evp grant transactions (not inclusive)
	 * @return the range of evp grant transactions
	 */
	@Override
	public List<EVPGrantTransaction> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the evp grant transactions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantTransactionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp grant transactions
	 * @param end the upper bound of the range of evp grant transactions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of evp grant transactions
	 */
	@Override
	public List<EVPGrantTransaction> findAll(
		int start, int end,
		OrderByComparator<EVPGrantTransaction> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the evp grant transactions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EVPGrantTransactionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp grant transactions
	 * @param end the upper bound of the range of evp grant transactions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of evp grant transactions
	 */
	@Override
	public List<EVPGrantTransaction> findAll(
		int start, int end,
		OrderByComparator<EVPGrantTransaction> orderByComparator,
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

		List<EVPGrantTransaction> list = null;

		if (useFinderCache) {
			list = (List<EVPGrantTransaction>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EVPGRANTTRANSACTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EVPGRANTTRANSACTION;

				sql = sql.concat(EVPGrantTransactionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<EVPGrantTransaction>)QueryUtil.list(
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
	 * Removes all the evp grant transactions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EVPGrantTransaction evpGrantTransaction : findAll()) {
			remove(evpGrantTransaction);
		}
	}

	/**
	 * Returns the number of evp grant transactions.
	 *
	 * @return the number of evp grant transactions
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
					_SQL_COUNT_EVPGRANTTRANSACTION);

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
		return "evpGrantTransactionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EVPGRANTTRANSACTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EVPGrantTransactionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the evp grant transaction persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new EVPGrantTransactionModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", EVPGrantTransaction.class.getName()));

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
		entityCache.removeCache(EVPGrantTransactionImpl.class.getName());

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

	private static final String _SQL_SELECT_EVPGRANTTRANSACTION =
		"SELECT evpGrantTransaction FROM EVPGrantTransaction evpGrantTransaction";

	private static final String _SQL_COUNT_EVPGRANTTRANSACTION =
		"SELECT COUNT(evpGrantTransaction) FROM EVPGrantTransaction evpGrantTransaction";

	private static final String _ORDER_BY_ENTITY_ALIAS = "evpGrantTransaction.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No EVPGrantTransaction exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		EVPGrantTransactionPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"date", "number"});

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

	private static class EVPGrantTransactionModelArgumentsResolver
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

			EVPGrantTransactionModelImpl evpGrantTransactionModelImpl =
				(EVPGrantTransactionModelImpl)baseModel;

			long columnBitmask =
				evpGrantTransactionModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					evpGrantTransactionModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						evpGrantTransactionModelImpl.getColumnBitmask(
							columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					evpGrantTransactionModelImpl, columnNames, original);
			}

			return null;
		}

		private static Object[] _getValue(
			EVPGrantTransactionModelImpl evpGrantTransactionModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						evpGrantTransactionModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = evpGrantTransactionModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static final Map<FinderPath, Long>
			_finderPathColumnBitmasksCache = new ConcurrentHashMap<>();

	}

}