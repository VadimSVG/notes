package vadimsw.notes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import vadimsw.notes.models.Note;

public interface NoteRepository extends CrudRepository<Note,Long> {

}
