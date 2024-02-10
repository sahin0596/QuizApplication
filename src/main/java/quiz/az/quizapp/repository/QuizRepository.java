package quiz.az.quizapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import quiz.az.quizapp.entity.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz,Long> {
}
