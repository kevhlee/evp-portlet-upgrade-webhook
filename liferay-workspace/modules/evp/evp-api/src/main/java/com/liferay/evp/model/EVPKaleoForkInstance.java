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

package com.liferay.evp.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the EVPKaleoForkInstance service. Represents a row in the &quot;EVPKaleoForkInstance&quot; database table, with each column mapped to a property of this class.
 *
 * @author Val Nagy
 * @see EVPKaleoForkInstanceModel
 * @generated
 */
@ImplementationClassName("com.liferay.evp.model.impl.EVPKaleoForkInstanceImpl")
@ProviderType
public interface EVPKaleoForkInstance
	extends EVPKaleoForkInstanceModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.liferay.evp.model.impl.EVPKaleoForkInstanceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<EVPKaleoForkInstance, Long>
		EVP_KALEO_FORK_INSTANCE_ID_ACCESSOR =
			new Accessor<EVPKaleoForkInstance, Long>() {

				@Override
				public Long get(EVPKaleoForkInstance evpKaleoForkInstance) {
					return evpKaleoForkInstance.getEvpKaleoForkInstanceId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<EVPKaleoForkInstance> getTypeClass() {
					return EVPKaleoForkInstance.class;
				}

			};

}