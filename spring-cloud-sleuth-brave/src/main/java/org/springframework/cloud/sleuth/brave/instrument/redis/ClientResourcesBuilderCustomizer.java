/*
 * Copyright 2013-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.sleuth.brave.instrument.redis;

import io.lettuce.core.resource.ClientResources;

/**
 * Customizer for {@link ClientResources.Builder}.
 *
 * @author Marcin Grzejszczak
 * @since 3.0.4
 */
public interface ClientResourcesBuilderCustomizer {

	/**
	 * Customizes the builder.
	 * @param builder builder to customize
	 */
	void customize(ClientResources.Builder builder);
}
