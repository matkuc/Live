package controllers;

import play.mvc.*;
import play.data.*;
import play.api.mvc.Call;
import static play.data.Form.*;

import views.html.players.*;
import views.html.*;


import models.*;

public class Players extends Controller {

    public static Result GO_HOME = redirect(
            routes.Players.list(0, "lastname", "asc", "")
    );

    public static Result index() {
        return GO_HOME;
    }

    public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
                views.html.players.list.render(
                        Player.page(page, 10, sortBy, order, filter),
                        sortBy, order, filter
                )
        );
    }

    public static Result edit(Long id) {
        Form<Player> playerForm = form(Player.class).fill(
                Player.find.byId(id)
        );
        return ok(
                views.html.players.editForm.render(id, playerForm)
        );
    }

    public static Result update(Long id) {
        Form<Player> playerForm = form(Player.class).bindFromRequest();
        if(playerForm.hasErrors()) {
            return badRequest(views.html.players.editForm.render(id, playerForm));
        }
        playerForm.get().update(id);
        flash("success", "Piłkarz " + playerForm.get().lastname + " został zaktualizowany");
        return GO_HOME;
    }


    public static Result create() {
        Form<Player> playerForm = form(Player.class);
        return ok(
                views.html.players.createForm.render(playerForm)
        );
    }

    public static Result save() {
        Form<Player> playerForm = form(Player.class).bindFromRequest();
        if(playerForm.hasErrors()) {
            return badRequest(views.html.players.createForm.render(playerForm));
        }
        playerForm.get().save();
        flash("success", "Piłkarz " + playerForm.get().lastname + " został dodany!");
        return GO_HOME;
    }

    public static Result delete(Long id) {
        Player.find.ref(id).delete();
        flash("success", "Piłkarz został usunięty");
        return GO_HOME;
    }


}
            
