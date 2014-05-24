package models;


        import java.util.*;
        import javax.validation.*;
        import javax.persistence.*;

        import play.db.ebean.*;
        import play.data.format.*;
        import play.data.validation.*;
        import play.data.validation.Constraints.*;

        import com.avaje.ebean.*;

/**
 * Created by Mateusz on 2014-05-24.
 */








/**
 * Created by Mateusz on 2014-05-24.
 */
@Entity
public class Match1 extends Model {

    @Id
    public Long id;

    @Constraints.Required
    public Long ResultA;

    @Constraints.Required
    public Long ResultB;

    public static Finder<Long, Match1> find = new Finder<Long,Match1>(Long.class, Match1.class);

}
