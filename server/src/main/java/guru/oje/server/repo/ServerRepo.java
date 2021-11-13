package guru.oje.server.repo;

import guru.oje.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String IpAddress);
    // Server findByName(String name);
}
