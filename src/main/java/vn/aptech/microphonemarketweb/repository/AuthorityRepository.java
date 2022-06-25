package vn.aptech.microphonemarketweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.aptech.microphonemarketweb.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
