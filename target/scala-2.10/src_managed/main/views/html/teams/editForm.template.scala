
package views.html.teams

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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Team],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, zespolForm: Form[Team]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

<h1>Edytuj Zespół</h1>

"""),_display_(Seq[Any](/*11.2*/form(routes.Teams.update(id))/*11.31*/ {_display_(Seq[Any](format.raw/*11.33*/("""

<fieldset>

    """),_display_(Seq[Any](/*15.6*/inputText(zespolForm("name"), '_label -> "Nazwa zespołu"))),format.raw/*15.63*/("""
    """),_display_(Seq[Any](/*16.6*/inputText(zespolForm("crest"), '_label -> "Nazwa obrazka z herbem"))),format.raw/*16.73*/("""

</fieldset>

<div class="actions">
    <input type="submit" value="Edytuj zespół" class="btn primary"> or
    <a href=""""),_display_(Seq[Any](/*22.15*/routes/*22.21*/.Teams.list())),format.raw/*22.34*/("""" class="btn">Anuluj</a>
</div>

""")))})),format.raw/*25.2*/("""

"""),_display_(Seq[Any](/*27.2*/form(routes.Teams.delete(id), 'class -> "topRight")/*27.53*/ {_display_(Seq[Any](format.raw/*27.55*/("""
<input type="submit" value="Usuń ten zespół" class="btn danger">
""")))})),format.raw/*29.2*/("""

""")))})),format.raw/*31.2*/("""
"""))}
    }
    
    def render(id:Long,zespolForm:Form[Team]): play.api.templates.HtmlFormat.Appendable = apply(id,zespolForm)
    
    def f:((Long,Form[Team]) => play.api.templates.HtmlFormat.Appendable) = (id,zespolForm) => apply(id,zespolForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 24 19:19:22 CEST 2014
                    SOURCE: C:/Users/Mateusz/test/test/app/views/teams/editForm.scala.html
                    HASH: 753a51268c4ce252c53ca24926625fcda574c72b
                    MATRIX: 792->1|929->60|961->84|1045->35|1075->57|1104->138|1143->143|1154->147|1192->149|1258->180|1296->209|1336->211|1394->234|1473->291|1515->298|1604->365|1768->493|1783->499|1818->512|1886->549|1926->554|1986->605|2026->607|2126->676|2162->681
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|50->22|50->22|50->22|53->25|55->27|55->27|55->27|57->29|59->31
                    -- GENERATED --
                */
            