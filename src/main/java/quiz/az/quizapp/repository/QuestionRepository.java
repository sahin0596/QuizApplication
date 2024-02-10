package quiz.az.quizapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quiz.az.quizapp.entity.QuestionEntity;

import java.util.UUID;


@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity, UUID> {


}
