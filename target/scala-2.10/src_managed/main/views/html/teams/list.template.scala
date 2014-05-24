
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Team],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Team], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*32.2*/header/*32.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.38*/("""
<th class=""""),_display_(Seq[Any](/*33.13*/key/*33.16*/.replace(".","_"))),format.raw/*33.33*/(""" header """),_display_(Seq[Any](/*33.42*/if(currentSortBy == key){/*33.68*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*33.132*/("""">
<a href=""""),_display_(Seq[Any](/*34.11*/link(0, key))),format.raw/*34.23*/("""">"""),_display_(Seq[Any](/*34.26*/title)),format.raw/*34.31*/("""</a>
</th>
""")))};def /*6.2*/link/*6.6*/(newPage:Int, newSortBy:String) = {{

var sortBy = currentSortBy
var order = currentOrder

if(newSortBy != null) {
sortBy = newSortBy
if(currentSortBy == newSortBy) {
if(currentOrder == "asc") {
order = "desc"
} else {
order = "asc"
}
} else {
order = "asc"
}
}

// Generate the link
routes.Teams.list(newPage, sortBy, order, currentFilter)

}};
Seq[Any](format.raw/*1.111*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""

<h1 id="homeTitle">"""),_display_(Seq[Any](/*40.21*/Messages("teams.list.title", currentPage.getTotalRowCount))),format.raw/*40.79*/("""</h1>

"""),_display_(Seq[Any](/*42.2*/if(flash.containsKey("success"))/*42.34*/ {_display_(Seq[Any](format.raw/*42.36*/("""
<div class="alert-message warning">
    <strong>Gotowe!</strong> """),_display_(Seq[Any](/*44.31*/flash/*44.36*/.get("success"))),format.raw/*44.51*/("""
</div>
""")))})),format.raw/*46.2*/("""

<div id="actions">

    <form action=""""),_display_(Seq[Any](/*50.20*/link(0, "nazwa"))),format.raw/*50.36*/("""" method="GET">
    <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*51.58*/currentFilter)),format.raw/*51.71*/("""" placeholder="Filtruj po nazwie">
    <input type="submit" id="searchsubmit" value="Sortuj" class="btn primary">
    </form>

    <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.44*/routes/*55.50*/.Teams.create())),format.raw/*55.65*/("""">Dodaj zespół</a>

</div>

"""),_display_(Seq[Any](/*59.2*/if(currentPage.getTotalRowCount == 0)/*59.39*/ {_display_(Seq[Any](format.raw/*59.41*/("""

<div class="well">
    <em>Nie ma nic do wyświetlenia</em>
</div>

""")))}/*65.3*/else/*65.8*/{_display_(Seq[Any](format.raw/*65.9*/("""

<table class="computers zebra-striped">
    <thead>
    <tr>
        """),_display_(Seq[Any](/*70.10*/header("name", "Nazwa zespołu"))),format.raw/*70.41*/("""
        """),_display_(Seq[Any](/*71.10*/header("crest", "Herb"))),format.raw/*71.33*/("""
    </tr>
    </thead>
    <tbody>

    """),_display_(Seq[Any](/*76.6*/for(team <- currentPage.getList) yield /*76.38*/ {_display_(Seq[Any](format.raw/*76.40*/("""
    <tr>
        <td><a href=""""),_display_(Seq[Any](/*78.23*/routes/*78.29*/.Teams.edit(team.id))),format.raw/*78.49*/("""">"""),_display_(Seq[Any](/*78.52*/team/*78.56*/.name)),format.raw/*78.61*/("""</a></td>
        <td>
            """),_display_(Seq[Any](/*80.14*/if(team.crest == null)/*80.36*/ {_display_(Seq[Any](format.raw/*80.38*/("""
            <em>-</em>
            """)))}/*82.15*/else/*82.20*/{_display_(Seq[Any](format.raw/*82.21*/("""
            """),_display_(Seq[Any](/*83.14*/team/*83.18*/.crest)),format.raw/*83.24*/("""
            """)))})),format.raw/*84.14*/("""
        </td>
    </tr>
    """)))})),format.raw/*87.6*/("""

    </tbody>
</table>

<div id="pagination" class="pagination">
    <ul>
        """),_display_(Seq[Any](/*94.10*/if(currentPage.hasPrev)/*94.33*/ {_display_(Seq[Any](format.raw/*94.35*/("""
        <li class="prev">
            <a href=""""),_display_(Seq[Any](/*96.23*/link(currentPage.getPageIndex - 1, null))),format.raw/*96.63*/("""">&larr; Poprzedni</a>
        </li>
        """)))}/*98.11*/else/*98.16*/{_display_(Seq[Any](format.raw/*98.17*/("""
        <li class="prev disabled">
            <a>&larr; Poprzedni</a>
        </li>
        """)))})),format.raw/*102.10*/("""
        <li class="current">
            <a>Wyświetla """),_display_(Seq[Any](/*104.27*/currentPage/*104.38*/.getDisplayXtoYofZ(" do "," z "))),format.raw/*104.70*/("""</a>
        </li>
        """),_display_(Seq[Any](/*106.10*/if(currentPage.hasNext)/*106.33*/ {_display_(Seq[Any](format.raw/*106.35*/("""
        <li class="next">
            <a href=""""),_display_(Seq[Any](/*108.23*/link(currentPage.getPageIndex + 1, null))),format.raw/*108.63*/("""">Następny &rarr;</a>
        </li>
        """)))}/*110.11*/else/*110.16*/{_display_(Seq[Any](format.raw/*110.17*/("""
        <li class="next disabled">
            <a>Następny &rarr;</a>
        </li>
        """)))})),format.raw/*114.10*/("""
    </ul>
</div>


<a class="btn success" id="add" href=""""),_display_(Seq[Any](/*119.40*/routes/*119.46*/.Match1.r1())),format.raw/*119.58*/("""">Transmisja</a>

""")))})),format.raw/*121.2*/("""

""")))})),format.raw/*123.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Team],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Team],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 24 19:19:22 CEST 2014
                    SOURCE: C:/Users/Mateusz/test/test/app/views/teams/list.scala.html
                    HASH: 3db7abf69354df1fa07a65681d28c524a1bda4ae
                    MATRIX: 820->1|1007->729|1021->735|1132->765|1182->779|1194->782|1233->799|1278->808|1312->834|1400->898|1450->912|1484->924|1523->927|1550->932|1586->244|1597->248|1992->110|2023->241|2052->612|2084->726|2113->946|2153->951|2165->955|2204->957|2264->981|2344->1039|2389->1049|2430->1081|2470->1083|2575->1152|2589->1157|2626->1172|2668->1183|2749->1228|2787->1244|2897->1318|2932->1331|3142->1505|3157->1511|3194->1526|3262->1559|3308->1596|3348->1598|3442->1675|3454->1680|3492->1681|3605->1758|3658->1789|3705->1800|3750->1823|3832->1870|3880->1902|3920->1904|3990->1938|4005->1944|4047->1964|4086->1967|4099->1971|4126->1976|4200->2014|4231->2036|4271->2038|4329->2078|4342->2083|4381->2084|4432->2099|4445->2103|4473->2109|4520->2124|4584->2157|4711->2248|4743->2271|4783->2273|4870->2324|4932->2364|4999->2413|5012->2418|5051->2419|5183->2518|5278->2576|5299->2587|5354->2619|5421->2649|5454->2672|5495->2674|5583->2725|5646->2765|5713->2813|5727->2818|5767->2819|5898->2917|5999->2981|6015->2987|6050->2999|6103->3020|6140->3025
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|102->76|102->76|102->76|104->78|104->78|104->78|104->78|104->78|104->78|106->80|106->80|106->80|108->82|108->82|108->82|109->83|109->83|109->83|110->84|113->87|120->94|120->94|120->94|122->96|122->96|124->98|124->98|124->98|128->102|130->104|130->104|130->104|132->106|132->106|132->106|134->108|134->108|136->110|136->110|136->110|140->114|145->119|145->119|145->119|147->121|149->123
                    -- GENERATED --
                */
            