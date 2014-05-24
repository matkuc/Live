// @SOURCE:C:/Users/Mateusz/test/test/conf/routes
// @HASH:026ca7e77b42bed69faa08719c184558ad34d685
// @DATE:Sat May 24 19:19:19 CEST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Teams_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Referees_index1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("referees/index"))))
        

// @LINE:8
private[this] lazy val controllers_Players_index2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("players/index"))))
        

// @LINE:12
private[this] lazy val controllers_Application_list3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers"))))
        

// @LINE:13
private[this] lazy val controllers_Teams_list4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teams"))))
        

// @LINE:14
private[this] lazy val controllers_Referees_list5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("referees"))))
        

// @LINE:15
private[this] lazy val controllers_Players_list6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("players"))))
        

// @LINE:18
private[this] lazy val controllers_Application_create7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/new"))))
        

// @LINE:19
private[this] lazy val controllers_Application_save8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers"))))
        

// @LINE:21
private[this] lazy val controllers_Teams_create9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teams/new"))))
        

// @LINE:22
private[this] lazy val controllers_Teams_save10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teams"))))
        

// @LINE:24
private[this] lazy val controllers_Referees_create11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("referees/new"))))
        

// @LINE:25
private[this] lazy val controllers_Referees_save12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("referees"))))
        

// @LINE:27
private[this] lazy val controllers_Players_create13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("players/new"))))
        

// @LINE:28
private[this] lazy val controllers_Players_save14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("players"))))
        

// @LINE:30
private[this] lazy val controllers_Match1_r115 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("match/wyrzuc"))))
        

// @LINE:32
private[this] lazy val controllers_Match1_ScoreA16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("match/gol"))))
        

// @LINE:33
private[this] lazy val controllers_Match1_ScoreB17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("match/gol1"))))
        

