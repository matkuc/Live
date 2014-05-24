
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>Relacje LIVE</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*7.119*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.70*/routes/*8.76*/.Assets.at("stylesheets/main.css"))),format.raw/*8.110*/(""""> 
    </head>
    <body>
        
        <header class="topbar">
            <h1 class="fill">
                <a href=""""),_display_(Seq[Any](/*14.27*/routes/*14.33*/.Teams.index())),format.raw/*14.47*/("""">
                    System relacji LIVE meczów piłkarskich
                    <div style="float:right;">
                        <a href=""""),_display_(Seq[Any](/*17.35*/routes/*17.41*/.Teams.index())),format.raw/*17.55*/("""">Zespoły</a>
                        <a href=""""),_display_(Seq[Any](/*18.35*/routes/*18.41*/.Referees.index())),format.raw/*18.58*/("""">Sędziowie</a>
                        <a href=""""),_display_(Seq[Any](/*19.35*/routes/*19.41*/.Players.index())),format.raw/*19.57*/("""">Piłkarze</a>
                    </div>
                </a>
            </h1>
        </header>
        
        <section id="main">
            """),_display_(Seq[Any](/*26.14*/content)),format.raw/*26.21*/("""
        </section>
        
    </body>
</html>
"""))}
    }
    
    def render(content:Html): play.api.templates.HtmlFormat.Appendable = apply(content)
    
    def f:((Html) => play.api.templates.HtmlFormat.Appendable) = (content) => apply(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 24 19:19:21 CEST 2014
                    SOURCE: C:/Users/Mateusz/test/test/app/views/main.scala.html
                    HASH: 42ef5cea7a4492e4f4e077647cb57088477ec928
                    MATRIX: 771->1|880->16|1056->157|1070->163|1135->206|1243->279|1257->285|1313->319|1473->443|1488->449|1524->463|1703->606|1718->612|1754->626|1838->674|1853->680|1892->697|1978->747|1993->753|2031->769|2216->918|2245->925
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|54->26|54->26
                    -- GENERATED --
                */
            