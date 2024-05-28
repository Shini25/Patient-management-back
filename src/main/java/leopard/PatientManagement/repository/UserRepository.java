package leopard.PatientManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import leopard.PatientManagement.model.User_account;

public interface UserRepository extends JpaRepository<User_account, String> {
    // Vous pouvez ajouter des méthodes de requête personnalisées ici si nécessaire
}
