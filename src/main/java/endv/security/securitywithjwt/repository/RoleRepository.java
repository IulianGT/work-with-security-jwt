package endv.security.securitywithjwt.repository;

import endv.security.securitywithjwt.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
