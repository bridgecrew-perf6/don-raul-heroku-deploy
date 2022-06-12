package com.donRaulHardwaresStore.donRaulHardwaresStore.repositories;

import com.donRaulHardwaresStore.donRaulHardwaresStore.collections.Bill;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBillRepository extends ReactiveMongoRepository<Bill, String> {
}
