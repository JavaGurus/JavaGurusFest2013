public class Persona {
    def nombre;
    def edad;    
    
    public String saluda(){
        "Hola me llamo $nombre y tengo $edad años."
    }
    
    String toString(){
        "'$nombre, $edad años'"
    }            
}

def persona = new Persona(nombre:"Juan", edad:21);

def listaPersonas = [persona,
                     new Persona(nombre:"Eliza",edad:20), 
                     new Persona(nombre:"Luis", edad:65),
                     new Persona(edad:"32",nombre:"Paco")]

listaPersonas.each{ println it.saluda() }