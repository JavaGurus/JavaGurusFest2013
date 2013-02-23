public class Persona {
    def nombre;
    def edad;    
    
    public Persona(nombre, edad){
        this.nombre = nombre
        this.edad = edad
    }
    
    public String saluda(){
        return "Hola me llamo $nombre y tengo $edad años."
    }            
}

Persona persona = new Persona("Juan", 21);

println persona.saluda()