// @LINE:36
private[this] lazy val controllers_Application_edit18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:37
private[this] lazy val controllers_Application_update19 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:39
private[this] lazy val controllers_Teams_edit20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teams/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:40
private[this] lazy val controllers_Teams_update21 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teams/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:42
private[this] lazy val controllers_Referees_edit22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("referees/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:43
private[this] lazy val controllers_Referees_update23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("referees/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:45
private[this] lazy val controllers_Players_edit24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("players/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:46
private[this] lazy val controllers_Players_update25 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("players/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:49
private[this] lazy val controllers_Application_delete26 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computers/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:50
private[this] lazy val controllers_Teams_delete27 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teams/"),DynamicPart("id", """[^/]+""",true),StaticPart("/usun"))))
        

// @LINE:51
private[this] lazy val controllers_Referees_delete28 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("referees/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:52
private[this] lazy val controllers_Players_delete29 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("players/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:55
private[this] lazy val controllers_Assets_at30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Teams.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """referees/index""","""controllers.Referees.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """players/index""","""controllers.Players.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers""","""controllers.Application.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teams""","""controllers.Teams.list(p:Int ?= 0, s:String ?= "nazwa", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """referees""","""controllers.Referees.list(p:Int ?= 0, s:String ?= "lastname", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """players""","""controllers.Players.list(p:Int ?= 0, s:String ?= "lastname", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/new""","""controllers.Application.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers""","""controllers.Application.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teams/new""","""controllers.Teams.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teams""","""controllers.Teams.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """referees/new""","""controllers.Referees.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """referees""","""controllers.Referees.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """players/new""","""controllers.Players.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """players""","""controllers.Players.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """match/wyrzuc""","""controllers.Match1.r1()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """match/gol""","""controllers.Match1.ScoreA(d1:Long, d2:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """match/gol1""","""controllers.Match1.ScoreB(d1:Long, d2:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/$id<[^/]+>""","""controllers.Application.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/$id<[^/]+>""","""controllers.Application.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teams/$id<[^/]+>""","""controllers.Teams.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teams/$id<[^/]+>""","""controllers.Teams.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """referees/$id<[^/]+>""","""controllers.Referees.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """referees/$id<[^/]+>""","""controllers.Referees.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """players/$id<[^/]+>""","""controllers.Players.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """players/$id<[^/]+>""","""controllers.Players.update(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computers/$id<[^/]+>/delete""","""controllers.Application.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teams/$id<[^/]+>/usun""","""controllers.Teams.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """referees/$id<[^/]+>/delete""","""controllers.Referees.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """players/$id<[^/]+>/delete""","""controllers.Players.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Teams_index0(params) => {
   call { 
        invokeHandler(controllers.Teams.index(), HandlerDef(this, "controllers.Teams", "index", Nil,"GET", """ Default path will just redirect to the computer list""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Referees_index1(params) => {
   call { 
        invokeHandler(controllers.Referees.index(), HandlerDef(this, "controllers.Referees", "index", Nil,"GET", """""", Routes.prefix + """referees/index"""))
   }
}
        

// @LINE:8
case controllers_Players_index2(params) => {
   call { 
        invokeHandler(controllers.Players.index(), HandlerDef(this, "controllers.Players", "index", Nil,"GET", """""", Routes.prefix + """players/index"""))
   }
}
        

// @LINE:12
case controllers_Application_list3(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Application.list(p, s, o, f), HandlerDef(this, "controllers.Application", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """ Computers list (look at the default values for pagination parameters)""", Routes.prefix + """computers"""))
   }
}
        

// @LINE:13
case controllers_Teams_list4(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("nazwa")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Teams.list(p, s, o, f), HandlerDef(this, "controllers.Teams", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """teams"""))
   }
}
        

// @LINE:14
case controllers_Referees_list5(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("lastname")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Referees.list(p, s, o, f), HandlerDef(this, "controllers.Referees", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """referees"""))
   }
}
        

// @LINE:15
case controllers_Players_list6(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("lastname")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Players.list(p, s, o, f), HandlerDef(this, "controllers.Players", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """players"""))
   }
}
        

// @LINE:18
case controllers_Application_create7(params) => {
   call { 
        invokeHandler(controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Nil,"GET", """ Add computer""", Routes.prefix + """computers/new"""))
   }
}
        

// @LINE:19
case controllers_Application_save8(params) => {
   call { 
        invokeHandler(controllers.Application.save(), HandlerDef(this, "controllers.Application", "save", Nil,"POST", """""", Routes.prefix + """computers"""))
   }
}
        

// @LINE:21
case controllers_Teams_create9(params) => {
   call { 
        invokeHandler(controllers.Teams.create(), HandlerDef(this, "controllers.Teams", "create", Nil,"GET", """""", Routes.prefix + """teams/new"""))
   }
}
        

// @LINE:22
case controllers_Teams_save10(params) => {
   call { 
        invokeHandler(controllers.Teams.save(), HandlerDef(this, "controllers.Teams", "save", Nil,"POST", """""", Routes.prefix + """teams"""))
   }
}
        

// @LINE:24
case controllers_Referees_create11(params) => {
   call { 
        invokeHandler(controllers.Referees.create(), HandlerDef(this, "controllers.Referees", "create", Nil,"GET", """""", Routes.prefix + """referees/new"""))
   }
}
        

// @LINE:25
case controllers_Referees_save12(params) => {
   call { 
        invokeHandler(controllers.Referees.save(), HandlerDef(this, "controllers.Referees", "save", Nil,"POST", """""", Routes.prefix + """referees"""))
   }
}
        

// @LINE:27
case controllers_Players_create13(params) => {
   call { 
        invokeHandler(controllers.Players.create(), HandlerDef(this, "controllers.Players", "create", Nil,"GET", """""", Routes.prefix + """players/new"""))
   }
}
        

// @LINE:28
case controllers_Players_save14(params) => {
   call { 
        invokeHandler(controllers.Players.save(), HandlerDef(this, "controllers.Players", "save", Nil,"POST", """""", Routes.prefix + """players"""))
   }
}
        

// @LINE:30
case controllers_Match1_r115(params) => {
   call { 
        invokeHandler(controllers.Match1.r1(), HandlerDef(this, "controllers.Match1", "r1", Nil,"GET", """""", Routes.prefix + """match/wyrzuc"""))
   }
}
        

// @LINE:32
case controllers_Match1_ScoreA16(params) => {
   call(params.fromQuery[Long]("d1", None), params.fromQuery[Long]("d2", None)) { (d1, d2) =>
        invokeHandler(controllers.Match1.ScoreA(d1, d2), HandlerDef(this, "controllers.Match1", "ScoreA", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """match/gol"""))
   }
}
        

// @LINE:33
case controllers_Match1_ScoreB17(params) => {
   call(params.fromQuery[Long]("d1", None), params.fromQuery[Long]("d2", None)) { (d1, d2) =>
        invokeHandler(controllers.Match1.ScoreB(d1, d2), HandlerDef(this, "controllers.Match1", "ScoreB", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """match/gol1"""))
   }
}
        

// @LINE:36
case controllers_Application_edit18(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long]),"GET", """ Edit existing computer""", Routes.prefix + """computers/$id<[^/]+>"""))
   }
}
        

// @LINE:37
case controllers_Application_update19(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """computers/$id<[^/]+>"""))
   }
}
        

// @LINE:39
case controllers_Teams_edit20(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Teams.edit(id), HandlerDef(this, "controllers.Teams", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """teams/$id<[^/]+>"""))
   }
}
        

// @LINE:40
case controllers_Teams_update21(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Teams.update(id), HandlerDef(this, "controllers.Teams", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """teams/$id<[^/]+>"""))
   }
}
        

// @LINE:42
case controllers_Referees_edit22(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Referees.edit(id), HandlerDef(this, "controllers.Referees", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """referees/$id<[^/]+>"""))
   }
}
        

// @LINE:43
case controllers_Referees_update23(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Referees.update(id), HandlerDef(this, "controllers.Referees", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """referees/$id<[^/]+>"""))
   }
}
        

// @LINE:45
case controllers_Players_edit24(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Players.edit(id), HandlerDef(this, "controllers.Players", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """players/$id<[^/]+>"""))
   }
}
        

// @LINE:46
case controllers_Players_update25(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Players.update(id), HandlerDef(this, "controllers.Players", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """players/$id<[^/]+>"""))
   }
}
        

// @LINE:49
case controllers_Application_delete26(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.delete(id), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[Long]),"POST", """ Delete a computer""", Routes.prefix + """computers/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:50
case controllers_Teams_delete27(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Teams.delete(id), HandlerDef(this, "controllers.Teams", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """teams/$id<[^/]+>/usun"""))
   }
}
        

// @LINE:51
case controllers_Referees_delete28(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Referees.delete(id), HandlerDef(this, "controllers.Referees", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """referees/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:52
case controllers_Players_delete29(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Players.delete(id), HandlerDef(this, "controllers.Players", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """players/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:55
case controllers_Assets_at30(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     