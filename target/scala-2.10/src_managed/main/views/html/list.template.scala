
package views.html

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Computer],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Computer], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*32.2*/header/*32.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.38*/("""
    <th class=""""),_display_(Seq[Any](/*33.17*/key/*33.20*/.replace(".","_"))),format.raw/*33.37*/(""" header """),_display_(Seq[Any](/*33.46*/if(currentSortBy == key){/*33.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*33.136*/("""">
        <a href=""""),_display_(Seq[Any](/*34.19*/link(0, key))),format.raw/*34.31*/("""">"""),_display_(Seq[Any](/*34.34*/title)),format.raw/*34.39*/("""</a>
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
    routes.Application.list(newPage, sortBy, order, currentFilter)
    
}};
Seq[Any](format.raw/*1.115*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""
    
    <h1 id="homeTitle">"""),_display_(Seq[Any](/*40.25*/Messages("computers.list.title", currentPage.getTotalRowCount))),format.raw/*40.87*/("""</h1>

    """),_display_(Seq[Any](/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*44.37*/flash/*44.42*/.get("success"))),format.raw/*44.57*/("""
        </div>
    """)))})),format.raw/*46.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*50.24*/link(0, "name"))),format.raw/*50.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*51.66*/currentFilter)),format.raw/*51.79*/("""" placeholder="Filter by computer name...">
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn primary">
        </form>
        
        <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.48*/routes/*55.54*/.Application.create())),format.raw/*55.75*/("""">Dodaj nowy komputer</a>
        
    </div>
    
    """),_display_(Seq[Any](/*59.6*/if(currentPage.getTotalRowCount == 0)/*59.43*/ {_display_(Seq[Any](format.raw/*59.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*65.7*/else/*65.12*/{_display_(Seq[Any](format.raw/*65.13*/("""
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*70.22*/header("name", "Computer name"))),format.raw/*70.53*/("""
                    """),_display_(Seq[Any](/*71.22*/header("introduced", "Introduced"))),format.raw/*71.56*/("""
                    """),_display_(Seq[Any](/*72.22*/header("discontinued", "Discontinued"))),format.raw/*72.60*/("""
                    """),_display_(Seq[Any](/*73.22*/header("company.name", "Company"))),format.raw/*73.55*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*78.18*/for(computer <- currentPage.getList) yield /*78.54*/ {_display_(Seq[Any](format.raw/*78.56*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*80.39*/routes/*80.45*/.Application.edit(computer.id))),format.raw/*80.75*/("""">"""),_display_(Seq[Any](/*80.78*/computer/*80.86*/.name)),format.raw/*80.91*/("""</a></td>
                        <td>
                            """),_display_(Seq[Any](/*82.30*/if(computer.introduced == null)/*82.61*/ {_display_(Seq[Any](format.raw/*82.63*/("""
                                <em>-</em>
                            """)))}/*84.31*/else/*84.36*/{_display_(Seq[Any](format.raw/*84.37*/("""
                                """),_display_(Seq[Any](/*85.34*/computer/*85.42*/.introduced.format("dd MMM yyyy"))),format.raw/*85.75*/("""
                            """)))})),format.raw/*86.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*89.30*/if(computer.discontinued == null)/*89.63*/ {_display_(Seq[Any](format.raw/*89.65*/("""
                                <em>-</em>
                            """)))}/*91.31*/else/*91.36*/{_display_(Seq[Any](format.raw/*91.37*/("""
                                """),_display_(Seq[Any](/*92.34*/computer/*92.42*/.discontinued.format("dd MMM yyyy"))),format.raw/*92.77*/("""
                            """)))})),format.raw/*93.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*96.30*/if(computer.company == null)/*96.58*/ {_display_(Seq[Any](format.raw/*96.60*/("""
                                <em>-</em>
                            """)))}/*98.31*/else/*98.36*/{_display_(Seq[Any](format.raw/*98.37*/("""
                                """),_display_(Seq[Any](/*99.34*/computer/*99.42*/.company.name)),format.raw/*99.55*/("""
                            """)))})),format.raw/*100.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*103.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq[Any](/*110.18*/if(currentPage.hasPrev)/*110.41*/ {_display_(Seq[Any](format.raw/*110.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq[Any](/*112.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*112.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*114.19*/else/*114.24*/{_display_(Seq[Any](format.raw/*114.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*118.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*120.36*/currentPage/*120.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*120.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*122.18*/if(currentPage.hasNext)/*122.41*/ {_display_(Seq[Any](format.raw/*122.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*124.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*124.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*126.19*/else/*126.24*/{_display_(Seq[Any](format.raw/*126.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*130.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*134.6*/("""
        
""")))})),format.raw/*136.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Computer],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Computer],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 24 19:19:21 CEST 2014
                    SOURCE: C:/Users/Mateusz/test/test/app/views/list.scala.html
                    HASH: 0e66660c93b25477383140b8b25194026ca6e5a9
                    MATRIX: 818->1|1009->860|1023->866|1134->896|1187->913|1199->916|1238->933|1283->942|1317->968|1405->1032|1462->1053|1496->1065|1535->1068|1562->1073|1600->243|1611->247|2143->114|2172->241|2200->748|2230->858|2258->1089|2296->1092|2308->1096|2347->1098|2413->1128|2497->1190|2544->1202|2585->1234|2625->1236|2742->1317|2756->1322|2793->1337|2845->1358|2939->1416|2976->1431|3093->1512|3128->1525|3375->1736|3390->1742|3433->1763|3524->1819|3570->1856|3610->1858|3734->1965|3747->1970|3786->1971|3942->2091|3995->2122|4053->2144|4109->2178|4167->2200|4227->2238|4285->2260|4340->2293|4458->2375|4510->2411|4550->2413|4650->2477|4665->2483|4717->2513|4756->2516|4773->2524|4800->2529|4904->2597|4944->2628|4984->2630|5076->2704|5089->2709|5128->2710|5198->2744|5215->2752|5270->2785|5332->2815|5457->2904|5499->2937|5539->2939|5631->3013|5644->3018|5683->3019|5753->3053|5770->3061|5827->3096|5889->3126|6014->3215|6051->3243|6091->3245|6183->3319|6196->3324|6235->3325|6305->3359|6322->3367|6357->3380|6420->3410|6527->3484|6688->3608|6721->3631|6762->3633|6872->3706|6935->3746|7020->3812|7034->3817|7074->3818|7245->3956|7355->4029|7376->4040|7432->4073|7513->4117|7546->4140|7587->4142|7697->4215|7760->4255|7841->4317|7855->4322|7895->4323|8062->4457|8142->4505|8185->4516
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|98->72|98->72|99->73|99->73|104->78|104->78|104->78|106->80|106->80|106->80|106->80|106->80|106->80|108->82|108->82|108->82|110->84|110->84|110->84|111->85|111->85|111->85|112->86|115->89|115->89|115->89|117->91|117->91|117->91|118->92|118->92|118->92|119->93|122->96|122->96|122->96|124->98|124->98|124->98|125->99|125->99|125->99|126->100|129->103|136->110|136->110|136->110|138->112|138->112|140->114|140->114|140->114|144->118|146->120|146->120|146->120|148->122|148->122|148->122|150->124|150->124|152->126|152->126|152->126|156->130|160->134|162->136
                    -- GENERATED --
                */
            