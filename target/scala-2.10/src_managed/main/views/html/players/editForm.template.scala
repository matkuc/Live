
package views.html.players

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Player],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, playerForm: Form[Player]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

<h1>Edytuj piłkarza</h1>

"""),_display_(Seq[Any](/*11.2*/form(routes.Players.update(id))/*11.33*/ {_display_(Seq[Any](format.raw/*11.35*/("""

<fieldset>

    """),_display_(Seq[Any](/*15.6*/inputText(playerForm("firstname"), '_label -> "Imię"))),format.raw/*15.59*/("""
    """),_display_(Seq[Any](/*16.6*/inputText(playerForm("lastname"), '_label -> "Nazwisko"))),format.raw/*16.62*/("""

    """),_display_(Seq[Any](/*18.6*/select(
    playerForm("team.id"),
    options(Team.options),
    '_label -> "Zespół", '_default -> "-- Wybierz zespół --",
    '_showConstraints -> false
    ))),format.raw/*23.6*/("""

    """),_display_(Seq[Any](/*25.6*/inputText(playerForm("date_birth"), '_label -> "Data urodzin"))),format.raw/*25.68*/("""
    """),_display_(Seq[Any](/*26.6*/inputText(playerForm("photo"), '_label -> "Zdjęcie"))),format.raw/*26.58*/("""
    """),_display_(Seq[Any](/*27.6*/inputText(playerForm("height"), '_label -> "Wzrost"))),format.raw/*27.58*/("""
    """),_display_(Seq[Any](/*28.6*/inputText(playerForm("weight"), '_label -> "Waga"))),format.raw/*28.56*/("""
    """),_display_(Seq[Any](/*29.6*/inputText(playerForm("position"), '_label -> "Pozycja"))),format.raw/*29.61*/("""
    """),_display_(Seq[Any](/*30.6*/inputText(playerForm("number"), '_label -> "Numer"))),format.raw/*30.57*/("""

</fieldset>

<div class="actions">
    <input type="submit" value="Edytuj piłkarza" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*36.15*/routes/*36.21*/.Players.list())),format.raw/*36.36*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*39.2*/("""

"""),_display_(Seq[Any](/*41.2*/form(routes.Players.delete(id), 'class -> "topRight")/*41.55*/ {_display_(Seq[Any](format.raw/*41.57*/("""
<input type="submit" value="Usuń piłkarza" class="btn danger">
""")))})),format.raw/*43.2*/("""

""")))})),format.raw/*45.2*/("""
"""))}
    }
    
    def render(id:Long,playerForm:Form[Player]): play.api.templates.HtmlFormat.Appendable = apply(id,playerForm)
    
    def f:((Long,Form[Player]) => play.api.templates.HtmlFormat.Appendable) = (id,playerForm) => apply(id,playerForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 24 19:19:22 CEST 2014
                    SOURCE: C:/Users/Mateusz/test/test/app/views/players/editForm.scala.html
                    HASH: 4231defd9b7501d9068334c6b2348c2595f841fc
                    MATRIX: 796->1|935->62|967->86|1051->37|1081->59|1110->140|1149->145|1160->149|1198->151|1266->184|1306->215|1346->217|1404->240|1479->293|1521->300|1599->356|1643->365|1829->530|1873->539|1957->601|1999->608|2073->660|2115->667|2189->719|2231->726|2303->776|2345->783|2422->838|2464->845|2537->896|2703->1026|2718->1032|2755->1047|2823->1084|2863->1089|2925->1142|2965->1144|3063->1211|3099->1216
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|46->18|51->23|53->25|53->25|54->26|54->26|55->27|55->27|56->28|56->28|57->29|57->29|58->30|58->30|64->36|64->36|64->36|67->39|69->41|69->41|69->41|71->43|73->45
                    -- GENERATED --
                */
            