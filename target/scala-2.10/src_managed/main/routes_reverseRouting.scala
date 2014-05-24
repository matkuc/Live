// @SOURCE:C:/Users/Mateusz/test/test/conf/routes
// @HASH:026ca7e77b42bed69faa08719c184558ad34d685
// @DATE:Sat May 24 19:19:19 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:55
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:46
// @LINE:45
// @LINE:43
// @LINE:42
// @LINE:40
// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:55
class ReverseAssets {
    

// @LINE:55
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:33
// @LINE:32
// @LINE:30
class ReverseMatch1 {
    

// @LINE:33
def ScoreB(d1:Long, d2:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "match/gol1" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("d1", d1)), Some(implicitly[QueryStringBindable[Long]].unbind("d2", d2)))))
}
                                                

// @LINE:30
def r1(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "match/wyrzuc")
}
                                                

// @LINE:32
def ScoreA(d1:Long, d2:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "match/gol" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("d1", d1)), Some(implicitly[QueryStringBindable[Long]].unbind("d2", d2)))))
}
                                                
    
}
                          

// @LINE:52
// @LINE:46
// @LINE:45
// @LINE:28
// @LINE:27
// @LINE:15
// @LINE:8
class ReversePlayers {
    

// @LINE:52
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "players/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:27
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "players/new")
}
                                                

// @LINE:45
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "players/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:46
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "players/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:15
def list(p:Int = 0, s:String = "lastname", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "players" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "lastname") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:28
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "players")
}
                                                

// @LINE:8
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "players/index")
}
                                                
    
}
                          

// @LINE:50
// @LINE:40
// @LINE:39
// @LINE:22
// @LINE:21
// @LINE:13
// @LINE:6
class ReverseTeams {
    

// @LINE:50
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "teams/" + implicitly[PathBindable[Long]].unbind("id", id) + "/usun")
}
                                                

// @LINE:21
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teams/new")
}
                                                

// @LINE:39
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teams/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:40
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "teams/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:13
def list(p:Int = 0, s:String = "nazwa", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teams" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "nazwa") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:22
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "teams")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:51
// @LINE:43
// @LINE:42
// @LINE:25
// @LINE:24
// @LINE:14
// @LINE:7
class ReverseReferees {
    

// @LINE:51
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "referees/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:24
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "referees/new")
}
                                                

// @LINE:42
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "referees/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:43
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "referees/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:14
def list(p:Int = 0, s:String = "lastname", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "referees" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "lastname") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:25
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "referees")
}
                                                

// @LINE:7
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "referees/index")
}
                                                
    
}
                          

// @LINE:49
// @LINE:37
// @LINE:36
// @LINE:19
// @LINE:18
// @LINE:12
class ReverseApplication {
    

// @LINE:49
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "computers/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:18
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "computers/new")
}
                                                

// @LINE:36
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "computers/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:37
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "computers/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:12
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "computers" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:19
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "computers")
}
                                                
    
}
                          
}
                  


// @LINE:55
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:46
// @LINE:45
// @LINE:43
// @LINE:42
// @LINE:40
// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:55
class ReverseAssets {
    

// @LINE:55
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:33
// @LINE:32
// @LINE:30
class ReverseMatch1 {
    

// @LINE:33
def ScoreB : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Match1.ScoreB",
   """
      function(d1,d2) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "match/gol1" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("d1", d1), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("d2", d2)])})
      }
   """
)
                        

// @LINE:30
def r1 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Match1.r1",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "match/wyrzuc"})
      }
   """
)
                        

// @LINE:32
def ScoreA : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Match1.ScoreA",
   """
      function(d1,d2) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "match/gol" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("d1", d1), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("d2", d2)])})
      }
   """
)
                        
    
}
              

// @LINE:52
// @LINE:46
// @LINE:45
// @LINE:28
// @LINE:27
// @LINE:15
// @LINE:8
class ReversePlayers {
    

// @LINE:52
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "players/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:27
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "players/new"})
      }
   """
)
                        

// @LINE:45
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "players/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:46
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "players/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:15
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "players" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:28
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "players"})
      }
   """
)
                        

// @LINE:8
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Players.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "players/index"})
      }
   """
)
                        
    
}
              

// @LINE:50
// @LINE:40
// @LINE:39
// @LINE:22
// @LINE:21
// @LINE:13
// @LINE:6
class ReverseTeams {
    

// @LINE:50
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teams/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/usun"})
      }
   """
)
                        

// @LINE:21
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teams/new"})
      }
   """
)
                        

// @LINE:39
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teams/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:40
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teams/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:13
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teams" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:22
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teams"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Teams.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:51
// @LINE:43
// @LINE:42
// @LINE:25
// @LINE:24
// @LINE:14
// @LINE:7
class ReverseReferees {
    

// @LINE:51
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "referees/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:24
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "referees/new"})
      }
   """
)
                        

// @LINE:42
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "referees/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:43
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "referees/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:14
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "referees" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:25
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "referees"})
      }
   """
)
                        

// @LINE:7
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Referees.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "referees/index"})
      }
   """
)
                        
    
}
              

// @LINE:49
// @LINE:37
// @LINE:36
// @LINE:19
// @LINE:18
// @LINE:12
class ReverseApplication {
    

// @LINE:49
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:18
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/new"})
      }
   """
)
                        

