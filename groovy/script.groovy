public class Persona {
    def nombre;
    def edad;    
    
    public String saluda(){
        "Hola me llamo $nombre y tengo $edad a�os."
    }
    
    String toString(){
        "'$nombre, $edad a�os'"
    }            
}

def mapa = [nombre:"Pepe",edad:"34"]

def persona2 = mapa as Persona

println persona2.saluda()
