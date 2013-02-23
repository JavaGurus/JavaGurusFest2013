class Perro {
  def ladra() { println "woof!" }
  def sientate() { println "(se sienta)" }
  def brinca() { println "boing!" }
}

def ejecuta( animal, action ) {
  animal."$action"()                 
}

def rex = new Perro()

ejecuta( rex, "ladra" )              
ejecuta( rex, "brinca" ) 