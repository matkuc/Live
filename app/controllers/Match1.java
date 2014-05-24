package controllers;

import play.mvc.*;
import play.data.*;
import play.api.mvc.Call;
import static play.data.Form.*;



import views.html.players.*;
import views.html.*;
/**
 * Created by Mateusz on 2014-05-24.
 */
public class Match1 extends Controller{

    public static Result r1()
    {

        long c = 1;
        models.Match1 z = models.Match1.find.byId(c);
        return ok( livescore.render(z.ResultA, z.ResultB) );
    };

    public static Result ScoreA(Long a, Long b)
    {
        long c = 1;
        models.Match1 z = models.Match1.find.byId(c);
        z.ResultA = z.ResultA + 1;
        z.update(c);

         return ok(livescore.render(z.ResultA, z.ResultB));
    };

    public static Result ScoreB(Long a, Long b)
    {
        b = b+1;
        return ok(livescore.render(a, b));
    };


}
