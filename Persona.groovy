public class Persona {
    private String nombre;
    private Integer edad;
    
    public static void main(String[] args){
        Persona persona = new Persona();
        
        persona.setNombre("Juan")
        persona.setEdad(21)
        
        System.out.println(persona.saluda())
    }
    
    public String saluda(){
        return "Hola me llamo " + nombre + " y tengo " + edad + " años."
    }
    
    public String getNombre(){
        return this.nombre
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre
    }

    public Integer getEdad(){
        return this.edad
    }
    
    public void setEdad(Integer edad){
        this.edad = edad
    }    
}