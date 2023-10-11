package vadimsw.notes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import vadimsw.notes.models.Note;

public interface NoteRepository extends JpaRepository<Note,Long> {

}
