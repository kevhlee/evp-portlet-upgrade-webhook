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
 * The extended model interface for the EVPGrantRequest service. Represents a row in the &quot;EVPGrantRequest&quot; database table, with each column mapped to a property of this class.
 *
 * @author Val Nagy
 * @see EVPGrantRequestModel
 * @generated
 */
@ImplementationClassName("com.liferay.evp.model.impl.EVPGrantRequestImpl")
@ProviderType
public interface EVPGrantRequest extends EVPGrantRequestModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.liferay.evp.model.impl.EVPGrantRequestImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<EVPGrantRequest, Long>
		EVP_GRANT_REQUEST_ID_ACCESSOR = new Accessor<EVPGrantRequest, Long>() {

			@Override
			public Long get(EVPGrantRequest evpGrantRequest) {
				return evpGrantRequest.getEvpGrantRequestId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<EVPGrantRequest> getTypeClass() {
				return EVPGrantRequest.class;
			}

		};

}