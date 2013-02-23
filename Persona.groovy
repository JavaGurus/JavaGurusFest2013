public class Persona {
    private String nombre;
    private Integer edad;
    
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
    
    public String getNombre(){
        println "getNombre"
        return this.nombre
    }
    
    public void setNombre(String nombre){
        println "setNombre"
        this.nombre = nombre
    }

    public Integer getEdad(){
        return this.edad
    }
    
    public void setEdad(Integer edad){
        println "setEdad"
        this.edad = edad
    }    
}