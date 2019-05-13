/**
 * Copyright © 2018 spring-data-dynamodb-examples-simple (https://github.com/derjust/spring-data-dynamodb/spring-data-dynamodb-examples/spring-data-dynamodb-examples-simple)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.derjust.spring_data_dynamodb_examples.simple;

import java.util.Collection;
import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.socialsignin.spring.data.dynamodb.repository.EnableScanCount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PagingUserRepository extends PagingAndSortingRepository<User, String> {
	Page<User> findByLastName(String lastName, Pageable pageable);

	@EnableScan
	@EnableScanCount
	Page<User> findAll(Pageable pageable);
	
	@EnableScan
	List<User> findByIdIn(Collection<String> id);


}