// @LINE:36
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:37
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:12
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computers" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:19
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computers"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:55
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:46
// @LINE:45
// @LINE:43
// @LINE:42
// @LINE:40
// @LINE:39
// @LINE:37
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:55
class ReverseAssets {
    

// @LINE:55
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:33
// @LINE:32
// @LINE:30
class ReverseMatch1 {
    

// @LINE:33
def ScoreB(d1:Long, d2:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Match1.ScoreB(d1, d2), HandlerDef(this, "controllers.Match1", "ScoreB", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """match/gol1""")
)
                      

// @LINE:30
def r1(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Match1.r1(), HandlerDef(this, "controllers.Match1", "r1", Seq(), "GET", """""", _prefix + """match/wyrzuc""")
)
                      

// @LINE:32
def ScoreA(d1:Long, d2:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Match1.ScoreA(d1, d2), HandlerDef(this, "controllers.Match1", "ScoreA", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """match/gol""")
)
                      
    
}
                          

// @LINE:52
// @LINE:46
// @LINE:45
// @LINE:28
// @LINE:27
// @LINE:15
// @LINE:8
class ReversePlayers {
    

// @LINE:52
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.delete(id), HandlerDef(this, "controllers.Players", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """players/$id<[^/]+>/delete""")
)
                      

// @LINE:27
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.create(), HandlerDef(this, "controllers.Players", "create", Seq(), "GET", """""", _prefix + """players/new""")
)
                      

// @LINE:45
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.edit(id), HandlerDef(this, "controllers.Players", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """players/$id<[^/]+>""")
)
                      

// @LINE:46
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.update(id), HandlerDef(this, "controllers.Players", "update", Seq(classOf[Long]), "POST", """""", _prefix + """players/$id<[^/]+>""")
)
                      

// @LINE:15
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.list(p, s, o, f), HandlerDef(this, "controllers.Players", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """players""")
)
                      

// @LINE:28
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.save(), HandlerDef(this, "controllers.Players", "save", Seq(), "POST", """""", _prefix + """players""")
)
                      

// @LINE:8
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Players.index(), HandlerDef(this, "controllers.Players", "index", Seq(), "GET", """""", _prefix + """players/index""")
)
                      
    
}
                          

// @LINE:50
// @LINE:40
// @LINE:39
// @LINE:22
// @LINE:21
// @LINE:13
// @LINE:6
class ReverseTeams {
    

// @LINE:50
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.delete(id), HandlerDef(this, "controllers.Teams", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """teams/$id<[^/]+>/usun""")
)
                      

// @LINE:21
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.create(), HandlerDef(this, "controllers.Teams", "create", Seq(), "GET", """""", _prefix + """teams/new""")
)
                      

// @LINE:39
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.edit(id), HandlerDef(this, "controllers.Teams", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """teams/$id<[^/]+>""")
)
                      

// @LINE:40
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.update(id), HandlerDef(this, "controllers.Teams", "update", Seq(classOf[Long]), "POST", """""", _prefix + """teams/$id<[^/]+>""")
)
                      

// @LINE:13
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.list(p, s, o, f), HandlerDef(this, "controllers.Teams", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """teams""")
)
                      

// @LINE:22
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.save(), HandlerDef(this, "controllers.Teams", "save", Seq(), "POST", """""", _prefix + """teams""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Teams.index(), HandlerDef(this, "controllers.Teams", "index", Seq(), "GET", """ Default path will just redirect to the computer list""", _prefix + """""")
)
                      
    
}
                          

// @LINE:51
// @LINE:43
// @LINE:42
// @LINE:25
// @LINE:24
// @LINE:14
// @LINE:7
class ReverseReferees {
    

// @LINE:51
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.delete(id), HandlerDef(this, "controllers.Referees", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """referees/$id<[^/]+>/delete""")
)
                      

// @LINE:24
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.create(), HandlerDef(this, "controllers.Referees", "create", Seq(), "GET", """""", _prefix + """referees/new""")
)
                      

// @LINE:42
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.edit(id), HandlerDef(this, "controllers.Referees", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """referees/$id<[^/]+>""")
)
                      

// @LINE:43
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.update(id), HandlerDef(this, "controllers.Referees", "update", Seq(classOf[Long]), "POST", """""", _prefix + """referees/$id<[^/]+>""")
)
                      

// @LINE:14
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.list(p, s, o, f), HandlerDef(this, "controllers.Referees", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """referees""")
)
                      

// @LINE:25
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.save(), HandlerDef(this, "controllers.Referees", "save", Seq(), "POST", """""", _prefix + """referees""")
)
                      

// @LINE:7
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Referees.index(), HandlerDef(this, "controllers.Referees", "index", Seq(), "GET", """""", _prefix + """referees/index""")
)
                      
    
}
                          

// @LINE:49
// @LINE:37
// @LINE:36
// @LINE:19
// @LINE:18
// @LINE:12
class ReverseApplication {
    

// @LINE:49
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.delete(id), HandlerDef(this, "controllers.Application", "delete", Seq(classOf[Long]), "POST", """ Delete a computer""", _prefix + """computers/$id<[^/]+>/delete""")
)
                      

// @LINE:18
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.create(), HandlerDef(this, "controllers.Application", "create", Seq(), "GET", """ Add computer""", _prefix + """computers/new""")
)
                      

// @LINE:36
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long]), "GET", """ Edit existing computer""", _prefix + """computers/$id<[^/]+>""")
)
                      

// @LINE:37
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long]), "POST", """""", _prefix + """computers/$id<[^/]+>""")
)
                      

// @LINE:12
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.list(p, s, o, f), HandlerDef(this, "controllers.Application", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """ Computers list (look at the default values for pagination parameters)""", _prefix + """computers""")
)
                      

// @LINE:19
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.save(), HandlerDef(this, "controllers.Application", "save", Seq(), "POST", """""", _prefix + """computers""")
)
                      
    
}
                          
}
        
    