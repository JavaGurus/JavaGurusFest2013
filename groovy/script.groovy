public class Persona {
    def nombre;
    def edad;    
    
    public String saluda(){
        return "Hola me llamo " + nombre + " y tengo " + edad + " años."
    }            
}

Persona persona = new Persona();
persona.nombre = "Juan"
persona.edad = 21
println persona.saluda()