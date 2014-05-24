
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
object livescore extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(d1: Long, d2: Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.22*/("""

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""

<h1>Mecz na szczycie! Lotnik Twardogóra : Polonia Grabowno</h1>


<div class="actions">
    <h2>"""),_display_(Seq[Any](/*9.10*/d1)),format.raw/*9.12*/(""" : """),_display_(Seq[Any](/*9.16*/d2)),format.raw/*9.18*/("""</h2>

</div>

<a class="btn info" id="gola" href=""""),_display_(Seq[Any](/*13.38*/routes/*13.44*/.Match1.ScoreA(d1:Long, d2:Long))),format.raw/*13.76*/("""">Gol A</a>
<a class="btn danger" id="golb" href=""""),_display_(Seq[Any](/*14.40*/routes/*14.46*/.Match1.ScoreB(d1:Long, d2:Long))),format.raw/*14.78*/("""">Gol B</a>


""")))})),format.raw/*17.2*/("""
"""))}
    }
    
    def render(d1:Long,d2:Long): play.api.templates.HtmlFormat.Appendable = apply(d1,d2)
    
    def f:((Long,Long) => play.api.templates.HtmlFormat.Appendable) = (d1,d2) => apply(d1,d2)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 24 19:19:21 CEST 2014
                    SOURCE: C:/Users/Mateusz/test/test/app/views/livescore.scala.html
                    HASH: f9bc164d3413174f3d75533ec9a53a1b096f1d38
                    MATRIX: 781->1|895->21|934->26|945->30|983->32|1123->137|1146->139|1185->143|1208->145|1300->201|1315->207|1369->239|1457->291|1472->297|1526->329|1575->347
                    LINES: 26->1|29->1|31->3|31->3|31->3|37->9|37->9|37->9|37->9|41->13|41->13|41->13|42->14|42->14|42->14|45->17
                    -- GENERATED --
                */
            