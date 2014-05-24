package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import models.*;

public class Teams extends Controller {

    public static Result GO_HOME = redirect(
            routes.Teams.list(0, "name", "asc", "")
    );

    public static Result index() {
        return GO_HOME;
    }

    public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
                views.html.teams.list.render(
                        Team.page(page, 10, sortBy, order, filter),
                        sortBy, order, filter
                )
        );
    }

    public static Result edit(Long id) {
        Form<Team> teamForm = form(Team.class).fill(
                Team.find.byId(id)
        );
        return ok(
                views.html.teams.editForm.render(id, teamForm)
        );
    }

    public static Result update(Long id) {
        Form<Team> teamForm = form(Team.class).bindFromRequest();
        if(teamForm.hasErrors()) {
            return badRequest(views.html.teams.editForm.render(id, teamForm));
        }
        teamForm.get().update(id);
        flash("success", "Zespół " + teamForm.get().name + " został zaktualizowany");
        return GO_HOME;
    }


    public static Result create() {
        Form<Team> teamForm = form(Team.class);
        return ok(
                views.html.teams.createForm.render(teamForm)
        );
    }

    public static Result save() {
        Form<Team> teamForm = form(Team.class).bindFromRequest();
        if(teamForm.hasErrors()) {
            return badRequest(views.html.teams.createForm.render(teamForm));
        }
        teamForm.get().save();
        flash("success", "Zespół " + teamForm.get().name + " został dodany!");
        return GO_HOME;
    }

    public static Result delete(Long id) {
        Team.find.ref(id).delete();
        flash("success", "Zespół został usunięty");
        return GO_HOME;
    }


}
            
