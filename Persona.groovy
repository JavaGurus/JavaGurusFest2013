public class Persona {
    def nombre;
    def edad;
    
    public static void main(String[] args){
        Persona persona = new Persona();
        
        persona.nombre = "Juan"
        persona.edad = 21
        println persona.nombre
        
        println persona.saluda()
    }
    
    public String saluda(){
        return "Hola me llamo " + nombre + " y tengo " + edad + " años."
    }
            
}